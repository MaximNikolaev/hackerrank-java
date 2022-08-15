// https://www.hackerrank.com/challenges/java-negative-subarray/

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int n = 0;

        n = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int subArrayCounter = 0;

        for (int len = 1; len <= n; len++) {

            int currSum = 0;
            for (int i = 0; i <= arr.length - len; i++) {

                int[] subArr = Arrays.copyOfRange(arr, i, i + len);

                if (Arrays.stream(subArr).sum() < 0) {
                    subArrayCounter++;
                }

            }

        }

        System.out.println(subArrayCounter);
    }
}
