from pickle import TRUE

import random;


score = 0
while TRUE:
    user_action = input("Choose your weapon (rock, paper, scissors, lizard, or Spock): ")

    possible_actions = ["rock", "paper", "scissors", "lizard", "Spock"]
    computer_actions = random.choice(possible_actions)

    print(f"You chose {user_action}.\n The computer chose {computer_actions}.\n")

    if user_action == computer_actions:
        print(f"Both players selected {user_action}. It's a tie!\n Score = {score}")
#Rock
    elif user_action == "rock":
        if computer_actions == "scissors":
            score +=1
            print(f"Rock smashes scissors! You win!\n Score = {score}")
        elif computer_actions == "paper":
            print(f"Paper covers Rock! You lose\n Score = {score}")
        elif computer_actions == "lizard":
            score +=1
            print(f"Rock crushes Lizard! You win!\n Score = {score}")
        else:
            print(f"Spock vaporizes Rock! You lose!\n Score = {score}")
#Paper
    elif user_action == "paper":
        if computer_actions == "scissors":
            print(f"Scissors cuts Paper! You lose!\n Score = {score}")
        elif computer_actions == "lizard":
            print(f"Lizard eats Paper! You lose!\n Score = {score}")
        elif computer_actions == "rock":
            score +=1
            print(f"Paper covers Rock! You win!\n Score = {score}")
        else:
            score +=1
            print(f"Paper disproves Spock! You win!\n Score = {score}")
#Scissors
    elif user_action == "scissors":
        if computer_actions == "rock":
            score +=1
            print(f"Rock smashes scissors! You win!\n Score = {score}")
        elif computer_actions == "lizard":
            score +=1
            print(f"Scissors decapitates Lizard! You win!\n Score = {score}")
        elif computer_actions == "paper":
            score +=1
            print(f"Scissors cuts Paper! You win!\n Score = {score}")
        else:
            print(f"Spock smashes Scissors! You lose!\n Score = {score}")
#Lizard
    elif user_action == "lizard":
        if computer_actions == "scissors":
            print(f"Scissors decapitates Lizard! You lose!\n Score = {score}")
        elif computer_actions == "rock":
            print(f"Rock crushes Lizard! You lose!\n Score = {score}")
        elif computer_actions == "paper":
            score +=1
            print(f"Lizard eats Paper! You win!\n Score = {score}")
        else:
            score +=1
            print(f"Lizard poisons Spock! You win!\n Score = {score}")
#Spock
    elif user_action == "Spock":
        if computer_actions == "scissors":
            score +=1
            print(f"Spock smashes scissors! You win!\n Score = {score}")
        elif computer_actions == "lizard":
            print(f"Lizard poisons Spock! You lose!\n Score = {score}")
        elif computer_actions == "paper":
            print(f"Paper disproves Spock! You lose!\n Score = {score}")
        else:
            score +=1
            print(f"Spock vaporizes Rock! You win! \n Score = {score}")
            

    play_again = input("Play again? (y/n): ")
    if play_again.lower() != "y":
        break
