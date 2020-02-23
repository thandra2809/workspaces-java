import java.util.Scanner;

public class MenuRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number-1:: ");
        int number1 = scanner.nextInt();


        System.out.print("Enter Number-2:: ");
        int number2 = scanner.nextInt();

        System.out.println("Choices Available are");
        System.out.println("OPTION - Operation");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Divide");
        System.out.println("4 - Multiply ");

        System.out.print("Choose an Option:: ");
        int choiceNumber = scanner.nextInt();

        System.out.println("*****************************************");
        System.out.println("You have selected the below choices");
        System.out.println("Number-1 :: " + number1);
        System.out.println("Number-2 :: " + number2);
        System.out.println("Option you have selected - " + choiceNumber);
        System.out.println("*****************************************");
        //performOperationUsingNestedIfElse(number1, number2, choiceNumber);
        performOperationUsingSwitch(number1, number2, choiceNumber);
        System.out.println("*****************************************");


    }

    private static void performOperationUsingNestedIfElse(int number1, int number2, int choiceNumber) {
        if (choiceNumber == 1) {
            System.out.println("Result is :: " + (number1 + number2));
        } else if (choiceNumber == 2) {
            System.out.println("Result is :: " + (number1 - number2));
        } else if (choiceNumber == 3) {
            System.out.println("Result is :: " + ((double) number1 / (double) number2));
        } else if (choiceNumber == 4) {
            System.out.println("Result is :: " + (number1 * number2));
        } else {
            System.out.println("Invalid Operation");
        }
    }

    private static void performOperationUsingSwitch(int number1, int number2, int choiceNumber) {

        switch (choiceNumber) {
            case 1:
                System.out.println("Result is :: " + (number1 + number2));
                break;
            case 2:
                System.out.println("Result is :: " + (number1 - number2));
                break;
            case 3:
                System.out.println("Result is :: " + ((double) number1 / (double) number2));
                break;
            case 4:
                System.out.println("Result is :: " + (number1 * number2));
                break;
            default:
                System.out.println("Invalid Operation");
        }
    }
}
