import java.util.Random;
import java.util.Scanner;

public class Game {
    static int score;
    static Random rand = new Random();
    static int random = rand.nextInt(5); //Gives you random number between 0 and 4
    static String[] possible_actions = {"Rock", "Paper", "Scissors", "Lizard", "Spock"};
    static String computer_actions = possible_actions[random];
    static String user_action;
    static String result;
    static boolean play = true;

    public static void main(String[] args) {
        while(play == true){
        System.out.println("Choose your weapon: ");
        Scanner input= new Scanner(System.in);
        user_action = input.next();

        switch(user_action){
            case "Rock":
                switch(computer_actions){
                    case "Rock":
                        System.out.println("You and your opponent picked the same weapon! You Tied!!");
                        System.out.println("Score: " + score);
                    break;
                    case "Paper":
                        System.out.println("Paper covers Rock!! You Lose!!!!");
                        System.out.println("Score: " + score);
                    break;
                    case "Scissors":
                        score +=1;
                        System.out.println("Rock crushes Scissors!!!! You Win!!!");
                        System.out.println("Score: " + score);
                    break;
                    case "Lizard":
                        score +=1;
                        System.out.println("Rock crushes Lizard!!! You Win!!!");
                        System.out.println("Score: " + score);
                    break;
                    case "Spock":
                        System.out.println("Spock vaporizes Rock!!! You Lose!!!");
                        System.out.println("Score: " + score);
                    break;
                }
            break;
            case "Paper":
                switch(computer_actions){
                    case "Rock":
                        score +=1;
                        System.out.println("Paper covers Rock!! You Win!!!!");
                        System.out.println("Score: " + score);
                    break;
                    case "Paper":
                        System.out.println("You and your opponent picked the same weapon! You Tied!!");
                        System.out.println("Score: " + score);
                    break;
                    case "Scissors":
                        System.out.println("Scissors cuts Paper!!! You Lose!!!");
                        System.out.println("Score: " + score);
                    break;
                    case "Lizard":
                        System.out.println("Lizard eats Paper!!! You Lose!!!");
                        System.out.println("Score: " + score);
                    break;
                    case "Spock":
                        score +=1;
                        System.out.println("Paper disproves Spock!!! You Win!!!");
                        System.out.println("Score: " + score);
                    break;
                }
            break;
            case "Scissors":
                switch(computer_actions){
                    case "Rock":
                        System.out.println("Rock crushes Scissors!!!! You Lose!!!");
                        System.out.println("Score: " + score);
                    break;
                    case "Paper":
                        score +=1;
                        System.out.println("Scissors cuts Paper!!! You Win!!!");
                        System.out.println("Score: " + score);
                    break;
                    case "Scissors":
                        System.out.println("You and your opponent picked the same weapon! You Tied!!");
                        System.out.println("Score: " + score);
                    break;
                    case "Lizard":
                        score +=1;
                        System.out.println("Scissors decapitates Lizard!!! You Win!!!");
                        System.out.println("Score: " + score);

                    break;
                    case "Spock":
                        System.out.println("Spock smashes Scissors!!! You Lose");
                        System.out.println("Score: " + score);
                    break;
                }
            break;
            case "Lizard":
                switch(computer_actions){
                    case "Rock":
                        System.out.println("Rock crushes Lizard!!! You Lose!!!");
                        System.out.println("Score: " + score);
                    break;
                    case "Paper":
                        score +=1;
                        System.out.println("Lizard eats Paper!!! You Win!!!");
                        System.out.println("Score: " + score);
                    break;
                    case "Scissors":
                        System.out.println("Scissors decapitates Lizard!!! You Lose!!!");
                        System.out.println("Score: " + score);
                    break;
                    case "Lizard":
                        System.out.println("You and your opponent picked the same weapon! You tied!!");
                        System.out.println("Score: " + score);
                    break;
                    case "Spock":
                        score +=1;
                        System.out.println("Lizard poisons Spock!!! You Win!!!");
                        System.out.println("Score: " + score);
                    break;
                }
            break;
            case "Spock":
                switch(computer_actions){
                    case "Rock":
                        score +=1;
                        System.out.println("Spock vaporizes Rock!!! You Win!!!");
                        System.out.println("Score: " + score);
                    break;
                    case "Paper":
                        System.out.println("Paper disproves Spock!!! You Lose!!!");
                        System.out.println("Score: " + score);
                    break;
                    case "Scissors":
                        score +=1;
                        System.out.println("Spock smashes Scissors!!! You Win!!!");
                        System.out.println("Score: " + score);
                    break;
                    case "Lizard":
                        System.out.println("Lizard poisons Spock!!! You Lose!!!");
                        System.out.println("Score: " + score);
                    break;
                    case "Spock":
                        System.out.println("You and your opponent picked the same weapon! You tied!!");
                        System.out.println("Score: " + score);
                    break;
                }
            break;
        }
        System.out.println("Would you like to play again? Y/N: ");
        String play_agn = input.next();
        if(play_agn.equals("Y")){
            play = true;
        }else{
            System.out.println("Final Score: " + score);
                play = false;
        }
    }   
    }   
}