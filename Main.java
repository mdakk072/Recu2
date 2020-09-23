import java.util.*;
import java.util.Scanner;

public class Main{





	public static void main(String[] args) {


		boolean a = true ; 
		System.out.println("Welcome to Receipt : "); 

		Recu recu = new Recu();

		

		while( a ){

					recu.showReceipt();
					System.out.print("entrer name: ");
			        Scanner in1 = new Scanner(System.in);
					String name = in1.nextLine();
					if(name.equals("*")){
						recu.tools(); 
					}

					else{

			        System.out.print("entrer price: "); 
			        Scanner in2 = new Scanner(System.in);
			        int price =  Integer.parseInt(in2.nextLine());


			       recu.addItem(new Item(price,name));}


		}




		//recu.showReceipt();
		 String aaa = recu.showReceiptString();
		 System.out.println(aaa) ; 




	}
}