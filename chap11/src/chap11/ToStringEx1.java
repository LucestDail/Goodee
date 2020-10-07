package chap11;

class ToString{
	int value;
	ToString(int value){
		this.value = value;
	}
	@Override
	public String toString() {
		return "value : " + value;
	}
}

public class ToStringEx1 {

	public static void main(String[] args) {
		ToString t1 = new ToString(10);
		ToString t2 = new ToString(20);
		System.out.println(t1.toString());
		System.out.println(t2);
	}

}
