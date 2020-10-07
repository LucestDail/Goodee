package chap11;

public class HashCodeEx1 {

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		if(s1 == s2)
			System.out.println("s1과 s2 는 같은 객체");
		else
			System.out.println("s1과 s2 는 다른 객체");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("s1 객체의 원래 hashCode값 : " + System.identityHashCode(s1));
		System.out.println("s1 객체의 원래 hashCode값 : " + System.identityHashCode(s2));
	}
}
