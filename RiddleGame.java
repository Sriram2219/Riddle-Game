import java.util.Scanner;

public class RiddleGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array of riddles and their answers
        String[][] riddles = {
            {"What has keys but can't open locks?", "piano"},
            {"I speak without a mouth and hear without ears. I have no body, but I come alive with wind. What am I?", "echo"},
            {"The more of this there is, the less you see. What is it?", "darkness"},
            {"I am tall when I am young, and I am short when I am old. What am I?", "candle"}
        };

        int score = 0;

        System.out.println("Welcome to the Riddle Game!");
        System.out.println("Try to answer the riddles correctly.");

        // Loop through each riddle
        for (int i = 0; i < riddles.length; i++) {
            System.out.println("\nRiddle " + (i + 1) + ": " + riddles[i][0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().toLowerCase().trim();

            // Check if the user's answer is correct
            if (userAnswer.equals(riddles[i][1])) {
                System.out.println("Correct! Well done.");
                score++;
            } else {
                System.out.println("Oops! The correct answer is: " + riddles[i][1]);
            }
        }

        // Display the final score
        System.out.println("\nGame over! Your final score is: " + score + "/" + riddles.length);
        scanner.close();
    }
}
