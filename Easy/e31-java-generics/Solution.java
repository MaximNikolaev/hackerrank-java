// https://www.hackerrank.com/challenges/java-generics/

class Printer {

    static <T> void printArray(T[] a) {

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
