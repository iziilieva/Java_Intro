package arraysdemo;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Sofia");
        cities.add(0,"Varna");
        cities.add("London");

        System.out.println(cities);

        System.out.printf("Cities before Brexit are: %s%n", cities);

        cities.remove("London");

        System.out.printf("Cities after Brexit are: %s%n", cities);

        cities.remove(0);

        System.out.printf("Cities after second remove are: %s%n", cities);
        System.out.println(cities.indexOf("Sofia"));

    }
}
