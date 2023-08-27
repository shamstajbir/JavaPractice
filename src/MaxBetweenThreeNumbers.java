import java.util.Scanner;

public class MaxBetweenThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int max = Math.max(num1, Math.max(num2, num3));

        System.out.println("The maixmum among three number" + num1 + ", " + num2 + ", and " + num3 + " is: " + max);

        scanner.close();
    }
}
