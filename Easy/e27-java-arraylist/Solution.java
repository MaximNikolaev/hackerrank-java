// https://www.hackerrank.com/challenges/java-arraylist/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        // read input data
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<List> al = new ArrayList<List>(0);

        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();

            ArrayList line = new ArrayList();

            for (int j = 0; j < d; j++) {
                line.add(j, sc.nextInt());
            }

            al.add(i, line);
        }

        // read queries
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            try {
                List l = al.get(x - 1);
                System.out.println(l.get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

    }
}
