package project04;

public class Cafe extends Goodfood{
	String nation;
	String name;
	double rank;
	double cnt;
	
	Cafe(){
		nation = "??";
		name = "??";
	}
	
	Cafe(String business, String nation, String name, double rank){
		super(business);
		this.nation = nation;
		this.name = name;
		this.rank += rank;
		cnt++;
		
	}
	
	void printCa() {
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
