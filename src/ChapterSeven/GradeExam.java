package ChapterSeven;

public class GradeExam {
    char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
             {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
             {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
             {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
             {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        // Key to the questions
         char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

    public void getAnswers() {

        for (int counter = 0; counter < answers.length; counter++) {
            int correctCount = 0;
            for (int count = 0; count < answers[counter].length; count++) {
                if (answers[counter][count] == keys[count]) {
                    correctCount++;
                }

            }
            System.out.println("Student  " +counter+ "'s correct count is " + correctCount);

        }
    }

    public static void main(String[] args) {
        GradeExam gradeExam=new GradeExam();
        gradeExam.getAnswers();
    }
}