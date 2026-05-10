// Input currency in rupees and output in USD.

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount in rupees : ");
        int a = sc.nextInt();
        int b = (a / 88);
        System.out.print("The conversion of " + a + " rupees in usd is : " + b);
        sc.close();
    }
}
