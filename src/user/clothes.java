package user;
import java.util.Scanner;

public class clothes {
    public trousers td[];

   public void hello(int a){
	   int  i,j,k;
	   String name;
	   double c,b;
	   Scanner input = new Scanner (System.in);
	   
	   td = new trousers[a];
	   for(i=0;i<a;i++){
		   td[i] = new trousers();
		   System.out.printf("\nEnter to Customer name %d: ",i+1);
		   name = input.next();
		   td[i].setName(name);
			   System.out.print("=> Enter to price clothes: ");
			   c=input.nextDouble();
			   td[i].setclothes(c);
				   System.out.print("=> Enter to price trousers: ");
				   b=input.nextDouble();
				   td[i].settrousers(b);
			  
	   }
		
   }
   public trousers priceclothes(){
	   double x =0;
	   int h =0;
	   for(int a =0 ; a<td.length;a++){
			 if(a<td.length-1){
			 if(td[a].getclothes()> td[a+1].getclothes()){
				 x = td[a].getclothes();
			 }else{
				 x = td[a+1].getclothes();
			 }
			 }
		 }
		 for(int a=0 ; a<td.length;a++){
			 if(x== td[a].getclothes()){
					h= a;
			 }
		 }
		 
		   return td[h];
   }
public trousers pricetrousers(){
	  double x=0;
	  int k = 0;
	
	 for(int a =0 ; a<td.length;a++){
		 if(a<td.length-1){
		 if(td[a].gettrousers()< td[a+1].gettrousers()){
			 x = td[a].gettrousers();
		 }else{
			 x = td[a+1].gettrousers();
		 }
		 }
	 }
	 for(int a=0 ; a<td.length;a++){
		 if(x== td[a].gettrousers()){
				k = a;
		 }
	 }
	 
	   return td[k];
   
	 }

}

