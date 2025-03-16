// generated file
package com.seirengames;

import com.raylib.Raylib;
import java.util.HashMap;
import java.util.Map;

public class RaylibEnum {


    /** System/Window config flags */

    public enum ConfigFlags {


        /** Set to try enabling V-Sync on GPU */

        FLAG_VSYNC_HINT(Raylib.ConfigFlags.FLAG_VSYNC_HINT),

        /** Set to run program in fullscreen */

        FLAG_FULLSCREEN_MODE(Raylib.ConfigFlags.FLAG_FULLSCREEN_MODE),

        /** Set to allow resizable window */

        FLAG_WINDOW_RESIZABLE(Raylib.ConfigFlags.FLAG_WINDOW_RESIZABLE),

        /** Set to disable window decoration (frame and buttons) */

        FLAG_WINDOW_UNDECORATED(Raylib.ConfigFlags.FLAG_WINDOW_UNDECORATED),

        /** Set to hide window */

        FLAG_WINDOW_HIDDEN(Raylib.ConfigFlags.FLAG_WINDOW_HIDDEN),

        /** Set to minimize window (iconify) */

        FLAG_WINDOW_MINIMIZED(Raylib.ConfigFlags.FLAG_WINDOW_MINIMIZED),

        /** Set to maximize window (expanded to monitor) */

        FLAG_WINDOW_MAXIMIZED(Raylib.ConfigFlags.FLAG_WINDOW_MAXIMIZED),

        /** Set to window non focused */

        FLAG_WINDOW_UNFOCUSED(Raylib.ConfigFlags.FLAG_WINDOW_UNFOCUSED),

        /** Set to window always on top */

        FLAG_WINDOW_TOPMOST(Raylib.ConfigFlags.FLAG_WINDOW_TOPMOST),

        /** Set to allow windows running while minimized */

        FLAG_WINDOW_ALWAYS_RUN(Raylib.ConfigFlags.FLAG_WINDOW_ALWAYS_RUN),

        /** Set to allow transparent framebuffer */

        FLAG_WINDOW_TRANSPARENT(Raylib.ConfigFlags.FLAG_WINDOW_TRANSPARENT),

        /** Set to support HighDPI */

        FLAG_WINDOW_HIGHDPI(Raylib.ConfigFlags.FLAG_WINDOW_HIGHDPI),

        /** Set to support mouse passthrough, only supported when FLAG_WINDOW_UNDECORATED */

        FLAG_WINDOW_MOUSE_PASSTHROUGH(Raylib.ConfigFlags.FLAG_WINDOW_MOUSE_PASSTHROUGH),

        /** Set to run program in borderless windowed mode */

        FLAG_BORDERLESS_WINDOWED_MODE(Raylib.ConfigFlags.FLAG_BORDERLESS_WINDOWED_MODE),

        /** Set to try enabling MSAA 4X */

        FLAG_MSAA_4X_HINT(Raylib.ConfigFlags.FLAG_MSAA_4X_HINT),

        /** Set to try enabling interlaced video format (for V3D) */

        FLAG_INTERLACED_HINT(Raylib.ConfigFlags.FLAG_INTERLACED_HINT)
    ;

        private final int value;

        private ConfigFlags(int value) {
            this.value = value;
        }

        private static final Map<Integer, ConfigFlags> BY_VALUE = new HashMap<>();

        static {
            for (ConfigFlags e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static ConfigFlags fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** Trace log level */

    public enum TraceLogLevel {


        /** Display all logs */

        LOG_ALL(Raylib.TraceLogLevel.LOG_ALL),

        /** Trace logging, intended for internal use only */

        LOG_TRACE(Raylib.TraceLogLevel.LOG_TRACE),

        /** Debug logging, used for internal debugging, it should be disabled on release builds */

        LOG_DEBUG(Raylib.TraceLogLevel.LOG_DEBUG),

        /** Info logging, used for program execution info */

        LOG_INFO(Raylib.TraceLogLevel.LOG_INFO),

        /** Warning logging, used on recoverable failures */

        LOG_WARNING(Raylib.TraceLogLevel.LOG_WARNING),

        /** Error logging, used on unrecoverable failures */

        LOG_ERROR(Raylib.TraceLogLevel.LOG_ERROR),

        /** Fatal logging, used to abort program: exit(EXIT_FAILURE) */

        LOG_FATAL(Raylib.TraceLogLevel.LOG_FATAL),

        /** Disable logging */

        LOG_NONE(Raylib.TraceLogLevel.LOG_NONE)
    ;

        private final int value;

        private TraceLogLevel(int value) {
            this.value = value;
        }

        private static final Map<Integer, TraceLogLevel> BY_VALUE = new HashMap<>();

        static {
            for (TraceLogLevel e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static TraceLogLevel fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** Keyboard keys (US keyboard layout) */

    public enum KeyboardKey {


        /** Key: NULL, used for no key pressed */

        KEY_NULL(Raylib.KeyboardKey.KEY_NULL),

        /** Key: &#39; */

        KEY_APOSTROPHE(Raylib.KeyboardKey.KEY_APOSTROPHE),

        /** Key: , */

        KEY_COMMA(Raylib.KeyboardKey.KEY_COMMA),

        /** Key: - */

        KEY_MINUS(Raylib.KeyboardKey.KEY_MINUS),

        /** Key: . */

        KEY_PERIOD(Raylib.KeyboardKey.KEY_PERIOD),

        /** Key: / */

        KEY_SLASH(Raylib.KeyboardKey.KEY_SLASH),

        /** Key: 0 */

        KEY_ZERO(Raylib.KeyboardKey.KEY_ZERO),

        /** Key: 1 */

        KEY_ONE(Raylib.KeyboardKey.KEY_ONE),

        /** Key: 2 */

        KEY_TWO(Raylib.KeyboardKey.KEY_TWO),

        /** Key: 3 */

        KEY_THREE(Raylib.KeyboardKey.KEY_THREE),

        /** Key: 4 */

        KEY_FOUR(Raylib.KeyboardKey.KEY_FOUR),

        /** Key: 5 */

        KEY_FIVE(Raylib.KeyboardKey.KEY_FIVE),

        /** Key: 6 */

        KEY_SIX(Raylib.KeyboardKey.KEY_SIX),

        /** Key: 7 */

        KEY_SEVEN(Raylib.KeyboardKey.KEY_SEVEN),

        /** Key: 8 */

        KEY_EIGHT(Raylib.KeyboardKey.KEY_EIGHT),

        /** Key: 9 */

        KEY_NINE(Raylib.KeyboardKey.KEY_NINE),

        /** Key: ; */

        KEY_SEMICOLON(Raylib.KeyboardKey.KEY_SEMICOLON),

        /** Key: = */

        KEY_EQUAL(Raylib.KeyboardKey.KEY_EQUAL),

        /** Key: A | a */

        KEY_A(Raylib.KeyboardKey.KEY_A),

        /** Key: B | b */

        KEY_B(Raylib.KeyboardKey.KEY_B),

        /** Key: C | c */

        KEY_C(Raylib.KeyboardKey.KEY_C),

        /** Key: D | d */

        KEY_D(Raylib.KeyboardKey.KEY_D),

        /** Key: E | e */

        KEY_E(Raylib.KeyboardKey.KEY_E),

        /** Key: F | f */

        KEY_F(Raylib.KeyboardKey.KEY_F),

        /** Key: G | g */

        KEY_G(Raylib.KeyboardKey.KEY_G),

        /** Key: H | h */

        KEY_H(Raylib.KeyboardKey.KEY_H),

        /** Key: I | i */

        KEY_I(Raylib.KeyboardKey.KEY_I),

        /** Key: J | j */

        KEY_J(Raylib.KeyboardKey.KEY_J),

        /** Key: K | k */

        KEY_K(Raylib.KeyboardKey.KEY_K),

        /** Key: L | l */

        KEY_L(Raylib.KeyboardKey.KEY_L),

        /** Key: M | m */

        KEY_M(Raylib.KeyboardKey.KEY_M),

        /** Key: N | n */

        KEY_N(Raylib.KeyboardKey.KEY_N),

        /** Key: O | o */

        KEY_O(Raylib.KeyboardKey.KEY_O),

        /** Key: P | p */

        KEY_P(Raylib.KeyboardKey.KEY_P),

        /** Key: Q | q */

        KEY_Q(Raylib.KeyboardKey.KEY_Q),

        /** Key: R | r */

        KEY_R(Raylib.KeyboardKey.KEY_R),

        /** Key: S | s */

        KEY_S(Raylib.KeyboardKey.KEY_S),

        /** Key: T | t */

        KEY_T(Raylib.KeyboardKey.KEY_T),

        /** Key: U | u */

        KEY_U(Raylib.KeyboardKey.KEY_U),

        /** Key: V | v */

        KEY_V(Raylib.KeyboardKey.KEY_V),

        /** Key: W | w */

        KEY_W(Raylib.KeyboardKey.KEY_W),

        /** Key: X | x */

        KEY_X(Raylib.KeyboardKey.KEY_X),

        /** Key: Y | y */

        KEY_Y(Raylib.KeyboardKey.KEY_Y),

        /** Key: Z | z */

        KEY_Z(Raylib.KeyboardKey.KEY_Z),

        /** Key: [ */

        KEY_LEFT_BRACKET(Raylib.KeyboardKey.KEY_LEFT_BRACKET),

        /** Key: &#39;\&#39; */

        KEY_BACKSLASH(Raylib.KeyboardKey.KEY_BACKSLASH),

        /** Key: ] */

        KEY_RIGHT_BRACKET(Raylib.KeyboardKey.KEY_RIGHT_BRACKET),

        /** Key: ` */

        KEY_GRAVE(Raylib.KeyboardKey.KEY_GRAVE),

        /** Key: Space */

        KEY_SPACE(Raylib.KeyboardKey.KEY_SPACE),

        /** Key: Esc */

        KEY_ESCAPE(Raylib.KeyboardKey.KEY_ESCAPE),

        /** Key: Enter */

        KEY_ENTER(Raylib.KeyboardKey.KEY_ENTER),

        /** Key: Tab */

        KEY_TAB(Raylib.KeyboardKey.KEY_TAB),

        /** Key: Backspace */

        KEY_BACKSPACE(Raylib.KeyboardKey.KEY_BACKSPACE),

        /** Key: Ins */

        KEY_INSERT(Raylib.KeyboardKey.KEY_INSERT),

        /** Key: Del */

        KEY_DELETE(Raylib.KeyboardKey.KEY_DELETE),

        /** Key: Cursor right */

        KEY_RIGHT(Raylib.KeyboardKey.KEY_RIGHT),

        /** Key: Cursor left */

        KEY_LEFT(Raylib.KeyboardKey.KEY_LEFT),

        /** Key: Cursor down */

        KEY_DOWN(Raylib.KeyboardKey.KEY_DOWN),

        /** Key: Cursor up */

        KEY_UP(Raylib.KeyboardKey.KEY_UP),

        /** Key: Page up */

        KEY_PAGE_UP(Raylib.KeyboardKey.KEY_PAGE_UP),

        /** Key: Page down */

        KEY_PAGE_DOWN(Raylib.KeyboardKey.KEY_PAGE_DOWN),

        /** Key: Home */

        KEY_HOME(Raylib.KeyboardKey.KEY_HOME),

        /** Key: End */

        KEY_END(Raylib.KeyboardKey.KEY_END),

        /** Key: Caps lock */

        KEY_CAPS_LOCK(Raylib.KeyboardKey.KEY_CAPS_LOCK),

        /** Key: Scroll down */

        KEY_SCROLL_LOCK(Raylib.KeyboardKey.KEY_SCROLL_LOCK),

        /** Key: Num lock */

        KEY_NUM_LOCK(Raylib.KeyboardKey.KEY_NUM_LOCK),

        /** Key: Print screen */

        KEY_PRINT_SCREEN(Raylib.KeyboardKey.KEY_PRINT_SCREEN),

        /** Key: Pause */

        KEY_PAUSE(Raylib.KeyboardKey.KEY_PAUSE),

        /** Key: F1 */

        KEY_F1(Raylib.KeyboardKey.KEY_F1),

        /** Key: F2 */

        KEY_F2(Raylib.KeyboardKey.KEY_F2),

        /** Key: F3 */

        KEY_F3(Raylib.KeyboardKey.KEY_F3),

        /** Key: F4 */

        KEY_F4(Raylib.KeyboardKey.KEY_F4),

        /** Key: F5 */

        KEY_F5(Raylib.KeyboardKey.KEY_F5),

        /** Key: F6 */

        KEY_F6(Raylib.KeyboardKey.KEY_F6),

        /** Key: F7 */

        KEY_F7(Raylib.KeyboardKey.KEY_F7),

        /** Key: F8 */

        KEY_F8(Raylib.KeyboardKey.KEY_F8),

        /** Key: F9 */

        KEY_F9(Raylib.KeyboardKey.KEY_F9),

        /** Key: F10 */

        KEY_F10(Raylib.KeyboardKey.KEY_F10),

        /** Key: F11 */

        KEY_F11(Raylib.KeyboardKey.KEY_F11),

        /** Key: F12 */

        KEY_F12(Raylib.KeyboardKey.KEY_F12),

        /** Key: Shift left */

        KEY_LEFT_SHIFT(Raylib.KeyboardKey.KEY_LEFT_SHIFT),

        /** Key: Control left */

        KEY_LEFT_CONTROL(Raylib.KeyboardKey.KEY_LEFT_CONTROL),

        /** Key: Alt left */

        KEY_LEFT_ALT(Raylib.KeyboardKey.KEY_LEFT_ALT),

        /** Key: Super left */

        KEY_LEFT_SUPER(Raylib.KeyboardKey.KEY_LEFT_SUPER),

        /** Key: Shift right */

        KEY_RIGHT_SHIFT(Raylib.KeyboardKey.KEY_RIGHT_SHIFT),

        /** Key: Control right */

        KEY_RIGHT_CONTROL(Raylib.KeyboardKey.KEY_RIGHT_CONTROL),

        /** Key: Alt right */

        KEY_RIGHT_ALT(Raylib.KeyboardKey.KEY_RIGHT_ALT),

        /** Key: Super right */

        KEY_RIGHT_SUPER(Raylib.KeyboardKey.KEY_RIGHT_SUPER),

        /** Key: KB menu */

        KEY_KB_MENU(Raylib.KeyboardKey.KEY_KB_MENU),

        /** Key: Keypad 0 */

        KEY_KP_0(Raylib.KeyboardKey.KEY_KP_0),

        /** Key: Keypad 1 */

        KEY_KP_1(Raylib.KeyboardKey.KEY_KP_1),

        /** Key: Keypad 2 */

        KEY_KP_2(Raylib.KeyboardKey.KEY_KP_2),

        /** Key: Keypad 3 */

        KEY_KP_3(Raylib.KeyboardKey.KEY_KP_3),

        /** Key: Keypad 4 */

        KEY_KP_4(Raylib.KeyboardKey.KEY_KP_4),

        /** Key: Keypad 5 */

        KEY_KP_5(Raylib.KeyboardKey.KEY_KP_5),

        /** Key: Keypad 6 */

        KEY_KP_6(Raylib.KeyboardKey.KEY_KP_6),

        /** Key: Keypad 7 */

        KEY_KP_7(Raylib.KeyboardKey.KEY_KP_7),

        /** Key: Keypad 8 */

        KEY_KP_8(Raylib.KeyboardKey.KEY_KP_8),

        /** Key: Keypad 9 */

        KEY_KP_9(Raylib.KeyboardKey.KEY_KP_9),

        /** Key: Keypad . */

        KEY_KP_DECIMAL(Raylib.KeyboardKey.KEY_KP_DECIMAL),

        /** Key: Keypad / */

        KEY_KP_DIVIDE(Raylib.KeyboardKey.KEY_KP_DIVIDE),

        /** Key: Keypad * */

        KEY_KP_MULTIPLY(Raylib.KeyboardKey.KEY_KP_MULTIPLY),

        /** Key: Keypad - */

        KEY_KP_SUBTRACT(Raylib.KeyboardKey.KEY_KP_SUBTRACT),

        /** Key: Keypad + */

        KEY_KP_ADD(Raylib.KeyboardKey.KEY_KP_ADD),

        /** Key: Keypad Enter */

        KEY_KP_ENTER(Raylib.KeyboardKey.KEY_KP_ENTER),

        /** Key: Keypad = */

        KEY_KP_EQUAL(Raylib.KeyboardKey.KEY_KP_EQUAL),

        /** Key: Android back button */

        KEY_BACK(Raylib.KeyboardKey.KEY_BACK),

        /** Key: Android menu button */

        KEY_MENU(Raylib.KeyboardKey.KEY_MENU),

        /** Key: Android volume up button */

        KEY_VOLUME_UP(Raylib.KeyboardKey.KEY_VOLUME_UP),

        /** Key: Android volume down button */

        KEY_VOLUME_DOWN(Raylib.KeyboardKey.KEY_VOLUME_DOWN)
    ;

        private final int value;

        private KeyboardKey(int value) {
            this.value = value;
        }

        private static final Map<Integer, KeyboardKey> BY_VALUE = new HashMap<>();

        static {
            for (KeyboardKey e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static KeyboardKey fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** Mouse buttons */

    public enum MouseButton {


        /** Mouse button left */

        MOUSE_BUTTON_LEFT(Raylib.MouseButton.MOUSE_BUTTON_LEFT),

        /** Mouse button right */

        MOUSE_BUTTON_RIGHT(Raylib.MouseButton.MOUSE_BUTTON_RIGHT),

        /** Mouse button middle (pressed wheel) */

        MOUSE_BUTTON_MIDDLE(Raylib.MouseButton.MOUSE_BUTTON_MIDDLE),

        /** Mouse button side (advanced mouse device) */

        MOUSE_BUTTON_SIDE(Raylib.MouseButton.MOUSE_BUTTON_SIDE),

        /** Mouse button extra (advanced mouse device) */

        MOUSE_BUTTON_EXTRA(Raylib.MouseButton.MOUSE_BUTTON_EXTRA),

        /** Mouse button forward (advanced mouse device) */

        MOUSE_BUTTON_FORWARD(Raylib.MouseButton.MOUSE_BUTTON_FORWARD),

        /** Mouse button back (advanced mouse device) */

        MOUSE_BUTTON_BACK(Raylib.MouseButton.MOUSE_BUTTON_BACK)
    ;

        private final int value;

        private MouseButton(int value) {
            this.value = value;
        }

        private static final Map<Integer, MouseButton> BY_VALUE = new HashMap<>();

        static {
            for (MouseButton e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static MouseButton fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** Mouse cursor */

    public enum MouseCursor {


        /** Default pointer shape */

        MOUSE_CURSOR_DEFAULT(Raylib.MouseCursor.MOUSE_CURSOR_DEFAULT),

        /** Arrow shape */

        MOUSE_CURSOR_ARROW(Raylib.MouseCursor.MOUSE_CURSOR_ARROW),

        /** Text writing cursor shape */

        MOUSE_CURSOR_IBEAM(Raylib.MouseCursor.MOUSE_CURSOR_IBEAM),

        /** Cross shape */

        MOUSE_CURSOR_CROSSHAIR(Raylib.MouseCursor.MOUSE_CURSOR_CROSSHAIR),

        /** Pointing hand cursor */

        MOUSE_CURSOR_POINTING_HAND(Raylib.MouseCursor.MOUSE_CURSOR_POINTING_HAND),

        /** Horizontal resize/move arrow shape */

        MOUSE_CURSOR_RESIZE_EW(Raylib.MouseCursor.MOUSE_CURSOR_RESIZE_EW),

        /** Vertical resize/move arrow shape */

        MOUSE_CURSOR_RESIZE_NS(Raylib.MouseCursor.MOUSE_CURSOR_RESIZE_NS),

        /** Top-left to bottom-right diagonal resize/move arrow shape */

        MOUSE_CURSOR_RESIZE_NWSE(Raylib.MouseCursor.MOUSE_CURSOR_RESIZE_NWSE),

        /** The top-right to bottom-left diagonal resize/move arrow shape */

        MOUSE_CURSOR_RESIZE_NESW(Raylib.MouseCursor.MOUSE_CURSOR_RESIZE_NESW),

        /** The omnidirectional resize/move cursor shape */

        MOUSE_CURSOR_RESIZE_ALL(Raylib.MouseCursor.MOUSE_CURSOR_RESIZE_ALL),

        /** The operation-not-allowed shape */

        MOUSE_CURSOR_NOT_ALLOWED(Raylib.MouseCursor.MOUSE_CURSOR_NOT_ALLOWED)
    ;

        private final int value;

        private MouseCursor(int value) {
            this.value = value;
        }

        private static final Map<Integer, MouseCursor> BY_VALUE = new HashMap<>();

        static {
            for (MouseCursor e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static MouseCursor fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** Gamepad buttons */

    public enum GamepadButton {


        /** Unknown button, just for error checking */

        GAMEPAD_BUTTON_UNKNOWN(Raylib.GamepadButton.GAMEPAD_BUTTON_UNKNOWN),

        /** Gamepad left DPAD up button */

        GAMEPAD_BUTTON_LEFT_FACE_UP(Raylib.GamepadButton.GAMEPAD_BUTTON_LEFT_FACE_UP),

        /** Gamepad left DPAD right button */

        GAMEPAD_BUTTON_LEFT_FACE_RIGHT(Raylib.GamepadButton.GAMEPAD_BUTTON_LEFT_FACE_RIGHT),

        /** Gamepad left DPAD down button */

        GAMEPAD_BUTTON_LEFT_FACE_DOWN(Raylib.GamepadButton.GAMEPAD_BUTTON_LEFT_FACE_DOWN),

        /** Gamepad left DPAD left button */

        GAMEPAD_BUTTON_LEFT_FACE_LEFT(Raylib.GamepadButton.GAMEPAD_BUTTON_LEFT_FACE_LEFT),

        /** Gamepad right button up (i.e. PS3: Triangle, Xbox: Y) */

        GAMEPAD_BUTTON_RIGHT_FACE_UP(Raylib.GamepadButton.GAMEPAD_BUTTON_RIGHT_FACE_UP),

        /** Gamepad right button right (i.e. PS3: Circle, Xbox: B) */

        GAMEPAD_BUTTON_RIGHT_FACE_RIGHT(Raylib.GamepadButton.GAMEPAD_BUTTON_RIGHT_FACE_RIGHT),

        /** Gamepad right button down (i.e. PS3: Cross, Xbox: A) */

        GAMEPAD_BUTTON_RIGHT_FACE_DOWN(Raylib.GamepadButton.GAMEPAD_BUTTON_RIGHT_FACE_DOWN),

        /** Gamepad right button left (i.e. PS3: Square, Xbox: X) */

        GAMEPAD_BUTTON_RIGHT_FACE_LEFT(Raylib.GamepadButton.GAMEPAD_BUTTON_RIGHT_FACE_LEFT),

        /** Gamepad top/back trigger left (first), it could be a trailing button */

        GAMEPAD_BUTTON_LEFT_TRIGGER_1(Raylib.GamepadButton.GAMEPAD_BUTTON_LEFT_TRIGGER_1),

        /** Gamepad top/back trigger left (second), it could be a trailing button */

        GAMEPAD_BUTTON_LEFT_TRIGGER_2(Raylib.GamepadButton.GAMEPAD_BUTTON_LEFT_TRIGGER_2),

        /** Gamepad top/back trigger right (first), it could be a trailing button */

        GAMEPAD_BUTTON_RIGHT_TRIGGER_1(Raylib.GamepadButton.GAMEPAD_BUTTON_RIGHT_TRIGGER_1),

        /** Gamepad top/back trigger right (second), it could be a trailing button */

        GAMEPAD_BUTTON_RIGHT_TRIGGER_2(Raylib.GamepadButton.GAMEPAD_BUTTON_RIGHT_TRIGGER_2),

        /** Gamepad center buttons, left one (i.e. PS3: Select) */

        GAMEPAD_BUTTON_MIDDLE_LEFT(Raylib.GamepadButton.GAMEPAD_BUTTON_MIDDLE_LEFT),

        /** Gamepad center buttons, middle one (i.e. PS3: PS, Xbox: XBOX) */

        GAMEPAD_BUTTON_MIDDLE(Raylib.GamepadButton.GAMEPAD_BUTTON_MIDDLE),

        /** Gamepad center buttons, right one (i.e. PS3: Start) */

        GAMEPAD_BUTTON_MIDDLE_RIGHT(Raylib.GamepadButton.GAMEPAD_BUTTON_MIDDLE_RIGHT),

        /** Gamepad joystick pressed button left */

        GAMEPAD_BUTTON_LEFT_THUMB(Raylib.GamepadButton.GAMEPAD_BUTTON_LEFT_THUMB),

        /** Gamepad joystick pressed button right */

        GAMEPAD_BUTTON_RIGHT_THUMB(Raylib.GamepadButton.GAMEPAD_BUTTON_RIGHT_THUMB)
    ;

        private final int value;

        private GamepadButton(int value) {
            this.value = value;
        }

        private static final Map<Integer, GamepadButton> BY_VALUE = new HashMap<>();

        static {
            for (GamepadButton e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static GamepadButton fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** Gamepad axis */

    public enum GamepadAxis {


        /** Gamepad left stick X axis */

        GAMEPAD_AXIS_LEFT_X(Raylib.GamepadAxis.GAMEPAD_AXIS_LEFT_X),

        /** Gamepad left stick Y axis */

        GAMEPAD_AXIS_LEFT_Y(Raylib.GamepadAxis.GAMEPAD_AXIS_LEFT_Y),

        /** Gamepad right stick X axis */

        GAMEPAD_AXIS_RIGHT_X(Raylib.GamepadAxis.GAMEPAD_AXIS_RIGHT_X),

        /** Gamepad right stick Y axis */

        GAMEPAD_AXIS_RIGHT_Y(Raylib.GamepadAxis.GAMEPAD_AXIS_RIGHT_Y),

        /** Gamepad back trigger left, pressure level: [1..-1] */

        GAMEPAD_AXIS_LEFT_TRIGGER(Raylib.GamepadAxis.GAMEPAD_AXIS_LEFT_TRIGGER),

        /** Gamepad back trigger right, pressure level: [1..-1] */

        GAMEPAD_AXIS_RIGHT_TRIGGER(Raylib.GamepadAxis.GAMEPAD_AXIS_RIGHT_TRIGGER)
    ;

        private final int value;

        private GamepadAxis(int value) {
            this.value = value;
        }

        private static final Map<Integer, GamepadAxis> BY_VALUE = new HashMap<>();

        static {
            for (GamepadAxis e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static GamepadAxis fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** Material map index */

    public enum MaterialMapIndex {


        /** Albedo material (same as: MATERIAL_MAP_DIFFUSE) */

        MATERIAL_MAP_ALBEDO(Raylib.MaterialMapIndex.MATERIAL_MAP_ALBEDO),

        /** Metalness material (same as: MATERIAL_MAP_SPECULAR) */

        MATERIAL_MAP_METALNESS(Raylib.MaterialMapIndex.MATERIAL_MAP_METALNESS),

        /** Normal material */

        MATERIAL_MAP_NORMAL(Raylib.MaterialMapIndex.MATERIAL_MAP_NORMAL),

        /** Roughness material */

        MATERIAL_MAP_ROUGHNESS(Raylib.MaterialMapIndex.MATERIAL_MAP_ROUGHNESS),

        /** Ambient occlusion material */

        MATERIAL_MAP_OCCLUSION(Raylib.MaterialMapIndex.MATERIAL_MAP_OCCLUSION),

        /** Emission material */

        MATERIAL_MAP_EMISSION(Raylib.MaterialMapIndex.MATERIAL_MAP_EMISSION),

        /** Heightmap material */

        MATERIAL_MAP_HEIGHT(Raylib.MaterialMapIndex.MATERIAL_MAP_HEIGHT),

        /** Cubemap material (NOTE: Uses GL_TEXTURE_CUBE_MAP) */

        MATERIAL_MAP_CUBEMAP(Raylib.MaterialMapIndex.MATERIAL_MAP_CUBEMAP),

        /** Irradiance material (NOTE: Uses GL_TEXTURE_CUBE_MAP) */

        MATERIAL_MAP_IRRADIANCE(Raylib.MaterialMapIndex.MATERIAL_MAP_IRRADIANCE),

        /** Prefilter material (NOTE: Uses GL_TEXTURE_CUBE_MAP) */

        MATERIAL_MAP_PREFILTER(Raylib.MaterialMapIndex.MATERIAL_MAP_PREFILTER),

        /** Brdf material */

        MATERIAL_MAP_BRDF(Raylib.MaterialMapIndex.MATERIAL_MAP_BRDF)
    ;

        private final int value;

        private MaterialMapIndex(int value) {
            this.value = value;
        }

        private static final Map<Integer, MaterialMapIndex> BY_VALUE = new HashMap<>();

        static {
            for (MaterialMapIndex e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static MaterialMapIndex fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** Shader location index */

    public enum ShaderLocationIndex {


        /** Shader location: vertex attribute: position */

        SHADER_LOC_VERTEX_POSITION(Raylib.ShaderLocationIndex.SHADER_LOC_VERTEX_POSITION),

        /** Shader location: vertex attribute: texcoord01 */

        SHADER_LOC_VERTEX_TEXCOORD01(Raylib.ShaderLocationIndex.SHADER_LOC_VERTEX_TEXCOORD01),

        /** Shader location: vertex attribute: texcoord02 */

        SHADER_LOC_VERTEX_TEXCOORD02(Raylib.ShaderLocationIndex.SHADER_LOC_VERTEX_TEXCOORD02),

        /** Shader location: vertex attribute: normal */

        SHADER_LOC_VERTEX_NORMAL(Raylib.ShaderLocationIndex.SHADER_LOC_VERTEX_NORMAL),

        /** Shader location: vertex attribute: tangent */

        SHADER_LOC_VERTEX_TANGENT(Raylib.ShaderLocationIndex.SHADER_LOC_VERTEX_TANGENT),

        /** Shader location: vertex attribute: color */

        SHADER_LOC_VERTEX_COLOR(Raylib.ShaderLocationIndex.SHADER_LOC_VERTEX_COLOR),

        /** Shader location: matrix uniform: model-view-projection */

        SHADER_LOC_MATRIX_MVP(Raylib.ShaderLocationIndex.SHADER_LOC_MATRIX_MVP),

        /** Shader location: matrix uniform: view (camera transform) */

        SHADER_LOC_MATRIX_VIEW(Raylib.ShaderLocationIndex.SHADER_LOC_MATRIX_VIEW),

        /** Shader location: matrix uniform: projection */

        SHADER_LOC_MATRIX_PROJECTION(Raylib.ShaderLocationIndex.SHADER_LOC_MATRIX_PROJECTION),

        /** Shader location: matrix uniform: model (transform) */

        SHADER_LOC_MATRIX_MODEL(Raylib.ShaderLocationIndex.SHADER_LOC_MATRIX_MODEL),

        /** Shader location: matrix uniform: normal */

        SHADER_LOC_MATRIX_NORMAL(Raylib.ShaderLocationIndex.SHADER_LOC_MATRIX_NORMAL),

        /** Shader location: vector uniform: view */

        SHADER_LOC_VECTOR_VIEW(Raylib.ShaderLocationIndex.SHADER_LOC_VECTOR_VIEW),

        /** Shader location: vector uniform: diffuse color */

        SHADER_LOC_COLOR_DIFFUSE(Raylib.ShaderLocationIndex.SHADER_LOC_COLOR_DIFFUSE),

        /** Shader location: vector uniform: specular color */

        SHADER_LOC_COLOR_SPECULAR(Raylib.ShaderLocationIndex.SHADER_LOC_COLOR_SPECULAR),

        /** Shader location: vector uniform: ambient color */

        SHADER_LOC_COLOR_AMBIENT(Raylib.ShaderLocationIndex.SHADER_LOC_COLOR_AMBIENT),

        /** Shader location: sampler2d texture: albedo (same as: SHADER_LOC_MAP_DIFFUSE) */

        SHADER_LOC_MAP_ALBEDO(Raylib.ShaderLocationIndex.SHADER_LOC_MAP_ALBEDO),

        /** Shader location: sampler2d texture: metalness (same as: SHADER_LOC_MAP_SPECULAR) */

        SHADER_LOC_MAP_METALNESS(Raylib.ShaderLocationIndex.SHADER_LOC_MAP_METALNESS),

        /** Shader location: sampler2d texture: normal */

        SHADER_LOC_MAP_NORMAL(Raylib.ShaderLocationIndex.SHADER_LOC_MAP_NORMAL),

        /** Shader location: sampler2d texture: roughness */

        SHADER_LOC_MAP_ROUGHNESS(Raylib.ShaderLocationIndex.SHADER_LOC_MAP_ROUGHNESS),

        /** Shader location: sampler2d texture: occlusion */

        SHADER_LOC_MAP_OCCLUSION(Raylib.ShaderLocationIndex.SHADER_LOC_MAP_OCCLUSION),

        /** Shader location: sampler2d texture: emission */

        SHADER_LOC_MAP_EMISSION(Raylib.ShaderLocationIndex.SHADER_LOC_MAP_EMISSION),

        /** Shader location: sampler2d texture: height */

        SHADER_LOC_MAP_HEIGHT(Raylib.ShaderLocationIndex.SHADER_LOC_MAP_HEIGHT),

        /** Shader location: samplerCube texture: cubemap */

        SHADER_LOC_MAP_CUBEMAP(Raylib.ShaderLocationIndex.SHADER_LOC_MAP_CUBEMAP),

        /** Shader location: samplerCube texture: irradiance */

        SHADER_LOC_MAP_IRRADIANCE(Raylib.ShaderLocationIndex.SHADER_LOC_MAP_IRRADIANCE),

        /** Shader location: samplerCube texture: prefilter */

        SHADER_LOC_MAP_PREFILTER(Raylib.ShaderLocationIndex.SHADER_LOC_MAP_PREFILTER),

        /** Shader location: sampler2d texture: brdf */

        SHADER_LOC_MAP_BRDF(Raylib.ShaderLocationIndex.SHADER_LOC_MAP_BRDF),

        /** Shader location: vertex attribute: boneIds */

        SHADER_LOC_VERTEX_BONEIDS(Raylib.ShaderLocationIndex.SHADER_LOC_VERTEX_BONEIDS),

        /** Shader location: vertex attribute: boneWeights */

        SHADER_LOC_VERTEX_BONEWEIGHTS(Raylib.ShaderLocationIndex.SHADER_LOC_VERTEX_BONEWEIGHTS),

        /** Shader location: array of matrices uniform: boneMatrices */

        SHADER_LOC_BONE_MATRICES(Raylib.ShaderLocationIndex.SHADER_LOC_BONE_MATRICES)
    ;

        private final int value;

        private ShaderLocationIndex(int value) {
            this.value = value;
        }

        private static final Map<Integer, ShaderLocationIndex> BY_VALUE = new HashMap<>();

        static {
            for (ShaderLocationIndex e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static ShaderLocationIndex fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** Shader uniform data type */

    public enum ShaderUniformDataType {


        /** Shader uniform type: float */

        SHADER_UNIFORM_FLOAT(Raylib.ShaderUniformDataType.SHADER_UNIFORM_FLOAT),

        /** Shader uniform type: vec2 (2 float) */

        SHADER_UNIFORM_VEC2(Raylib.ShaderUniformDataType.SHADER_UNIFORM_VEC2),

        /** Shader uniform type: vec3 (3 float) */

        SHADER_UNIFORM_VEC3(Raylib.ShaderUniformDataType.SHADER_UNIFORM_VEC3),

        /** Shader uniform type: vec4 (4 float) */

        SHADER_UNIFORM_VEC4(Raylib.ShaderUniformDataType.SHADER_UNIFORM_VEC4),

        /** Shader uniform type: int */

        SHADER_UNIFORM_INT(Raylib.ShaderUniformDataType.SHADER_UNIFORM_INT),

        /** Shader uniform type: ivec2 (2 int) */

        SHADER_UNIFORM_IVEC2(Raylib.ShaderUniformDataType.SHADER_UNIFORM_IVEC2),

        /** Shader uniform type: ivec3 (3 int) */

        SHADER_UNIFORM_IVEC3(Raylib.ShaderUniformDataType.SHADER_UNIFORM_IVEC3),

        /** Shader uniform type: ivec4 (4 int) */

        SHADER_UNIFORM_IVEC4(Raylib.ShaderUniformDataType.SHADER_UNIFORM_IVEC4),

        /** Shader uniform type: sampler2d */

        SHADER_UNIFORM_SAMPLER2D(Raylib.ShaderUniformDataType.SHADER_UNIFORM_SAMPLER2D)
    ;

        private final int value;

        private ShaderUniformDataType(int value) {
            this.value = value;
        }

        private static final Map<Integer, ShaderUniformDataType> BY_VALUE = new HashMap<>();

        static {
            for (ShaderUniformDataType e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static ShaderUniformDataType fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** Shader attribute data types */

    public enum ShaderAttributeDataType {


        /** Shader attribute type: float */

        SHADER_ATTRIB_FLOAT(Raylib.ShaderAttributeDataType.SHADER_ATTRIB_FLOAT),

        /** Shader attribute type: vec2 (2 float) */

        SHADER_ATTRIB_VEC2(Raylib.ShaderAttributeDataType.SHADER_ATTRIB_VEC2),

        /** Shader attribute type: vec3 (3 float) */

        SHADER_ATTRIB_VEC3(Raylib.ShaderAttributeDataType.SHADER_ATTRIB_VEC3),

        /** Shader attribute type: vec4 (4 float) */

        SHADER_ATTRIB_VEC4(Raylib.ShaderAttributeDataType.SHADER_ATTRIB_VEC4)
    ;

        private final int value;

        private ShaderAttributeDataType(int value) {
            this.value = value;
        }

        private static final Map<Integer, ShaderAttributeDataType> BY_VALUE = new HashMap<>();

        static {
            for (ShaderAttributeDataType e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static ShaderAttributeDataType fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** Pixel formats */

    public enum PixelFormat {


        /** 8 bit per pixel (no alpha) */

        PIXELFORMAT_UNCOMPRESSED_GRAYSCALE(Raylib.PixelFormat.PIXELFORMAT_UNCOMPRESSED_GRAYSCALE),

        /** 8*2 bpp (2 channels) */

        PIXELFORMAT_UNCOMPRESSED_GRAY_ALPHA(Raylib.PixelFormat.PIXELFORMAT_UNCOMPRESSED_GRAY_ALPHA),

        /** 16 bpp */

        PIXELFORMAT_UNCOMPRESSED_R5G6B5(Raylib.PixelFormat.PIXELFORMAT_UNCOMPRESSED_R5G6B5),

        /** 24 bpp */

        PIXELFORMAT_UNCOMPRESSED_R8G8B8(Raylib.PixelFormat.PIXELFORMAT_UNCOMPRESSED_R8G8B8),

        /** 16 bpp (1 bit alpha) */

        PIXELFORMAT_UNCOMPRESSED_R5G5B5A1(Raylib.PixelFormat.PIXELFORMAT_UNCOMPRESSED_R5G5B5A1),

        /** 16 bpp (4 bit alpha) */

        PIXELFORMAT_UNCOMPRESSED_R4G4B4A4(Raylib.PixelFormat.PIXELFORMAT_UNCOMPRESSED_R4G4B4A4),

        /** 32 bpp */

        PIXELFORMAT_UNCOMPRESSED_R8G8B8A8(Raylib.PixelFormat.PIXELFORMAT_UNCOMPRESSED_R8G8B8A8),

        /** 32 bpp (1 channel - float) */

        PIXELFORMAT_UNCOMPRESSED_R32(Raylib.PixelFormat.PIXELFORMAT_UNCOMPRESSED_R32),

        /** 32*3 bpp (3 channels - float) */

        PIXELFORMAT_UNCOMPRESSED_R32G32B32(Raylib.PixelFormat.PIXELFORMAT_UNCOMPRESSED_R32G32B32),

        /** 32*4 bpp (4 channels - float) */

        PIXELFORMAT_UNCOMPRESSED_R32G32B32A32(Raylib.PixelFormat.PIXELFORMAT_UNCOMPRESSED_R32G32B32A32),

        /** 16 bpp (1 channel - half float) */

        PIXELFORMAT_UNCOMPRESSED_R16(Raylib.PixelFormat.PIXELFORMAT_UNCOMPRESSED_R16),

        /** 16*3 bpp (3 channels - half float) */

        PIXELFORMAT_UNCOMPRESSED_R16G16B16(Raylib.PixelFormat.PIXELFORMAT_UNCOMPRESSED_R16G16B16),

        /** 16*4 bpp (4 channels - half float) */

        PIXELFORMAT_UNCOMPRESSED_R16G16B16A16(Raylib.PixelFormat.PIXELFORMAT_UNCOMPRESSED_R16G16B16A16),

        /** 4 bpp (no alpha) */

        PIXELFORMAT_COMPRESSED_DXT1_RGB(Raylib.PixelFormat.PIXELFORMAT_COMPRESSED_DXT1_RGB),

        /** 4 bpp (1 bit alpha) */

        PIXELFORMAT_COMPRESSED_DXT1_RGBA(Raylib.PixelFormat.PIXELFORMAT_COMPRESSED_DXT1_RGBA),

        /** 8 bpp */

        PIXELFORMAT_COMPRESSED_DXT3_RGBA(Raylib.PixelFormat.PIXELFORMAT_COMPRESSED_DXT3_RGBA),

        /** 8 bpp */

        PIXELFORMAT_COMPRESSED_DXT5_RGBA(Raylib.PixelFormat.PIXELFORMAT_COMPRESSED_DXT5_RGBA),

        /** 4 bpp */

        PIXELFORMAT_COMPRESSED_ETC1_RGB(Raylib.PixelFormat.PIXELFORMAT_COMPRESSED_ETC1_RGB),

        /** 4 bpp */

        PIXELFORMAT_COMPRESSED_ETC2_RGB(Raylib.PixelFormat.PIXELFORMAT_COMPRESSED_ETC2_RGB),

        /** 8 bpp */

        PIXELFORMAT_COMPRESSED_ETC2_EAC_RGBA(Raylib.PixelFormat.PIXELFORMAT_COMPRESSED_ETC2_EAC_RGBA),

        /** 4 bpp */

        PIXELFORMAT_COMPRESSED_PVRT_RGB(Raylib.PixelFormat.PIXELFORMAT_COMPRESSED_PVRT_RGB),

        /** 4 bpp */

        PIXELFORMAT_COMPRESSED_PVRT_RGBA(Raylib.PixelFormat.PIXELFORMAT_COMPRESSED_PVRT_RGBA),

        /** 8 bpp */

        PIXELFORMAT_COMPRESSED_ASTC_4x4_RGBA(Raylib.PixelFormat.PIXELFORMAT_COMPRESSED_ASTC_4x4_RGBA),

        /** 2 bpp */

        PIXELFORMAT_COMPRESSED_ASTC_8x8_RGBA(Raylib.PixelFormat.PIXELFORMAT_COMPRESSED_ASTC_8x8_RGBA)
    ;

        private final int value;

        private PixelFormat(int value) {
            this.value = value;
        }

        private static final Map<Integer, PixelFormat> BY_VALUE = new HashMap<>();

        static {
            for (PixelFormat e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static PixelFormat fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** Texture parameters: filter mode */

    public enum TextureFilter {


        /** No filter, just pixel approximation */

        TEXTURE_FILTER_POINT(Raylib.TextureFilter.TEXTURE_FILTER_POINT),

        /** Linear filtering */

        TEXTURE_FILTER_BILINEAR(Raylib.TextureFilter.TEXTURE_FILTER_BILINEAR),

        /** Trilinear filtering (linear with mipmaps) */

        TEXTURE_FILTER_TRILINEAR(Raylib.TextureFilter.TEXTURE_FILTER_TRILINEAR),

        /** Anisotropic filtering 4x */

        TEXTURE_FILTER_ANISOTROPIC_4X(Raylib.TextureFilter.TEXTURE_FILTER_ANISOTROPIC_4X),

        /** Anisotropic filtering 8x */

        TEXTURE_FILTER_ANISOTROPIC_8X(Raylib.TextureFilter.TEXTURE_FILTER_ANISOTROPIC_8X),

        /** Anisotropic filtering 16x */

        TEXTURE_FILTER_ANISOTROPIC_16X(Raylib.TextureFilter.TEXTURE_FILTER_ANISOTROPIC_16X)
    ;

        private final int value;

        private TextureFilter(int value) {
            this.value = value;
        }

        private static final Map<Integer, TextureFilter> BY_VALUE = new HashMap<>();

        static {
            for (TextureFilter e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static TextureFilter fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** Texture parameters: wrap mode */

    public enum TextureWrap {


        /** Repeats texture in tiled mode */

        TEXTURE_WRAP_REPEAT(Raylib.TextureWrap.TEXTURE_WRAP_REPEAT),

        /** Clamps texture to edge pixel in tiled mode */

        TEXTURE_WRAP_CLAMP(Raylib.TextureWrap.TEXTURE_WRAP_CLAMP),

        /** Mirrors and repeats the texture in tiled mode */

        TEXTURE_WRAP_MIRROR_REPEAT(Raylib.TextureWrap.TEXTURE_WRAP_MIRROR_REPEAT),

        /** Mirrors and clamps to border the texture in tiled mode */

        TEXTURE_WRAP_MIRROR_CLAMP(Raylib.TextureWrap.TEXTURE_WRAP_MIRROR_CLAMP)
    ;

        private final int value;

        private TextureWrap(int value) {
            this.value = value;
        }

        private static final Map<Integer, TextureWrap> BY_VALUE = new HashMap<>();

        static {
            for (TextureWrap e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static TextureWrap fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** Cubemap layouts */

    public enum CubemapLayout {


        /** Automatically detect layout type */

        CUBEMAP_LAYOUT_AUTO_DETECT(Raylib.CubemapLayout.CUBEMAP_LAYOUT_AUTO_DETECT),

        /** Layout is defined by a vertical line with faces */

        CUBEMAP_LAYOUT_LINE_VERTICAL(Raylib.CubemapLayout.CUBEMAP_LAYOUT_LINE_VERTICAL),

        /** Layout is defined by a horizontal line with faces */

        CUBEMAP_LAYOUT_LINE_HORIZONTAL(Raylib.CubemapLayout.CUBEMAP_LAYOUT_LINE_HORIZONTAL),

        /** Layout is defined by a 3x4 cross with cubemap faces */

        CUBEMAP_LAYOUT_CROSS_THREE_BY_FOUR(Raylib.CubemapLayout.CUBEMAP_LAYOUT_CROSS_THREE_BY_FOUR),

        /** Layout is defined by a 4x3 cross with cubemap faces */

        CUBEMAP_LAYOUT_CROSS_FOUR_BY_THREE(Raylib.CubemapLayout.CUBEMAP_LAYOUT_CROSS_FOUR_BY_THREE)
    ;

        private final int value;

        private CubemapLayout(int value) {
            this.value = value;
        }

        private static final Map<Integer, CubemapLayout> BY_VALUE = new HashMap<>();

        static {
            for (CubemapLayout e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static CubemapLayout fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** Font type, defines generation method */

    public enum FontType {


        /** Default font generation, anti-aliased */

        FONT_DEFAULT(Raylib.FontType.FONT_DEFAULT),

        /** Bitmap font generation, no anti-aliasing */

        FONT_BITMAP(Raylib.FontType.FONT_BITMAP),

        /** SDF font generation, requires external shader */

        FONT_SDF(Raylib.FontType.FONT_SDF)
    ;

        private final int value;

        private FontType(int value) {
            this.value = value;
        }

        private static final Map<Integer, FontType> BY_VALUE = new HashMap<>();

        static {
            for (FontType e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static FontType fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** Color blending modes (pre-defined) */

    public enum BlendMode {


        /** Blend textures considering alpha (default) */

        BLEND_ALPHA(Raylib.BlendMode.BLEND_ALPHA),

        /** Blend textures adding colors */

        BLEND_ADDITIVE(Raylib.BlendMode.BLEND_ADDITIVE),

        /** Blend textures multiplying colors */

        BLEND_MULTIPLIED(Raylib.BlendMode.BLEND_MULTIPLIED),

        /** Blend textures adding colors (alternative) */

        BLEND_ADD_COLORS(Raylib.BlendMode.BLEND_ADD_COLORS),

        /** Blend textures subtracting colors (alternative) */

        BLEND_SUBTRACT_COLORS(Raylib.BlendMode.BLEND_SUBTRACT_COLORS),

        /** Blend premultiplied textures considering alpha */

        BLEND_ALPHA_PREMULTIPLY(Raylib.BlendMode.BLEND_ALPHA_PREMULTIPLY),

        /** Blend textures using custom src/dst factors (use rlSetBlendFactors()) */

        BLEND_CUSTOM(Raylib.BlendMode.BLEND_CUSTOM),

        /** Blend textures using custom rgb/alpha separate src/dst factors (use rlSetBlendFactorsSeparate()) */

        BLEND_CUSTOM_SEPARATE(Raylib.BlendMode.BLEND_CUSTOM_SEPARATE)
    ;

        private final int value;

        private BlendMode(int value) {
            this.value = value;
        }

        private static final Map<Integer, BlendMode> BY_VALUE = new HashMap<>();

        static {
            for (BlendMode e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static BlendMode fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** Gesture */

    public enum Gesture {


        /** No gesture */

        GESTURE_NONE(Raylib.Gesture.GESTURE_NONE),

        /** Tap gesture */

        GESTURE_TAP(Raylib.Gesture.GESTURE_TAP),

        /** Double tap gesture */

        GESTURE_DOUBLETAP(Raylib.Gesture.GESTURE_DOUBLETAP),

        /** Hold gesture */

        GESTURE_HOLD(Raylib.Gesture.GESTURE_HOLD),

        /** Drag gesture */

        GESTURE_DRAG(Raylib.Gesture.GESTURE_DRAG),

        /** Swipe right gesture */

        GESTURE_SWIPE_RIGHT(Raylib.Gesture.GESTURE_SWIPE_RIGHT),

        /** Swipe left gesture */

        GESTURE_SWIPE_LEFT(Raylib.Gesture.GESTURE_SWIPE_LEFT),

        /** Swipe up gesture */

        GESTURE_SWIPE_UP(Raylib.Gesture.GESTURE_SWIPE_UP),

        /** Swipe down gesture */

        GESTURE_SWIPE_DOWN(Raylib.Gesture.GESTURE_SWIPE_DOWN),

        /** Pinch in gesture */

        GESTURE_PINCH_IN(Raylib.Gesture.GESTURE_PINCH_IN),

        /** Pinch out gesture */

        GESTURE_PINCH_OUT(Raylib.Gesture.GESTURE_PINCH_OUT)
    ;

        private final int value;

        private Gesture(int value) {
            this.value = value;
        }

        private static final Map<Integer, Gesture> BY_VALUE = new HashMap<>();

        static {
            for (Gesture e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static Gesture fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** Camera system modes */

    public enum CameraMode {


        /** Camera custom, controlled by user (UpdateCamera() does nothing) */

        CAMERA_CUSTOM(Raylib.CameraMode.CAMERA_CUSTOM),

        /** Camera free mode */

        CAMERA_FREE(Raylib.CameraMode.CAMERA_FREE),

        /** Camera orbital, around target, zoom supported */

        CAMERA_ORBITAL(Raylib.CameraMode.CAMERA_ORBITAL),

        /** Camera first person */

        CAMERA_FIRST_PERSON(Raylib.CameraMode.CAMERA_FIRST_PERSON),

        /** Camera third person */

        CAMERA_THIRD_PERSON(Raylib.CameraMode.CAMERA_THIRD_PERSON)
    ;

        private final int value;

        private CameraMode(int value) {
            this.value = value;
        }

        private static final Map<Integer, CameraMode> BY_VALUE = new HashMap<>();

        static {
            for (CameraMode e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static CameraMode fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** Camera projection */

    public enum CameraProjection {


        /** Perspective projection */

        CAMERA_PERSPECTIVE(Raylib.CameraProjection.CAMERA_PERSPECTIVE),

        /** Orthographic projection */

        CAMERA_ORTHOGRAPHIC(Raylib.CameraProjection.CAMERA_ORTHOGRAPHIC)
    ;

        private final int value;

        private CameraProjection(int value) {
            this.value = value;
        }

        private static final Map<Integer, CameraProjection> BY_VALUE = new HashMap<>();

        static {
            for (CameraProjection e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static CameraProjection fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** N-patch layout */

    public enum NPatchLayout {


        /** Npatch layout: 3x3 tiles */

        NPATCH_NINE_PATCH(Raylib.NPatchLayout.NPATCH_NINE_PATCH),

        /** Npatch layout: 1x3 tiles */

        NPATCH_THREE_PATCH_VERTICAL(Raylib.NPatchLayout.NPATCH_THREE_PATCH_VERTICAL),

        /** Npatch layout: 3x1 tiles */

        NPATCH_THREE_PATCH_HORIZONTAL(Raylib.NPatchLayout.NPATCH_THREE_PATCH_HORIZONTAL)
    ;

        private final int value;

        private NPatchLayout(int value) {
            this.value = value;
        }

        private static final Map<Integer, NPatchLayout> BY_VALUE = new HashMap<>();

        static {
            for (NPatchLayout e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static NPatchLayout fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** OpenGL version */

    public enum rlGlVersion {


        /** OpenGL 1.1 */

        RL_OPENGL_11(Raylib.rlGlVersion.RL_OPENGL_11),

        /** OpenGL 2.1 (GLSL 120) */

        RL_OPENGL_21(Raylib.rlGlVersion.RL_OPENGL_21),

        /** OpenGL 3.3 (GLSL 330) */

        RL_OPENGL_33(Raylib.rlGlVersion.RL_OPENGL_33),

        /** OpenGL 4.3 (using GLSL 330) */

        RL_OPENGL_43(Raylib.rlGlVersion.RL_OPENGL_43),

        /** OpenGL ES 2.0 (GLSL 100) */

        RL_OPENGL_ES_20(Raylib.rlGlVersion.RL_OPENGL_ES_20),

        /** OpenGL ES 3.0 (GLSL 300 es) */

        RL_OPENGL_ES_30(Raylib.rlGlVersion.RL_OPENGL_ES_30)
    ;

        private final int value;

        private rlGlVersion(int value) {
            this.value = value;
        }

        private static final Map<Integer, rlGlVersion> BY_VALUE = new HashMap<>();

        static {
            for (rlGlVersion e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static rlGlVersion fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** Trace log level */

    public enum rlTraceLogLevel {


        /** Display all logs */

        RL_LOG_ALL(Raylib.rlTraceLogLevel.RL_LOG_ALL),

        /** Trace logging, intended for internal use only */

        RL_LOG_TRACE(Raylib.rlTraceLogLevel.RL_LOG_TRACE),

        /** Debug logging, used for internal debugging, it should be disabled on release builds */

        RL_LOG_DEBUG(Raylib.rlTraceLogLevel.RL_LOG_DEBUG),

        /** Info logging, used for program execution info */

        RL_LOG_INFO(Raylib.rlTraceLogLevel.RL_LOG_INFO),

        /** Warning logging, used on recoverable failures */

        RL_LOG_WARNING(Raylib.rlTraceLogLevel.RL_LOG_WARNING),

        /** Error logging, used on unrecoverable failures */

        RL_LOG_ERROR(Raylib.rlTraceLogLevel.RL_LOG_ERROR),

        /** Fatal logging, used to abort program: exit(EXIT_FAILURE) */

        RL_LOG_FATAL(Raylib.rlTraceLogLevel.RL_LOG_FATAL),

        /** Disable logging */

        RL_LOG_NONE(Raylib.rlTraceLogLevel.RL_LOG_NONE)
    ;

        private final int value;

        private rlTraceLogLevel(int value) {
            this.value = value;
        }

        private static final Map<Integer, rlTraceLogLevel> BY_VALUE = new HashMap<>();

        static {
            for (rlTraceLogLevel e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static rlTraceLogLevel fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** Texture pixel formats */

    public enum rlPixelFormat {


        /** 8 bit per pixel (no alpha) */

        RL_PIXELFORMAT_UNCOMPRESSED_GRAYSCALE(Raylib.rlPixelFormat.RL_PIXELFORMAT_UNCOMPRESSED_GRAYSCALE),

        /** 8*2 bpp (2 channels) */

        RL_PIXELFORMAT_UNCOMPRESSED_GRAY_ALPHA(Raylib.rlPixelFormat.RL_PIXELFORMAT_UNCOMPRESSED_GRAY_ALPHA),

        /** 16 bpp */

        RL_PIXELFORMAT_UNCOMPRESSED_R5G6B5(Raylib.rlPixelFormat.RL_PIXELFORMAT_UNCOMPRESSED_R5G6B5),

        /** 24 bpp */

        RL_PIXELFORMAT_UNCOMPRESSED_R8G8B8(Raylib.rlPixelFormat.RL_PIXELFORMAT_UNCOMPRESSED_R8G8B8),

        /** 16 bpp (1 bit alpha) */

        RL_PIXELFORMAT_UNCOMPRESSED_R5G5B5A1(Raylib.rlPixelFormat.RL_PIXELFORMAT_UNCOMPRESSED_R5G5B5A1),

        /** 16 bpp (4 bit alpha) */

        RL_PIXELFORMAT_UNCOMPRESSED_R4G4B4A4(Raylib.rlPixelFormat.RL_PIXELFORMAT_UNCOMPRESSED_R4G4B4A4),

        /** 32 bpp */

        RL_PIXELFORMAT_UNCOMPRESSED_R8G8B8A8(Raylib.rlPixelFormat.RL_PIXELFORMAT_UNCOMPRESSED_R8G8B8A8),

        /** 32 bpp (1 channel - float) */

        RL_PIXELFORMAT_UNCOMPRESSED_R32(Raylib.rlPixelFormat.RL_PIXELFORMAT_UNCOMPRESSED_R32),

        /** 32*3 bpp (3 channels - float) */

        RL_PIXELFORMAT_UNCOMPRESSED_R32G32B32(Raylib.rlPixelFormat.RL_PIXELFORMAT_UNCOMPRESSED_R32G32B32),

        /** 32*4 bpp (4 channels - float) */

        RL_PIXELFORMAT_UNCOMPRESSED_R32G32B32A32(Raylib.rlPixelFormat.RL_PIXELFORMAT_UNCOMPRESSED_R32G32B32A32),

        /** 16 bpp (1 channel - half float) */

        RL_PIXELFORMAT_UNCOMPRESSED_R16(Raylib.rlPixelFormat.RL_PIXELFORMAT_UNCOMPRESSED_R16),

        /** 16*3 bpp (3 channels - half float) */

        RL_PIXELFORMAT_UNCOMPRESSED_R16G16B16(Raylib.rlPixelFormat.RL_PIXELFORMAT_UNCOMPRESSED_R16G16B16),

        /** 16*4 bpp (4 channels - half float) */

        RL_PIXELFORMAT_UNCOMPRESSED_R16G16B16A16(Raylib.rlPixelFormat.RL_PIXELFORMAT_UNCOMPRESSED_R16G16B16A16),

        /** 4 bpp (no alpha) */

        RL_PIXELFORMAT_COMPRESSED_DXT1_RGB(Raylib.rlPixelFormat.RL_PIXELFORMAT_COMPRESSED_DXT1_RGB),

        /** 4 bpp (1 bit alpha) */

        RL_PIXELFORMAT_COMPRESSED_DXT1_RGBA(Raylib.rlPixelFormat.RL_PIXELFORMAT_COMPRESSED_DXT1_RGBA),

        /** 8 bpp */

        RL_PIXELFORMAT_COMPRESSED_DXT3_RGBA(Raylib.rlPixelFormat.RL_PIXELFORMAT_COMPRESSED_DXT3_RGBA),

        /** 8 bpp */

        RL_PIXELFORMAT_COMPRESSED_DXT5_RGBA(Raylib.rlPixelFormat.RL_PIXELFORMAT_COMPRESSED_DXT5_RGBA),

        /** 4 bpp */

        RL_PIXELFORMAT_COMPRESSED_ETC1_RGB(Raylib.rlPixelFormat.RL_PIXELFORMAT_COMPRESSED_ETC1_RGB),

        /** 4 bpp */

        RL_PIXELFORMAT_COMPRESSED_ETC2_RGB(Raylib.rlPixelFormat.RL_PIXELFORMAT_COMPRESSED_ETC2_RGB),

        /** 8 bpp */

        RL_PIXELFORMAT_COMPRESSED_ETC2_EAC_RGBA(Raylib.rlPixelFormat.RL_PIXELFORMAT_COMPRESSED_ETC2_EAC_RGBA),

        /** 4 bpp */

        RL_PIXELFORMAT_COMPRESSED_PVRT_RGB(Raylib.rlPixelFormat.RL_PIXELFORMAT_COMPRESSED_PVRT_RGB),

        /** 4 bpp */

        RL_PIXELFORMAT_COMPRESSED_PVRT_RGBA(Raylib.rlPixelFormat.RL_PIXELFORMAT_COMPRESSED_PVRT_RGBA),

        /** 8 bpp */

        RL_PIXELFORMAT_COMPRESSED_ASTC_4x4_RGBA(Raylib.rlPixelFormat.RL_PIXELFORMAT_COMPRESSED_ASTC_4x4_RGBA),

        /** 2 bpp */

        RL_PIXELFORMAT_COMPRESSED_ASTC_8x8_RGBA(Raylib.rlPixelFormat.RL_PIXELFORMAT_COMPRESSED_ASTC_8x8_RGBA)
    ;

        private final int value;

        private rlPixelFormat(int value) {
            this.value = value;
        }

        private static final Map<Integer, rlPixelFormat> BY_VALUE = new HashMap<>();

        static {
            for (rlPixelFormat e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static rlPixelFormat fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** Texture parameters: filter mode */

    public enum rlTextureFilter {


        /** No filter, just pixel approximation */

        RL_TEXTURE_FILTER_POINT(Raylib.rlTextureFilter.RL_TEXTURE_FILTER_POINT),

        /** Linear filtering */

        RL_TEXTURE_FILTER_BILINEAR(Raylib.rlTextureFilter.RL_TEXTURE_FILTER_BILINEAR),

        /** Trilinear filtering (linear with mipmaps) */

        RL_TEXTURE_FILTER_TRILINEAR(Raylib.rlTextureFilter.RL_TEXTURE_FILTER_TRILINEAR),

        /** Anisotropic filtering 4x */

        RL_TEXTURE_FILTER_ANISOTROPIC_4X(Raylib.rlTextureFilter.RL_TEXTURE_FILTER_ANISOTROPIC_4X),

        /** Anisotropic filtering 8x */

        RL_TEXTURE_FILTER_ANISOTROPIC_8X(Raylib.rlTextureFilter.RL_TEXTURE_FILTER_ANISOTROPIC_8X),

        /** Anisotropic filtering 16x */

        RL_TEXTURE_FILTER_ANISOTROPIC_16X(Raylib.rlTextureFilter.RL_TEXTURE_FILTER_ANISOTROPIC_16X)
    ;

        private final int value;

        private rlTextureFilter(int value) {
            this.value = value;
        }

        private static final Map<Integer, rlTextureFilter> BY_VALUE = new HashMap<>();

        static {
            for (rlTextureFilter e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static rlTextureFilter fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** Color blending modes (pre-defined) */

    public enum rlBlendMode {


        /** Blend textures considering alpha (default) */

        RL_BLEND_ALPHA(Raylib.rlBlendMode.RL_BLEND_ALPHA),

        /** Blend textures adding colors */

        RL_BLEND_ADDITIVE(Raylib.rlBlendMode.RL_BLEND_ADDITIVE),

        /** Blend textures multiplying colors */

        RL_BLEND_MULTIPLIED(Raylib.rlBlendMode.RL_BLEND_MULTIPLIED),

        /** Blend textures adding colors (alternative) */

        RL_BLEND_ADD_COLORS(Raylib.rlBlendMode.RL_BLEND_ADD_COLORS),

        /** Blend textures subtracting colors (alternative) */

        RL_BLEND_SUBTRACT_COLORS(Raylib.rlBlendMode.RL_BLEND_SUBTRACT_COLORS),

        /** Blend premultiplied textures considering alpha */

        RL_BLEND_ALPHA_PREMULTIPLY(Raylib.rlBlendMode.RL_BLEND_ALPHA_PREMULTIPLY),

        /** Blend textures using custom src/dst factors (use rlSetBlendFactors()) */

        RL_BLEND_CUSTOM(Raylib.rlBlendMode.RL_BLEND_CUSTOM),

        /** Blend textures using custom src/dst factors (use rlSetBlendFactorsSeparate()) */

        RL_BLEND_CUSTOM_SEPARATE(Raylib.rlBlendMode.RL_BLEND_CUSTOM_SEPARATE)
    ;

        private final int value;

        private rlBlendMode(int value) {
            this.value = value;
        }

        private static final Map<Integer, rlBlendMode> BY_VALUE = new HashMap<>();

        static {
            for (rlBlendMode e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static rlBlendMode fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** Shader location point type */

    public enum rlShaderLocationIndex {


        /** Shader location: vertex attribute: position */

        RL_SHADER_LOC_VERTEX_POSITION(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_VERTEX_POSITION),

        /** Shader location: vertex attribute: texcoord01 */

        RL_SHADER_LOC_VERTEX_TEXCOORD01(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_VERTEX_TEXCOORD01),

        /** Shader location: vertex attribute: texcoord02 */

        RL_SHADER_LOC_VERTEX_TEXCOORD02(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_VERTEX_TEXCOORD02),

        /** Shader location: vertex attribute: normal */

        RL_SHADER_LOC_VERTEX_NORMAL(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_VERTEX_NORMAL),

        /** Shader location: vertex attribute: tangent */

        RL_SHADER_LOC_VERTEX_TANGENT(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_VERTEX_TANGENT),

        /** Shader location: vertex attribute: color */

        RL_SHADER_LOC_VERTEX_COLOR(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_VERTEX_COLOR),

        /** Shader location: matrix uniform: model-view-projection */

        RL_SHADER_LOC_MATRIX_MVP(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MATRIX_MVP),

        /** Shader location: matrix uniform: view (camera transform) */

        RL_SHADER_LOC_MATRIX_VIEW(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MATRIX_VIEW),

        /** Shader location: matrix uniform: projection */

        RL_SHADER_LOC_MATRIX_PROJECTION(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MATRIX_PROJECTION),

        /** Shader location: matrix uniform: model (transform) */

        RL_SHADER_LOC_MATRIX_MODEL(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MATRIX_MODEL),

        /** Shader location: matrix uniform: normal */

        RL_SHADER_LOC_MATRIX_NORMAL(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MATRIX_NORMAL),

        /** Shader location: vector uniform: view */

        RL_SHADER_LOC_VECTOR_VIEW(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_VECTOR_VIEW),

        /** Shader location: vector uniform: diffuse color */

        RL_SHADER_LOC_COLOR_DIFFUSE(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_COLOR_DIFFUSE),

        /** Shader location: vector uniform: specular color */

        RL_SHADER_LOC_COLOR_SPECULAR(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_COLOR_SPECULAR),

        /** Shader location: vector uniform: ambient color */

        RL_SHADER_LOC_COLOR_AMBIENT(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_COLOR_AMBIENT),

        /** Shader location: sampler2d texture: albedo (same as: RL_SHADER_LOC_MAP_DIFFUSE) */

        RL_SHADER_LOC_MAP_ALBEDO(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MAP_ALBEDO),

        /** Shader location: sampler2d texture: metalness (same as: RL_SHADER_LOC_MAP_SPECULAR) */

        RL_SHADER_LOC_MAP_METALNESS(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MAP_METALNESS),

        /** Shader location: sampler2d texture: normal */

        RL_SHADER_LOC_MAP_NORMAL(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MAP_NORMAL),

        /** Shader location: sampler2d texture: roughness */

        RL_SHADER_LOC_MAP_ROUGHNESS(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MAP_ROUGHNESS),

        /** Shader location: sampler2d texture: occlusion */

        RL_SHADER_LOC_MAP_OCCLUSION(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MAP_OCCLUSION),

        /** Shader location: sampler2d texture: emission */

        RL_SHADER_LOC_MAP_EMISSION(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MAP_EMISSION),

        /** Shader location: sampler2d texture: height */

        RL_SHADER_LOC_MAP_HEIGHT(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MAP_HEIGHT),

        /** Shader location: samplerCube texture: cubemap */

        RL_SHADER_LOC_MAP_CUBEMAP(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MAP_CUBEMAP),

        /** Shader location: samplerCube texture: irradiance */

        RL_SHADER_LOC_MAP_IRRADIANCE(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MAP_IRRADIANCE),

        /** Shader location: samplerCube texture: prefilter */

        RL_SHADER_LOC_MAP_PREFILTER(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MAP_PREFILTER),

        /** Shader location: sampler2d texture: brdf */

        RL_SHADER_LOC_MAP_BRDF(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MAP_BRDF)
    ;

        private final int value;

        private rlShaderLocationIndex(int value) {
            this.value = value;
        }

        private static final Map<Integer, rlShaderLocationIndex> BY_VALUE = new HashMap<>();

        static {
            for (rlShaderLocationIndex e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static rlShaderLocationIndex fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** Shader uniform data type */

    public enum rlShaderUniformDataType {


        /** Shader uniform type: float */

        RL_SHADER_UNIFORM_FLOAT(Raylib.rlShaderUniformDataType.RL_SHADER_UNIFORM_FLOAT),

        /** Shader uniform type: vec2 (2 float) */

        RL_SHADER_UNIFORM_VEC2(Raylib.rlShaderUniformDataType.RL_SHADER_UNIFORM_VEC2),

        /** Shader uniform type: vec3 (3 float) */

        RL_SHADER_UNIFORM_VEC3(Raylib.rlShaderUniformDataType.RL_SHADER_UNIFORM_VEC3),

        /** Shader uniform type: vec4 (4 float) */

        RL_SHADER_UNIFORM_VEC4(Raylib.rlShaderUniformDataType.RL_SHADER_UNIFORM_VEC4),

        /** Shader uniform type: int */

        RL_SHADER_UNIFORM_INT(Raylib.rlShaderUniformDataType.RL_SHADER_UNIFORM_INT),

        /** Shader uniform type: ivec2 (2 int) */

        RL_SHADER_UNIFORM_IVEC2(Raylib.rlShaderUniformDataType.RL_SHADER_UNIFORM_IVEC2),

        /** Shader uniform type: ivec3 (3 int) */

        RL_SHADER_UNIFORM_IVEC3(Raylib.rlShaderUniformDataType.RL_SHADER_UNIFORM_IVEC3),

        /** Shader uniform type: ivec4 (4 int) */

        RL_SHADER_UNIFORM_IVEC4(Raylib.rlShaderUniformDataType.RL_SHADER_UNIFORM_IVEC4),

        /** Shader uniform type: unsigned int */

        RL_SHADER_UNIFORM_UINT(Raylib.rlShaderUniformDataType.RL_SHADER_UNIFORM_UINT),

        /** Shader uniform type: uivec2 (2 unsigned int) */

        RL_SHADER_UNIFORM_UIVEC2(Raylib.rlShaderUniformDataType.RL_SHADER_UNIFORM_UIVEC2),

        /** Shader uniform type: uivec3 (3 unsigned int) */

        RL_SHADER_UNIFORM_UIVEC3(Raylib.rlShaderUniformDataType.RL_SHADER_UNIFORM_UIVEC3),

        /** Shader uniform type: uivec4 (4 unsigned int) */

        RL_SHADER_UNIFORM_UIVEC4(Raylib.rlShaderUniformDataType.RL_SHADER_UNIFORM_UIVEC4),

        /** Shader uniform type: sampler2d */

        RL_SHADER_UNIFORM_SAMPLER2D(Raylib.rlShaderUniformDataType.RL_SHADER_UNIFORM_SAMPLER2D)
    ;

        private final int value;

        private rlShaderUniformDataType(int value) {
            this.value = value;
        }

        private static final Map<Integer, rlShaderUniformDataType> BY_VALUE = new HashMap<>();

        static {
            for (rlShaderUniformDataType e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static rlShaderUniformDataType fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** Shader attribute data types */

    public enum rlShaderAttributeDataType {


        /** Shader attribute type: float */

        RL_SHADER_ATTRIB_FLOAT(Raylib.rlShaderAttributeDataType.RL_SHADER_ATTRIB_FLOAT),

        /** Shader attribute type: vec2 (2 float) */

        RL_SHADER_ATTRIB_VEC2(Raylib.rlShaderAttributeDataType.RL_SHADER_ATTRIB_VEC2),

        /** Shader attribute type: vec3 (3 float) */

        RL_SHADER_ATTRIB_VEC3(Raylib.rlShaderAttributeDataType.RL_SHADER_ATTRIB_VEC3),

        /** Shader attribute type: vec4 (4 float) */

        RL_SHADER_ATTRIB_VEC4(Raylib.rlShaderAttributeDataType.RL_SHADER_ATTRIB_VEC4)
    ;

        private final int value;

        private rlShaderAttributeDataType(int value) {
            this.value = value;
        }

        private static final Map<Integer, rlShaderAttributeDataType> BY_VALUE = new HashMap<>();

        static {
            for (rlShaderAttributeDataType e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static rlShaderAttributeDataType fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** Framebuffer attachment type */

    public enum rlFramebufferAttachType {


        /** Framebuffer attachment type: color 0 */

        RL_ATTACHMENT_COLOR_CHANNEL0(Raylib.rlFramebufferAttachType.RL_ATTACHMENT_COLOR_CHANNEL0),

        /** Framebuffer attachment type: color 1 */

        RL_ATTACHMENT_COLOR_CHANNEL1(Raylib.rlFramebufferAttachType.RL_ATTACHMENT_COLOR_CHANNEL1),

        /** Framebuffer attachment type: color 2 */

        RL_ATTACHMENT_COLOR_CHANNEL2(Raylib.rlFramebufferAttachType.RL_ATTACHMENT_COLOR_CHANNEL2),

        /** Framebuffer attachment type: color 3 */

        RL_ATTACHMENT_COLOR_CHANNEL3(Raylib.rlFramebufferAttachType.RL_ATTACHMENT_COLOR_CHANNEL3),

        /** Framebuffer attachment type: color 4 */

        RL_ATTACHMENT_COLOR_CHANNEL4(Raylib.rlFramebufferAttachType.RL_ATTACHMENT_COLOR_CHANNEL4),

        /** Framebuffer attachment type: color 5 */

        RL_ATTACHMENT_COLOR_CHANNEL5(Raylib.rlFramebufferAttachType.RL_ATTACHMENT_COLOR_CHANNEL5),

        /** Framebuffer attachment type: color 6 */

        RL_ATTACHMENT_COLOR_CHANNEL6(Raylib.rlFramebufferAttachType.RL_ATTACHMENT_COLOR_CHANNEL6),

        /** Framebuffer attachment type: color 7 */

        RL_ATTACHMENT_COLOR_CHANNEL7(Raylib.rlFramebufferAttachType.RL_ATTACHMENT_COLOR_CHANNEL7),

        /** Framebuffer attachment type: depth */

        RL_ATTACHMENT_DEPTH(Raylib.rlFramebufferAttachType.RL_ATTACHMENT_DEPTH),

        /** Framebuffer attachment type: stencil */

        RL_ATTACHMENT_STENCIL(Raylib.rlFramebufferAttachType.RL_ATTACHMENT_STENCIL)
    ;

        private final int value;

        private rlFramebufferAttachType(int value) {
            this.value = value;
        }

        private static final Map<Integer, rlFramebufferAttachType> BY_VALUE = new HashMap<>();

        static {
            for (rlFramebufferAttachType e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static rlFramebufferAttachType fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** Framebuffer texture attachment type */

    public enum rlFramebufferAttachTextureType {


        /** Framebuffer texture attachment type: cubemap, +X side */

        RL_ATTACHMENT_CUBEMAP_POSITIVE_X(Raylib.rlFramebufferAttachTextureType.RL_ATTACHMENT_CUBEMAP_POSITIVE_X),

        /** Framebuffer texture attachment type: cubemap, -X side */

        RL_ATTACHMENT_CUBEMAP_NEGATIVE_X(Raylib.rlFramebufferAttachTextureType.RL_ATTACHMENT_CUBEMAP_NEGATIVE_X),

        /** Framebuffer texture attachment type: cubemap, +Y side */

        RL_ATTACHMENT_CUBEMAP_POSITIVE_Y(Raylib.rlFramebufferAttachTextureType.RL_ATTACHMENT_CUBEMAP_POSITIVE_Y),

        /** Framebuffer texture attachment type: cubemap, -Y side */

        RL_ATTACHMENT_CUBEMAP_NEGATIVE_Y(Raylib.rlFramebufferAttachTextureType.RL_ATTACHMENT_CUBEMAP_NEGATIVE_Y),

        /** Framebuffer texture attachment type: cubemap, +Z side */

        RL_ATTACHMENT_CUBEMAP_POSITIVE_Z(Raylib.rlFramebufferAttachTextureType.RL_ATTACHMENT_CUBEMAP_POSITIVE_Z),

        /** Framebuffer texture attachment type: cubemap, -Z side */

        RL_ATTACHMENT_CUBEMAP_NEGATIVE_Z(Raylib.rlFramebufferAttachTextureType.RL_ATTACHMENT_CUBEMAP_NEGATIVE_Z),

        /** Framebuffer texture attachment type: texture2d */

        RL_ATTACHMENT_TEXTURE2D(Raylib.rlFramebufferAttachTextureType.RL_ATTACHMENT_TEXTURE2D),

        /** Framebuffer texture attachment type: renderbuffer */

        RL_ATTACHMENT_RENDERBUFFER(Raylib.rlFramebufferAttachTextureType.RL_ATTACHMENT_RENDERBUFFER)
    ;

        private final int value;

        private rlFramebufferAttachTextureType(int value) {
            this.value = value;
        }

        private static final Map<Integer, rlFramebufferAttachTextureType> BY_VALUE = new HashMap<>();

        static {
            for (rlFramebufferAttachTextureType e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static rlFramebufferAttachTextureType fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


    /** Face culling mode */

    public enum rlCullMode {


        /**  */

        RL_CULL_FACE_FRONT(Raylib.rlCullMode.RL_CULL_FACE_FRONT),

        /**  */

        RL_CULL_FACE_BACK(Raylib.rlCullMode.RL_CULL_FACE_BACK)
    ;

        private final int value;

        private rlCullMode(int value) {
            this.value = value;
        }

        private static final Map<Integer, rlCullMode> BY_VALUE = new HashMap<>();

        static {
            for (rlCullMode e : values()) {
                BY_VALUE.put(e.value, e);
            }
        }

        private static rlCullMode fromValue(int value) {
            return BY_VALUE.get(value);
        }
    }


}
