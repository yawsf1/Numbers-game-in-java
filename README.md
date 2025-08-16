# Numbers-game-in-java


### Random Number Guessing Game (Java)

This is a simple console-based Random Number Guessing Game written in Java.  
The program generates a random number between 1 and 100, and the player must guess it.  


### Features: 

- Generates a random number between 1 and 100.
- Player receives hints:
  - "Too big" if the guess is larger than the number.
  - "Too small" if the guess is smaller than the number.
- Keeps track of the number of tries.
- Increases score when the player guesses correctly.
- Option to play again after winning.
- Enter `0` at any time to quit the game.


### How to Run: 

1. Make sure you have Java (JDK 17+) installed.
2. Save the code in a file named `Random_Num.java`.
3. Compile the program:
   javac Random_Num.java

### Example Gameplay:

Entrer un nombre (0 pour quitter): 50
Too small, 1
Entrer un nombre (0 pour quitter): 75
Too big, 2
Entrer un nombre (0 pour quitter): 63
You did win ! Your score is 1 with 2 wanna try again ? (1 si oui, 0 sinon)
1
Entrer un nombre (0 pour quitter): ...
