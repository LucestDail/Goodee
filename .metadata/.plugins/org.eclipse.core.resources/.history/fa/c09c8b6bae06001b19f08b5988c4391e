package src;

class SingleObject{
	private static SingleObject obj = new SingleObject();
	private SingleObject() {}
	private int value = 100;
	public static SingleObject getObject() {
		return obj;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}


public class SingletonEx1 {
	public static void main(String ... args) {
//		SingleObject obj = new SingleObject(); //생성자 접근 불가
		SingleObject obj = SingleObject.getObject();
		System.out.println(obj.getValue());
		obj.setValue(500);
		System.out.println(obj.getValue());
	}

}
