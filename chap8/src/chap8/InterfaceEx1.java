package chap8;

interface Printerable{
	int INK = 100;
	void print();
}

interface Scannerable{
	void scan();
}

interface Faxable{
	String FAX_NO = "02-1234-5678";
	void send(String tel);
	void receive(String tel);
}

interface Complexerable
extends Printerable, Scannerable, Faxable{}
class Complexer implements Complexerable{
	int ink;
	String fax_no;
	Complexer(){
		this.ink = INK;
		this.fax_no = FAX_NO;
	}

	@Override
	public void print() {
		System.out.println("����մϴ�...");
		--ink;
	}

	@Override
	public void scan() {
		System.out.println("��ĵ�մϴ�...");
		
	}

	@Override
	public void send(String tel) {
		System.out.println(tel + "���� ���� �彺�� �����ϴ�...");
		
	}

	@Override
	public void receive(String tel) {
		System.out.println(tel + "���� ���� �彺�� ����մϴ�...");
		--ink;
		
	}
	
}

public class InterfaceEx1 {

	public static void main(String[] args) {
		Complexer myPrint = new Complexer();
		System.out.println("���� ��ũ�� : " + myPrint.ink);
		myPrint.print();
		System.out.println("���� ��ũ�� : " + myPrint.ink);
		myPrint.scan();   
		System.out.println("���� ��ũ�� : " + myPrint.ink);
		myPrint.send("010-1234-5678");   
		System.out.println("���� ��ũ�� : " + myPrint.ink);
		myPrint.receive("010-2429-9420");   
		System.out.println("���� ��ũ�� : " + myPrint.ink);
		if(myPrint instanceof Complexer) {
			System.out.println("Complexer ��ü��");
		}
		if(myPrint instanceof Complexerable) {
			System.out.println("Complexerable ��ü��");
		}
		if(myPrint instanceof Printerable) {
			System.out.println("Printerable ��ü��");
		}
		if(myPrint instanceof Scannerable) {
			System.out.println("Scannerable ��ü��");
		}
		if(myPrint instanceof Faxable) {
			System.out.println("Faxable ��ü��");
		}
	}

}
