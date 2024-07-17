 public class Array {
    public static void main (String[] args){

        int[] array = {1,2,3,5,6,8,8,9};

        for(int i: array){
            System.out.println(i);
        }


        String[] string = {"mercedes", "corvette", "BMW"};

        for(String i: string){
            System.out.println(i);
        }


        String[] cars = new String[3];

        cars[0] = "mercedes";
        cars[1] = "corvette";
        cars[2] = "BMW";

        for(int i = 0; i<cars.length; i++){
            System.out.println(cars[i]);
        }


        String[][] gari = new String[3][3];
        
        gari[0][0] = "mercedes";
        gari[0][1] = "corvette";
        gari[0][2] = "BMW";

        



;

}
}
