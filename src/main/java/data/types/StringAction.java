package data.types;

public class StringAction {
    public static void main(String[] args) {
        String testString = "My test string";

        System.out.println(testString.charAt(0));

        System.out.println(testString.contains("str"));

        System.out.println(testString.equals("random string"));

        System.out.println(testString.length());

        String [] stringArray = testString.split(" ");
        System.out.println( "\""+testString + "\"" + " has " + stringArray.length + " words.");

        System.out.println(String.format("\""+"%s" + "\"" +" has " + "\"" + "%d" + "\"" + " words.", testString, stringArray.length));
        //System.out.printf("%s has %d words.", testString, stringArray.length);
    }
}
