package org.codeWars;

public class Kata
{
    //https://www.codewars.com/kata/5839edaa6754d6fec10000a2/train/java
    public static char findMissingLetter(char[] array)
    {
        for (int i = 1; i < array.length; i++) {
            int intDiff = (int) array[i] - (int) array[i-1];
            if (intDiff != 1) {
                return (char) ((int) array[i] - 1);
            }
        }
        return ' ';
    }
}
