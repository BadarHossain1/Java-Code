public class Strings {

    public static void main(String[] args){
        //String = a reference data type that can store one or more characters reference data types have access to useful methods

        String name = "John";

        boolean result = name.equals("John")

        System.out.println(result);

        result = name.equalsIgnoreCase("john");
        System.out.println(result);

        char result = name.charAt(0);
        int result = name.indexOf("o");

        boolean result = name.isEmpty();

        String result = name.toLowerCase();
        String result = name.toUpperCase();

        String result = name.trim();

        String result = name.replace('o', 'a');
    }

}
