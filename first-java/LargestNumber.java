// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Largest number is : " + a);
        } else {
            System.out.println("Largest number is : " + b);
        }

        sc.close();
    }
}
