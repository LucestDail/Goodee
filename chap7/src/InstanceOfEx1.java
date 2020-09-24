package src;
/*
 * 인스턴스오브(InstanceOf)객체와 참조변수의 관계값을 반환
 * 
 */
public class InstanceOfEx1 {

	public static void main(String[] args) {
		Parent3 p = new Parent3();
		if(p instanceof Child3) {
			System.out.println("p 는 Child3 객체임");
			Child3 c = (Child3)p;
			System.out.println(c.x);
		}else
			System.out.println("p 는 Child3 객체아님");
		if(p instanceof Parent3) {
			System.out.println("p 는 Parent3 객체임");
		}else
			System.out.println("p 는 Parent3 객체아님");
		if(p instanceof Object)	{
			System.out.println("p 는 Object 객체임");
			Object o = (Object)p;
		}else
			System.out.println("p 는 Object  객체아님");
		
	}

}
