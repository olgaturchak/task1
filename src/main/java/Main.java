import java.util.*;

public class Main {

    public static void main(String[] args) {
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

    public static class FuturePerfectQuiz {
        public static final String ADMIN_PASSWORD = "1111";
        public static final int NUM_QUESTIONS = 5;

        static final List<String> questions = Arrays.asList(
                "Question 1: Maryna _____ swim fast when she was young                 \nAnswers: \na) should; \nb) could; \nc) might; \nd) can",
                "Question 2: The detectives were ____ identify the murderer                   \nAnswers: \na) ought to;\nb) not;\nc) able to;\nd) does not",
                "Question 3: My boss _____ be in the office now, but I do not really know         \nAnswers: \na) can;\nb) could;\nc) may;\nd) let",
                "Question 4: Bill and Ben _____(get up) at 7 o'clock   \nAnswers: \na) gets up;\nb) gat up;\nc) get ups;\nd) get up",
                "Question 4: My mum ____(cook) dinner every day        \nAnswers: \na) cook;\nb) cooks;\nc) cok;\nd) cooked"
        );

        public static final Map<Integer, String> correctAnswers = new HashMap<>();

        static {
            correctAnswers.put(1, "b");
            correctAnswers.put(2, "c");
            correctAnswers.put(3, "b");
            correctAnswers.put(4, "d");
            correctAnswers.put(5, "b");
        }

        public static boolean isValidAnswer(String answer) {
            return answer.equals("a") || answer.equals("b") || answer.equals("c") || answer.equals("d");
        }
    }
}




