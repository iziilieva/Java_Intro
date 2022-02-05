package data.types;

import java.util.Scanner;

public class SecondHomeworkExperiments {

    public static void main(String[] args) {
        String name = "Izabel";
        String switchName = ("Your name is <myname> ");

        System.out.println( switchName.replace("<myname>", name));

        System.out.println("====================================================");


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first string:");
        String firstString = scanner.nextLine();

        System.out.println("Enter second string");
        String secondString = scanner.nextLine();

        if (firstString.equals(secondString)){
            System.out.println("String are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        System.out.println("====================================================");


        System.out.println("Enter some text and I will count the words in it");
        String toBeCounted = scanner.nextLine();
        String [] stringArray = toBeCounted.split(" ");
//        System.out.println(String.format("\""+"%s" + "\"" +" has " + "\"" + "%d" + "\"" + " words.", toBeCounted, stringArray.length));
        System.out.println( "\""+toBeCounted + "\"" + " has " + stringArray.length + " words.");
//        System.out.println("".split(" ").length);
//        System.out.println("".split(" "));
//        System.out.println("".length());

    }
}
