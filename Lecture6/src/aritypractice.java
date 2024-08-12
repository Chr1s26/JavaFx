import java.util.Scanner;

public class aritypractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Create an array to store the grades of students
        double[] grades = new double[numStudents];

        // Ask the user to enter the grades of each student
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        // Calculate the average grade using the average method
        double averageGrade = average(grades);

        // Display the average grade
        System.out.println("Average grade of the class: " + averageGrade);

        // Close the scanner
        scanner.close();
    }

    public static double average(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}
