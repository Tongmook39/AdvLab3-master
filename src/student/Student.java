package student;
import java.util.Scanner;


public class Student {
    public StudentInfo std[];

   public void InitialiData(int a){
	   int  i,j,k;
	   String name;
	   double c,b;
	   Scanner input = new Scanner (System.in);
	   
	   std = new StudentInfo[a];
	   for(i=0;i<a;i++){
		   std[i] = new StudentInfo();
		   System.out.printf("\nEnter the Student name #%d: ",i+1);
		   name = input.next();
		   std[i].setName(name);
			   System.out.print("=> Enter the student GPA: ");
			   c=input.nextDouble();
			   std[i].setGPA(c);
				   System.out.print("=> Enter the student height: ");
				   b=input.nextDouble();
				   std[i].setHeight(b);
			  
	   }
		
   }
   public double classGPA(){
	   double x =0;
	   for(int i=0;i<std.length;i++ )
	          x = x + std[i].getGPA();
	   return x/std.length;
   }
public StudentInfo tallestSTD(){
	  double x=0;
	  int k = 0;
	
	 for(int a =0 ; a<std.length;a++){
		 if(a<std.length-1){
		 if(std[a].getHeight()> std[a+1].getHeight()){
			 x = std[a].getHeight();
		 }else{
			 x = std[a+1].getHeight();
		 }
		 }
	 }
	 for(int a=0 ; a<std.length;a++){
		 if(x== std[a].getHeight()){
				k = a;
		 }
	 }
	 
	   return std[k];
   
	 }

   
}

