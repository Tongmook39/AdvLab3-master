package user;
import java.util.Scanner;
public class Command {
public static void main(String[] args){
	int num;
	Scanner input = new Scanner (System.in);
	System.out.print("Enter number to buy Goods: ");
	num= input.nextInt();
	clothes td = new clothes();
	td.hello(num);

	System.out.printf("\nName Customer: %s",td.priceclothes().getName());
	System.out.print("\nPrice clothes Max: "+td.priceclothes().getclothes());
	System.out.printf("\nName Customer: %s",td.pricetrousers().getName());
	System.out.print("\nPrice trousers Min: "+td.pricetrousers().gettrousers());
	
}
}