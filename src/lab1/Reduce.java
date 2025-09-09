package lab1;

public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;
        count = reduce(n);
        System.out.println(count);
    }

    private static int reduce(int n) {
        int count;
        if (n % 2 == 0) {
            count = n / 2 + 1;
        } else {
            count = (n - 1) / 2 + 2;
        }
        return count;
    }
}
