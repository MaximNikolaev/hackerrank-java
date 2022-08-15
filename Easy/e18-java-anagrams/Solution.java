// https://www.hackerrank.com/challenges/java-anagrams/

static boolean isAnagram(String a, String b) {

        a = a.toUpperCase();
        b = b.toUpperCase();

        if (a.length() == b.length()) {
            int[] counts_a = new int[255];
            int[] counts_b = new int[255];

            for (int i = 0; i < a.length(); i++) {
                counts_a[a.charAt(i)] += 1;
                counts_b[b.charAt(i)] += 1;
            }

            for (int i = 0; i < counts_a.length; i++) {
                if (counts_a[i] != counts_b[i]) {
                    return false;
                }
            }

        } else {
            return false;
        }

        return true;
}
