import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] scores = new int[5]; // single-dimensional 
        System.out.print("Enter scores: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
        }

        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            char grade;

            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("Score is " + score + " and Grade is " + grade);
        }

        input.close();
    }
}

