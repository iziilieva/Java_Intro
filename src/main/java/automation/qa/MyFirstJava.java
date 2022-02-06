package automation.qa;

import java.util.Scanner;

public class MyFirstJava {
    public static void main(String[] args) {
        //write the text in the console
        System.out.println("Please enter your first name");

        //Scanner is class for reading values from the console
        Scanner scanner = new Scanner(System.in);

        //a string variable that will store the value entered from the user
        String firstName = scanner.nextLine();

        //System.out.println("Your name is: " + firstName);

        System.out.println("Please enter your age: ");

        //integer variable that will store the age entered from the user
        int userAge = scanner.nextInt();

        //System.out.println("Your age is " + userAge);

        //System.out.println("Your name is " + firstName + " and your age is " + userAge);

        System.out.println("Your name is " + firstName + "\n and your age is " + userAge);

        if (userAge > 18) {

            System.out.println(firstName + " can buy alcohol legally");
        }

        if(userAge < 18){
            System.out.println(firstName + " cannot buy alcohol legally");
        }

        if (userAge >= 65){
            System.out.println(firstName + " is retired");
        }
    }
}
