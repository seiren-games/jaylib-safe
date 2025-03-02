package org.example;

import com.raylib.Raylib;
import java.util.HashMap;
import java.util.Map;

public class RaylibWrapper {


    public enum ConfigFlags {

    
        FLAG_VSYNC_HINT(Raylib.ConfigFlags.FLAG_VSYNC_HINT),
        FLAG_FULLSCREEN_MODE(Raylib.ConfigFlags.FLAG_FULLSCREEN_MODE),
        FLAG_WINDOW_RESIZABLE(Raylib.ConfigFlags.FLAG_WINDOW_RESIZABLE),
        FLAG_WINDOW_UNDECORATED(Raylib.ConfigFlags.FLAG_WINDOW_UNDECORATED),
        FLAG_WINDOW_HIDDEN(Raylib.ConfigFlags.FLAG_WINDOW_HIDDEN),
        FLAG_WINDOW_MINIMIZED(Raylib.ConfigFlags.FLAG_WINDOW_MINIMIZED),
        FLAG_WINDOW_MAXIMIZED(Raylib.ConfigFlags.FLAG_WINDOW_MAXIMIZED),
        FLAG_WINDOW_UNFOCUSED(Raylib.ConfigFlags.FLAG_WINDOW_UNFOCUSED),
        FLAG_WINDOW_TOPMOST(Raylib.ConfigFlags.FLAG_WINDOW_TOPMOST),
        FLAG_WINDOW_ALWAYS_RUN(Raylib.ConfigFlags.FLAG_WINDOW_ALWAYS_RUN),
        FLAG_WINDOW_TRANSPARENT(Raylib.ConfigFlags.FLAG_WINDOW_TRANSPARENT),
        FLAG_WINDOW_HIGHDPI(Raylib.ConfigFlags.FLAG_WINDOW_HIGHDPI),
        FLAG_WINDOW_MOUSE_PASSTHROUGH(Raylib.ConfigFlags.FLAG_WINDOW_MOUSE_PASSTHROUGH),
        FLAG_BORDERLESS_WINDOWED_MODE(Raylib.ConfigFlags.FLAG_BORDERLESS_WINDOWED_MODE),
        FLAG_MSAA_4X_HINT(Raylib.ConfigFlags.FLAG_MSAA_4X_HINT),
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
    public enum TraceLogLevel {

    
        LOG_ALL(Raylib.TraceLogLevel.LOG_ALL),
        LOG_TRACE(Raylib.TraceLogLevel.LOG_TRACE),
        LOG_DEBUG(Raylib.TraceLogLevel.LOG_DEBUG),
        LOG_INFO(Raylib.TraceLogLevel.LOG_INFO),
        LOG_WARNING(Raylib.TraceLogLevel.LOG_WARNING),
        LOG_ERROR(Raylib.TraceLogLevel.LOG_ERROR),
        LOG_FATAL(Raylib.TraceLogLevel.LOG_FATAL),
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
    public enum KeyboardKey {

    
        KEY_NULL(Raylib.KeyboardKey.KEY_NULL),
        KEY_APOSTROPHE(Raylib.KeyboardKey.KEY_APOSTROPHE),
        KEY_COMMA(Raylib.KeyboardKey.KEY_COMMA),
        KEY_MINUS(Raylib.KeyboardKey.KEY_MINUS),
        KEY_PERIOD(Raylib.KeyboardKey.KEY_PERIOD),
        KEY_SLASH(Raylib.KeyboardKey.KEY_SLASH),
        KEY_ZERO(Raylib.KeyboardKey.KEY_ZERO),
        KEY_ONE(Raylib.KeyboardKey.KEY_ONE),
        KEY_TWO(Raylib.KeyboardKey.KEY_TWO),
        KEY_THREE(Raylib.KeyboardKey.KEY_THREE),
        KEY_FOUR(Raylib.KeyboardKey.KEY_FOUR),
        KEY_FIVE(Raylib.KeyboardKey.KEY_FIVE),
        KEY_SIX(Raylib.KeyboardKey.KEY_SIX),
        KEY_SEVEN(Raylib.KeyboardKey.KEY_SEVEN),
        KEY_EIGHT(Raylib.KeyboardKey.KEY_EIGHT),
        KEY_NINE(Raylib.KeyboardKey.KEY_NINE),
        KEY_SEMICOLON(Raylib.KeyboardKey.KEY_SEMICOLON),
        KEY_EQUAL(Raylib.KeyboardKey.KEY_EQUAL),
        KEY_A(Raylib.KeyboardKey.KEY_A),
        KEY_B(Raylib.KeyboardKey.KEY_B),
        KEY_C(Raylib.KeyboardKey.KEY_C),
        KEY_D(Raylib.KeyboardKey.KEY_D),
        KEY_E(Raylib.KeyboardKey.KEY_E),
        KEY_F(Raylib.KeyboardKey.KEY_F),
        KEY_G(Raylib.KeyboardKey.KEY_G),
        KEY_H(Raylib.KeyboardKey.KEY_H),
        KEY_I(Raylib.KeyboardKey.KEY_I),
        KEY_J(Raylib.KeyboardKey.KEY_J),
        KEY_K(Raylib.KeyboardKey.KEY_K),
        KEY_L(Raylib.KeyboardKey.KEY_L),
        KEY_M(Raylib.KeyboardKey.KEY_M),
        KEY_N(Raylib.KeyboardKey.KEY_N),
        KEY_O(Raylib.KeyboardKey.KEY_O),
        KEY_P(Raylib.KeyboardKey.KEY_P),
        KEY_Q(Raylib.KeyboardKey.KEY_Q),
        KEY_R(Raylib.KeyboardKey.KEY_R),
        KEY_S(Raylib.KeyboardKey.KEY_S),
        KEY_T(Raylib.KeyboardKey.KEY_T),
        KEY_U(Raylib.KeyboardKey.KEY_U),
        KEY_V(Raylib.KeyboardKey.KEY_V),
        KEY_W(Raylib.KeyboardKey.KEY_W),
        KEY_X(Raylib.KeyboardKey.KEY_X),
        KEY_Y(Raylib.KeyboardKey.KEY_Y),
        KEY_Z(Raylib.KeyboardKey.KEY_Z),
        KEY_LEFT_BRACKET(Raylib.KeyboardKey.KEY_LEFT_BRACKET),
        KEY_BACKSLASH(Raylib.KeyboardKey.KEY_BACKSLASH),
        KEY_RIGHT_BRACKET(Raylib.KeyboardKey.KEY_RIGHT_BRACKET),
        KEY_GRAVE(Raylib.KeyboardKey.KEY_GRAVE),
        KEY_SPACE(Raylib.KeyboardKey.KEY_SPACE),
        KEY_ESCAPE(Raylib.KeyboardKey.KEY_ESCAPE),
        KEY_ENTER(Raylib.KeyboardKey.KEY_ENTER),
        KEY_TAB(Raylib.KeyboardKey.KEY_TAB),
        KEY_BACKSPACE(Raylib.KeyboardKey.KEY_BACKSPACE),
        KEY_INSERT(Raylib.KeyboardKey.KEY_INSERT),
        KEY_DELETE(Raylib.KeyboardKey.KEY_DELETE),
        KEY_RIGHT(Raylib.KeyboardKey.KEY_RIGHT),
        KEY_LEFT(Raylib.KeyboardKey.KEY_LEFT),
        KEY_DOWN(Raylib.KeyboardKey.KEY_DOWN),
        KEY_UP(Raylib.KeyboardKey.KEY_UP),
        KEY_PAGE_UP(Raylib.KeyboardKey.KEY_PAGE_UP),
        KEY_PAGE_DOWN(Raylib.KeyboardKey.KEY_PAGE_DOWN),
        KEY_HOME(Raylib.KeyboardKey.KEY_HOME),
        KEY_END(Raylib.KeyboardKey.KEY_END),
        KEY_CAPS_LOCK(Raylib.KeyboardKey.KEY_CAPS_LOCK),
        KEY_SCROLL_LOCK(Raylib.KeyboardKey.KEY_SCROLL_LOCK),
        KEY_NUM_LOCK(Raylib.KeyboardKey.KEY_NUM_LOCK),
        KEY_PRINT_SCREEN(Raylib.KeyboardKey.KEY_PRINT_SCREEN),
        KEY_PAUSE(Raylib.KeyboardKey.KEY_PAUSE),
        KEY_F1(Raylib.KeyboardKey.KEY_F1),
        KEY_F2(Raylib.KeyboardKey.KEY_F2),
        KEY_F3(Raylib.KeyboardKey.KEY_F3),
        KEY_F4(Raylib.KeyboardKey.KEY_F4),
        KEY_F5(Raylib.KeyboardKey.KEY_F5),
        KEY_F6(Raylib.KeyboardKey.KEY_F6),
        KEY_F7(Raylib.KeyboardKey.KEY_F7),
        KEY_F8(Raylib.KeyboardKey.KEY_F8),
        KEY_F9(Raylib.KeyboardKey.KEY_F9),
        KEY_F10(Raylib.KeyboardKey.KEY_F10),
        KEY_F11(Raylib.KeyboardKey.KEY_F11),
        KEY_F12(Raylib.KeyboardKey.KEY_F12),
        KEY_LEFT_SHIFT(Raylib.KeyboardKey.KEY_LEFT_SHIFT),
        KEY_LEFT_CONTROL(Raylib.KeyboardKey.KEY_LEFT_CONTROL),
        KEY_LEFT_ALT(Raylib.KeyboardKey.KEY_LEFT_ALT),
        KEY_LEFT_SUPER(Raylib.KeyboardKey.KEY_LEFT_SUPER),
        KEY_RIGHT_SHIFT(Raylib.KeyboardKey.KEY_RIGHT_SHIFT),
        KEY_RIGHT_CONTROL(Raylib.KeyboardKey.KEY_RIGHT_CONTROL),
        KEY_RIGHT_ALT(Raylib.KeyboardKey.KEY_RIGHT_ALT),
        KEY_RIGHT_SUPER(Raylib.KeyboardKey.KEY_RIGHT_SUPER),
        KEY_KB_MENU(Raylib.KeyboardKey.KEY_KB_MENU),
        KEY_KP_0(Raylib.KeyboardKey.KEY_KP_0),
        KEY_KP_1(Raylib.KeyboardKey.KEY_KP_1),
        KEY_KP_2(Raylib.KeyboardKey.KEY_KP_2),
        KEY_KP_3(Raylib.KeyboardKey.KEY_KP_3),
        KEY_KP_4(Raylib.KeyboardKey.KEY_KP_4),
        KEY_KP_5(Raylib.KeyboardKey.KEY_KP_5),
        KEY_KP_6(Raylib.KeyboardKey.KEY_KP_6),
        KEY_KP_7(Raylib.KeyboardKey.KEY_KP_7),
        KEY_KP_8(Raylib.KeyboardKey.KEY_KP_8),
        KEY_KP_9(Raylib.KeyboardKey.KEY_KP_9),
        KEY_KP_DECIMAL(Raylib.KeyboardKey.KEY_KP_DECIMAL),
        KEY_KP_DIVIDE(Raylib.KeyboardKey.KEY_KP_DIVIDE),
        KEY_KP_MULTIPLY(Raylib.KeyboardKey.KEY_KP_MULTIPLY),
        KEY_KP_SUBTRACT(Raylib.KeyboardKey.KEY_KP_SUBTRACT),
        KEY_KP_ADD(Raylib.KeyboardKey.KEY_KP_ADD),
        KEY_KP_ENTER(Raylib.KeyboardKey.KEY_KP_ENTER),
        KEY_KP_EQUAL(Raylib.KeyboardKey.KEY_KP_EQUAL),
        KEY_BACK(Raylib.KeyboardKey.KEY_BACK),
        KEY_MENU(Raylib.KeyboardKey.KEY_MENU),
        KEY_VOLUME_UP(Raylib.KeyboardKey.KEY_VOLUME_UP),
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
    public enum MouseButton {

    
        MOUSE_BUTTON_LEFT(Raylib.MouseButton.MOUSE_BUTTON_LEFT),
        MOUSE_BUTTON_RIGHT(Raylib.MouseButton.MOUSE_BUTTON_RIGHT),
        MOUSE_BUTTON_MIDDLE(Raylib.MouseButton.MOUSE_BUTTON_MIDDLE),
        MOUSE_BUTTON_SIDE(Raylib.MouseButton.MOUSE_BUTTON_SIDE),
        MOUSE_BUTTON_EXTRA(Raylib.MouseButton.MOUSE_BUTTON_EXTRA),
        MOUSE_BUTTON_FORWARD(Raylib.MouseButton.MOUSE_BUTTON_FORWARD),
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
    public enum MouseCursor {

    
        MOUSE_CURSOR_DEFAULT(Raylib.MouseCursor.MOUSE_CURSOR_DEFAULT),
        MOUSE_CURSOR_ARROW(Raylib.MouseCursor.MOUSE_CURSOR_ARROW),
        MOUSE_CURSOR_IBEAM(Raylib.MouseCursor.MOUSE_CURSOR_IBEAM),
        MOUSE_CURSOR_CROSSHAIR(Raylib.MouseCursor.MOUSE_CURSOR_CROSSHAIR),
        MOUSE_CURSOR_POINTING_HAND(Raylib.MouseCursor.MOUSE_CURSOR_POINTING_HAND),
        MOUSE_CURSOR_RESIZE_EW(Raylib.MouseCursor.MOUSE_CURSOR_RESIZE_EW),
        MOUSE_CURSOR_RESIZE_NS(Raylib.MouseCursor.MOUSE_CURSOR_RESIZE_NS),
        MOUSE_CURSOR_RESIZE_NWSE(Raylib.MouseCursor.MOUSE_CURSOR_RESIZE_NWSE),
        MOUSE_CURSOR_RESIZE_NESW(Raylib.MouseCursor.MOUSE_CURSOR_RESIZE_NESW),
        MOUSE_CURSOR_RESIZE_ALL(Raylib.MouseCursor.MOUSE_CURSOR_RESIZE_ALL),
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
    public enum GamepadButton {

    
        GAMEPAD_BUTTON_UNKNOWN(Raylib.GamepadButton.GAMEPAD_BUTTON_UNKNOWN),
        GAMEPAD_BUTTON_LEFT_FACE_UP(Raylib.GamepadButton.GAMEPAD_BUTTON_LEFT_FACE_UP),
        GAMEPAD_BUTTON_LEFT_FACE_RIGHT(Raylib.GamepadButton.GAMEPAD_BUTTON_LEFT_FACE_RIGHT),
        GAMEPAD_BUTTON_LEFT_FACE_DOWN(Raylib.GamepadButton.GAMEPAD_BUTTON_LEFT_FACE_DOWN),
        GAMEPAD_BUTTON_LEFT_FACE_LEFT(Raylib.GamepadButton.GAMEPAD_BUTTON_LEFT_FACE_LEFT),
        GAMEPAD_BUTTON_RIGHT_FACE_UP(Raylib.GamepadButton.GAMEPAD_BUTTON_RIGHT_FACE_UP),
        GAMEPAD_BUTTON_RIGHT_FACE_RIGHT(Raylib.GamepadButton.GAMEPAD_BUTTON_RIGHT_FACE_RIGHT),
        GAMEPAD_BUTTON_RIGHT_FACE_DOWN(Raylib.GamepadButton.GAMEPAD_BUTTON_RIGHT_FACE_DOWN),
        GAMEPAD_BUTTON_RIGHT_FACE_LEFT(Raylib.GamepadButton.GAMEPAD_BUTTON_RIGHT_FACE_LEFT),
        GAMEPAD_BUTTON_LEFT_TRIGGER_1(Raylib.GamepadButton.GAMEPAD_BUTTON_LEFT_TRIGGER_1),
        GAMEPAD_BUTTON_LEFT_TRIGGER_2(Raylib.GamepadButton.GAMEPAD_BUTTON_LEFT_TRIGGER_2),
        GAMEPAD_BUTTON_RIGHT_TRIGGER_1(Raylib.GamepadButton.GAMEPAD_BUTTON_RIGHT_TRIGGER_1),
        GAMEPAD_BUTTON_RIGHT_TRIGGER_2(Raylib.GamepadButton.GAMEPAD_BUTTON_RIGHT_TRIGGER_2),
        GAMEPAD_BUTTON_MIDDLE_LEFT(Raylib.GamepadButton.GAMEPAD_BUTTON_MIDDLE_LEFT),
        GAMEPAD_BUTTON_MIDDLE(Raylib.GamepadButton.GAMEPAD_BUTTON_MIDDLE),
        GAMEPAD_BUTTON_MIDDLE_RIGHT(Raylib.GamepadButton.GAMEPAD_BUTTON_MIDDLE_RIGHT),
        GAMEPAD_BUTTON_LEFT_THUMB(Raylib.GamepadButton.GAMEPAD_BUTTON_LEFT_THUMB),
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
    public enum GamepadAxis {

    
        GAMEPAD_AXIS_LEFT_X(Raylib.GamepadAxis.GAMEPAD_AXIS_LEFT_X),
        GAMEPAD_AXIS_LEFT_Y(Raylib.GamepadAxis.GAMEPAD_AXIS_LEFT_Y),
        GAMEPAD_AXIS_RIGHT_X(Raylib.GamepadAxis.GAMEPAD_AXIS_RIGHT_X),
        GAMEPAD_AXIS_RIGHT_Y(Raylib.GamepadAxis.GAMEPAD_AXIS_RIGHT_Y),
        GAMEPAD_AXIS_LEFT_TRIGGER(Raylib.GamepadAxis.GAMEPAD_AXIS_LEFT_TRIGGER),
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
    public enum MaterialMapIndex {

    
        MATERIAL_MAP_ALBEDO(Raylib.MaterialMapIndex.MATERIAL_MAP_ALBEDO),
        MATERIAL_MAP_METALNESS(Raylib.MaterialMapIndex.MATERIAL_MAP_METALNESS),
        MATERIAL_MAP_NORMAL(Raylib.MaterialMapIndex.MATERIAL_MAP_NORMAL),
        MATERIAL_MAP_ROUGHNESS(Raylib.MaterialMapIndex.MATERIAL_MAP_ROUGHNESS),
        MATERIAL_MAP_OCCLUSION(Raylib.MaterialMapIndex.MATERIAL_MAP_OCCLUSION),
        MATERIAL_MAP_EMISSION(Raylib.MaterialMapIndex.MATERIAL_MAP_EMISSION),
        MATERIAL_MAP_HEIGHT(Raylib.MaterialMapIndex.MATERIAL_MAP_HEIGHT),
        MATERIAL_MAP_CUBEMAP(Raylib.MaterialMapIndex.MATERIAL_MAP_CUBEMAP),
        MATERIAL_MAP_IRRADIANCE(Raylib.MaterialMapIndex.MATERIAL_MAP_IRRADIANCE),
        MATERIAL_MAP_PREFILTER(Raylib.MaterialMapIndex.MATERIAL_MAP_PREFILTER),
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
    public enum ShaderLocationIndex {

    
        SHADER_LOC_VERTEX_POSITION(Raylib.ShaderLocationIndex.SHADER_LOC_VERTEX_POSITION),
        SHADER_LOC_VERTEX_TEXCOORD01(Raylib.ShaderLocationIndex.SHADER_LOC_VERTEX_TEXCOORD01),
        SHADER_LOC_VERTEX_TEXCOORD02(Raylib.ShaderLocationIndex.SHADER_LOC_VERTEX_TEXCOORD02),
        SHADER_LOC_VERTEX_NORMAL(Raylib.ShaderLocationIndex.SHADER_LOC_VERTEX_NORMAL),
        SHADER_LOC_VERTEX_TANGENT(Raylib.ShaderLocationIndex.SHADER_LOC_VERTEX_TANGENT),
        SHADER_LOC_VERTEX_COLOR(Raylib.ShaderLocationIndex.SHADER_LOC_VERTEX_COLOR),
        SHADER_LOC_MATRIX_MVP(Raylib.ShaderLocationIndex.SHADER_LOC_MATRIX_MVP),
        SHADER_LOC_MATRIX_VIEW(Raylib.ShaderLocationIndex.SHADER_LOC_MATRIX_VIEW),
        SHADER_LOC_MATRIX_PROJECTION(Raylib.ShaderLocationIndex.SHADER_LOC_MATRIX_PROJECTION),
        SHADER_LOC_MATRIX_MODEL(Raylib.ShaderLocationIndex.SHADER_LOC_MATRIX_MODEL),
        SHADER_LOC_MATRIX_NORMAL(Raylib.ShaderLocationIndex.SHADER_LOC_MATRIX_NORMAL),
        SHADER_LOC_VECTOR_VIEW(Raylib.ShaderLocationIndex.SHADER_LOC_VECTOR_VIEW),
        SHADER_LOC_COLOR_DIFFUSE(Raylib.ShaderLocationIndex.SHADER_LOC_COLOR_DIFFUSE),
        SHADER_LOC_COLOR_SPECULAR(Raylib.ShaderLocationIndex.SHADER_LOC_COLOR_SPECULAR),
        SHADER_LOC_COLOR_AMBIENT(Raylib.ShaderLocationIndex.SHADER_LOC_COLOR_AMBIENT),
        SHADER_LOC_MAP_ALBEDO(Raylib.ShaderLocationIndex.SHADER_LOC_MAP_ALBEDO),
        SHADER_LOC_MAP_METALNESS(Raylib.ShaderLocationIndex.SHADER_LOC_MAP_METALNESS),
        SHADER_LOC_MAP_NORMAL(Raylib.ShaderLocationIndex.SHADER_LOC_MAP_NORMAL),
        SHADER_LOC_MAP_ROUGHNESS(Raylib.ShaderLocationIndex.SHADER_LOC_MAP_ROUGHNESS),
        SHADER_LOC_MAP_OCCLUSION(Raylib.ShaderLocationIndex.SHADER_LOC_MAP_OCCLUSION),
        SHADER_LOC_MAP_EMISSION(Raylib.ShaderLocationIndex.SHADER_LOC_MAP_EMISSION),
        SHADER_LOC_MAP_HEIGHT(Raylib.ShaderLocationIndex.SHADER_LOC_MAP_HEIGHT),
        SHADER_LOC_MAP_CUBEMAP(Raylib.ShaderLocationIndex.SHADER_LOC_MAP_CUBEMAP),
        SHADER_LOC_MAP_IRRADIANCE(Raylib.ShaderLocationIndex.SHADER_LOC_MAP_IRRADIANCE),
        SHADER_LOC_MAP_PREFILTER(Raylib.ShaderLocationIndex.SHADER_LOC_MAP_PREFILTER),
        SHADER_LOC_MAP_BRDF(Raylib.ShaderLocationIndex.SHADER_LOC_MAP_BRDF),
        SHADER_LOC_VERTEX_BONEIDS(Raylib.ShaderLocationIndex.SHADER_LOC_VERTEX_BONEIDS),
        SHADER_LOC_VERTEX_BONEWEIGHTS(Raylib.ShaderLocationIndex.SHADER_LOC_VERTEX_BONEWEIGHTS),
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
    public enum ShaderUniformDataType {

    
        SHADER_UNIFORM_FLOAT(Raylib.ShaderUniformDataType.SHADER_UNIFORM_FLOAT),
        SHADER_UNIFORM_VEC2(Raylib.ShaderUniformDataType.SHADER_UNIFORM_VEC2),
        SHADER_UNIFORM_VEC3(Raylib.ShaderUniformDataType.SHADER_UNIFORM_VEC3),
        SHADER_UNIFORM_VEC4(Raylib.ShaderUniformDataType.SHADER_UNIFORM_VEC4),
        SHADER_UNIFORM_INT(Raylib.ShaderUniformDataType.SHADER_UNIFORM_INT),
        SHADER_UNIFORM_IVEC2(Raylib.ShaderUniformDataType.SHADER_UNIFORM_IVEC2),
        SHADER_UNIFORM_IVEC3(Raylib.ShaderUniformDataType.SHADER_UNIFORM_IVEC3),
        SHADER_UNIFORM_IVEC4(Raylib.ShaderUniformDataType.SHADER_UNIFORM_IVEC4),
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
    public enum ShaderAttributeDataType {

    
        SHADER_ATTRIB_FLOAT(Raylib.ShaderAttributeDataType.SHADER_ATTRIB_FLOAT),
        SHADER_ATTRIB_VEC2(Raylib.ShaderAttributeDataType.SHADER_ATTRIB_VEC2),
        SHADER_ATTRIB_VEC3(Raylib.ShaderAttributeDataType.SHADER_ATTRIB_VEC3),
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
    public enum PixelFormat {

    
        PIXELFORMAT_UNCOMPRESSED_GRAYSCALE(Raylib.PixelFormat.PIXELFORMAT_UNCOMPRESSED_GRAYSCALE),
        PIXELFORMAT_UNCOMPRESSED_GRAY_ALPHA(Raylib.PixelFormat.PIXELFORMAT_UNCOMPRESSED_GRAY_ALPHA),
        PIXELFORMAT_UNCOMPRESSED_R5G6B5(Raylib.PixelFormat.PIXELFORMAT_UNCOMPRESSED_R5G6B5),
        PIXELFORMAT_UNCOMPRESSED_R8G8B8(Raylib.PixelFormat.PIXELFORMAT_UNCOMPRESSED_R8G8B8),
        PIXELFORMAT_UNCOMPRESSED_R5G5B5A1(Raylib.PixelFormat.PIXELFORMAT_UNCOMPRESSED_R5G5B5A1),
        PIXELFORMAT_UNCOMPRESSED_R4G4B4A4(Raylib.PixelFormat.PIXELFORMAT_UNCOMPRESSED_R4G4B4A4),
        PIXELFORMAT_UNCOMPRESSED_R8G8B8A8(Raylib.PixelFormat.PIXELFORMAT_UNCOMPRESSED_R8G8B8A8),
        PIXELFORMAT_UNCOMPRESSED_R32(Raylib.PixelFormat.PIXELFORMAT_UNCOMPRESSED_R32),
        PIXELFORMAT_UNCOMPRESSED_R32G32B32(Raylib.PixelFormat.PIXELFORMAT_UNCOMPRESSED_R32G32B32),
        PIXELFORMAT_UNCOMPRESSED_R32G32B32A32(Raylib.PixelFormat.PIXELFORMAT_UNCOMPRESSED_R32G32B32A32),
        PIXELFORMAT_UNCOMPRESSED_R16(Raylib.PixelFormat.PIXELFORMAT_UNCOMPRESSED_R16),
        PIXELFORMAT_UNCOMPRESSED_R16G16B16(Raylib.PixelFormat.PIXELFORMAT_UNCOMPRESSED_R16G16B16),
        PIXELFORMAT_UNCOMPRESSED_R16G16B16A16(Raylib.PixelFormat.PIXELFORMAT_UNCOMPRESSED_R16G16B16A16),
        PIXELFORMAT_COMPRESSED_DXT1_RGB(Raylib.PixelFormat.PIXELFORMAT_COMPRESSED_DXT1_RGB),
        PIXELFORMAT_COMPRESSED_DXT1_RGBA(Raylib.PixelFormat.PIXELFORMAT_COMPRESSED_DXT1_RGBA),
        PIXELFORMAT_COMPRESSED_DXT3_RGBA(Raylib.PixelFormat.PIXELFORMAT_COMPRESSED_DXT3_RGBA),
        PIXELFORMAT_COMPRESSED_DXT5_RGBA(Raylib.PixelFormat.PIXELFORMAT_COMPRESSED_DXT5_RGBA),
        PIXELFORMAT_COMPRESSED_ETC1_RGB(Raylib.PixelFormat.PIXELFORMAT_COMPRESSED_ETC1_RGB),
        PIXELFORMAT_COMPRESSED_ETC2_RGB(Raylib.PixelFormat.PIXELFORMAT_COMPRESSED_ETC2_RGB),
        PIXELFORMAT_COMPRESSED_ETC2_EAC_RGBA(Raylib.PixelFormat.PIXELFORMAT_COMPRESSED_ETC2_EAC_RGBA),
        PIXELFORMAT_COMPRESSED_PVRT_RGB(Raylib.PixelFormat.PIXELFORMAT_COMPRESSED_PVRT_RGB),
        PIXELFORMAT_COMPRESSED_PVRT_RGBA(Raylib.PixelFormat.PIXELFORMAT_COMPRESSED_PVRT_RGBA),
        PIXELFORMAT_COMPRESSED_ASTC_4x4_RGBA(Raylib.PixelFormat.PIXELFORMAT_COMPRESSED_ASTC_4x4_RGBA),
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
    public enum TextureFilter {

    
        TEXTURE_FILTER_POINT(Raylib.TextureFilter.TEXTURE_FILTER_POINT),
        TEXTURE_FILTER_BILINEAR(Raylib.TextureFilter.TEXTURE_FILTER_BILINEAR),
        TEXTURE_FILTER_TRILINEAR(Raylib.TextureFilter.TEXTURE_FILTER_TRILINEAR),
        TEXTURE_FILTER_ANISOTROPIC_4X(Raylib.TextureFilter.TEXTURE_FILTER_ANISOTROPIC_4X),
        TEXTURE_FILTER_ANISOTROPIC_8X(Raylib.TextureFilter.TEXTURE_FILTER_ANISOTROPIC_8X),
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
    public enum TextureWrap {

    
        TEXTURE_WRAP_REPEAT(Raylib.TextureWrap.TEXTURE_WRAP_REPEAT),
        TEXTURE_WRAP_CLAMP(Raylib.TextureWrap.TEXTURE_WRAP_CLAMP),
        TEXTURE_WRAP_MIRROR_REPEAT(Raylib.TextureWrap.TEXTURE_WRAP_MIRROR_REPEAT),
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
    public enum CubemapLayout {

    
        CUBEMAP_LAYOUT_AUTO_DETECT(Raylib.CubemapLayout.CUBEMAP_LAYOUT_AUTO_DETECT),
        CUBEMAP_LAYOUT_LINE_VERTICAL(Raylib.CubemapLayout.CUBEMAP_LAYOUT_LINE_VERTICAL),
        CUBEMAP_LAYOUT_LINE_HORIZONTAL(Raylib.CubemapLayout.CUBEMAP_LAYOUT_LINE_HORIZONTAL),
        CUBEMAP_LAYOUT_CROSS_THREE_BY_FOUR(Raylib.CubemapLayout.CUBEMAP_LAYOUT_CROSS_THREE_BY_FOUR),
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
    public enum FontType {

    
        FONT_DEFAULT(Raylib.FontType.FONT_DEFAULT),
        FONT_BITMAP(Raylib.FontType.FONT_BITMAP),
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
    public enum BlendMode {

    
        BLEND_ALPHA(Raylib.BlendMode.BLEND_ALPHA),
        BLEND_ADDITIVE(Raylib.BlendMode.BLEND_ADDITIVE),
        BLEND_MULTIPLIED(Raylib.BlendMode.BLEND_MULTIPLIED),
        BLEND_ADD_COLORS(Raylib.BlendMode.BLEND_ADD_COLORS),
        BLEND_SUBTRACT_COLORS(Raylib.BlendMode.BLEND_SUBTRACT_COLORS),
        BLEND_ALPHA_PREMULTIPLY(Raylib.BlendMode.BLEND_ALPHA_PREMULTIPLY),
        BLEND_CUSTOM(Raylib.BlendMode.BLEND_CUSTOM),
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
    public enum Gesture {

    
        GESTURE_NONE(Raylib.Gesture.GESTURE_NONE),
        GESTURE_TAP(Raylib.Gesture.GESTURE_TAP),
        GESTURE_DOUBLETAP(Raylib.Gesture.GESTURE_DOUBLETAP),
        GESTURE_HOLD(Raylib.Gesture.GESTURE_HOLD),
        GESTURE_DRAG(Raylib.Gesture.GESTURE_DRAG),
        GESTURE_SWIPE_RIGHT(Raylib.Gesture.GESTURE_SWIPE_RIGHT),
        GESTURE_SWIPE_LEFT(Raylib.Gesture.GESTURE_SWIPE_LEFT),
        GESTURE_SWIPE_UP(Raylib.Gesture.GESTURE_SWIPE_UP),
        GESTURE_SWIPE_DOWN(Raylib.Gesture.GESTURE_SWIPE_DOWN),
        GESTURE_PINCH_IN(Raylib.Gesture.GESTURE_PINCH_IN),
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
    public enum CameraMode {

    
        CAMERA_CUSTOM(Raylib.CameraMode.CAMERA_CUSTOM),
        CAMERA_FREE(Raylib.CameraMode.CAMERA_FREE),
        CAMERA_ORBITAL(Raylib.CameraMode.CAMERA_ORBITAL),
        CAMERA_FIRST_PERSON(Raylib.CameraMode.CAMERA_FIRST_PERSON),
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
    public enum CameraProjection {

    
        CAMERA_PERSPECTIVE(Raylib.CameraProjection.CAMERA_PERSPECTIVE),
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
    public enum NPatchLayout {

    
        NPATCH_NINE_PATCH(Raylib.NPatchLayout.NPATCH_NINE_PATCH),
        NPATCH_THREE_PATCH_VERTICAL(Raylib.NPatchLayout.NPATCH_THREE_PATCH_VERTICAL),
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
    public enum rlGlVersion {

    
        RL_OPENGL_11(Raylib.rlGlVersion.RL_OPENGL_11),
        RL_OPENGL_21(Raylib.rlGlVersion.RL_OPENGL_21),
        RL_OPENGL_33(Raylib.rlGlVersion.RL_OPENGL_33),
        RL_OPENGL_43(Raylib.rlGlVersion.RL_OPENGL_43),
        RL_OPENGL_ES_20(Raylib.rlGlVersion.RL_OPENGL_ES_20),
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
    public enum rlTraceLogLevel {

    
        RL_LOG_ALL(Raylib.rlTraceLogLevel.RL_LOG_ALL),
        RL_LOG_TRACE(Raylib.rlTraceLogLevel.RL_LOG_TRACE),
        RL_LOG_DEBUG(Raylib.rlTraceLogLevel.RL_LOG_DEBUG),
        RL_LOG_INFO(Raylib.rlTraceLogLevel.RL_LOG_INFO),
        RL_LOG_WARNING(Raylib.rlTraceLogLevel.RL_LOG_WARNING),
        RL_LOG_ERROR(Raylib.rlTraceLogLevel.RL_LOG_ERROR),
        RL_LOG_FATAL(Raylib.rlTraceLogLevel.RL_LOG_FATAL),
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
    public enum rlPixelFormat {

    
        RL_PIXELFORMAT_UNCOMPRESSED_GRAYSCALE(Raylib.rlPixelFormat.RL_PIXELFORMAT_UNCOMPRESSED_GRAYSCALE),
        RL_PIXELFORMAT_UNCOMPRESSED_GRAY_ALPHA(Raylib.rlPixelFormat.RL_PIXELFORMAT_UNCOMPRESSED_GRAY_ALPHA),
        RL_PIXELFORMAT_UNCOMPRESSED_R5G6B5(Raylib.rlPixelFormat.RL_PIXELFORMAT_UNCOMPRESSED_R5G6B5),
        RL_PIXELFORMAT_UNCOMPRESSED_R8G8B8(Raylib.rlPixelFormat.RL_PIXELFORMAT_UNCOMPRESSED_R8G8B8),
        RL_PIXELFORMAT_UNCOMPRESSED_R5G5B5A1(Raylib.rlPixelFormat.RL_PIXELFORMAT_UNCOMPRESSED_R5G5B5A1),
        RL_PIXELFORMAT_UNCOMPRESSED_R4G4B4A4(Raylib.rlPixelFormat.RL_PIXELFORMAT_UNCOMPRESSED_R4G4B4A4),
        RL_PIXELFORMAT_UNCOMPRESSED_R8G8B8A8(Raylib.rlPixelFormat.RL_PIXELFORMAT_UNCOMPRESSED_R8G8B8A8),
        RL_PIXELFORMAT_UNCOMPRESSED_R32(Raylib.rlPixelFormat.RL_PIXELFORMAT_UNCOMPRESSED_R32),
        RL_PIXELFORMAT_UNCOMPRESSED_R32G32B32(Raylib.rlPixelFormat.RL_PIXELFORMAT_UNCOMPRESSED_R32G32B32),
        RL_PIXELFORMAT_UNCOMPRESSED_R32G32B32A32(Raylib.rlPixelFormat.RL_PIXELFORMAT_UNCOMPRESSED_R32G32B32A32),
        RL_PIXELFORMAT_UNCOMPRESSED_R16(Raylib.rlPixelFormat.RL_PIXELFORMAT_UNCOMPRESSED_R16),
        RL_PIXELFORMAT_UNCOMPRESSED_R16G16B16(Raylib.rlPixelFormat.RL_PIXELFORMAT_UNCOMPRESSED_R16G16B16),
        RL_PIXELFORMAT_UNCOMPRESSED_R16G16B16A16(Raylib.rlPixelFormat.RL_PIXELFORMAT_UNCOMPRESSED_R16G16B16A16),
        RL_PIXELFORMAT_COMPRESSED_DXT1_RGB(Raylib.rlPixelFormat.RL_PIXELFORMAT_COMPRESSED_DXT1_RGB),
        RL_PIXELFORMAT_COMPRESSED_DXT1_RGBA(Raylib.rlPixelFormat.RL_PIXELFORMAT_COMPRESSED_DXT1_RGBA),
        RL_PIXELFORMAT_COMPRESSED_DXT3_RGBA(Raylib.rlPixelFormat.RL_PIXELFORMAT_COMPRESSED_DXT3_RGBA),
        RL_PIXELFORMAT_COMPRESSED_DXT5_RGBA(Raylib.rlPixelFormat.RL_PIXELFORMAT_COMPRESSED_DXT5_RGBA),
        RL_PIXELFORMAT_COMPRESSED_ETC1_RGB(Raylib.rlPixelFormat.RL_PIXELFORMAT_COMPRESSED_ETC1_RGB),
        RL_PIXELFORMAT_COMPRESSED_ETC2_RGB(Raylib.rlPixelFormat.RL_PIXELFORMAT_COMPRESSED_ETC2_RGB),
        RL_PIXELFORMAT_COMPRESSED_ETC2_EAC_RGBA(Raylib.rlPixelFormat.RL_PIXELFORMAT_COMPRESSED_ETC2_EAC_RGBA),
        RL_PIXELFORMAT_COMPRESSED_PVRT_RGB(Raylib.rlPixelFormat.RL_PIXELFORMAT_COMPRESSED_PVRT_RGB),
        RL_PIXELFORMAT_COMPRESSED_PVRT_RGBA(Raylib.rlPixelFormat.RL_PIXELFORMAT_COMPRESSED_PVRT_RGBA),
        RL_PIXELFORMAT_COMPRESSED_ASTC_4x4_RGBA(Raylib.rlPixelFormat.RL_PIXELFORMAT_COMPRESSED_ASTC_4x4_RGBA),
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
    public enum rlTextureFilter {

    
        RL_TEXTURE_FILTER_POINT(Raylib.rlTextureFilter.RL_TEXTURE_FILTER_POINT),
        RL_TEXTURE_FILTER_BILINEAR(Raylib.rlTextureFilter.RL_TEXTURE_FILTER_BILINEAR),
        RL_TEXTURE_FILTER_TRILINEAR(Raylib.rlTextureFilter.RL_TEXTURE_FILTER_TRILINEAR),
        RL_TEXTURE_FILTER_ANISOTROPIC_4X(Raylib.rlTextureFilter.RL_TEXTURE_FILTER_ANISOTROPIC_4X),
        RL_TEXTURE_FILTER_ANISOTROPIC_8X(Raylib.rlTextureFilter.RL_TEXTURE_FILTER_ANISOTROPIC_8X),
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
    public enum rlBlendMode {

    
        RL_BLEND_ALPHA(Raylib.rlBlendMode.RL_BLEND_ALPHA),
        RL_BLEND_ADDITIVE(Raylib.rlBlendMode.RL_BLEND_ADDITIVE),
        RL_BLEND_MULTIPLIED(Raylib.rlBlendMode.RL_BLEND_MULTIPLIED),
        RL_BLEND_ADD_COLORS(Raylib.rlBlendMode.RL_BLEND_ADD_COLORS),
        RL_BLEND_SUBTRACT_COLORS(Raylib.rlBlendMode.RL_BLEND_SUBTRACT_COLORS),
        RL_BLEND_ALPHA_PREMULTIPLY(Raylib.rlBlendMode.RL_BLEND_ALPHA_PREMULTIPLY),
        RL_BLEND_CUSTOM(Raylib.rlBlendMode.RL_BLEND_CUSTOM),
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
    public enum rlShaderLocationIndex {

    
        RL_SHADER_LOC_VERTEX_POSITION(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_VERTEX_POSITION),
        RL_SHADER_LOC_VERTEX_TEXCOORD01(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_VERTEX_TEXCOORD01),
        RL_SHADER_LOC_VERTEX_TEXCOORD02(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_VERTEX_TEXCOORD02),
        RL_SHADER_LOC_VERTEX_NORMAL(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_VERTEX_NORMAL),
        RL_SHADER_LOC_VERTEX_TANGENT(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_VERTEX_TANGENT),
        RL_SHADER_LOC_VERTEX_COLOR(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_VERTEX_COLOR),
        RL_SHADER_LOC_MATRIX_MVP(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MATRIX_MVP),
        RL_SHADER_LOC_MATRIX_VIEW(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MATRIX_VIEW),
        RL_SHADER_LOC_MATRIX_PROJECTION(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MATRIX_PROJECTION),
        RL_SHADER_LOC_MATRIX_MODEL(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MATRIX_MODEL),
        RL_SHADER_LOC_MATRIX_NORMAL(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MATRIX_NORMAL),
        RL_SHADER_LOC_VECTOR_VIEW(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_VECTOR_VIEW),
        RL_SHADER_LOC_COLOR_DIFFUSE(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_COLOR_DIFFUSE),
        RL_SHADER_LOC_COLOR_SPECULAR(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_COLOR_SPECULAR),
        RL_SHADER_LOC_COLOR_AMBIENT(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_COLOR_AMBIENT),
        RL_SHADER_LOC_MAP_ALBEDO(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MAP_ALBEDO),
        RL_SHADER_LOC_MAP_METALNESS(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MAP_METALNESS),
        RL_SHADER_LOC_MAP_NORMAL(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MAP_NORMAL),
        RL_SHADER_LOC_MAP_ROUGHNESS(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MAP_ROUGHNESS),
        RL_SHADER_LOC_MAP_OCCLUSION(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MAP_OCCLUSION),
        RL_SHADER_LOC_MAP_EMISSION(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MAP_EMISSION),
        RL_SHADER_LOC_MAP_HEIGHT(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MAP_HEIGHT),
        RL_SHADER_LOC_MAP_CUBEMAP(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MAP_CUBEMAP),
        RL_SHADER_LOC_MAP_IRRADIANCE(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MAP_IRRADIANCE),
        RL_SHADER_LOC_MAP_PREFILTER(Raylib.rlShaderLocationIndex.RL_SHADER_LOC_MAP_PREFILTER),
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
    public enum rlShaderUniformDataType {

    
        RL_SHADER_UNIFORM_FLOAT(Raylib.rlShaderUniformDataType.RL_SHADER_UNIFORM_FLOAT),
        RL_SHADER_UNIFORM_VEC2(Raylib.rlShaderUniformDataType.RL_SHADER_UNIFORM_VEC2),
        RL_SHADER_UNIFORM_VEC3(Raylib.rlShaderUniformDataType.RL_SHADER_UNIFORM_VEC3),
        RL_SHADER_UNIFORM_VEC4(Raylib.rlShaderUniformDataType.RL_SHADER_UNIFORM_VEC4),
        RL_SHADER_UNIFORM_INT(Raylib.rlShaderUniformDataType.RL_SHADER_UNIFORM_INT),
        RL_SHADER_UNIFORM_IVEC2(Raylib.rlShaderUniformDataType.RL_SHADER_UNIFORM_IVEC2),
        RL_SHADER_UNIFORM_IVEC3(Raylib.rlShaderUniformDataType.RL_SHADER_UNIFORM_IVEC3),
        RL_SHADER_UNIFORM_IVEC4(Raylib.rlShaderUniformDataType.RL_SHADER_UNIFORM_IVEC4),
        RL_SHADER_UNIFORM_UINT(Raylib.rlShaderUniformDataType.RL_SHADER_UNIFORM_UINT),
        RL_SHADER_UNIFORM_UIVEC2(Raylib.rlShaderUniformDataType.RL_SHADER_UNIFORM_UIVEC2),
        RL_SHADER_UNIFORM_UIVEC3(Raylib.rlShaderUniformDataType.RL_SHADER_UNIFORM_UIVEC3),
        RL_SHADER_UNIFORM_UIVEC4(Raylib.rlShaderUniformDataType.RL_SHADER_UNIFORM_UIVEC4),
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
    public enum rlShaderAttributeDataType {

    
        RL_SHADER_ATTRIB_FLOAT(Raylib.rlShaderAttributeDataType.RL_SHADER_ATTRIB_FLOAT),
        RL_SHADER_ATTRIB_VEC2(Raylib.rlShaderAttributeDataType.RL_SHADER_ATTRIB_VEC2),
        RL_SHADER_ATTRIB_VEC3(Raylib.rlShaderAttributeDataType.RL_SHADER_ATTRIB_VEC3),
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
    public enum rlFramebufferAttachType {

    
        RL_ATTACHMENT_COLOR_CHANNEL0(Raylib.rlFramebufferAttachType.RL_ATTACHMENT_COLOR_CHANNEL0),
        RL_ATTACHMENT_COLOR_CHANNEL1(Raylib.rlFramebufferAttachType.RL_ATTACHMENT_COLOR_CHANNEL1),
        RL_ATTACHMENT_COLOR_CHANNEL2(Raylib.rlFramebufferAttachType.RL_ATTACHMENT_COLOR_CHANNEL2),
        RL_ATTACHMENT_COLOR_CHANNEL3(Raylib.rlFramebufferAttachType.RL_ATTACHMENT_COLOR_CHANNEL3),
        RL_ATTACHMENT_COLOR_CHANNEL4(Raylib.rlFramebufferAttachType.RL_ATTACHMENT_COLOR_CHANNEL4),
        RL_ATTACHMENT_COLOR_CHANNEL5(Raylib.rlFramebufferAttachType.RL_ATTACHMENT_COLOR_CHANNEL5),
        RL_ATTACHMENT_COLOR_CHANNEL6(Raylib.rlFramebufferAttachType.RL_ATTACHMENT_COLOR_CHANNEL6),
        RL_ATTACHMENT_COLOR_CHANNEL7(Raylib.rlFramebufferAttachType.RL_ATTACHMENT_COLOR_CHANNEL7),
        RL_ATTACHMENT_DEPTH(Raylib.rlFramebufferAttachType.RL_ATTACHMENT_DEPTH),
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
    public enum rlFramebufferAttachTextureType {

    
        RL_ATTACHMENT_CUBEMAP_POSITIVE_X(Raylib.rlFramebufferAttachTextureType.RL_ATTACHMENT_CUBEMAP_POSITIVE_X),
        RL_ATTACHMENT_CUBEMAP_NEGATIVE_X(Raylib.rlFramebufferAttachTextureType.RL_ATTACHMENT_CUBEMAP_NEGATIVE_X),
        RL_ATTACHMENT_CUBEMAP_POSITIVE_Y(Raylib.rlFramebufferAttachTextureType.RL_ATTACHMENT_CUBEMAP_POSITIVE_Y),
        RL_ATTACHMENT_CUBEMAP_NEGATIVE_Y(Raylib.rlFramebufferAttachTextureType.RL_ATTACHMENT_CUBEMAP_NEGATIVE_Y),
        RL_ATTACHMENT_CUBEMAP_POSITIVE_Z(Raylib.rlFramebufferAttachTextureType.RL_ATTACHMENT_CUBEMAP_POSITIVE_Z),
        RL_ATTACHMENT_CUBEMAP_NEGATIVE_Z(Raylib.rlFramebufferAttachTextureType.RL_ATTACHMENT_CUBEMAP_NEGATIVE_Z),
        RL_ATTACHMENT_TEXTURE2D(Raylib.rlFramebufferAttachTextureType.RL_ATTACHMENT_TEXTURE2D),
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
    public enum rlCullMode {

    
        RL_CULL_FACE_FRONT(Raylib.rlCullMode.RL_CULL_FACE_FRONT),
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
