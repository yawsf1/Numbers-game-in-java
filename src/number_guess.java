import java.util.Random;
import java.util.Scanner;

public class number_guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        try {
            int number = random.nextInt(1, 100);
            int score = 0;
            int tries = 0;
            int guess;
            do {
                System.out.print("Entrer un nombre (0 pour quitter): ");
                guess = scanner.nextInt();
                if (guess == number) {
                    score = score + 1;
                    System.out.println("You did win ! Your score is " + score + " with "+ tries +" wanna try again ? (1 si oui, 0 sinon)");
                    int again = scanner.nextInt();
                    tries = 0;
                    if (again == 1) {
                        continue;
                    } else {
                        System.out.println("Your score is " + score + " and your number of tries is " + tries);
                        break;
                    }
                } else {
                    if(guess == 0){
                        break;
                    }
                    tries = tries + 1;
                    if (guess > number) {
                        System.out.println("Too big, " + tries);
                    } else {
                        System.out.println("Too small, " + tries);
                    }
                }
            }
            while (guess != 0);
        }
        catch(Exception e){
            System.out.println("You should enter a number");
        }
        scanner.close();
    }
}