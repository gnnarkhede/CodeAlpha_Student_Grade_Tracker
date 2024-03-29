import java.util.Scanner;

public class Student_grade_tracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Initialize arrays to store student grades
        int[] grades = new int[numStudents];

        // Enter grades for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
        }

        // Compute average, highest, and lowest grades
        int total = 0;
        int highest = grades[0];
        int lowest = grades[0];

        for (int grade : grades) {
            total += grade;

            if (grade > highest) {
                highest = grade;
            }

            if (grade < lowest) {
                lowest = grade;
            }
        }

        // Calculate average
        double average = (double) total / numStudents;

        // Display results
        System.out.println("\nResults:");
        System.out.println("Average Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);

        sc.close();
    }
}
