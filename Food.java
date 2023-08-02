package project04;

public class Food extends Restaurant{
	String[] menu;
	int[] num;
	
	Food() {
		this.setting();
		
	}
	
	Food(String food, String name, int point){
		super(food, name, point);
		this.setting();
	}
	
	Food(String food, String name, int point, String menu, int num){
		super(food, name, point);
		setting();
		this.menu[0] = menu;
		this.num[0] = num;
	}
	
	Food(String food, String name, int point, String[] menu, int[] num){
		super(food, name, point);
		this.menu = menu;
		this.num = num;
	}
	
	void setting() {
		menu = new String[3];
		num = new int[3];
		for(int i = 0; i<menu.length; i++) {
			menu[i] = "SOLD OUT";
			num[i] = 0;
		}
	}
	
	void printRes() {
		super.printRes();
		for(int i = 0; i<menu.length; i++) {
			System.out.println("메뉴: "+menu[i]+", 가격: "+num[i]);
		}
	}
	
	
//	Food(String food, String name, int point, String menu, int num){
//		super(food, name, point);
//		this.menu=menu;
//		this.num=num;	
//	}
	void hello() {
		System.out.println("Welcome!");
	}
	
	
	
}
