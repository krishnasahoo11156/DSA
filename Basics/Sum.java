//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

package Basics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String input = "0";
        while (true) {
            System.out.print("Enter the next number: ");
            input = sc.nextLine();
            if (input.equals("x")) {
                break;
            }
            int answer = Integer.parseInt(input);
            sum += answer;
        }
        System.out.println("The sum of the numbers are: " + sum);
        sc.close();
    }
}
