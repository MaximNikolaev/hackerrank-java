// https://www.hackerrank.com/challenges/java-exception-handling-try-catch/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        //failed for 2147483648

        Scanner sc = new Scanner(System.in);

        try {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int z = x / y;

            System.out.println(z);

        } catch (Exception e) {

            String eName = e.getClass().getName().toString();
            if (eName.equals("java.lang.ArithmeticException")) {
                System.out.println(e.toString());
            } else {
                System.out.println(eName);
            }

        }
    }

}
