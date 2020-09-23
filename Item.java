public class Item{

	private int price ; 
	private String name ; 


	public Item(int price, String name ) {

		this.price = price ;
		this.name = name ;
	}

	public  String getName(){
		return this.name;
	}
	public  int getPrice(){
		return this.price;
	}
	public  void setPrice(int newprice){
		this.price=newprice;


	}
	public  void setName(String newName){
		this.name=newName;
		

	}
}