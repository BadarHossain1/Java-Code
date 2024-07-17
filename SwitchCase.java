public class SwitchCase {
    public static void main(String[] args){
        String day = "Friday";

        switch(day){
            case "Sunday":
                System.out.println("It's Sunday!");
                break;
            case "Monday":
                System.out.println("It's Monday!");
                break;
            case "Tuesday":
                System.out.println("It's Tuesday!");
                break;
            case "Wednesday":
                System.out.println("It's Wednesday!");
                break;
            case "Thursday":
                System.out.println("It's Thursday!");
                break;
            case "Friday":
                System.out.println("It's Friday!");
                break;
            case "Saturday":
                System.out.println("It's Saturday!");
                break;
            default:
                System.out.println("Invalid day!");
        }
    }
}
