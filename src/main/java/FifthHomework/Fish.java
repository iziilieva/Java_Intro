package FifthHomework;

public class Fish extends Pet{

    public Fish(boolean hasTail, String name, int age, PetBreed petBreed, PetAddress petAddress, int barcode) {
        super(hasTail, name, age, petBreed, petAddress, barcode);
    }

    @Override
    public void run() {
        System.out.println(super.getName() + " is swimming.");
    }

//    public void talk(){
//
//        System.out.println("I can talk");
//    }
}
