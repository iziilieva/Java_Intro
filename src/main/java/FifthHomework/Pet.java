package FifthHomework;

public class Pet implements PetActions{

    private boolean hasTail;
    private String name;
    private int age;
    private PetBreed breed;
    private int barcode;
    private PetAddress address;


    public int getBarcode() {
        return barcode;
    }
    public PetAddress getAddress() {
        return address;
    }
    public void setAddress(PetAddress address) {
        this.address = address;
    }
    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }
    public boolean getHasTail() {
        return hasTail;
    }
    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }else {
            System.out.println("Invalid data!");
        }
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0){
            this.age = age;
        }else {
            System.out.println("Invalid age data!");
        }
    }
    public PetBreed getBreed() {
        return breed;
    }
    public Pet(boolean hasTail, String name, int age, PetBreed breed, PetAddress address, int barcode) {
        setHasTail(hasTail);
        setName(name);
        setAge(age);
        setBreed(breed);
        setAddress(address);
        setBarcode(barcode);
    }

    public void setBreed(PetBreed breed) {
        if (!breed.equals(null)) {
            this.breed = breed;
        }else{
            System.out.println("Invalid data");
        }
    }

    public void printData(){
        System.out.printf("This pet's name is: %s.%nThis pet's age: %d.%nThis pet's breed is: %s.%nThis pet's barcode is: %d.%nThis pet's address is: %s.%n", name, age, breed.getBreedName(), barcode, address.getFullAddress());
        if (hasTail){
            System.out.println("This pet has tail.");
        }else {
            System.out.println("This pet has not tail.");
        }

    }

    @Override
    public void run() {
        System.out.println(name + " is running...");
    }

    @Override
    public void jump() {
        System.out.println(name + " is jumping...");
    }
}
