package br.com.vsibrasil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VSValidation {

    public static boolean containsOnlyLettersRegex(String str) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

}
