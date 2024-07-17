public class MethodConcept {
    public static void main(String[] args){
        hello("Badar");
        hello("Badar", 21);
    }

    static void hello(String name){
        System.out.println("Hello " + name);
    }

    static void hello(String name, int age){
        System.out.println("Hello " + name + " you are " + age + " years old");
    }
}
