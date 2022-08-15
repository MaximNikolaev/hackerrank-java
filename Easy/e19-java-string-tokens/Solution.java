// https://www.hackerrank.com/challenges/java-string-tokens/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if (s.trim().equals("")) {
            System.out.println(0);
        } else {

            String[] arr = s.trim().split("[ !,?._'@]+");

            System.out.println(arr.length);
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

        }
        scan.close();
    }
}

