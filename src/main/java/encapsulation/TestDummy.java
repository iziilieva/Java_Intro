package encapsulation;

public class TestDummy {
    public static void main(String[] args) {

        Person elena = new Person("Elena", 11.0);
        Person alex = new Person("Alex", 4.0);

        Product coffee = new Product("Coffee", 10.0);
        Product tea = new Product("Tea", 2.0);

        elena.buyProduct(coffee);
        alex.buyProduct(tea);
        alex.buyProduct(tea);
        elena.buyProduct(tea);

        elena.printItemsPerUser();
        alex.printItemsPerUser();

        Person mimi = new Person("Mimi", 0);
        Product juice = new Product( "Juice", 2);

        mimi.buyProduct(juice);
        mimi.printItemsPerUser();

        Person petar = new Person("Petar", -3);
        Product bread = new Product("Bread", 1);

        petar.buyProduct(bread);
        petar.printItemsPerUser();
    }
}
