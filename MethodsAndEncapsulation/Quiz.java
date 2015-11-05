enum Result {
  CORRECT, WRONG, UNANSWERED
}

public class Quiz {
  private static String[] trueAnswers = {"C", "A", "B", "D", "B", "C", "C", "A"};

  private String[] answers;
  private int correct = 0;
  private int wrong = 0;
  private int unanswered = 0;
  private Result[] results = new Result[8];
  private boolean passed;

  public Quiz(String[] check) {
    answers = check;
    checkAll();
  }

  private void checkAll() {
    for(int i = 0; i < results.length; i++)
      results[i] = Result.UNANSWERED;

    for(int i = 0; i < answers.length && i < trueAnswers.length; i++) {
      if(answers[i].equals("X")) {
        results[i] = Result.UNANSWERED;
        unanswered++;
      } else if(answers[i].equals(trueAnswers[i])) {
        results[i] = Result.CORRECT;
        correct++;
      } else {
        results[i] = Result.WRONG;
        wrong++;
      }
    }

    if(correct >= 5)
      passed = true;
  }

  public void printResults() {
    System.out.println("Question  Submitted Ans.  Correct Ans.  Result");
    for(int i = 0; i < results.length; i++) {
      System.out.printf("%5d %9s %15s %14s%n", (i+1),
          answers[i], trueAnswers[i], results[i]);
    }
    System.out.printf("No. of correct answers: %7s%n", correct);
    System.out.printf("No. of wrong answers: %9s%n", wrong);
    System.out.printf("No. of questions unanswered: %2s%n", unanswered);
    System.out.println("The candidate " + (passed ? "PASSED" : "FAILED") + ".");
  }

  public static void main(String[] args) {
    Quiz quiz = new Quiz(args);
    quiz.printResults();
  }
}
