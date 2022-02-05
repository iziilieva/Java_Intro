package operators.java;

public class AppropriationOperators {

    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 3;

        int result = firstNumber + secondNumber;
        System.out.println("the sum is " + result);

        //result = result + firstNumber;
        result += firstNumber;

        System.out.println(result);

    }
}
