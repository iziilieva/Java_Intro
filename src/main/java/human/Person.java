package human;

import animal.Mammal;

public class Person extends Mammal {

    @Override
    public void eats(String food) {
        super.eats(food);
    }

    public Person(String name) {
        super(name);
    }
}
