package chap11;

class Equal{
	int value;
	Equal(int value){
		this.value = value;
	}
}

public class EqualsEx1 {

	public static void main(String[] args) {
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(10);
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
