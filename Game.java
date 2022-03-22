import java.util.Random;

public class Game {
    static int player_score;
    static int com_score;
    static String play_score;
    static String comp_score;
    static Random rand = new Random();
    static int random = rand.nextInt(5); //Gives you random number between 0 and 4
    static String[] possible_actions = {"Rock", "Paper", "Scissors", "Lizard", "Spock"};
    static String computer_actions = possible_actions[random];
    static String user_action;
    static String result;
    static boolean play = true;

    public static void main(String[] args) {
        /*System.out.println("Would you like to play again? Y/N: ");
        String play_agn = input.next();
        if(play_agn.equals("Y")){
            play = true;
        }else{
            System.out.println("Final Score: " + score);
                play = false;
        }
        */
    }   
    
    static void play_game(){
        switch(user_action){
            case "Rock":
                switch(computer_actions){
                    case "Rock":
                        result = "You and your opponent picked the same weapon! You Tied!!";
                        play_score = "Your Score: " + player_score;
                        System.out.println("Computer's Score: " + com_score);
                    break;
                    case "Paper":
                        com_score +=1;
                        result = "Paper covers Rock!! You Lose!!!!";
                        play_score = "Your Score: " + player_score;
                        comp_score = "Computer's Score: " + com_score;
                    break;
                    case "Scissors":
                        player_score +=1;
                        result = "Rock crushes Scissors!!!! You Win!!!";
                        play_score = "Your Score: " + player_score;
                        comp_score = "Computer's Score: " + com_score;
                    break;
                    case "Lizard":
                        player_score +=1;
                        result = "Rock crushes Lizard!!! You Win!!!";
                        play_score = "Your Score: " + player_score;
                        comp_score = "Computer's Score: " + com_score;
                    break;
                    case "Spock":
                        com_score +=1;
                        result = "Spock vaporizes Rock!!! You Lose!!!";
                        play_score = "Your Score: " + player_score;
                        comp_score = "Computer's Score: " + com_score;
                    break;
                }
            break;
            case "Paper":
                switch(computer_actions){
                    case "Rock":
                        player_score +=1;
                        result = "Paper covers Rock!! You Win!!!!";
                        play_score = "Your Score: " + player_score;
                        comp_score = "Computer's Score: " + com_score;
                    break;
                    case "Paper":
                    result = "You and your opponent picked the same weapon! You Tied!!";
                    play_score = "Your Score: " + player_score;
                    comp_score = "Computer's Score: " + com_score;
                    break;
                    case "Scissors":
                        com_score +=1;
                        result = "Scissors cuts Paper!!! You Lose!!!";
                        play_score = "Your Score: " + player_score;
                        comp_score = "Computer's Score: " + com_score;
                    break;
                    case "Lizard":
                        com_score +=1;
                        result = "Lizard eats Paper!!! You Lose!!!";
                        play_score = "Your Score: " + player_score;
                        comp_score = "Computer's Score: " + com_score;
                    break;
                    case "Spock":
                        player_score +=1;
                        result = "Paper disproves Spock!!! You Win!!!";
                        play_score = "Your Score: " + player_score;
                        comp_score = "Computer's Score: " + com_score;
                    break;
                }
            break;
            case "Scissors":
                switch(computer_actions){
                    case "Rock":
                        com_score +=1;
                        result = "Rock crushes Scissors!!!! You Lose!!!";
                        play_score = "Your Score: " + player_score;
                        comp_score = "Computer's Score: " + com_score;
                    break;
                    case "Paper":
                        player_score +=1;
                        result = "Scissors cuts Paper!!! You Win!!!";
                        play_score = "Your Score: " + player_score;
                        comp_score = "Computer's Score: " + com_score;
                    break;
                    case "Scissors":
                    result = "You and your opponent picked the same weapon! You Tied!!";
                    play_score = "Your Score: " + player_score;
                    comp_score = "Computer's Score: " + com_score;
                    break;
                    case "Lizard":
                        player_score +=1;
                        result = "Scissors decapitates Lizard!!! You Win!!!";
                        play_score = "Your Score: " + player_score;
                        comp_score = "Computer's Score: " + com_score;

                    break;
                    case "Spock":
                        com_score +=1;
                        result = "Spock smashes Scissors!!! You Lose";
                        play_score = "Your Score: " + player_score;
                        comp_score = "Computer's Score: " + com_score;
                    break;
                }
            break;
            case "Lizard":
                switch(computer_actions){
                    case "Rock":
                        com_score +=1;
                        result = "Rock crushes Lizard!!! You Lose!!!";
                        play_score = "Your Score: " + player_score;
                        comp_score = "Computer's Score: " + com_score;
                    break;
                    case "Paper":
                        player_score +=1;
                        result = "Lizard eats Paper!!! You Win!!!";
                        play_score = "Your Score: " + player_score;
                        comp_score = "Computer's Score: " + com_score;
                    break;
                    case "Scissors":
                        com_score +=1;
                        result = "Scissors decapitates Lizard!!! You Lose!!!";
                        play_score = "Your Score: " + player_score;
                        comp_score = "Computer's Score: " + com_score;
                    break;
                    case "Lizard":
                        result = "You and your opponent picked the same weapon! You tied!!";
                        play_score = "Your Score: " + player_score;
                        comp_score = "Computer's Score: " + com_score;
                    break;
                    case "Spock":
                        player_score +=1;
                        result = "Lizard poisons Spock!!! You Win!!!";
                        play_score = "Your Score: " + player_score;
                        comp_score = "Computer's Score: " + com_score;
                    break;
                }
            break;
            case "Spock":
                switch(computer_actions){
                    case "Rock":
                        player_score +=1;
                        result = "Spock vaporizes Rock!!! You Win!!!";
                        play_score = "Your Score: " + player_score;
                        comp_score = "Computer's Score: " + com_score;
                    break;
                    case "Paper":
                        com_score +=1;
                        result = "Paper disproves Spock!!! You Lose!!!";
                        play_score = "Your Score: " + player_score;
                        comp_score = "Computer's Score: " + com_score;
                    break;
                    case "Scissors":
                        player_score +=1;
                        result = "Spock smashes Scissors!!! You Win!!!";
                        play_score = "Your Score: " + player_score;
                        comp_score = "Computer's Score: " + com_score;
                    break;
                    case "Lizard":
                        com_score +=1;
                        result = "Lizard poisons Spock!!! You Lose!!!";
                        play_score = "Your Score: " + player_score;
                        comp_score = "Computer's Score: " + com_score;
                    break;
                    case "Spock":
                        result = "You and your opponent picked the same weapon! You tied!!";
                        play_score = "Your Score: " + player_score;
                        comp_score = "Computer's Score: " + com_score;
                    break;
                }
            break;
        }
    } }  
