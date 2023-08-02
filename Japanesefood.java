package project04;

public class Japanesefood extends Restaurant{
	String[] menu;
	int[] price;
	
	Japanesefood(){
		setting();
	}
	
	Japanesefood(String business, String nation, String name, double rank, String[] menu, int[] price){
		super(business, nation, name, rank);
		this.menu = menu;
		this.price = price;
	}
	
	
	void setting() {
		menu = new String[5];
		price = new int[5];
		for(int i = 0; i<menu.length; i++) {
			menu[i] = "SOLD OUT";
			price[i] = 0;
		}
	}
	void printRe() {
		super.printRe();
		for(int i = 0; i<menu.length; i++) {
			System.out.println("메뉴: "+menu[i]+", 가격: "+price[i]);
		}
	}
}
