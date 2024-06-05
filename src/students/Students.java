package students;

import java.util.Scanner;

public class Students {
	Scanner scanner = new Scanner(System.in);
	
	int studId;
	String studName;
	double percentage;
	int totalMarks=0;
	int[] studMarks = new int[5];
	
	public void accept() {
		System.out.println("Enter Students id : ");
		studId=scanner.nextInt();
		System.out.println("Enter Students Name : ");
		studName=scanner.next();
		System.out.println("Please Enter 5 marks :");
		for(int i=0;i<5;i++) {
			studMarks[i]=scanner.nextInt();
		}
		average();
	}
	
	public void average() {
		for(int i=0;i<5;i++) {
			totalMarks += studMarks[i];
		}
		percentage = (totalMarks * 100)/500;
	}
	
	public boolean searchById(int id) {
		return id==studId;
	}
	
	public void display() {
		System.out.println("\nStudent Id: "+studId);
		System.out.println("Student Name: "+studName);
		System.out.println("Percentage : "+percentage);
	}
	
}
