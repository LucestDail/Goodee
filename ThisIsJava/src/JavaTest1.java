
public class JavaTest1 {

	public static void main(String[] args) {

		String a = new String("hello");
		String b = "hello";
		
		if(a == "hello") {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		if(a == b) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		if(a.equals(b)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}
