package oop;

public class Parrot extends Pet {

    public Parrot(boolean hasTail, String name, int age, Breed breed, Address address) {
        super(hasTail, name, age, breed, address);
    }

    @Override
    public void run() {
        System.out.println(super.getName() + " is flying.");
    }

//    public void talk(){
//
//        System.out.println("I can talk");
//    }

    public boolean isExpensive(Breed breed) {

        boolean result = false;
        switch(breed.getBreedName()){
            case "Ara":
                result = true;
                break;
            case "Mini":
                result = false;
                break;
            default:
                result = false;
        }
        return result;
    }

//method overload
    public boolean isExpensive() {
        if (super.getBreed().getBreedName().equals("Ara")){
            return true;
        }else {
            return false;
        }

    }
}

