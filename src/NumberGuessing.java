import javafx.scene.paint.Stop;

import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[]args){

        int pickedNumber;
        Scanner keyboard;
       int guessNumber;
       int playAgain = 1;
        int maxTries = 10;


        //initialization
        do {
            pickedNumber = (int) (Math.random() * 100);

            System.out.println(pickedNumber);
            keyboard = new Scanner(System.in);
            System.out.println("Pick a Number 0-100.");
            System.out.println("You only have 10 tries");
            guessNumber = keyboard.nextInt();
            for (int tries = 0; tries <=maxTries; tries++) {

                if ((pickedNumber != guessNumber)) {
                    if (pickedNumber > guessNumber) {
                        System.out.println("too low");
                    } else if (pickedNumber < guessNumber) {
                        System.out.println("too high");
                    }
                    System.out.println("guess again");
                    System.out.println("Pick a Number 0-100");
                    guessNumber = keyboard.nextInt();

                }
                else {
                    System.out.println("You won");
                    System.out.println("Do you want to play again, 1 for yes, 2 for no?");
                    playAgain = keyboard.nextInt();
                    break;
                }
            }

            if(guessNumber != pickedNumber ){
                System.out.println("Out of tries, You Lose!");
                System.out.println("Do you want to play again, 1 for yes, 2 for no?");
                playAgain = keyboard.nextInt();

            }
        }while (playAgain == 1);









    }
}
