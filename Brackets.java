import java.util.ArrayList;
import java.util.List;

public class Brackets {

    public static void generateBrackets(String current, int opened, int closed, int n) {
        if (current.length() == 2 * n) {
            System.out.println(current);
            return;
        }
        if (opened < n) {
            generateBrackets(current + "(", opened + 1, closed, n);
        }
        if (closed < opened) {
            generateBrackets(current + ")", opened, closed + 1, n);
        }
    }

    public static List<String> generate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n не может быть отрицательным: " + n);
        }
        List<String> result = new ArrayList<>();
        collect("", 0, 0, n, result);
        return result;
    }

    private static void collect(String current, int opened, int closed, int n, List<String> result) {
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }
        if (opened < n) {
            collect(current + "(", opened + 1, closed, n, result);
        }
        if (closed < opened) {
            collect(current + ")", opened, closed + 1, n, result);
        }
    }

    public static void main(String[] args) {
        generateBrackets("", 0, 0, 3);
    }
}
