import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        int principle = sc.nextInt();
        System.out.println();
        System.out.print("Enter the rate of interest: ");
        int rate = sc.nextInt();
        System.out.println();
        System.out.print("Enter the time: ");
        int time = sc.nextInt();

        float interest = (principle * rate * time) / 100;

        System.out.println();
        System.out.println("The simple interest is : " + interest);
        sc.close();

    }
}
