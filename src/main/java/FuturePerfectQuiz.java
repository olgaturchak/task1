import java.util.*;

public class FuturePerfectQuiz {
    public static final String ADMIN_PASSWORD = "1111";
    public static final int NUM_QUESTIONS = 5;

    static final List<String> questions = Arrays.asList(
            "Question 1: Cats ______ like tomatoes                 \nAnswers: \na) am; \nb) don`t; \nc) isn`t; \nd) does not",
            "Question 2: None of us _____ saints                   \nAnswers: \na) is;\nb) not;\nc) are;\nd) does not",
            "Question 3: Bob ______(watch TV) every evening        \nAnswers: \na) watch TVs;\nb) watches TV;\nc) watchs TV;\nd) watch TV",
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
