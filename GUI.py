import random
import tkinter as tk

score = 0
com_answer = ""

#button event
def handle_click(event):
    possible_actions = ["rock", "paper", "scissors", "lizard", "Spock"]
    computer_actions = random.choice(possible_actions)
    if user_input == computer_actions:
        print(f"Both players selected {user_input}. It's a tie!\n Score = {score}")
        com_answer = "Both players selected {user_input}. It's a tie!\n Score = {score}"
#Rock
    elif user_input == "rock":
        if computer_actions == "scissors":
            score +=1
            print(f"Rock smashes scissors! You win!\n Score = {score}")
            com_answer = "Rock smashes scissors! You win!"
        elif computer_actions == "paper":
            print(f"Paper covers Rock! You lose\n Score = {score}")
            com_answer = "Paper covers Rock! You lose\n Score = {score}"
        elif computer_actions == "lizard":
            score +=1
            print(f"Rock crushes Lizard! You win!\n Score = {score}")
            com_answer = "Rock crushes Lizard! You win!\n Score = {score}"
        else:
            print(f"Spock vaporizes Rock! You lose!\n Score = {score}")
            com_answer ="Spock vaporizes Rock! You lose!\n Score = {score}" 
#Paper
    elif user_input == "paper":
        if computer_actions == "scissors":
            print(f"Scissors cuts Paper! You lose!\n Score = {score}")
            com_answer = "Scissors cuts Paper! You lose!\n Score = {score}"
        elif computer_actions == "lizard":
            print(f"Lizard eats Paper! You lose!\n Score = {score}")
            com_answer = "Lizard eats Paper! You lose!\n Score = {score}"
        elif computer_actions == "rock":
            score +=1
            print(f"Paper covers Rock! You win!\n Score = {score}")
            com_answer = "Paper covers Rock! You win!\n Score = {score}"
        else:
            score +=1
            print(f"Paper disproves Spock! You win!\n Score = {score}")
            com_answer = "Paper disproves Spock! You win!\n Score = {score}"
#Scissors
    elif user_input == "scissors":
        if computer_actions == "rock":
            score +=1
            print(f"Rock smashes scissors! You win!\n Score = {score}")
            com_answer = "Rock smashes scissors! You win!\n Score = {score}"
        elif computer_actions == "lizard":
            score +=1
            print(f"Scissors decapitates Lizard! You win!\n Score = {score}")
            com_answer = "Scissors decapitates Lizard! You win!\n Score = {score}"
        elif computer_actions == "paper":
            score +=1
            print(f"Scissors cuts Paper! You win!\n Score = {score}")
            com_answer = "Scissors cuts Paper! You win!\n Score = {score}"
        else:
            print(f"Spock smashes Scissors! You lose!\n Score = {score}")
            com_answer = "Spock smashes Scissors! You lose!\n Score = {score}"
#Lizard
    elif user_input == "lizard":
        if computer_actions == "scissors":
            print(f"Scissors decapitates Lizard! You lose!\n Score = {score}")
            com_answer = "Scissors decapitates Lizard! You lose!\n Score = {score}"
        elif computer_actions == "rock":
            print(f"Rock crushes Lizard! You lose!\n Score = {score}")
        elif computer_actions == "paper":
            score +=1
            print(f"Lizard eats Paper! You win!\n Score = {score}")
            com_answer = "Lizard eats Paper! You win!\n Score = {score}"
        else:
            score +=1
            print(f"Lizard poisons Spock! You win!\n Score = {score}")
            com_answer = "Lizard poisons Spock! You win!\n Score = {score}"
#Spock
    elif user_input == "Spock":
        if computer_actions == "scissors":
            score +=1
            print(f"Spock smashes scissors! You win!\n Score = {score}")
            com_answer = "Spock smashes scissors! You win!\n Score = {score}"
        elif computer_actions == "lizard":
            print(f"Lizard poisons Spock! You lose!\n Score = {score}")
            com_answer = "Lizard poisons Spock! You lose!\n Score = {score}"
        elif computer_actions == "paper":
            print(f"Paper disproves Spock! You lose!\n Score = {score}")
            com_answer = "Paper disproves Spock! You lose!\n Score = {score}"
        else:
            score +=1
            print(f"Spock vaporizes Rock! You win! \n Score = {score}")
            com_answer = "Spock vaporizes Rock! You win! \n Score = {score}"
          
#GUI Displayed
title = "Rock, Paper, Scissors, Lizard, Spock"
window = tk.Tk()
Title = tk.Label(text = title)
Title.pack()
hello = tk.Label(text="Choose your weapon (Rock, Paper, Scissors, Lizard, or Spock): ")
hello.pack()
user_input = tk.Entry(width = 50)
user_input.pack()
button = tk.Button(text = "Attack", command= handle_click)
button.pack()
result = tk.Label(text = com_answer)
result.pack()
window.mainloop()