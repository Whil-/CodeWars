package org.codeWars;

public class PigLatin {
    public static String pigIt(String str) {
        String[] words = str.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            if (words[i].matches("\\b\\w+\\b")) {
                words[i] = words[i].substring(1) + words[i].charAt(0) + "ay";
            }
        }
        return String.join(" ", words);
    }
}
