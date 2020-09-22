package chap6;

class Rectangle2{
	int width, height, serialNo;
	static int sno = 0;
	int area() {
		return width*height;
	}
	
	int length() {
		return 2*(width+height);
	}
	boolean isSquare() {
		return (width == height);
	}
	
	public String toString() {
		return serialNo + "번 사각형 : " +
	"(" + width + "," + height + "), " +
				(isSquare() ? "정사각형" : "직사각형")
				+ ", 지금까지 생성된 사각형 갯수 : " + sno + 
				", 면적 : " + area() + ", 둘레 : " + length();
	}
	
	
}

public class RectangleEx1 {

	public static void main(String[] args) {
		Rectangle2 rec21 = new Rectangle2();
		Rectangle2 rec22 = new Rectangle2();
		Rectangle2 rec23 = new Rectangle2();
		rec21.width = 30;
		rec21.height = 20;
		rec21.serialNo = ++Rectangle2.sno;
		rec22.width = 35;
		rec22.height = 25;
		rec22.serialNo = ++Rectangle2.sno;
		rec23.width = 30;
		rec23.height = 30;
		rec23.serialNo = ++Rectangle2.sno;
		System.out.println(rec21.toString());
		System.out.println(rec22.toString());
		System.out.println(rec23.toString());
		

	}

}
