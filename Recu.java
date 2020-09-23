import java.util.*;
public class Recu {


	String newLine = System.getProperty("line.separator");


	private int totalPrice ; 
	private List<Item> listItems ;
	int userIndex;
	private String test1String ;


	public Recu(){


		this.listItems= new ArrayList<Item>()  ; 
		this.totalPrice = 0 ;
		this.l9lawi="          27/03/1992             /n"+"zReceipt";

	}


	public  void showReceipt(){

		userIndex=1;



	for (Item  element : listItems){
		
		System.out.println(userIndex+"."+element.getName()+":		"+element.getPrice()+"$");
		userIndex++;
	}
	 userIndex=1;

		System.out.println("Total price :		"+this.getTotalPrice( )+"$");


	}

	public String showReceiptString(){

		for (Item  element : listItems){

			l9lawi += "/n"+userIndex+"."+element.getName()+"   "+element.getPrice();
		
			//System.out.println(userIndex+"."+element.getName()+":		"+element.getPrice()+"$");
			userIndex++;
		}
		 userIndex=1;
	
			System.out.println("Total price :		"+this.getTotalPrice( )+"$");






		return test1 ;

	}

	public int getTotalPrice(){
		int sum = 0;
		for (Item  element : listItems){
			sum += element.getPrice();
			}
		return sum;
	}
	public  void  addItem(Item item){

		listItems.add(item) ; 
		totalPrice+=item.getPrice();
   

	}
	public void tools(){

		System.out.print("choisir : "+newLine+"1.enlever article"+newLine);
		Scanner inn1 = new Scanner(System.in);
					String choice = inn1.nextLine();

		if (choice.equals("1")){
			System.out.println("entrer l'index de l'article : ");
			Scanner in1n = new Scanner(System.in);
			int indexToRemove =  Integer.parseInt(in1n.nextLine())-1;
			this.removeItem(indexToRemove);
					

		}
		

	}

	public void removeItem(int indexItem){
		this.listItems.remove( indexItem);
	}
	}


