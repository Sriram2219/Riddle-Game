import java.util.Scanner;

public class riddle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        // Array of riddles
        String[] riddles = {
            "I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I?",
            "The more of me you take, the more you leave behind. What am I?",
            "What has keys but can't open locks?"
        };

        // Array of answers
        String[] answers = {"echo", "footsteps", "piano"};

        System.out.println("Welcome to the Riddle Game!");
        System.out.println("Type your answers in lowercase. Let's start!\n");

        // Loop through riddles
        for (int i = 0; i < riddles.length; i++) {
            System.out.println("Riddle " + (i + 1) + ": " + riddles[i]);
            System.out.print("Your Answer: ");
            String userAnswer = sc.nextLine().trim();

            // Check answer
            if (userAnswer.equals(answers[i])) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is: " + answers[i] + "\n");
            }
        }

        System.out.println("Game Over! Your final score is: " + score + "/" + riddles.length);
        sc.close();
    }
}
