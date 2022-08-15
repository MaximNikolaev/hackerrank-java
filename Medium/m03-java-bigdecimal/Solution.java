// https://www.hackerrank.com/challenges/java-bigdecimal/

import java.math.BigDecimal;
import java.util.*;

class Solution {
    public static void main(String[] args) {

        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        //Write your code here
        Arrays.sort(s, 0, s.length - 2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                BigDecimal b1 = new BigDecimal(o1);
                BigDecimal b2 = new BigDecimal(o2);

                return -b1.compareTo(b2);
            }
        });

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}