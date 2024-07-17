import java.util.*;

class Main {
    public static void main(String[] args) {
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);
        // Hello there

        System.out.println("Enter Side X: ");
        x = scanner.nextDouble();

        System.out.println("Enter Side Y: ");
        y = scanner.nextDouble();

        z = MathOperations.sqrt((x * x) + (y * y));

        System.out.println("The Hypotenuse is  = " + z);

        scanner.close();

    }
}