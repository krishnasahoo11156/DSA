// To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Fibonacii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till which you want the fibonacci series : ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i < n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
            System.out.println(temp);
        }
        sc.close();
    }
}
