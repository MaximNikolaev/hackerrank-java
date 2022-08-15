// https://www.hackerrank.com/challenges/java-loops/

import java.util.*;
import java.io.*;

class Solution {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            printSeries(a, b, n);
        }
        in.close();
    }

    private static void printSeries(int a, int b, int n) {
        String[] result = new String[n];
        int currentValue = 0;
        for (int i = 0; i < n; i++) {
            currentValue += Math.pow(2, i) * b;
            result[i] = "" + (a + currentValue);
        }
        System.out.println(String.join(" ", result));
    }

}
