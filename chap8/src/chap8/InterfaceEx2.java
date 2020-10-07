package chap8;

class LazerZet implements Printerable{
	public void print() {
		System.out.println("LazerZet Print method");
	}
}

class InkZet implements Printerable{
	public void print() {
		System.out.println("InkZet Print method");
	}
}

class PrinterManager{
	public static Printerable getPrinter(String type) {
		if(type.equals("INK")) {
			return new InkZet();
		}else {
			return new LazerZet();
		}
	}
}

public class InterfaceEx2 {

	public static void main(String[] args) {
		Printerable a = PrinterManager.getPrinter("INK");
		a.print();
		a = PrinterManager.getPrinter("");
		a.print();

		LazerZet zet = (LazerZet)PrinterManager.getPrinter("INK");
		zet.print();
	}

}
