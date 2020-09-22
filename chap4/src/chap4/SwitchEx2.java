package chap4;

public class SwitchEx2 {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 10) + 1;
		String[] prize = {"자전거","USB","키보드","","","","","","","",""};
		switch(num) {
		case 1:System.out.println("축하합니다. " +prize[num-1]+"에 당첨되었습니다.");break;
		case 2:System.out.println("축하합니다. " +prize[num-1]+"에 당첨되었습니다.");break;
		case 3:System.out.println("축하합니다. " +prize[num-1]+"에 당첨되었습니다.");break;
		default:System.out.println("아쉽습니다. 다음 기회에");
		}
	}
}