package Example;

import java.util.function.Function;

public class AndThenEx2 {
	public static void main(String[] args) {
		//Function <parameter, return> ~~;
		Function<Member2, Address> funA;
		Function<Address,String> funB;
		Function<Member2, String> funAB;
		String city;
		funA = (a) -> a.getAddress();
		funB = (b) -> b.getCity(); 
		funAB = funA.andThen(funB);
		city = funAB.apply(
				new Member2("홍길동","hong", new Address("한국","서울")));
		System.out.println("거주도시 : " + city);
		
		funAB = funB.compose(funA);
		city = funAB.apply(
				new Member2("김삿갓","kim", new Address("한국","부산")));
		
		System.out.println("거주도시 : " + city);
		
		
	}

}
