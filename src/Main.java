import java.util.Random;
import java.util.Scanner;

import static javafx.application.Platform.exit;


public class Main {
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
            System.out.println("type y to go to confirm");
            answer = keyboard.next();
        } while (answer.equalsIgnoreCase("y"));
    }

    // case 1
    public static int foyer(String direction){
        int room = 1;

        System.out.println("You entered Foyer room which is full of dead scorpions, Type North " +
                "to go to next room!");
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

        System.out.println("you're in room two now!");
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
        } return room;
    }

}