package FifthHomework;

public class PetBoard {

    public static void main(String[] args) {
        System.out.println("\n===================\n");

        PetAddress mouseAddress = new PetAddress();
        mouseAddress.setCity("Varna");
        mouseAddress.setStreetName("Sea Garden");
        mouseAddress.setPostalCode(3000);

        Mouse mouse = new Mouse(true, "Miki", 20, new PetBreed("street"), mouseAddress, 777);
        mouse.printData();

        System.out.println("\n===================\n");

        PetAddress catPetAddress = new PetAddress();
        catPetAddress.setCity("Sofia");
        catPetAddress.setStreetName("Alabin");
        catPetAddress.setPostalCode(1000);

        Cat persian = new Cat(true, "Moira", 2, new PetBreed("Persian"), catPetAddress, 888);
        persian.printData();

        System.out.println("\n===================\n");

        PetAddress fishPetAddress = new PetAddress();
        fishPetAddress.setCity("Sofia");
        fishPetAddress.setStreetName("Nishava");
        fishPetAddress.setPostalCode(1000);
        Fish goldFish = new Fish(true, "Nemo", 4, new PetBreed("Gold Fish"), fishPetAddress, 999);
        goldFish.printData();

        System.out.println("\n===================\n");

        persian.run();
        goldFish.run();
        mouse.jump();
    }
}
