package chap11;

public class StringEx2 {

	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		System.out.println(s.charAt(4)); // 문자 추출, 'E'
		System.out.println(s.compareTo("abc")); // 문자 크기 비교, 'A' - 'a' = 32
		System.out.println(s.compareToIgnoreCase("abcdefgh")); //대소문자 상관없이 첫번째 문자 비교
		System.out.println(s.concat("abc")); // 문자열 붙이기
		System.out.println(s.endsWith("GH")); // 문자열이 일치하는지?
		System.out.println(s.startsWith("ABC")); // 문자열이 일치하는지?
		System.out.println(s.equals("ABCDEFGH")); // 대소문자까지 다 비교
		System.out.println(s.equalsIgnoreCase("abcdEFGH")); // 대소문자 무시 비교
		
		s = new String("This is a String");
		System.out.println(s.indexOf('i')); //문자 위치 인덱스값 리턴
		System.out.println(s.indexOf('i',12)); // 입력한 인덱스(5)부터 해당하는 문자의 위치 인덱스값
		System.out.println(s.indexOf("is"));//"is" 문자열 위치 반환 : 2
		
		System.out.println(s.lastIndexOf("is"));// 뒤에서부터 "is" 문자열 위치 반환 : 5
		System.out.println(s.length()); // 문자열의 길이 반환
		System.out.println(s.replace("is", "QR"));// 문자열을 대체
		
		System.out.println(s.substring(5)); // 부분 문자열, 5번 이후 문자열 반환
		System.out.println(s.substring(5, 13)); // 부분 문자열, 5번 이후 문자열 13전까지 반환

		System.out.println(s.toLowerCase()); // 전체 다 소문자로
		System.out.println(s.toUpperCase()); // 전체 다 대문자로
		
		System.out.println("   문 자 열 공 백 제 거 t r i m   ".trim()); // 공백 제거
		String[] sarr = "a,b,c".split(",");
		for(String ss : sarr)
		System.out.println(ss);
	}

}
