import java.util.Scanner;

public class ExitGame {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        //Scanner is a class provided by java.util.scanner. It can parse and return the input it reads. It is used to read the input of primitive types like int, double, etc. This is the standard input stream. In Java, System.in represents the input from the console

        

        System.out.println("Do you want to exit the game?? Press Q or q");

        String response = scanner.next();

        if(response.equals("Q") || response.equals("q")){
            System.out.println("You are out");
        }

        else{
            System.out.println("You are still playing");
        }
    }
}
