package chap11;

class Equal{
	int value;
	Equal(int value){
		this.value = value;
	}
}

public class EqualsEx1 {

	public static void main(String[] args) {
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(10);
		if(e1 == e2) {
			System.out.println("== 같음");
		}else {
			System.out.println("== 다름");
		}
		
		if(e1.equals(e2)) {
			System.out.println("equals 같음");
		}else {
			System.out.println("equals 다름");
		}
		
		if(e1.value == e2.value) {
			System.out.println("value 같음");
		}else {
			System.out.println("value 다름");
		}

	}

}
