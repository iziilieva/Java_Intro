package operators.java;

import java.util.Scanner;

public class ThirdHomework {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //First task
        System.out.println("=============Beginning of first task=============");
        System.out.println("Enter a number between 1 and 7 and I will tell you which day of the week it is:");
        int enteredNumber = scanner.nextInt();
        printDayOfTheWeek(enteredNumber);
        System.out.println("=============End of first task=============");
        System.out.println("=============Beginning of second task=============");


        //Second task
        System.out.println("Now I will calculate the area and the perimeter of a rectangle!");
        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the rectangle:");
        double width = scanner.nextDouble();
        double area = (length * width);
        double perimeter = (2 * (length + width));
        System.out.println("The area of the rectangle is " + area);
        System.out.println("The area of the rectangle is " + perimeter);
        System.out.println("=============End of second task=============");
        System.out.println("=============Beginning of third task=============");


        //Third task
        System.out.println("Enter random whole number and I will guess if positive or negative:");
        int randomNumber = scanner.nextInt();

        if (randomNumber > 0) {
            System.out.println("The entered number is positive.");
        } else if (randomNumber < 0) {
            System.out.println("Entered number is negative.");
        } else {
            System.out.println("Entered number is 0");
            }
        System.out.println("=============End of third task=============");
        System.out.println("=============Beginning of fourth task=============");


        //Fourth task
        System.out.println("Now, I will ask you to enter three different whole numbers and I will tell you which is the greatest one of them!");
        System.out.println("Enter your first number:");
        int firtsNumber = scanner.nextInt();
        System.out.println("Enter your second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter your third number:");
        int thirdNumber = scanner.nextInt();

        if ((firtsNumber == secondNumber) && (secondNumber == thirdNumber)){
            System.out.println("All entered numbers are the same.");
        }else if(firtsNumber > secondNumber){
            if (firtsNumber > thirdNumber) {
                System.out.println("The first entered number is the greatest one.");
            } else {
                System.out.println("The third entered number is the greatest one.");
            }
        }else{
            if (secondNumber > thirdNumber) {
                System.out.println("The second entered number is the greatest one.");
            } else {
                System.out.println("The third entered number is the greatest one.");
            }
        }
        System.out.println("=============End of fourth task=============");
    }

    //First task
    public static void printDayOfTheWeek(int dayOfTheWeek) {
        switch (dayOfTheWeek) {
            case 1:
                System.out.println("You entered 1. So week day is Monday.");
                break;
            case 2:
                System.out.println("You entered 2. So week day is Tuesday.");
                break;
            case 3:
                System.out.println("You entered 3. So week day is Wednesday.");
                break;
            case 4:
                System.out.println("You entered 4. So week day is Thursday.");
                break;
            case 5:
                System.out.println("You entered 5. So week day is Friday.");
                break;
            case 6:
                System.out.println("You entered 6. So week day is Saturday.");
                break;
            case 7:
                System.out.println("You entered 7. So week day is Sunday.");
                break;
            default:
                System.out.println("The entered option is not correct!");
                break;

        }
    }
}