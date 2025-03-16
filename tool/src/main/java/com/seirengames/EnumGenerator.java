package com.seirengames;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class EnumGenerator {
	private static final String RAYLIB_JAVA_PATH = "../tool/src/extracted_sources/com/raylib/Raylib.java"; // Raylib.java のパス
	private static final String OUTPUT_PATH = "../lib/src/main/java/com/seirengames/RaylibEnum.java"; // 出力パス

	public static void main(String[] args) throws IOException {
		List<EnumData> enums = extractStaticClasses(RAYLIB_JAVA_PATH);

		TemplateEngine templateEngine = createTemplateEngine();
		Context context = new Context();
		context.setVariable("enums", enums);

		String generatedCode = templateEngine.process("enum_template", context);
		generatedCode = "// generated file\r\n" + generatedCode;
		Files.write(Paths.get(OUTPUT_PATH), generatedCode.getBytes());
		System.out.println("`" + OUTPUT_PATH + "` has been generated.");
	}

	private static TemplateEngine createTemplateEngine() {
		ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
		resolver.setTemplateMode("TEXT");
		resolver.setPrefix("templates/");
		resolver.setSuffix(".txt");

		TemplateEngine templateEngine = new TemplateEngine();
		templateEngine.setTemplateResolver(resolver);
		return templateEngine;
	}

	private static List<EnumData> extractStaticClasses(String filePath) throws IOException {
		List<EnumData> enums = new ArrayList<>();
		List<String> lines = Files.readAllLines(Paths.get(filePath));

		Pattern classPattern = Pattern.compile("public static class (\\w+)\\s*\\{");
		Pattern fieldPattern = Pattern.compile("public static final int (\\w+) = (\\d+);");

		EnumData currentEnum = null;
		String lastComment = null;

		for (String line : lines) {
			String trimmed = line.trim();

			// 単一行コメントを取得（例: /** コメント */）
			if (trimmed.startsWith("/**") && trimmed.endsWith("*/")) {
				lastComment = trimmed;
				continue;
			}

			Matcher classMatcher = classPattern.matcher(line);
			Matcher fieldMatcher = fieldPattern.matcher(line);

			if (classMatcher.find()) {
				if (currentEnum != null) {
					enums.add(currentEnum);
				}
				currentEnum = new EnumData(classMatcher.group(1));
				if (lastComment != null) {
					currentEnum.comment = lastComment;
					lastComment = null;
				}
			} else if (fieldMatcher.find() && currentEnum != null) {
				EnumField field = new EnumField(fieldMatcher.group(1));
				if (lastComment != null) {
					field.comment = lastComment;
					lastComment = null;
				}
				currentEnum.addField(field);
			} else {
				// 空行やコメント行以外なら、コメント情報はリセット
				if (!trimmed.isEmpty() && !trimmed.startsWith("*")) {
					lastComment = null;
				}
			}
		}

		if (currentEnum != null) {
			enums.add(currentEnum);
		}

		return enums;
	}

	static class EnumData {
		String name;
		String comment; // クラスコメント
		List<EnumField> fields = new ArrayList<>();

		public String getName() {
			return name;
		}

		public String getComment() {
			return comment;
		}

		public List<EnumField> getFields() {
			return fields;
		}

		EnumData(String name) {
			this.name = name;
		}

		void addField(EnumField field) {
			fields.add(field);
		}
	}

	static class EnumField {
		String name;
		String comment; // フィールドコメント

		public String getName() {
			return name;
		}

		public String getComment() {
			return comment;
		}

		EnumField(String name) {
			this.name = name;
		}
	}
}
