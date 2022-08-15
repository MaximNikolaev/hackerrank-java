// https://www.hackerrank.com/challenges/java-output-formatting/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");

        int max = 3;
        String[] arrstr = new String[max];

        for (int i = 0; i < max; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            arrstr[i] = getAlignedString(s1, x);

        }

        for (int i = 0; i < arrstr.length; i++) {
            System.out.println(arrstr[i]);
        }

        System.out.println("================================");

    }

    private static String getAlignedString(String s1, int x) {
        StringBuilder sb = new StringBuilder();

        //adding s1
        sb.append(s1);

        //up to 15 spaces
        while (sb.length() < 15) {
            sb.append(" ");
        }

        if (x >= 10 && x <= 99) {
            sb.append("0");
        } else if (x >= 0 && x < 10) {
            sb.append("00");
        }

        sb.append(x);

        return sb.toString();
    }
}
