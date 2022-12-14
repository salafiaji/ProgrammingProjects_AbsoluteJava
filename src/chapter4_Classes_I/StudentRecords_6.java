package chapter4_Classes_I;

/**
 * Write a grading program for a class with the following grading policies:
 *  a. There are three quizzes, each graded on the basis of 10 points.
 *  b. There is one midterm exam, graded on the basis of 100 points.
 *  c. There is one final exam, graded on the basis of 100 points.
 *  The final exam counts for 40% of the grade. The midterm counts for 35% of the
 * grade. The three quizzes together count for a total of 25% of the grade. (Do not
 * forget to convert the quiz scores to percentages before they are averaged in.)
 *  Any grade of 90 or more is an A, any grade of 80 or more (but less than 90) is a
 * B, any grade of 70 or more (but less than 80) is a C, any grade of 60 or more (but
 * less than 70) is a D, and any grade below 60 is an F. The program should read in
 * the student’s scores and output the student’s record, which consists of three quiz
 * scores and two exam scores, as well as the student’s overall numeric score for the
 * entire course and final letter grade.
 *  Define and use a class for the student record. The class should have instance variables for the quizzes, midterm, final, overall numeric score for the course, and
 * final letter grade. The overall numeric score is a number in the range 0 to 100,
 * which represents the weighted average of the student’s work. The class should have
 * methods to compute the overall numeric grade and the final letter grade. These last
 * methods should be void methods that set the appropriate instance variables. Your
 * class should have a reasonable set of accessor and mutator methods, an equals
 * method, and a toString method, whether or not your program uses them. You
 * may add other methods if you wish.
 */

public class StudentRecords_6 {
    public static final double QUIZ_GRADE_PERCENT = 0.25;
    public static final double MIDTERM_GRADE_PERCENT = 0.35;
    public static final double FINAL_EXAM_GRADE_PERCENT = 0.4;
    private double quiz1;
    private double quiz2;
    private double quiz3;
    private double midtermScore;
    private double finalExamScore;
    private double overallNumericScore;
    private char finalLetterGrade;

    public StudentRecords_6(double qz1, double qz2, double qz3, double mt, double fes) {
        if (qz1 > 10 || qz1 < 0)  {
            System.out.println("Score out of range, input values between 0 and 10 ");

        } else {
            this.quiz1 = qz1;
        }
        if (qz2 > 10 || qz2 < 0)  {
            System.out.println("Score out of range, input values between 0 and 10 ");
        } else {
            this.quiz2 = qz2;
        }
        if (qz3 > 10 || qz3 < 0)  {
            System.out.println("Score out of range, input values between 0 and 10 ");
        } else {
            this.quiz3 = qz3;
        }
        if (mt > 100 || mt < 0)  {
            System.out.println("Score out of range, input values between 0 and 100 ");
        } else {
            this.midtermScore = mt;
        }
        if (fes > 100 || fes < 0)  {
            System.out.println("Score out of range, input values between 0 and 100 ");
        } else {
            this.finalExamScore = fes;
        }

    }

    public double getQuiz1() {
        return quiz1;
    }

    public double getQuiz2() {
        return quiz2;
    }

    public double getQuiz3() {
        return quiz3;
    }

    public double getOverallNumericScore() {
        overallNumericScore = getAvgQuizScore() + getMidtermScore() + getFinalExamScore();

        return overallNumericScore;
    }


    public char getFinalLetterGrade() {
        double numericGrade = overallNumericScore;
        if (numericGrade >= 90)
        {
            return 'A';
        }
        else if (numericGrade < 90 && numericGrade >= 80)
        {
            return 'B';
        }
        else if (numericGrade < 80 && numericGrade >= 70)
        {
            return 'C';
        }
        else if (numericGrade < 70 && numericGrade >= 60)
        {
            return 'D';
        }
        else
        {
            return 'F';
        }


    }

    public double getAvgQuizScore() {
        return (quiz1 + quiz2 + quiz3) * QUIZ_GRADE_PERCENT / 3;
    }

    public double getMidtermScore() {
        return midtermScore * MIDTERM_GRADE_PERCENT;
    }

    public double getFinalExamScore() {
        return finalExamScore * FINAL_EXAM_GRADE_PERCENT;
    }


}
