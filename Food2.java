package project04;

public class Food2 extends Restaurant{
	String[] menu;
	int[] num;
	
	Food2() {
		this.setting();
		
	}
	
	
	Food2(String food, String name, int point){
		super(food, name, point);
		this.setting();
	}
	
	Food2(String food, String name, int point, String menu, int num){
		super(food, name, point);
		setting();
		this.menu[0] = menu;
		this.num[0] = num;
	}
	
	Food2(String food, String name, int point, String[] menu, int[] num){
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
//	Food2(String food, String name, float score, String menu, int num){
//		super(food, name, score);
//		this.menu=menu;
//		this.num=num;	
//	}
//	void hello() {
//		super.hello();
//	}
//	void score() {
//		System.out.println("이 가게의 평점은 "+ score + " 입니다.");
//	}
}
