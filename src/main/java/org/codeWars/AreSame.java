package org.codeWars;

import java.util.Arrays;

// https://www.codewars.com/kata/550498447451fbbd7600041c/train/java
public class AreSame {

    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null) return false;
        int[] aa = Arrays.stream(a).map(n -> n * n).sorted().toArray();
        return Arrays.compare(aa, Arrays.stream(b).sorted().toArray()) == 0;
    }
}