// https://www.hackerrank.com/challenges/java-end-of-file/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            System.out.println("" + i++ + " " + sc.nextLine());
        }
    }
}
