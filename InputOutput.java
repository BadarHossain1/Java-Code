import java.util.*;

public class InputOutput {

    public static void main (String[] args){
         Scanner scanner = new Scanner (System.in);
         System.out.println("Enter Your Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter another number: ");
        int number = scanner.nextInt();
        System.out.println("The number is: "+number);
        scanner.nextLine(); // to clear the \n in the scanner
        String food = scanner.nextLine();
        System.out.println("Your favorite food is: "+food);




    }
    
}
