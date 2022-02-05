package operators.java;

public class LogicalOperators {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 20;
        boolean result = false;

        //true && true = true
        result = (firstNumber < secondNumber) && !(firstNumber > secondNumber);
        System.out.println(result);

        //true && false = false
        result = (firstNumber < secondNumber) && (firstNumber > secondNumber);
        System.out.println(result);

        //false ||  false = false
        result = (firstNumber > secondNumber) ||  (firstNumber > secondNumber);
        System.out.println(result);

        //true ||  false = true
        result = (firstNumber < secondNumber)  || (firstNumber > secondNumber);
        System.out.println(result);

    }
}
