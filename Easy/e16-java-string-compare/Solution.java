// https://www.hackerrank.com/challenges/java-string-compare/

public static String getSmallestAndLargest(String s, int k) {

        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int i = 0; i < s.length()-k+1; i++) {

        String current_substring = s.substring(i, i+k);

            if (smallest == "") {
                smallest = current_substring;
            } else if (smallest.compareTo(current_substring)>0){
                smallest = current_substring;
            };

            if (largest.compareTo(current_substring)<0){
                largest = current_substring;
            }
        }
        return smallest + "\n" + largest;
}
