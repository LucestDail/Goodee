package Example;

public class BoxEx1 {

	public static void main(String[] args) {
		Box b = new Box();
		b.set("ȫ�浿");
		System.out.println(b.get());
		String name =  (String) b.get();
		b.set(new Apple());
		System.out.println(b.get());
		Apple a = new Apple();
		a = (Apple) b.get();
	}

}
