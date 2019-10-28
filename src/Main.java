import java.util.Random;
import java.util.Scanner;

import static javafx.application.Platform.exit;

public class Main {
    public static int roomCounter = 0;
    public static Scanner keyboard = new Scanner(System.in);
    public static Random r = new Random();
    static boolean found;
    static boolean secret;

    static int randomize;


    public static void main(String[] args) {
        process();
        exit();

    }

    public static void process(){
        String answer;
        String direction = "quit";
        randomize = chance (1, 8);
        int room = 1;

        do {
            switch (room) {
                case 1:
                    room = foyer(direction);
                    break;
                case 2:
                    room = frontRoom(direction);
                    break;
                case 3:
                    room = library(direction);
                    break;
                case 4:
                    room = kitchen(direction);
                    break;
                case 5:
                    room = diningRoom(direction);
                    break;
                case 6:
                    room = vault(direction);
                    break;
                case 7:
                    room = parlor(direction);
                    break;
                case 8:
                    room = secretRoom(direction);
                    break;
            }
            System.out.println("Are you sure? (Y/N) ");
            answer = keyboard.next();
        } while (answer.equalsIgnoreCase("y"));
    }

    // case 1
    public static int foyer(String direction){
        int room = 1;
        roomCounter ++;

        System.out.println("You entered the Foyer, looking around you see a dead scorpion (ew gross)");
        System.out.println("There is a door ahead, type north to proceed" +
                "or you can be a pansy and type quit at any time to leave.");
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
                return foyer(direction);
        } return room;
    }


    public static int frontRoom(String direction){
        int room = 2;
        roomCounter ++;

        System.out.println("You've entered the front room, its big or whatever and there is a piano! cool!");
        System.out.println("Looking around there seems to be a few options, you can either go east, west, " +
                "or return to the previous room by typing south.");
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


    public static int library(String direction) {
        int room = 3;
        roomCounter ++;

        System.out.println("You entered library room, its scary and there are lots of spiders in it!!");
        System.out.println("Looking around there seems to be a few options, you can go to north, " +
                "or return to the previous room via east.");
        direction = keyboard.next();
        switch (direction) {
            case "east":
                room = 2;
                break;

            case "north":
                room = 5;
                break;

            case "quit":
                exit();
                break;

            default:
                System.out.println("girl you typed it wrong try again lol");
        }
        return room;
    }

    public static int kitchen(String direction) {
        int room = 4;
        roomCounter ++;

        System.out.println("You entered kitchen room, its scary and there are lots of bats in it!!");
        System.out.println("Looking around there seems to be a few options, you can go to north, " +
                "or return to the previous room via west.");
        direction = keyboard.next();
        switch (direction) {
            case "west":
                room = 2;
                break;

            case "north":
                room = 7;
                break;

            case "quit":
                exit();
                break;

            default:
                System.out.println("girl you typed it wrong try again lol");
        }
        return room;
    }

    public static int diningRoom(String direction) {
        int room = 5;
        roomCounter ++;

        System.out.println("You entered Dining Room, its scary and there are lots of dust and empty boxes!!");
        System.out.println("Looking around there seems to be only one option, you can go to south. ");
        direction = keyboard.next();
        switch (direction) {
            case "south":
                room = 3;
                break;

            case "quit":
                exit();
                break;

            default:
                System.out.println("girl you typed it wrong try again lol");
        }
        return room;
    }

    public static int vault(String direction) {
        int room = 6;
        int random = chance(1, 100);
        roomCounter++;

        System.out.println("You found the vault! There are three skeletons yikeS!");
        System.out.println("There doesn't seem to be much else in here, go east to return to the previous room.");
        direction = keyboard.next();

        if (secret == true) {
            System.out.println("Since you've found the secret room you can type " +
                    "secret to enter it again! Or you can type east to return to the parlor.");
            direction = keyboard.next();

            switch (direction) {
                case "east":
                    room = 7;
                    break;

                case "secret":
                    room = 8;
                    break;

                case "quit":
                    exit();
                    break;

                default:
                    System.out.println("girl you typed it wrong try again lol");
            }

        } else {
            switch (direction) {
                case "east":
                    if (random <= 25) {
                        secret = (true);
                        room = 8;
                    } else {
                        room = 7;
                    }
                    break;

                case "quit":
                    exit();
                    break;

                default:
                    System.out.println("girl you typed it wrong try again lol");
            }
        } return room;
    }

    public static int parlor(String direction) {
        int room = 7;
        roomCounter ++;

        System.out.println("You entered Parlor room, there is a Treasure Chest!!");
        System.out.println("Looking around there seems to be a few options, you can go to west or south. ");
        direction = keyboard.next();
        switch (direction) {
            case "south":
                room = 4;
                break;

            case "west":
                room = 6;
                break;

            case "quit":
                exit();
                break;

            default:
                System.out.println("girl you typed it wrong try again lol");
        }
        return room;
    }

    public static int secretRoom(String direction) {
        int room = 8;
        roomCounter ++;

        System.out.println("oh hey you stumbled upon the secret room! what! there are piles of gold!");
        System.out.println("You can only return to the previous room by typing west");
        direction = keyboard.next();

        switch (direction) {
            case "west":
                room = 6;
                break;

            case "quit":
                exit();
                break;

            default:
                System.out.println("girl you typed it wrong try again lol");
        }
        return room;
    }

    public static boolean secretFound() {
        return found;
    }

    public static int chance(int min, int max) {
        return min + ((int) (Math.random() * max));
    }

    public static void exit() {
        int random = chance(1, 100);

        System.out.println("You ran out of the creepy house with your tail " +
                "between your legs what a loser lol");
        System.out.println("Total number of rooms you visisted: " + roomCounter);
        if (random <= 25) {
            System.out.println("A ghost followed you! yikes");
        }
        System.exit(0);
    }
}