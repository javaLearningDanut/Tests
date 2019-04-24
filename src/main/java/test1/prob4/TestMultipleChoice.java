package test1.prob4;

public class TestMultipleChoice {
    public static void main(String[] args) {
        MultipleChoice multipleChoice=new MultipleChoice();
        multipleChoice.setCorrectAnswers();
        multipleChoice.sumbitAnswers();
        multipleChoice.displayTableResults();
        multipleChoice.displayResults();
        multipleChoice.checkIfCandidatePassed();
    }


}
