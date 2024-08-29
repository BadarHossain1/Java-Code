public class Printf {
    public static void main(String[] args){
        int x = 10;
        double y = 10.123456789;
        

        System.out.printf("The value of x is %d\n", x);
        System.out.printf("The value of y is %.2f\n", y);
        System.out.printf("The value of y is %+f\n", y);
        System.out.printf("The value of y is %020f\n", y);
        System.out.printf("The value of y is %,f\n", y);
        
    }
}
