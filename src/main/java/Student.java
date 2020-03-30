import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private double[] scores;

    public Student (String firstName, String lastName, double[] scores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.scores = scores;
    }

    public String getFirstName() {
        return firstName;
    }

    public Double totalScore(double[] scores) {
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }

    public Double calculateAverageGrade(double[] scores) {
        double total = 0;
        for (int j = 0; j < scores.length; j++) {
            total += scores[j];
        }
        return total / scores.length;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", scores=" + Arrays.toString(scores) +
                '}';
    }
}
