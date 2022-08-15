// https://www.hackerrank.com/challenges/java-2d-array/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        int max_sum = 0;
        boolean max_sum_initialized = false;

        for (int start_col = 0; start_col <= 3; start_col++) {
            for (int start_row = 0; start_row <= 3; start_row++) {

                int current_sum = 0;

                current_sum += arr.get(start_row + 0).get(start_col + 0);
                current_sum += arr.get(start_row + 0).get(start_col + 1);
                current_sum += arr.get(start_row + 0).get(start_col + 2);

                current_sum += arr.get(start_row + 1).get(start_col + 1);

                current_sum += arr.get(start_row + 2).get(start_col + 0);
                current_sum += arr.get(start_row + 2).get(start_col + 1);
                current_sum += arr.get(start_row + 2).get(start_col + 2);

                if (max_sum_initialized) {
                    if (current_sum > max_sum) {
                        max_sum = current_sum;
                    }
                } else {
                    max_sum = current_sum;
                    max_sum_initialized = true;
                }

            }
        }

        System.out.println(max_sum);

    }
}
