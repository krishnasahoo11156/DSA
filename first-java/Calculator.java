//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();

        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        System.out.print(("Enter the operation to be done from + - / * : "));
        char op = sc.next().charAt(0);

        if (op == '+') {
            System.out.println("The sum of " + a + " and " + b + " is : " + (a + b));
            ;
        } else if (op == '-') {
            System.out.println("The subtraction of " + a + " from " + b + " is : " + (b - a));
        } else if (op == '*') {
            System.out.println("The product of " + a + " and " + b + " is : " + (a * b));
        } else if (op == '/') {
            System.out.println("The division of " + a + " by " + b + " is : " + (a / b));
        } else {
            System.out.println("Please enter the operator among the mentioned operators only.");
        }
        sc.close();
    }
}
