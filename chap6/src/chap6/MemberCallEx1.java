package chap6;

public class MemberCallEx1 {
	static int cv1 = 10;
	static int cv2 = cv1; // 클래스 맴버 간 접근 : 가능
	int iv1 = 100;
	int iv2 = iv1; // 인스턴스 맴버 간 접근 : 가능
	int iv3 = cv1; // 인스턴스 맴버에서 클래스 맴버 접근 : 가능
	static int cv3 = new MemberCallEx1().iv1; // 클래스에서 인스턴스는 접근 불가능 : 일회용 객체 생성 필요
	void method1() { // 인스턴스 메소드
		System.out.println("cv1 + cv2 = " + (cv1 + cv2));
		System.out.println("iv1 + iv2 = " + (iv1 + iv2));
	}
	static void method2() { // 클래스 매소드
		System.out.println("cv1 + cv2 = " + (cv1 + cv2));
		// 클래스 맴버에서 인스턴스 맴버 직접 접근 불가능
		MemberCallEx1 m = new MemberCallEx1();
		System.out.println("iv1 + iv2 = " + (m.iv1 + m.iv2));
	}
	public static void main(String[] args) {
		// 클래스 맴버에서 인스턴스 맴버 직접 접근 불가능
		new MemberCallEx1().method1(); // 일회용 객체 생성
		method2();
	}

}
