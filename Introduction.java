import java.util.*;

class Test {
    public static void main(String[] args) {
        int a = 0;
        int b = 6;

        int addition = a + b;
        int substraction = a - b;

        // System.out.println("Addition of " + a + " and " + b +
        // " is " + addition);

        char var1 = 65, var2 = 66;

        int add = var1 + var2;

        // System.out.println("Addition of " + var1 + " and " + var2 + " is " + add);

        String s1 = "Leading";
        String s2 = "University";

        String s = s1.toUpperCase();
        String t = s2.toLowerCase();

        // System.out.print(s);
        // System.out.print(t);

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        // System.out.println(max);
        // System.out.println(min);

        if (a >= 10) {
            System.out.print("You can buy chips");
        } else if (a >= 5) {
            System.out.println("You can buy cake");
        } else if (a >= 1) {
            System.out.println("You can buy chocolate");
        } else {
            System.out.println("GORIBSSS");
        }
        int age = 20;
        String vote = (age >= 18) ? "yes" : "no";
        System.out.println(vote);

    }
}