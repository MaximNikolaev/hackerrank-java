// https://www.hackerrank.com/challenges/java-inheritance-2/

abstract class Arithmetic {
    abstract int add(int x1, int x2);
}

class Adder extends Arithmetic {
    public int add(int x1, int x2) {
        return x1 + x2;
    }
}
