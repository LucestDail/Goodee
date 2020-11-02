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
				new Member2("ȫ�浿","hong", new Address("�ѱ�","����")));
		System.out.println("���ֵ��� : " + city);
		
		funAB = funB.compose(funA);
		city = funAB.apply(
				new Member2("���","kim", new Address("�ѱ�","�λ�")));
		
		System.out.println("���ֵ��� : " + city);
		
		
	}

}
