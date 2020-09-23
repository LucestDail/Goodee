package chap6;

class Rectangle3{
	int width = 0;
	int height = 0;
	int serialNo = 0;
	static int sno = 0;
	public Rectangle3(int w, int h) {
		width = w;
		height = h;
		serialNo = ++sno;
	}

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
		return serialNo+"/"+sno+" �簢��:("+width + "," + height + ") ���� : " + area() + ", �ѷ� : " + length();
	}
}

public class Exam4 {
	public static void main(String[] args) {
		Rectangle3[] rarr = new Rectangle3[5];
		int AreaSum = 0;
		int LengthSum = 0;
		for(int i = 0; i < rarr.length;i++) {
			int width = (int)(Math.random()*30)+20;;
			int height = (int)(Math.random()*30)+20;;
			rarr[i] = new Rectangle3(width, height);
			AreaSum += rarr[i].area();
			LengthSum += rarr[i].length();
		}
		for(int i = 0; i < rarr.length;i++) {
			System.out.println(rarr[i]);
		}
		System.out.println("��ü �簢�� ������ �� : " + AreaSum);
		System.out.println("��ü �簢�� �ѷ��� �� : " + LengthSum);
	}
}
