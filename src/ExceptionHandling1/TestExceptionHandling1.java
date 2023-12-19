package ExceptionHandling1;

import java.util.Scanner;

public class TestExceptionHandling1 {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Enter an index to view the value: ");
        int userInput = scanner.nextInt();

        try {
            System.out.println("The value of index " + userInput + " is: " + array[userInput]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds");
        }

    }
}
