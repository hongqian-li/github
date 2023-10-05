import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = "Emma";
        int guess = 0;

        System.out.println("Guess my name (type 'stop' to exit)");
        String answer = in.nextLine();

        while (!answer.equals("stop")) { // Use while instead of While, and fix the condition
            if (answer.equals(name)) {
                System.out.println("Congratulations!\nYou guessed " + (guess + 1) + " times.");
                break;
            } else {
                System.out.println("Guess my name (type 'stop' to exit)");
                answer = in.nextLine();
                guess++;
            }
        }
        if (!answer.equals(name) && !answer.equals("stop")) {
            System.out.println("You guessed " + guess + " times.");
        }
    }
}
