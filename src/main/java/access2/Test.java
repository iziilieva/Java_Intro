package access2;

import access.Product;

public class Test {
    public static void main(String[] args) {
        Product product = new Product();
        product.publicName = ""; //we can access anything that is public
        product.setPrivateName("");
        product.getPrivateName();
    }
}
