package project04;

import java.util.ArrayList;

public class class21 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog("강아지", 4);
		Cat cat = new Cat("고양이", 5);
		
		dog.eat();
		dog.sleep();
		System.out.println(dog.name+ " "+ dog.age);
		cat.eat();
		cat.sleep();
		System.out.println(cat.name+" "+ cat.age);
		
		animal.eat();
		animal.sleep();
		System.out.println(animal.name+" "+ animal.age);
		
//식당 -> 어느 나라 음식인지, 식당 이름, 평점(부모클래스)
//가게 -> 메뉴, 가격 (자식클래스)
		
//		Restaurant rt = new Restaurant();
//		Food f1 = new Food("양식", "양식집", 4, "햄버거", 6000);
//		Food f2 = new Food("한식", "한식집", 5, "비빔밥", 5000);
//		Food f3 = new Food("일식", "일식집", 4, "초밥", 7000);
//		f1.hello();
//		f1.score();
//		System.out.println("가게이름: "+f1.name+", 음식종류: "+f1.food+", 음식이름: "+f1.menu+", 음식가격: "+f1.num);
//		f2.hello();
//		f2.score();
//		System.out.println("가게이름: "+f2.name+", 음식종류: "+f2.food+", 음식이름: "+f2.menu+", 음식가격: "+f2.num);
//		f3.hello();
//		f3.score();
//		System.out.println("가게이름: "+f3.name+", 음식종류: "+f3.food+", 음식이름: "+f3.menu+", 음식가격: "+f3.num);
//		rt.hello();
//		rt.score();
		
		Restaurant res = new Restaurant();
		res.printRes();
		
		Food food = new Food();
		food.printRes();
		
		Food2 food2 = new Food2();
		food2.printRes();
		
		Food3 food3 = new Food3();
		food3.printRes();
		
		Food fd1 = new Food("한식", "한식당", 5, "백반", 5000);
		fd1.printRes();
		String[] menu = {"초밥", "라멘", "우동"};
		int[] num = {10000, 8000, 6000};
		Food2 fd2 = new Food2("일식", "일식당", 4, menu, num);
		fd2.printRes();
		
		fd2.setPoint(1);
		fd2.setPoint(1);
		fd2.setPoint(1);
		fd2.setPoint(1);
		fd2.setPoint(1);
		fd2.printRes();
		
//		Food[] ff1 = new Food[5];
		ArrayList<Food> foodlist = new ArrayList<>();
		System.out.println("s:"+foodlist.size());
		foodlist.add(fd1);
		System.out.println("s:"+foodlist.size());
		foodlist.add(food);
		System.out.println("s:"+foodlist.size());
		
		Food ff1 = new Food("한식", "한식당", 3, "국밥", 6000);
		foodlist.add(ff1);
		
		foodlist.add(new Food("한식", "한식당", 4, "김밥", 1000));
		
		System.out.println(foodlist.get(2).name);
		
		foodlist.remove(2);
		System.out.println("가게이름: "+foodlist.get(0).name+", 음식종류: "+foodlist.get(0).food
				+", 평점: "+foodlist.get(0).point);
		System.out.println("메뉴: "+foodlist.get(0).menu[0]+", 가격: "+foodlist.get(0).num[0]);
		System.out.println("메뉴: "+foodlist.get(2).menu[0]+", 가격: "+foodlist.get(2).num[0]);
		System.out.println("메뉴: "+foodlist.get(0).menu[0]+", 가격: "+foodlist.get(0).num[0]);
		
		foodlist.get(2).printRes();
		System.out.println("---");
		for(int i = 0; i<foodlist.size(); i++) {
			foodlist.get(i).printRes();
		}
		
		
		
		
		
		
	}

}




//상속(inheritance) -> 자식에게 물려주는 것.
//부모 클래스(parent class), 기반 클래스(bass class)
//부모 클래스는 보통 자식 클래스가 공통적으로 가지는 필드와 메서드를 정의할 때 사용한다.
//부모 클래스명 {}

//자식 클래스(child class), 파생 클래스(derived class)
//자식 클래스는 보통 부모 클래스에게 상속을 받아 새로운 클래스를 만드는 것.
//속성, 메서드들을 물려받을 수 있다.
//자식 클래스명 extends 부모 클래스명{}
//자식 클래스에서 부모 클래스에세 상속을 받아 속성과 메서드를 사용하려면 super키워드를 사용해야 한다.

//객체는 배열에 못넣나?
//String[] -> 객체 배열

//배열(Array) list
//ArrayList
//객체 밖에 못 넣는다.
//배열의 단점 : 사이즈를 지정해줘야 한다.
//ArrayList는 사이즈가 유동적이다.
//ArrayList<객체> 어레이리스트명 = new ArrayList<>();



