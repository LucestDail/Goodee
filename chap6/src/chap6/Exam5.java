package chap6;


class CoinToss{
	int side;
	void flip() {
		side = (int)(Math.random()*2);
	}
}

public class Exam5 {

	public static void main(String[] args) {
		final int TossCount = 3;
		CoinToss myCoin = new CoinToss();
		CoinToss youCoin = new CoinToss();
		System.out.println("<myCoin>\t<youCoin>");
		boolean end = false;
		while(!end) {
			int myWin = 0;
			int youWin = 0;
			for(int i = 0;i < TossCount;i++) {
				myCoin.flip();
				youCoin.flip();
				System.out.println(myCoin.side +" : " + youCoin.side);
				if(myCoin.side == 1)
					myWin++;
				if(youCoin.side == 1)
					youWin++;
			}
			if(myWin == 3) {
				System.out.println("myCoin win!");
				end = true;
			}
			if(youWin == 3) {
				System.out.println("youCoin win!");
				end = true;
			}
		}
		
	}
}
