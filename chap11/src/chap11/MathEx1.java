package chap11;
/*
 * Math 클래스 : 수치 계산 가능
 * 메소드 : static 메소드
 * 상수 : PI(원주율)
 * 		 E  (자연로그)
 * 
 */
public class MathEx1 {

	public static void main(String[] args) {
		int target = -100;
		System.out.println(Math.abs(target));
		System.out.println(Math.abs(-3.14));
		System.out.println(Math.ceil(3.14)); // 나보다 큰 정수
		System.out.println(Math.floor(3.5));
		System.out.println(Math.rint(3.5));
		System.out.println(Math.min(5, 10));
		System.out.println(Math.max(5, 10));
		System.out.println(Math.round(3.14));
		System.out.println(Math.random());
		System.out.println(Math.sin(Math.PI/2));
		System.out.println(Math.cos(Math.toRadians(60)));
		System.out.println(Math.tan(Math.toDegrees(Math.PI/2)));
		System.out.println(Math.log(Math.E));
		System.out.println(Math.sqrt(25));
		System.out.println(Math.pow(5,3));
	}

}
