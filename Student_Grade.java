import java.util.Scanner;

class Student_Grade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total number of subjects: ");
        int numSubjects = sc.nextInt();

        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks in  subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            totalMarks = totalMarks + marks[i];
        }

        double avgPercentage = (double) totalMarks / (numSubjects * 100) * 100;

        String grade;
        if (avgPercentage >= 90) {
            grade = "Outstanding";
        } else if (avgPercentage >= 80) {
            grade = "Excellent";
        } else if (avgPercentage >= 70) {
            grade = "Verygood";
        } else if (avgPercentage >= 60) {
            grade = "Good";
        } else if (avgPercentage >= 50) {
            grade = "Average";
        } else {
            grade = "Fail";
        }

        System.out.println("Total Marks is: " + totalMarks);
        System.out.println("Average Percentage is : " + avgPercentage);
        System.out.println("Grade: " + grade);

    }
}
