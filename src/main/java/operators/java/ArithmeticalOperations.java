package operators.java;

public class ArithmeticalOperations {
    public static void main(String[ ] args) {
        int firstNumber = 10;
        int secondNumber = 3;
        double firstDouble = 5;
        double secondDouble = 2;


        double result = firstDouble / secondDouble;
        System.out.println(result);
        System.out.println(firstNumber / result);

        // division
        System.out.println(firstNumber / secondNumber);

        //% will return the remain of the /
        System.out.println(firstNumber % secondNumber);

        //incremetal
        System.out.println(++firstNumber);
        System.out.println(firstNumber);

        //decremental
        System.out.println(firstNumber--);
        System.out.println(firstNumber);

    }
}
