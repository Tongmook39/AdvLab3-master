package student;
import java.util.Scanner;
public class Command2 {
public static void main(String[] args){
	int num;
	Scanner input = new Scanner (System.in);
	System.out.print("Enter the number of student: ");
	num= input.nextInt();
	Student std = new Student();
	std.InitialiData(num);

	System.out.printf("\nClass GPA: %.2f",std.classGPA());
	System.out.print(" \n"+ std.tallestSTD().getName()+" has the maximum height," +std.tallestSTD().getHeight() +"cm.");
}
}
