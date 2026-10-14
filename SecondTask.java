public class SecondTask {

    public static int countDigits(long n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным: " + n);
        }
        if (n < 10) {
            return 1;
        }
        return countDigits(n / 10) + 1;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(7));
        System.out.println(countDigits(572));
        System.out.println(countDigits(1000));
        System.out.println(countDigits(0));
    }
}
