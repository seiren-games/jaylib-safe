package com.seirengames;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.EnumSet;

import com.seirengames.RaylibEnum.ConfigFlags;

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
}
