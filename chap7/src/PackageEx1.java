package src;

import java.util.Date;

import test.PackageTest;

class Pack1{
	void method() {
		System.out.println("chap7.Pack1.method()");
	}
}

public class PackageEx1 {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		java.lang.System.out.println("hello");
		Pack1 p = new Pack1();
		p.method();
		PackageTest pt = new PackageTest();
		pt.method();
	}

}
