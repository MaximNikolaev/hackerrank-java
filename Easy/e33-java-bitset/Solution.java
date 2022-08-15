// https://www.hackerrank.com/challenges/java-bitset/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        BitSet bs1 = new BitSet(n);
        BitSet bs2 = new BitSet(n);

        for (int i = 0; i < m; i++) {

            String cmd = sc.next();
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();

            if (cmd.equals("AND")) {
                if (p1 == 1) {
                    bs1.and(bs2);
                } else {
                    bs2.and(bs1);
                }
            } else if (cmd.equals("OR")) {
                if (p1 == 1) {
                    bs1.or(bs2);
                } else {
                    bs2.or(bs1);
                }
            } else if (cmd.equals("XOR")) {
                if (p1 == 1) {
                    bs1.xor(bs2);
                } else {
                    bs2.xor(bs1);
                }
            } else if (cmd.equals("FLIP")) {
                if (p1 == 1) {
                    bs1.flip(p2);
                } else {
                    bs2.flip(p2);
                }
            } else if (cmd.equals("SET")) {
                if (p1 == 1) {
                    bs1.set(p2);
                } else {
                    bs2.set(p2);
                }
            }

            System.out.println(bs1.cardinality() + " " + bs2.cardinality());

        }

    }
}
