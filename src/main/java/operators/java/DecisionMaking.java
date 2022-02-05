package operators.java;

public class DecisionMaking {
    public static void main(String[] args) {
        printDayOfTheWeek(10);

        int a = 6;
        int b = 10;


        if (a == b){
            System.out.println("Numbers are equal");
            System.out.println(a + b);

        }else if (a > b){
            System.out.println("First is greater");
            System.out.println(a - b);
        }else{
            System.out.println("Second is greater");
            System.out.println(b - a);
        }

    }

    public static void printDayOfTheWeek(int DayOfTheWeek) {

        switch (DayOfTheWeek) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Not correct option!");
                break;

        }
    }

}
