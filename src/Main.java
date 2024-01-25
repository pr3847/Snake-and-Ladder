import java.sql.SQLOutput;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to play Snake and Ladder game");
        playGame();
    }
    //To roll a Die
    private static  int rollDice(){
        Random r=new Random();
        return r.nextInt(6);
    }
    //Generate a Option
    private static String checkFor(){
        String[] arr={"No play","Ladder","Snake"};
        Random r=new Random();
        int i=r.nextInt(arr.length);
        return arr[i];
    }

    //To play the game
    public static void playGame(){
        Scanner sc=new Scanner(System.in);

        int position=0,diceVal=0;
        System.out.println("Initial player position: "+position);
        System.out.println("Enter to roll Die");
        String s=sc.nextLine();

        if(s.equalsIgnoreCase("roll")){
           diceVal=rollDice();
           System.out.println("you rolled "+diceVal);
        }
        String Option=checkFor();
        switch (Option){
            case "Ladder":
                position+=diceVal;
                break;
            case "Snake":
                position-=diceVal;
                break;
            case "No play":
                break;
            default:
                System.out.println("u got nothing");
        }
        System.out.println("Now ur on the position:"+position);
    }
}