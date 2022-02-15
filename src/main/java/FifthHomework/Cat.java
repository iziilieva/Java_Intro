package FifthHomework;

public class Cat extends Pet {

    public Cat(boolean hasTail, String name, int age, PetBreed petBreed, PetAddress petAddress, int barcode) {
        super(hasTail, name, age, petBreed, petAddress, barcode);
    }

    public void meow(){
        System.out.println("Mau Mau Mau");
    }
}
