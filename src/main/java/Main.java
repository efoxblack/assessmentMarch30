import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your first and last name?");
        String firstN = scan.nextLine();
        String lastN = scan.nextLine();

        System.out.println("How many grades do you have?");
        int num = scan.nextInt();

        System.out.println("Enter your grades: ");
        double[] scores = new double[num];

        for (int i = 0; i < scores.length; i++) {
            scores[i] = scan.nextDouble();
        }

        Student student1 = new Student(firstN, lastN, scores);

        System.out.println(student1);

        System.out.println(student1.getFirstName() + "'s scores are: " + Arrays.toString(scores));

        System.out.println(student1.getFirstName() + "'s total score is: " + student1.totalScore(scores));

        System.out.println(student1.getFirstName() + "'s average score is: " + student1.calculateAverageGrade(scores));
    }
}
