package methods;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SixthHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //task 1
        System.out.println("Enter your password:");

        String password = scanner.nextLine();

        if (Password_Validation(password)) {
            System.out.println("Password is correct");
        } else {
            System.out.println("Password should be at least 8 symbols and should contain letters and at least one special character and one number.");
        }
        System.out.println("\n===========================\n");

        //task2.1
        System.out.println("Please enter three whole numbers and I will check if all of them are positive:");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        if (checkIfPositive(firstNumber, secondNumber, thirdNumber)){
            System.out.println("Numbers are positive.");
        }else{
            System.out.println("At least one number is negative.");
        }
        System.out.println("\n===========================\n");

        //task2.2
        System.out.println("Please enter three whole numbers and I will check if all of them are equal:");
        int firstNumber2 = scanner.nextInt();
        int secondNumber2 = scanner.nextInt();
        int thirdNumber2 = scanner.nextInt();

        if (checkIfEqual(firstNumber2, secondNumber2, thirdNumber2)){
            System.out.println("Numbers are equal.");
        }else{
            System.out.println("Numbers are not equal.");
        }
        System.out.println("\n===========================\n");

        //task 3.1
        System.out.println("Please enter two numbers and I will calculate the average of them:");
        double firstNumber3 = scanner.nextDouble();
        double secondNumber3 = scanner.nextDouble();
        System.out.println("The average of the two entered numbers is: " + averageOfTwo(firstNumber3,secondNumber3));
        System.out.println("\n===========================\n");

        //task 3.2
        System.out.println("Please enter two numbers and I will calculate the sum of them:");
        double firstNumber4 = scanner.nextDouble();
        double secondNumber4 = scanner.nextDouble();
        System.out.println("The sum of the two entered numbers is: " + sumOfTwo(firstNumber4,secondNumber4));
        System.out.println("\n===========================\n");

        //task 3.3
        System.out.println("Calling second method with the parameters of the first. Result is: " + sumOfTwo(averageOfTwo(2,3),averageOfTwo(6,7)));
    }


    public static boolean Password_Validation(String password) {
        if (password.length() < 8) {
            return false;
        }

        Pattern letter = Pattern.compile("[a-zA-z]");
        Pattern digit = Pattern.compile("[0-9]");
        Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        //Pattern eight = Pattern.compile (".{8}");

        Matcher hasLetter = letter.matcher(password);
        Matcher hasDigit = digit.matcher(password);
        Matcher hasSpecial = special.matcher(password);

        return hasLetter.find() && hasDigit.find() && hasSpecial.find();
    }

    public static boolean checkIfPositive(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber >= 0 && secondNumber >= 0 && thirdNumber >= 0;
    }

    public static boolean checkIfEqual(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber == secondNumber && secondNumber == thirdNumber;
    }

    public static double averageOfTwo(double firstNumber, double secondNumber){
        return (firstNumber + secondNumber) / 2;
    }

    public static double sumOfTwo(double firstNumber, double secondNumber){
        return firstNumber + secondNumber;
    }
}