import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] scores = {27.5, 77.3, 94.7, 100.0, 44.7, 67.8};

        Student student1 = new Student("Mike", "Jones", scores);

        System.out.println(student1);

        System.out.println(student1.getFirstName() + "'s scores are: " + Arrays.toString(scores));

        System.out.println(student1.getFirstName() + "'s total score is: " + student1.totalScore(scores));

        System.out.println(student1.getFirstName() + "'s average score is: " + student1.calculateAverageGrade(scores));
    }
}
