package Test1030;

import java.util.stream.Stream;

public class Test4 {
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String[]> strArrStrm = Stream.of(
				new String[] {"홍길동","김삿갓","이몽룡"},
				new String[] {"서울특별시","금천구","가산동","대륭테크노타운 3차"}
				);
		
		strArrStrm.forEach(s->{
			for(String item : s) {
				Test4.count += item.length();
			}
		});
		System.out.println("총 문자열의 합 : " + Test4.count);
	}

}
