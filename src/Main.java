import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // entre 1 et 100
        int numberOfTries = 0;
        int maxTries = 10;
        Scanner scanner = new Scanner(System.in);
        boolean hasWon = false;

        System.out.println("Bienvenue dans le jeu de devinettes !");
        System.out.println("Devinez un nombre entre 1 et 100. Vous avez 10 essais.");

        while (numberOfTries < maxTries) {
            System.out.print("Entrez votre essai #" + (numberOfTries + 1) + ": ");
            int userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess < numberToGuess) {
                System.out.println("Trop petit !");
            } else if (userGuess > numberToGuess) {
                System.out.println("Trop grand !");
            } else {
                hasWon = true;
                break;
            }
        }

        if (hasWon) {
            System.out.println("Bravo ! Vous avez deviné le bon nombre en " + numberOfTries + " essai(s) !");
        } else {
            System.out.println("Perdu ! Le bon nombre était : " + numberToGuess);
        }

        scanner.close();
    }
}