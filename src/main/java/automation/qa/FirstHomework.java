package automation.qa;

import java.util.Scanner;

public class FirstHomework {

    public static void main(String[] args){

        System.out.println("Please enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Please enter your favourite hobby:");
        String hobby = scanner.next();

        System.out.println("Your name is " + name + " and your favourite hobby is " + hobby);

    }


}
