import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private int score;
    private Scanner scanner;

    public Quiz() {
        questions = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void administer() {
        for (Question q : questions) {
            System.out.println(q.getQuestion());
            String[] options = q.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((char) ('A' + i) + ": " + options[i]);
            }
            System.out.print("Your answer: ");
            char answer = scanner.next().toUpperCase().charAt(0);
            if (q.isCorrect(answer)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong. The correct answer was " + q.getCorrectAnswer() + ".\n");
            }
        }
        System.out.println("Quiz over! You scored " + score + " out of " + questions.size());
    }
}
