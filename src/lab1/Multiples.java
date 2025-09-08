package lab1;

public class Multiples {
    public static void main(String[] args) {
        int n = 1000;
        int a = 5;
        int b = 3;
        System.out.println(multiples(n, a, b));
    }

    public static int multiples(int n, int a, int b) {
        int count;
        if (a == b) {
            count = (n - 1) / a;
        } else{
            count = (n - 1) / a + (n-1) / b - (n-1) / (a*b);
        }
        return count;
    }
    public static int multiples() {
        int a = 1000;
        int b = 3;
        int c= 5;
        return a / b + a / c - a / (b*c) - 1;
    }
}
