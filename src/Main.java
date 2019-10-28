import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String n,w,e,s;
        int roomCounter = 0;
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        //int x = 1 + r.nextInt(6);
        String direction;
        System.out.println("You are encountered a creepy haunted house," +
                "type Enter to continue or you may choose to quit at any time by typing Quit!");
        String choice = keyboard.next();
        if(choice.equalsIgnoreCase("Enter")){




    }
        else if (choice.equalsIgnoreCase("Quit")){

        }


    public int foyer(int x){
            System.out.println("You entered Foyer room which is full of dead scorpions, Type North " +
                    "to go to next room!");
            String choice1 = keyboard.next();
            if (choice1.equalsIgnoreCase("north")) {
                //method FrontRoom
                roomCounter++;
                return roomCounter;
            } else {
                //quit
            }


        }

    }
public String frontRoom(){
    System.out.println("You entered Front Room,where there is a piano, you can choose south, west, and east!");
    String choice2 = keyboard.next();
    if(choice2.equalsIgnoreCase("west")){

}
}