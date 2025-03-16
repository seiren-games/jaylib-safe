package com.seirengames;

import java.lang.foreign.MemorySegment;
import java.util.EnumSet;
import java.util.Optional;

import com.raylib.Image;
import com.raylib.Raylib;
import com.raylib.Shader;
import com.seirengames.RaylibEnum.ConfigFlags;
import com.seirengames.RaylibEnum.GamepadAxis;
import com.seirengames.RaylibEnum.GamepadButton;
import com.seirengames.RaylibEnum.KeyboardKey;
import com.seirengames.RaylibEnum.MouseButton;
import com.seirengames.RaylibEnum.MouseCursor;
import com.seirengames.RaylibEnum.TraceLogLevel;

public class RaylibWrapper {

	// --- キーボード関連 ---
	public static boolean isKeyDown(KeyboardKey key) {
		return Raylib.isKeyDown(key.value);
	}

	public static boolean isKeyPressed(KeyboardKey key) {
		return Raylib.isKeyPressed(key.value);
	}

	public static boolean isKeyReleased(KeyboardKey key) {
		return Raylib.isKeyReleased(key.value);
	}

	public static boolean isKeyUp(KeyboardKey key) {
		return Raylib.isKeyUp(key.value);
	}

	public static Optional<KeyboardKey> getKeyPressed() {
		int code = Raylib.getKeyPressed();
		if (code == 0) {
			// キューにキーが無い場合
			return Optional.empty();
		}
		return Optional.of(KeyboardKey.fromValue(code));
	}

	public static void setExitKey(KeyboardKey key) {
		Raylib.setExitKey(key.value);
	}

	// --- ビットフラグ (ConfigFlags) ---
	public static void setConfigFlags(EnumSet<ConfigFlags> flags) {
		int combined = 0;
		for (ConfigFlags f : flags) {
			combined |= f.value;
		}
		Raylib.setConfigFlags(combined);
	}

	// --- トレースログレベル ---
	public static void setTraceLogLevel(TraceLogLevel level) {
		Raylib.setTraceLogLevel(level.value);
	}

	// --- マウス関連 ---
	public static boolean isMouseButtonPressed(MouseButton button) {
		return Raylib.isMouseButtonPressed(button.value);
	}

	public static boolean isMouseButtonDown(MouseButton button) {
		return Raylib.isMouseButtonDown(button.value);
	}

	public static boolean isMouseButtonReleased(MouseButton button) {
		return Raylib.isMouseButtonReleased(button.value);
	}

	public static boolean isMouseButtonUp(MouseButton button) {
		return Raylib.isMouseButtonUp(button.value);
	}

	public static void setMouseCursor(MouseCursor cursor) {
		Raylib.setMouseCursor(cursor.value);
	}

	// --- ゲームパッド関連 ---
	public static boolean isGamepadButtonPressed(int gamepad, GamepadButton button) {
		return Raylib.isGamepadButtonPressed(gamepad, button.value);
	}

	public static boolean isGamepadButtonDown(int gamepad, GamepadButton button) {
		return Raylib.isGamepadButtonDown(gamepad, button.value);
	}

	public static boolean isGamepadButtonReleased(int gamepad, GamepadButton button) {
		return Raylib.isGamepadButtonReleased(gamepad, button.value);
	}

	public static boolean isGamepadButtonUp(int gamepad, GamepadButton button) {
		return Raylib.isGamepadButtonUp(gamepad, button.value);
	}

	public static Optional<GamepadButton> getGamepadButtonPressed() {
		int code = Raylib.getGamepadButtonPressed();
		if (code == 0) {
			return Optional.empty();
		}
		return Optional.of(GamepadButton.fromValue(code));
	}

	public static float getGamepadAxisMovement(int gamepad, GamepadAxis axis) {
		return Raylib.getGamepadAxisMovement(gamepad, axis.value);
	}

	// --- リソース読み込み時の有効性チェック ---
	// 例: 画像読み込み
	public static Optional<Image> loadImage(String fileName) {
		Image img = Raylib.loadImage(fileName);
		if (!isImageValid(img)) {
			return Optional.empty();
		}
		return Optional.of(img);
	}

	// 有効な Image かどうかのチェック例（Image.memorySegment が NULL でなければ有効と仮定）
	public static boolean isImageValid(Image img) {
		return img != null && img.memorySegment != null && !img.memorySegment.equals(MemorySegment.NULL);
	}

	// 例: シェーダー読み込み
	public static Optional<Shader> loadShader(String vsFileName, String fsFileName) {
		Shader shader = Raylib.loadShader(vsFileName, fsFileName);
		if (!Raylib.isShaderValid(shader)) {
			return Optional.empty();
		}
		return Optional.of(shader);
	}

	// 他の LoadXXX / IsXXXValid 系の関数についても同様のパターンでラッパーを実装してください。
}