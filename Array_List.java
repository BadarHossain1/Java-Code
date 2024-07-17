import java.util.ArrayList;

public class Array_List {
    public static void main (String[] args){
        //Array List = a resizable array. Elements can be added and removed after compilation. Phase store reference data types


        ArrayList<String>food = new ArrayList<String>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        for(int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
        }

        food.set(0, "sushi");
        food.remove(2);
        System.out.println(food.get(0));
        // food.clear(); 

        //2D 

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        groceryList.add(food);

        System.out.println(groceryList.get(0).get(0));




    }
}
