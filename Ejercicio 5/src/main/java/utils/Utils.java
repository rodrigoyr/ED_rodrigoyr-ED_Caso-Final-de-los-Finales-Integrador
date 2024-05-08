package utils;

import java.util.regex.Pattern;

public class Utils {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
    private static final Pattern ALIAS_PATTERN = Pattern.compile("^[a-zA-Z0-9_]+$");

    public static boolean isValidEmail(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }

    public static boolean isValidAlias(String alias) {
        return ALIAS_PATTERN.matcher(alias).matches();
    }
}