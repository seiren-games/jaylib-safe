import re


def extract_function_definitions(filename):
    with open(filename, "r", encoding="utf-8") as file:
        content = file.read()

    # 正規表現パターン：
    #   - public static の後に戻り値や型（ジェネリクス、配列も含む）、
    #   - 関数名、引数リスト (括弧内は改行も含む) をキャプチャし、
    #   - その後に { が続くもの
    pattern = re.compile(
        r"(public\s+static\s+[\w<>\[\]]+\s+\w+\s*\([^)]*\))\s*\{", re.DOTALL
    )
    matches = pattern.findall(content)

    # 改行や余分な空白を除去して各定義の末尾にセミコロンを付与
    definitions = [" ".join(match.split()) + ";" for match in matches]
    return definitions

if __name__ == "__main__":
    filename = "extracted_sources/com/raylib/Raylib.java"
    definitions = extract_function_definitions(filename)
    for d in definitions:
        print(d)
