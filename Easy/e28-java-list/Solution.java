// https://www.hackerrank.com/challenges/java-list/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            l.add(sc.nextInt());
        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            String cmd = sc.next();
            if (cmd.equals("Insert")) {

                int x = sc.nextInt();
                int y = sc.nextInt();
                l.add(x, y);

            } else if (cmd.equals("Delete")) {

                int x = sc.nextInt();
                l.remove(x);

            }
        }

        StringJoiner sj = new StringJoiner(" ");

        for (int i = 0; i < l.size(); i++) {
            sj.add(l.get(i).toString());
        }

        System.out.println(sj.toString());

    }
}
