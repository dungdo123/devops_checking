package testci;

public class Compute {

    public int plus(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        if (b == 0)
            throw new IllegalArgumentException("b must not be zero");
        return a / b;
    }


}
