import java.util.Scanner;

public class Main {
    public static long factorial1(int n) {
        long sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }
    public static long factorial2(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial2(n-1);
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial1(n));
        System.out.println(factorial2(n));
    }
}