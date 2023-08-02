package project04;

public class Goodfood {
	String business;
	
	Goodfood(){
		business = "?";
	}
	
	Goodfood(String business){
		this.business = business;
	}
	
	void printFood() {
		System.out.println("이곳은 "+business+"입니다.");
	}
	
}
