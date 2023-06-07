import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);
            List<String> userAnswers = new ArrayList<>();
            int totalCorrect = 0;

            System.out.println("Welcome to the Future Perfect Quiz!");
            System.out.println("Answer the following questions (a, b, c, d) or enter 'q' to quit:");

            for (int i = 0; i < FuturePerfectQuiz.NUM_QUESTIONS; i++) {
                System.out.println(FuturePerfectQuiz.questions.get(i));
                String answer = scanner.nextLine().toLowerCase();

                if (answer.equals("q")) {
                    System.out.println("Quiz terminated. Goodbye!");
                    return;
                }

                while (!FuturePerfectQuiz.isValidAnswer(answer)) {
                    System.out.println("Invalid answer. Please choose a valid option (a, b, c, d) or enter 'q' to quit:");
                    answer = scanner.nextLine().toLowerCase();
                    if (answer.equals("q")) {
                        System.out.println("Quiz terminated. Goodbye!");
                        return;
                    }
                }

                userAnswers.add(answer);

                if (answer.equals(FuturePerfectQuiz.correctAnswers.get(i + 1))) {
                    totalCorrect++;
                }
            }

            double percentage = (double) totalCorrect / FuturePerfectQuiz.NUM_QUESTIONS * 100;
            System.out.println("Quiz completed!");
            System.out.println("Your score: " + totalCorrect + "/" + FuturePerfectQuiz.NUM_QUESTIONS);
            System.out.println("Percentage: " + percentage + "%");

            System.out.println("Enter the administrator password to view the correct answers:");
            String password = scanner.nextLine();

            if (password.equals(FuturePerfectQuiz.ADMIN_PASSWORD)) {
                System.out.println("Correct answers:");
                for (int i = 0; i < FuturePerfectQuiz.NUM_QUESTIONS; i++) {
                    String correctAnswer = FuturePerfectQuiz.correctAnswers.get(i + 1);
                    System.out.println("Question " + (i + 1) + ": " + correctAnswer);
                }
            } else {
                System.out.println("Incorrect password. Exiting...");
            }
        }

    }

