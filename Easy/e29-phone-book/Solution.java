// https://www.hackerrank.com/challenges/phone-book/

import java.util.*;

class Solution {

    public static void main(String[] argh) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        Map book = new HashMap();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            book.put(name, phone);

        }

        while (in.hasNext()) {
            String s = in.nextLine();

            if (book.containsKey(s)) {
                System.out.println(s + "=" + book.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }

}
