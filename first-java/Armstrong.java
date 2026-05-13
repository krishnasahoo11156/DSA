// To find Armstrong Number between two given number.

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");

        for (int num = start; num <= end; num++) {

            int original = num;
            int temp = num;

            // Count digits
            int digits = String.valueOf(num).length();

            int sum = 0;

            // Calculate Armstrong sum
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            // Check Armstrong
            if (sum == original) {
                System.out.println(original);
            }
        }

        sc.close();
    }
}