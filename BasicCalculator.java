import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int choice;
            do {
                System.out.print("Please Enter:\n1 For addition\n2 For subtraction\n3 For multiplication\n4 For division\n");
                choice = sc.nextInt();
            } while (choice < 1 || choice > 4);

            System.out.print("Enter first number :");
            int a = sc.nextInt();

            System.out.print("Enter second number:");
            int b = sc.nextInt();

            double result = -1;
            boolean isError = false;

            switch (choice) {
                case 1: {
                    result = a + b;
                    break;
                }
                case 2: {
                    result = a - b;
                    break;
                }
                case 3: {
                    result = a * b;
                    break;
                }
                case 4: {
                    if (b == 0) {
                        System.out.println("Can't divide a number by zero!");
                        isError = true;
                    } else {
                        result = (double) a / b;
                    }
                    break;
                }
                default:
                    System.out.println("Unexpected error occurred!");
                    isError = true;
                    break;
            }

            if (!isError) {
                System.out.println("Result is " + result);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        } finally {
            sc.close();
        }
    }
}
