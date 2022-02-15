package FifthHomework;

public class PetBreed {

    private String petbreedName;

    public String getBreedName() {
        return petbreedName;
    }

    public void setBreedName(String petbreedName) {
        if (!petbreedName.isEmpty()){
            this.petbreedName = petbreedName;
        }else {
            System.out.println("Invalid data");
        }
    }

    public PetBreed(String breedName) {

        setBreedName(breedName);
    }
}