import java.util.Random;
import java.util.Scanner;

public class Game {
    static int score;
    static Random rand = new Random();
    static int random = rand.nextInt(5); //Gives you random number between 0 and 4
    static String[] possible_actions = {"Rock", "Paper", "Scissors", "Lizard", "Spock"};
    static String computer_actions = possible_actions[random];
    static String result;
    static boolean play = true;

    public static void main(String[] args) {
        while(play == true){
        System.out.println("Choose your weapon: ");
        Scanner input= new Scanner(System.in);
        String user_action = input.next();
        input.close();
        switch(user_action){
            case "Rock":
                switch(computer_actions){
                    case "Rock":
                        System.out.println("You and your opponent picked the same weapon! You Tied!!");
                    break;
                    case "Paper":
                        System.out.println("Paper covers Rock!! You Lose!!!!");
                    break;
                    case "Scissors":
                        score +=1;
                        System.out.println("Rock crushes Scissors!!!! You Win!!!");
                    break;
                    case "Lizard":
                        score +=1;
                        System.out.println("Rock crushes Lizard!!! You Win!!!");
                    break;
                    case "Spock":
                        System.out.println("Spock vaporizes Rock!!! You Lose!!!");
                    break;
                }
            break;
            case "Paper":
                switch(computer_actions){
                    case "Rock":
                        score +=1;
                        System.out.println("Paper covers Rock!! You Win!!!!");
                    break;
                    case "Paper":
                        System.out.println("You and your opponent picked the same weapon! You Tied!!");
                    break;
                    case "Scissors":
                        System.out.println("Scissors cuts Paper!!! You Lose!!!");
                    break;
                    case "Lizard":
                        System.out.println("Lizard eats Paper!!! You Lose!!!");
                    break;
                    case "Spock":
                        score +=1;
                        System.out.println("Paper disproves Spock!!! You Win!!!");
                    break;
                }
            break;
            case "Scissors":
                switch(computer_actions){
                    case "Rock":
                        System.out.println("Rock crushes Scissors!!!! You Lose!!!");
                    break;
                    case "Paper":
                        score +=1;
                        System.out.println("Scissors cuts Paper!!! You Win!!!");
                    break;
                    case "Scissors":
                        System.out.println("You and your opponent picked the same weapon! You Tied!!");
                    break;
                    case "Lizard":
                        score +=1;
                        System.out.println("Scissors decapitates Lizard!!! You Win!!!");

                    break;
                    case "Spock":
                        System.out.println("Spock smashes Scissors!!! You Lose");
                    break;
                }
            break;
            case "Lizard":
                switch(computer_actions){
                    case "Rock":
                        System.out.println("Rock crushes Lizard!!! You Lose!!!");
                    break;
                    case "Paper":
                        score +=1;
                        System.out.println("Lizard eats Paper!!! You Win!!!");
                    break;
                    case "Scissors":
                        System.out.println("Scissors decapitates Lizard!!! You Lose!!!");
                    break;
                    case "Lizard":
                        System.out.println("You and your opponent picked the same weapon! You tied!!");
                    break;
                    case "Spock":
                        score +=1;
                        System.out.println("Lizard poisons Spock!!! You Win!!!");
                    break;
                }
            break;
            case "Spock":
                switch(computer_actions){
                    case "Rock":
                        score +=1;
                        System.out.println("Spock vaporizes Rock!!! You Win!!!");
                    break;
                    case "Paper":
                        System.out.println("Paper disproves Spock!!! You Lose!!!");
                    break;
                    case "Scissors":
                        score +=1;
                        System.out.println("Spock smashes Scissors!!! You Win!!!");
                    break;
                    case "Lizard":
                        System.out.println("Lizard poisons Spock!!! You Lose!!!");
                    break;
                    case "Spock":
                        System.out.println("You and your opponent picked the same weapon! You tied!!");
                    break;
                }
            break;
        }
        System.out.println("Would you like to play again? Y/N: ");
        
        
    }
    
}

    
}