import java.util.Random;
import java.util.Scanner;

import static javafx.application.Platform.exit;


public class extra {
    public static int roomCounter = 0;
    public static Scanner keyboard = new Scanner(System.in);
    public static Random r = new Random();


    public static void main(String[] args) {
        process();



    }

    public static void process(){
        String answer;
        String direction = "quit";
        int room = 1;

        do {
            switch (room) {
                case 1:
                    room = foyer(direction);
                    break;
                case 2:
                    room = frontRoom(direction);
                    break;
//                case 3:
//                    room = library(direction);
//                    break;
//                case 4:
//                    room = kitchen(direction);
//                    break;
//                case 5:
//                    room = diningRoom(direction);
//                    break;
//                case 6:
//                    room = vault(direction);
//                    break;
//                case 7:
//                    room = parlor(direction);
//                    break;
//                case 8:
//                    room = secretRoom(direction);
//                    break;
            }
            System.out.println("Would you like to go to another room? (Y/N");
            answer = keyboard.next();
        } while (answer.equalsIgnoreCase("y"));
    }

    // case 1
    public static int foyer(String direction){
        int room = 1;

        System.out.println("You entered the Foyer, looking around you see a dead scorpion (ew gross)");
        System.out.println("There is a door ahead, type north to proceed.");
        direction = keyboard.next();

        switch (direction) {
            case "north":
                room = 2;
                break;

            case "quit":
                exit();
                break;

            default:
                System.out.println("girl you typed it wrong try again lol");
        } return room;
    }


    public static int frontRoom(String direction){
        int room = 2;

        System.out.println("You've entered the front room, its big or whatever and there is a piano! cool!");
        System.out.println("Looking around there seems to be a few options, you can either east, west, " +
                "or return to the previous room via south.");
        direction = keyboard.next();

        switch (direction) {
            case "south":
                room = 1;
                break;

            case "west":
                room = 3;
                break;

            case "east":
                room = 4;
                break;

            case "quit":
                exit();
                break;

            default:
                System.out.println("girl you typed it wrong try again lol");
        } return room;
    }

}