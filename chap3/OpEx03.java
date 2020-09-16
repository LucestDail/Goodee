package chap3;

class OpEx03{

public static void main(String args[]) {
	int a=10,b=20;
	int c;
	c=++a + ++b;
	System.out.println("1.a="+a+"\tb="+b+"\tc="+c);
	c=a++ + b++;
	System.out.println("2.a="+a+"\tb="+b+"\tc="+c);
	c=a++ + ++b;
	System.out.println("3.a="+a+"\tb="+b+"\tc="+c);
	c=++a + b++;
	System.out.println("4.a="+a+"\tb="+b+"\tc="+c);
	c = --a + --b;
	System.out.println("5.a="+a+"\tb="+b+"\tc="+c);
	c = a-- + b--;
	System.out.println("6.a="+a+"\tb="+b+"\tc="+c);
	c = a-- + --b;
	System.out.println("7.a="+a+"\tb="+b+"\tc="+c);
	c = --a + b--;
	System.out.println("8.a="+a+"\tb="+b+"\tc="+c);
	}
}