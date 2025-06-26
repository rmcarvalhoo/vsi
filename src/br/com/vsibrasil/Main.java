package br.com.vsibrasil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distinct letters: ");
        String input = scanner.nextLine();

        List<String> result = Main.generatePermutations(input);
        result.forEach(System.out::println);
    }

    public static List<String> generatePermutations(String input) {
        boolean isValid = VSValidation.containsOnlyLettersRegex(input);
        if (isValid) {
            List<String> result = new ArrayList<>();
            generate("", input, result);
            return result;
        }  else {
            throw new RuntimeException("Invalid input");
        }
    }

    private static void generate(String prefix, String remaining, List<String> result) {
        if (remaining.isEmpty()) {
            result.add(prefix);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                generate(
                        prefix + remaining.charAt(i),
                        remaining.substring(0, i) + remaining.substring(i + 1),
                        result
                );
            }
        }
    }

}