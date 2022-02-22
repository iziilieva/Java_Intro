package access;

public class Product {
    public String publicName;
    protected String protectedName;
    String defaultName;
    private String privateName;

    //setter method for updating the value of a private variable in the current class
    public void setPrivateName(String privateName){
        this.privateName = privateName;
    }

    //getter method for accessing private variable in the current class
    public String getPrivateName(){
        return privateName;
    }

}
