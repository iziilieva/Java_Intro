package FourthHomework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FourthHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //task 1
        int[] arrayElements = new int[20];
        System.out.println("The index of the elements of the array multiplied by 5 are: ");
        for (int i = 0; i < arrayElements.length; i++) {
            arrayElements[i] = i * 5;
            System.out.print(arrayElements[i]);
            if (i != arrayElements.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("\n=========================\n");

        //task 2
        int arraySumElements = 0;
        for (int i = 0; i < arrayElements.length; i++) {
            arraySumElements += arrayElements[i];
        }
        double averageArrayElements = (double)arraySumElements / (double)arrayElements.length;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.printf("The average value of above array is: %s%n", df.format(averageArrayElements));

        System.out.println("\n=========================\n");

        //task 3
        System.out.println("Please enter 5 elements one by one and I will calculate sum of even and sum of odds numbers:");

        int[] array = new int[5];
        int sumOfEven = 0;
        int sumOfOdd = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] % 2 == 0) {
                sumOfEven = sumOfEven + array[i];
            } else if (array[i] % 2 != 0) {
                sumOfOdd = sumOfOdd + array[i];
            }
        }
        System.out.println("The sum of even numbers is " + sumOfEven + " add the sum of odd numbers is " + sumOfOdd);

        System.out.println("\n=========================\n");

        //task 4
        System.out.println("Please enter whole positive number and I will tell you all the numbers before it, starting from 1: ");
        int N = scanner.nextInt();
        printNumbersToN(N);
        System.out.println("\n=========================\n");

        //task 5
        System.out.println("Please enter a number and I will calculate all the numbers from 1 to the entered number, which are not divided by 3 and 7: ");
        int M = scanner.nextInt();
        printNumbersThreeSeven(M);
        System.out.println("\n=========================\n");

        //task6
        System.out.println("Please enter number and I will calculate sum of Fibonacci numbers: ");
        int K = scanner.nextInt();
        printSumFibonacci(K);
    }

    public static void printNumbersToN(int N) {
        System.out.println("The entered numbers from 1 to N are :");
        for (int i = 1; i <= N; i++) {
            System.out.print(i);

            if (i != N) {
                System.out.print(", ");
            }
        }
    }

    public static void printNumbersThreeSeven(int N) {
        System.out.println("The numbers that do not divide by 3 and 7 are: ");
        for (int i = 1; i <= N; i++) {
            if (!(i % 3 == 0) && !(i % 7 == 0)) {
                if (i !=1){
                    System.out.print(", ");
                }
                System.out.print(i);
            }
        }
    }

    public static void printSumFibonacci(int N) {
        int sum = 1;
        int first = 0;
        int second = 1;

        for (int i = 2; i < N; i++) {
            int next = first + second;
            sum += next;
            first = second;
            second = next;
        }

        System.out.println("The sum of the Fibonacci numbers is " + sum);
    }
}
