package project04;

import java.util.ArrayList;

public class test03 {

	public static void main(String[] args) {
		//1. 요식업 - (식당, 카페) - (나라별 가게, )
		ArrayList<Koreanfood> kfood = new ArrayList<>();
		String[] menu1 = {"김밥", "국밥", "비빔밥", "돌솥밥", "백반"};
		String[] menu2 = {"김밥", "치즈김밥", "소고기김밥", "참치김밥", "야채김밥"};
		int[] price1 = {2000, 6000, 5000, 8000, 10000};
		int[] price2 = {1500, 2000, 3000, 2500, 2000};
		kfood.add(new Koreanfood("식당", "한국", "한식당", 4.5, menu1, price1));
		kfood.add(new Koreanfood("식당", "한국", "김밥식당", 4.3, menu2, price2));
		ArrayList<Restaurant> rest = new ArrayList<>();
		ArrayList<Americanfood> afood = new ArrayList<>();
		String[] menu3 = {"페퍼로니피자", "하와이안피자", "치즈피자", "시카고피자", "맥시칸피자"};
		String[] menu4 = {"치즈버거", "비프버거", "더블치즈버거", "더블비프버거", "치킨버거"};
		int[] price3 = {10000, 11000, 10000, 13000, 12000};
		int[] price4 = {5000, 6000, 8000, 9000, 6000};
		afood.add(new Americanfood("식당", "미국", "피자하우스", 3.3, menu3, price3));
		afood.add(new Americanfood("식당", "미국", "버거하우스", 4.3, menu4, price4));
		rest.addAll(kfood);
		rest.addAll(afood);
		
		for(int i = 0; i<rest.size();i++) {
			rest.get(i).printRe();
		}
		
		
		
		//2. 주사위 게임하는 사람들 - 객체가 생성되면 랜덤한 주사위값(1~6)을 가지고 있다. 다른 객체와 주사위 값을 가지고 승부한다.
		//	 누가 이겼는지 판단을 하고, 게임을 할 때마다 주사위값이 바뀌어야 한다.
		
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		if(dice1.dice < dice2.dice){
			System.out.println("Player1: "+dice1.dice);
			System.out.println("Player2: "+dice2.dice);
			System.out.println("Player2이 이겼습니다.");
		}else if(dice1.dice > dice2.dice) {
			System.out.println("Player1: "+dice1.dice);
			System.out.println("Player2: "+dice2.dice);
			System.out.println("Player1이 이겼습니다.");
		}else {
			System.out.println("Player1: "+dice1.dice);
			System.out.println("Player2: "+dice2.dice);
			System.out.println("무승부입니다.");
		}

		
		//3. 카드게임 -> 객체화
		//컴퓨터, 사람을 객체화한다. 컴퓨터 vs 컴퓨터, 컴퓨터 vs 사람, 사람 vs 사람
		
		
		
		
		
		
	}

}
