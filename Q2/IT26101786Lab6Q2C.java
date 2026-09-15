import java.util.Scanner;

public class IT26101786Lab6Q2C {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        int i = 0;
        int sum = 0;
        double average;

        System.out.println("Please enter 10 numbers:");

        while (i < 10) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            sum = sum + numbers[i];
            i++;
        }

        System.out.println("\nThe numbers you entered are:");

        i = 0;
        while (i < 10) {
            System.out.print(numbers[i] + " ");
            i++;
        }

        average = (double) sum / 10;

        System.out.println("\n");
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

    }
}