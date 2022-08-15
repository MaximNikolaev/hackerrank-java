// https://www.hackerrank.com/challenges/java-stack/

import java.util.*;

class Solution {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            //Complete the code

            Stack stack = new Stack();
            char[] chars = input.toCharArray();

            boolean noErrors = true;

            char charInStack;

            for (int i = 0; i < chars.length; i++) {

                if (stack.empty()) {

                    if (chars[i] == '(' || chars[i] == '[' || chars[i] == '{') {
                        stack.push(chars[i]);
                    } else {
                        noErrors = false;
                        break;
                    }

                } else {

                    charInStack = (char) stack.peek();

                    if ((charInStack == '(' || charInStack == '[' || charInStack == '{') && ((chars[i] == '(' || chars[i] == '[' || chars[i] == '{'))) {
                        stack.push(chars[i]);
                    } else if (charInStack == '(' && chars[i] != ')') {
                        noErrors = false;
                        break;
                    } else if (charInStack == '[' && chars[i] != ']') {
                        noErrors = false;
                        break;
                    } else if (charInStack == '{' && chars[i] != '}') {
                        noErrors = false;
                        break;
                    } else {
                        stack.pop();
                    }

                }
            }

            if (!stack.empty()) {
                noErrors = false;
            }

            System.out.println((noErrors ? "true" : "false"));

        }

    }
}
