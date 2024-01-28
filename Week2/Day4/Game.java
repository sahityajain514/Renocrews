import java.util.Random;
import java.util.Scanner;

public class Game {

    private int randomNumber;
    private int userGuess;
    private int numberOfGuesses;

    // Default constructor to generate a random number
    public Game() {
        generateRandomNumber();
        this.numberOfGuesses = 0;
    }

    // Method to generate a random number
    private void generateRandomNumber() {
        Random random = new Random();
        this.randomNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 100
    }

    // Method to take user input for a guess
    public void takeUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        this.userGuess = scanner.nextInt();
        numberOfGuesses++;
    }

    // Method to check if the user's guess is correct
    public boolean isEnteredCorrect() {
        return userGuess == randomNumber;
    }

    // Getter method for the number of guesses
    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }

    // Setter method for the number of guesses
    public void setNumberOfGuesses(int numberOfGuesses) {
        this.numberOfGuesses = numberOfGuesses;
    }

    // Method to print a hint when the user's guess is not correct
    public void printHint() {
        if (userGuess < randomNumber) {
            System.out.println("Too low! Try a higher number.");
        } else {
            System.out.println("Too high! Try a lower number.");
        }
    }

    public static void main(String[] args) {
        Game guessingGame = new Game();

        do {
            guessingGame.takeUserInput();

            if (guessingGame.isEnteredCorrect()) {
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("Number of guesses: " + guessingGame.getNumberOfGuesses());
            } else {
                guessingGame.printHint();
            }
        } while (!guessingGame.isEnteredCorrect());
    }
}


