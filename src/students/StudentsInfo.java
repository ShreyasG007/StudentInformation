package students;

import java.util.Scanner;

public class StudentsInfo {
	public static void main(String[] args) {
		Students[] stud = new Students[10];
		Scanner scanner = new Scanner(System.in);

		int choice;
		System.out.println("Enter total number of students : ");
		int totalStudent = scanner.nextInt();
		for (int i = 0; i < totalStudent; i++) {
			stud[i] = new Students();
		}

		System.out.println("Accept Student details");
		for (int i = 0; i < totalStudent; i++) {
			stud[i].accept();
		}

		do {
			System.out.println("\n*****Menu*****");
			System.out.println("1.Display all Student details.");
			System.out.println("2.Display Student details by id.");
			System.out.println("3.Display Maximum percentage student.");
			System.out.println("4.Exit");

			System.out.println("Enter your choice");
			choice = scanner.nextInt();

			switch (choice) {

			case 1:
				for (int i = 0; i < totalStudent; i++) {
					stud[i].display();
				}
				break;

			case 2:
				System.out.println("\nEnter a student id to be searched");
				int id = scanner.nextInt();

				Students foundStudent = null;

				for (int i = 0; i < totalStudent; i++) {
					if (stud[i].searchById(id)) {
						foundStudent = stud[i];
						break;
					}
				}

				if (foundStudent != null) {
					foundStudent.display();
				} else {
					System.out.println("Student id not found");
				}
				break;

			case 3:
				double maxPercentage = stud[0].percentage;
				Students maxPer = stud[0];

				for (int i = 0; i < totalStudent; i++) {
					if (stud[i].percentage > maxPercentage) {
						maxPercentage = stud[i].percentage;
						maxPer = stud[i];
					}
				}
				maxPer.display();
				break;

			case 4:
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}

		} while (choice != 4);

		scanner.close();
	}
}
