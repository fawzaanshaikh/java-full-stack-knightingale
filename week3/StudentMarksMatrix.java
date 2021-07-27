package knightingale.week3;

import java.util.Scanner;

public class StudentMarksMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int numberOfStudents = sc.nextInt();
		System.out.print("Enter the number of subjects: ");
		int numberOfSubjects = sc.nextInt();
		
		int[][] marks = new int[numberOfStudents][numberOfSubjects + 1]; // + 1, since I am using the last column for total marks
		
		int i = 0, j = 0;
		for (i = 0; i < numberOfStudents; i++) {
			System.out.println("Enter the " + numberOfSubjects + " marks for student number " + (i + 1));
			
			for (j = 0; j < numberOfSubjects; j++) {
				marks[i][j] = sc.nextInt();
			}
		}
		
		calculateTotal(numberOfStudents, numberOfSubjects, marks); 
	}
	
	public static void calculateTotal(int maxStudents, int maxSubjects, int[][] marks) {
		int i = 0, j = 0, subjectSum = 0;	// Total of all subjects per student is stored in this variable
		
		for (i = 0; i < maxStudents; i++) {
			subjectSum = 0;
			
			for (j = 0; j < maxSubjects; j++) {
				subjectSum += marks[i][j];
			}
			
			marks[i][maxSubjects] = subjectSum;	// The last column is then filled with the total subjects' marks
			
			System.out.println("The total marks of student number " + (i + 1) + " is " + marks[i][maxSubjects]);
		}
		
		
	}
}
