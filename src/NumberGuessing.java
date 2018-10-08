import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[]args){

        int pickedNumber;
        Scanner keyboard;
       int guessNumber;


        //initialization
        pickedNumber = (int)(Math.random()*100);

        System.out.println(pickedNumber);
        keyboard = new Scanner(System.in);
        System.out.println("Pick a Number 0-100.");
        guessNumber = keyboard.nextInt();
        int maxTries = 10;
        for (int tries = 0; tries<=maxTries; tries++) {
            if (pickedNumber > guessNumber) {
                System.out.println("too low");
            }
            else if(pickedNumber < guessNumber){
                System.out.println("too high");
            }
            if ((pickedNumber != guessNumber)){
                System.out.println("guess again");
                guessNumber = keyboard.nextInt();
            }
            if(guessNumber == pickedNumber){
                System.out.println("You won");
                break;

            }
        }









    }
}
