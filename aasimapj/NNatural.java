import java.util.Scanner;

public class NNatural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        if (n < 1) {
            System.out.println("The number must be a positive integer.");
        } else{
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }
        scanner.close();
    }
}