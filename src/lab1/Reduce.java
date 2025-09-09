package lab1;

public class Reduce {
    public static void main(String[] args) {
        int n = 200;
        int count = 0;
        count = reduce(n);
        System.out.println(count);
    }

    public static int reduce(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                count++;
                n = n / 2;
            } else {
                n = n - 1;
                count++;
            }
        }
        return count;
    }
}