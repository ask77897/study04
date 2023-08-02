package project04;

public class Student {
	String name;
	int age;
	String phone;
	int num;
	
	Student(){
		name = "unknown";
		age = 0;
		phone = "unknown";
		num = 0;
				
	}
	
	Student(String name, int age, String phone, int num){
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.num = num;	
	}
//	Student(String name, int age, String phone){
//		this.name = name;
//		this.age = age;
//		this.phone = phone;
//		this.num++;	
//	}
	Student(String name, int age, String phone){
		this();// 클래스 내부(생성자 내부)에서 기본 생성자를 호출
	}
	Student(String str){
		age = 0;
		num = 0;
		
		if(str.charAt(0)<58) {
			phone = str;
			name = "unknown";
		}else {
			name = str;
			phone = "unkknown";
		}
	}
	Student(int a){
		name = "unkown";
		age = a;
		phone = "unknown";
		num = 0;
	}
//	Student(String b){
//		name = "unkown";
//		age = 0;
//		phone = b;
//		num = 0;
//	}
//	Student(int c){
//		name = "unknown";
//		age = 0;
//		phone = "unknown";
//		num = c;
//	}
	
	
	void printStudent() {
		System.out.println("이름: "+ this.name+", 나이: "+age+", 연락처: "+ phone+", 학번: "+num);
	}
	
	
}




//this -> 클래스 내부를 가르킨다.	(this.인스턴스 변수)
//Student.printStudent(); 단, this -> 해당 객체
//this() -> 메소드, 생성자 -> s1();
//생성자 부분에서 다른생성자를 불러오는 것.
//생성자 가장 첫번째 줄에 나와야한다.