public class FirstTask {

    public static int money(int first, int difference, int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Номер дня должен быть >= 1: " + n);
        }
        if (n == 1) {
            return first;
        }
        return money(first, difference, n - 1) + difference;
    }

    public static int total(int first, int difference, int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Номер дня должен быть >= 1: " + n);
        }
        if (n == 1) {
            return first;
        }
        return total(first, difference, n - 1) + money(first, difference, n);
    }

    public static void main(String[] args) {
        System.out.println(total(5, 4, 3));
        System.out.println(total(10, -2, 3));
    }
}
