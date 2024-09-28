package org.codeWars;

import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateEncoder {
    public static String encode(String word) {
        // Create index
        Map<Character, Long> charCountMap = word.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        // Create return value
        StringBuilder output = new StringBuilder();
        for (char c : word.toLowerCase().toCharArray()) {
            if (charCountMap.get(c) < 2) {
                output.append("(");
            } else {
                output.append(")");
            }
        }
        return output.toString();
    }
}
