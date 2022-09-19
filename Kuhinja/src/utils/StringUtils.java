package utils;

public class StringUtils {

    public static String coloredText(String text, String color) {
        return color + text + Color.ANSI_RESET;
    }
}
