package project04;

public class Cat extends Animal{
	String name;
	int age;
	
	Cat(String name, int age){
		//super();
		this.name = name;
		this.age = age;
	}
	
	
	void eat() {
		System.out.println("야옹~");
	}
	
	void sleep(){
		System.out.println("고양이가 잠을 잡니다.");
	}
}
//Cat cat = new Cat();

