package com.seirengames;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.EnumSet;
import java.util.Optional;

import com.raylib.Color;
import com.raylib.Font;
import com.raylib.Texture;
import com.raylib.Vector2;
import com.seirengames.RaylibEnum.ConfigFlags;
import com.seirengames.RaylibEnum.KeyboardKey;

public class Raylib {

    /**
     * Any IntBuffers you create *MUST* be direct allocation and native order. Use
     * this method to ensure that.
     */
    public static IntBuffer createIntBuffer(int size) {
        return com.raylib.Raylib.createIntBuffer(size);
    }

    /**
     * Any FloatBuffers you create *MUST* be direct allocation and native order. Use
     * this method to ensure that.
     */
    public static FloatBuffer createFloatBuffer(int size) {
        return com.raylib.Raylib.createFloatBuffer(size);
    }

    /**
     * Any ByteBuffers you create *MUST* be direct allocation and native order. Use
     * this method to ensure that.
     */
    public static ByteBuffer createByteBuffer(int size) {
        return com.raylib.Raylib.createByteBuffer(size);
    }

    /**
     * Initialize window and OpenGL context
     */
    public static void initWindow(int width, int height, String title) {
        com.raylib.Raylib.initWindow(width, height, title);
    }

    /**
     * Close window and unload OpenGL context
     */
    public static void closeWindow() {
        com.raylib.Raylib.closeWindow();
    }

    /**
     * Check if application should close (KEY_ESCAPE pressed or windows close icon
     * clicked)
     */
    public static boolean windowShouldClose() {
        return com.raylib.Raylib.windowShouldClose();
    }

    /**
     * Check if window has been initialized successfully
     */
    public static boolean isWindowReady() {
        return com.raylib.Raylib.isWindowReady();
    }

    /**
     * Check if window is currently fullscreen
     */
    public static boolean isWindowFullscreen() {
        return com.raylib.Raylib.isWindowFullscreen();
    }

    /**
     * Check if window is currently hidden
     */
    public static boolean isWindowHidden() {
        return com.raylib.Raylib.isWindowHidden();
    }

    /**
     * Check if window is currently minimized
     */
    public static boolean isWindowMinimized() {
        return com.raylib.Raylib.isWindowMinimized();
    }

    /**
     * Check if window is currently maximized
     */
    public static boolean isWindowMaximized() {
        return com.raylib.Raylib.isWindowMaximized();
    }

    /**
     * Check if window is currently focused
     */
    public static boolean isWindowFocused() {
        return com.raylib.Raylib.isWindowFocused();
    }

    /**
     * Check if window has been resized last frame
     */
    public static boolean isWindowResized() {
        return com.raylib.Raylib.isWindowResized();
    }

    /**
     * Check if one specific window flag is enabled
     */
    public static boolean isWindowState(ConfigFlags flag) {
        return com.raylib.Raylib.isWindowState(flag.value);
    }

    /**
     * Set window configuration state using flags
     */
    public static void setWindowState(EnumSet<ConfigFlags> flags) {
        int combined = 0;
        for (ConfigFlags f : flags) {
            combined |= f.value;
        }
        com.raylib.Raylib.setWindowState(combined);
    }

    /**
     * Clear window configuration state flags
     */
    public static void clearWindowState(EnumSet<ConfigFlags> flags) {
        int combined = 0;
        for (ConfigFlags f : flags) {
            combined |= f.value;
        }
        com.raylib.Raylib.clearWindowState(combined);
    }

    /**
     * Toggle window state: fullscreen/windowed, resizes monitor to match window
     * resolution
     */
    public static void toggleFullscreen() {
        com.raylib.Raylib.toggleFullscreen();
    }

    /**
     * Toggle window state: borderless windowed, resizes window to match monitor
     * resolution
     */
    public static void toggleBorderlessWindowed() {
        com.raylib.Raylib.toggleBorderlessWindowed();
    }

    /**
     * Set window state: maximized, if resizable
     */
    public static void maximizeWindow() {
        com.raylib.Raylib.maximizeWindow();
    }

    /**
     * Check if a key is being pressed
     */
    public static boolean isKeyDown(KeyboardKey key) {
        return com.raylib.Raylib.isKeyDown(key.value);
    }

    /**
     * Load texture from file into GPU memory (VRAM)
     *
     * このラッパー関数は、com.raylib.Raylib.loadTexture を呼び出し、
     * isTextureValid によってロードの成功を検証します。
     * ロードに失敗した場合は Optional.empty() を返します。
     */
    public static Optional<Texture> loadTexture(String fileName) {
        Texture texture = com.raylib.Raylib.loadTexture(fileName);
        if (!com.raylib.Raylib.isTextureValid(texture)) {
            return Optional.empty();
        }
        return Optional.of(texture);
    }

    /**
     * Unload texture from GPU memory (VRAM)
     */
    public static void unloadTexture(Texture texture) {
        com.raylib.Raylib.unloadTexture(texture);
    }

    /**
    * Measure string width for default font
    */
    public static int measureText( String text, int fontSize ) {
        return com.raylib.Raylib.measureText(text, fontSize);
    }

    /**
    * Measure string size for Font
    */
    public static Vector2 measureTextEx( Font font, String text, float fontSize, float spacing ) {
        return com.raylib.Raylib.measureTextEx(font, text, fontSize, spacing);
    }

    /**
    * Measure string size for Font
    */
    public static Vector2 measureTextEx(Arena arena, Font font, String text, float fontSize, float spacing) {
        return com.raylib.Raylib.measureTextEx(arena, font, text, fontSize, spacing);
    }

        /**
    * Get current screen width
    */
    public static int getScreenWidth( ) {
        return com.raylib.Raylib.getScreenWidth();
    }

    /**
    * Get current screen height
    */
    public static int getScreenHeight() {
        return com.raylib.Raylib.getScreenHeight();
    }
    
        /**
    * Draw current FPS
    */
    public static void drawFPS( int posX, int posY ) {
        com.raylib.Raylib.drawFPS(posX, posY);
    }

    /**
    * Draw text (using default font)
    */
    public static void drawText( String text, int posX, int posY, int fontSize, Color color ) {
        com.raylib.Raylib.drawText(text, posX, posY, fontSize, color);
    }

    /**
    * Draw text using font and additional parameters
    */
    public static void drawTextEx( Font font, String text, Vector2 position, float fontSize, float spacing, Color tint ) {
        com.raylib.Raylib.drawTextEx(font, text, position, fontSize, spacing, tint);
    }

    /**
    * Draw text using Font and pro parameters (rotation)
    */
    public static void drawTextPro( Font font, String text, Vector2 position, Vector2 origin, float rotation, float fontSize, float spacing, Color tint ) {
        com.raylib.Raylib.drawTextPro(font, text, position, origin, rotation, fontSize, spacing, tint);
    }

    /**
    * Draw one character (codepoint)
    */
    public static void drawTextCodepoint( Font font, int codepoint, Vector2 position, float fontSize, Color tint ) {
        com.raylib.Raylib.drawTextCodepoint(font, codepoint, position, fontSize, tint);
    }

    /**
    * Draw multiple character (codepoint)
    */
    public static void drawTextCodepoints( Font font, MemorySegment codepoints, int codepointCount, Vector2 position, float fontSize, float spacing, Color tint ) {
        com.raylib.Raylib.drawTextCodepoints(font, codepoints, codepointCount, position, fontSize, spacing, tint);
    }
    
    public static Color LIGHTGRAY = com.raylib.Raylib.LIGHTGRAY;
    public static Color GRAY = com.raylib.Raylib.GRAY;
    public static Color DARKGRAY = com.raylib.Raylib.DARKGRAY;
    public static Color YELLOW = com.raylib.Raylib.YELLOW;
    public static Color GOLD = com.raylib.Raylib.GOLD;
    public static Color ORANGE = com.raylib.Raylib.ORANGE;
    public static Color PINK = com.raylib.Raylib.PINK;
    public static Color RED = com.raylib.Raylib.RED;
    public static Color MAROON = com.raylib.Raylib.MAROON;
    public static Color GREEN = com.raylib.Raylib.GREEN;
    public static Color LIME = com.raylib.Raylib.LIME;
    public static Color DARKGREEN = com.raylib.Raylib.DARKGREEN;
    public static Color SKYBLUE = com.raylib.Raylib.SKYBLUE;
    public static Color BLUE = com.raylib.Raylib.BLUE;
    public static Color DARKBLUE = com.raylib.Raylib.DARKBLUE;
    public static Color PURPLE = com.raylib.Raylib.PURPLE;
    public static Color VIOLET = com.raylib.Raylib.VIOLET;
    public static Color DARKPURPLE = com.raylib.Raylib.DARKPURPLE;
    public static Color BEIGE = com.raylib.Raylib.BEIGE;
    public static Color BROWN = com.raylib.Raylib.BROWN;
    public static Color DARKBROWN = com.raylib.Raylib.DARKBROWN;
    public static Color WHITE = com.raylib.Raylib.WHITE;
    public static Color BLACK = com.raylib.Raylib.BLACK;
    public static Color BLANK = com.raylib.Raylib.BLANK;
    public static Color MAGENTA = com.raylib.Raylib.MAGENTA;
    public static Color RAYWHITE = com.raylib.Raylib.RAYWHITE;
}
