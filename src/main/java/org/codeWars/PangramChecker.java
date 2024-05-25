package org.codeWars;

public class PangramChecker {
    public boolean check(String sentence){
        boolean[] alphabet = new boolean[25];
        int index;
        for (char c: sentence.toLowerCase().toCharArray()) {
            index = (int) c - (int) 'a';
            if (index < 25 && index >= 0 ) {
                alphabet[index] = true;
            }
        }
        for (boolean b: alphabet) {
            if (!b) {
                return false;
            }
        }
        return true;
    }
}