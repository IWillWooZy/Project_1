import java.math.BigInteger;

public class Factorial {

    public static long factorialLong(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n не может быть отрицательным: " + n);
        }
        if (n <= 1) {
            return 1L;
        }
        return n * factorialLong(n - 1);
    }

    public static BigInteger factorialBig(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n не может быть отрицательным: " + n);
        }
        if (n <= 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(factorialBig(n - 1));
    }

    public static int firstOverflowN() {
        int n = 0;
        while (BigInteger.valueOf(factorialLong(n)).equals(factorialBig(n))) {
            n++;
        }
        return n;
    }

    public static void main(String[] args) {
        for (int n = 0; n <= 22; n++) {
            System.out.printf("%2d! long = %d, BigInteger = %s%n", n, factorialLong(n), factorialBig(n));
        }
        System.out.println("Переполнение long начинается с n = " + firstOverflowN());
    }
}
