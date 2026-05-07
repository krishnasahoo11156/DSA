//Take 2 numbers as inputs and find their HCF and LCM.

package Basics;

import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int hcf, lcm;

        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);
        while (min != 0) {
            int temp = min;
            min = max % temp;
            max = temp;
        }
        hcf = max;
        if (hcf == 0) {
            lcm = 0;
        } else {
            lcm = (num1 * num2) / hcf;
        }

        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);

        sc.close();
    }
}
