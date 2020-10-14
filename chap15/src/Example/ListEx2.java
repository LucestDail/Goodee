package Example;
import java.util.List;
/**
 * Vector 예제 : Collection 프레임워크 이전 클래스
 * list 인터페이스의 구현 클래스
 * 이전 사용된 메소드의 list 를 구현한 메소드가 함께 존재
 */
import java.util.Vector;

public class ListEx2 {

	public static void main(String[] args) {
		Vector<Double> list = new Vector<>();
//		List<Double> list = new Vector<>();
		list.add(0.3);
		list.add(Math.PI);
		list.addElement(5.0); // Vectory 의 원래 메소드, add() 동일한 기능
		for(Double d : list) {
			System.out.println(d);
		}
		double num = 5.0;
		int index = list.indexOf(num);
		if(index < 0) {
			System.out.println(num + "은 list에 없습니다.");
		}else {
			System.out.println(num + "의 위치 : " + index);
		}
		num = 0.3;
		System.out.println(list.indexOf(num));
		if(list.contains(num)) {
			list.removeElement(num);
			System.out.println(num + " 삭제됨");
		}
		list.remove(5.0);
		System.out.println(list);
	}

}
