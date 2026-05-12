// To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String n = sc.nextLine();
        n = n.toLowerCase();

        int left = 0;
        int right = n.length() - 1;

        boolean ans = true;

        while (left < right) {
            if (n.charAt(left) != n.charAt(right)) {
                ans = false;
                break;
            }
            left++;
            right--;
        }
        if (ans == true) {
            System.out.println("The String is a palindrome");
        } else {
            System.out.println("The String is not a palindrome");
        }

        sc.close();
    }
}
