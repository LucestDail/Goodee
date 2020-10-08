package chap11;

class Equal2{
	int value;
	Equal2(int value){
		this.value = value;
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Equal2) {
			Equal2 e = (Equal2)o;
			return value == e.value;
			
		}else {
			return false;
		}
	}
}

public class EqualsEx2 {

	public static void main(String[] args) {
		Equal2 e1 = new Equal2(10);
		Equal2 e2 = new Equal2(10);
		if(e1 == e2) {
			System.out.println("== ����");
		}else {
			System.out.println("== �ٸ�");
		}
		
		if(e1.equals(e2)) {
			System.out.println("equals ����");
		}else {
			System.out.println("equals �ٸ�");
		}
		
		if(e1.value == e2.value) {
			System.out.println("value ����");
		}else {
			System.out.println("value �ٸ�");
		}

	}

}