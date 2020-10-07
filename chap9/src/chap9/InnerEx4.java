package chap9;

interface I {
	void test();
}

public class InnerEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iv = 100;
		System.out.println("iv : " + iv);

		I i = new I() {
			public void test() {
				System.out.println("iv : " + iv);
			}
		};
		i.test();
		
		
		i = ()->System.out.println("iv : " + iv);
		i.test();
	}
	

}
