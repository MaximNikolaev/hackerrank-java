// https://www.hackerrank.com/challenges/java-hashset/

HashSet hs = new HashSet();
for (int i = 0; i < t; i++) {
    hs.add("" + pair_left[i] + " " +  pair_right[i]);
    System.out.println(hs.size());
}
