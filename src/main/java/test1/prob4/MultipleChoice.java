package test1.prob4;

import java.util.Scanner;

public class MultipleChoice {
    char[] submittedAnswers = new char[8];
    char[] correctAnswers = new char[8];
    int counterCorrect;
    int counterWrong;
    int counterUnanswered;


    public void setCorrectAnswers() {
        correctAnswers[0] = 'C';
        correctAnswers[1] = 'A';
        correctAnswers[2] = 'B';
        correctAnswers[3] = 'D';
        correctAnswers[4] = 'B';
        correctAnswers[5] = 'C';
        correctAnswers[6] = 'C';
        correctAnswers[7] = 'A';
    }

    public void sumbitAnswers() {
        Scanner input = null;
        String answer;
        try {
            System.out.println("Answer with 'A', 'B','C', 'D' or put 'X' if you don't want to answer");
            for (int i = 1; i <= correctAnswers.length; i++) {
                input = new Scanner(System.in);
                do {
                    System.out.print("Your answer for question number " + i + " is: ");
                    answer = input.next();
                } while (!(answer.charAt(0) == 'A' || answer.charAt(0) == 'B' || answer.charAt(0) == 'C' || answer.charAt(0) == 'D' || answer.charAt(0) == 'X'));
                submittedAnswers[i - 1] = answer.charAt(0);
            }
        } finally {
            input.close();
        }

    }

    public void displayTableResults() {
        System.out.println("Question\tSubmitted\tCorrect\t\tResult");
        for (int i = 0; i < submittedAnswers.length; i++) {
            System.out.print("\t" + (i + 1));
            System.out.print("\t\t\t" + submittedAnswers[i]);
            System.out.print("\t\t\t" + correctAnswers[i]);
            if (submittedAnswers[i] == 'X') {
                System.out.print("\t\t" + Result.UNANSWERED);
                counterUnanswered++;
            } else if (submittedAnswers[i] == correctAnswers[i]) {
                System.out.print("\t\t" + Result.CORRECT);
                counterCorrect++;
            } else {
                System.out.print("\t\t" + Result.WRONG);
                counterWrong++;
            }
            System.out.println();
        }
    }

    public void displayResults() {
        System.out.println("No. of correct answers: " + counterCorrect);
        System.out.println("No. of wrong answers: " + counterWrong);
        System.out.println("No. of questions unanswered: " + counterUnanswered);


    }

    public void checkIfCandidatePassed() {
        if (counterCorrect >= 5) {
            System.out.println("The Candidate PASSED");
        } else {
            System.out.println("The candidate FAILED");
        }
    }
}
