package chap6;
class Rectangle{
	int width;
	int height;
	int area(int width, int height) {
		return width*height;
	}
	int length(int width, int height) {
		return 2 * width + 2 * height;
	}

}
public class Exam1 {

	public static void main(String[] args) {
		Rectangle R1 = new Rectangle();
		R1.width = 10;
		R1.height = 20;
		System.out.println(R1.area(R1.width, R1.height));
		System.out.println(R1.length(R1.width, R1.height));
	}

}
