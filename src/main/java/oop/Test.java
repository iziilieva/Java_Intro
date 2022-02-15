package oop;

public class Test {
    public static void main(String[] args) {
        Dog frenchie = new Dog();  //default constructor
        Address dogAddress = new Address();
        dogAddress.setCity("Sofia");
        dogAddress.setStreetName("Alabala");
        dogAddress.setPostalCode(1000);
        frenchie.printData();

        frenchie.setAge(2);
        Breed frBulldog = new Breed("French Bulldog");
        frenchie.setBreed(new Breed("French Bulldog")); //calling a method with parameter which is new object  of type Breed
        frenchie.setBreed(frBulldog); // calling a method with parameter with an object  (same as above)
        frenchie.setHasTail(false);
        frenchie.setName("Morti");
        frenchie.setAddress(dogAddress);  //Dog has Address
        frenchie.printData();

        Dog huscky = new Dog(true, "Sara", 6, new Breed("Hucky"), dogAddress); //constructor with parameters
        huscky.printData();

//        Parrot parrot = new Parrot();
        Address parrotAddress = new Address();
        parrotAddress.setCity("Sofia");
        parrotAddress.setStreetName("Alabala");
        parrotAddress.setPostalCode(1000);
        Parrot parrot = new Parrot(true, "Poly", 12, new Breed("Ara"), parrotAddress);
//        parrot.printData();

        parrot.setAge(12);
        parrot.setBreed(new Breed("Ara"));
        parrot.setHasTail(true);
        parrot.setName("Poli");
        parrot.setAddress(parrotAddress);
        parrot.setBarcode(12345);
        parrot.printData();
        Breed ara = new Breed( "Ara");
        Breed bara = new Breed( "Bara");


//        Parrot parrot2 = new Parrot();
//        Address parrot2Address = new Address();
//        parrot2Address.setStreetName("some street");
//        parrot2Address.setCity("some city");
//        parrot2Address.setPostalCode(12345);
//
//        parrot2.setAge(12);
//        parrot2.setBreed(new Breed("Cacadu"));
//        parrot2.setHasTail(true);
//        parrot2.setName("Pacy");
//        parrot2.setAddress(parrotAddress);
//        parrot2.printData();

        System.out.println(parrot.isHasTail());

        frenchie.run();
        parrot.run();


        System.out.println(parrot.isExpensive(ara));
        System.out.println(parrot.isExpensive(bara));
        System.out.println(parrot.isExpensive());

        if (parrot.isExpensive()){
            System.out.println("You can't buy it.");
        } else {
            System.out.println("You can buy it.");
        }


    }
}
