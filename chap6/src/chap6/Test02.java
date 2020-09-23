package chap6;

class Circle {
	int r = 1, x = 1, y=1, no;
	static int cno;

	Circle(int r, int x, int y) {
		this.r = r;
		this.x = x;
		this.y = y;
		no = ++cno;
	}

	Circle(int x, int y) {
		this.x = x;
		this.y = y;
		no = ++cno;
	}

	Circle(int r) {
		this.r = r;
		no = ++cno;
	}

	double area(int r) {
		return Math.PI * this.r * this.r;
	}

	double length(int r) {
		return Math.PI * 2 * this.r;
	}

	void move(int a, int b) {
		this.x += a;
		this.y += b;
	}

	void scale(int m) {
		this.r *= m;
	}

	public String toString() {
		return no + "번원 : 반지름 : "+ this.r +", 좌표(" +this.x+ ":"+this.y + ") , 넓이 : "+ area(this.r)+ ", 둘레 : " + length(this.r) ;
	}

}

public class Test02 {
	public static void main(String[] args) {
		Circle[] carr = new Circle[3];
		carr[0] = new Circle(10, 10, 10);
		carr[1] = new Circle(20, 20);
		carr[2] = new Circle(100);
		for (Circle c : carr) {
			System.out.println(c);
			c.move(10, 10);
			System.out.println(c);
			c.scale(3);
			System.out.println(c);
		}
	}
}