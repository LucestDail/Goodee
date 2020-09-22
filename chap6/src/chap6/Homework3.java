package chap6;

/*
 * 
 * 3. 동전을 표현하는 Coion 클래스 구현하기
 * 멤버변수 :  동전의 면(side)
 *  멤버메서드 : flip() 
 *  기능 : 동전을 던져 동전의 면을 변경한다.
 *  Math.random() 메서드 이용. 앞면,뒷면 출력함.
 */


class Coin{
	boolean side = false;
	void flip() {
		float judge = (float) (Math.random());
		if(judge > 0.5)
			side = false;
		else
			side = true;
		System.out.println(side ? "앞면" : "뒷면");
	}
}

public class Homework3 {
	public static void main(String[] args) {
		Coin c1 = new Coin();
		c1.flip();
	}
}
