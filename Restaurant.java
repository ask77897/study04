package project04;

public class Restaurant extends Goodfood {
	String food;
	String nation;
	String name;
	int point = 0;
	int count = 0;
	double rank = 0;
	double cnt = 0;

	
	Restaurant(){
		nation = "??";
		name = "??";
		
		
	}
	Restaurant(String food, String name, int point){
		this.food = food;
		this.name = name;
		this.point += point;
		count++;
		
	}
	Restaurant(String business,String nation, String name, double rank){
		super(business);
		this.nation = nation;
		this.name = name;
		this.rank += rank;
		cnt++;
		
	}
	

	void printRes() {
		System.out.println("어서오세요.");
		if(count == 0) {
			System.out.println("가게이름: "+name+", 음식종류: "+food+", 평점: "+0);
		}
		else {
			System.out.println("가게이름: "+name+", 음식종류: "+food+", 평점: "+point/count);
		}
	}
	void setPoint(int point) {
		this.point += point;
		count++;
	}
	void printRe() {
		System.out.print("어서오세요. ");
		super.printFood();
		if(cnt == 0) {
			System.out.println("가게이름: "+name+", 국가: "+nation+", 평점: "+0);
		}
		else {
			System.out.println("가게이름: "+name+", 국가: "+nation+", 평점: "+rank/cnt);
		}
	}
	void setRank(double rank) {
		this.rank += rank;
		cnt++;
	}
	
	
	
}
