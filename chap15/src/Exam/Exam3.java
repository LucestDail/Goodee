package Exam;

import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet 이용하는 예제
 * 절대 중복 없음, 정렬할것
 * 로또 번호 1 ~ 45 임의의 숫자를 중복없이 6개 찾아서 출력
 * TreeSet 이용할 것
 * 
 * @author GDJ30
 *
 */
class LottoSet<T> {
	Set<T> set;

	LottoSet(Set<T> set) {
		this.set = set;
	}
}

class GenerateLottoSet extends LottoSet<Object>{
	
	ConstValues CONST = new ConstValues();
	
	GenerateLottoSet(Set<Object> set) {
		super(set);
	}
	
	public Set<Object> generateRandom(){
		Set<Object> set = new TreeSet<>();
		while (true) {
			set.add((int) (Math.random() * CONST.LOTTO_MAX) + 1);
			if (set.size() == CONST.LOTTO_SET_MAX) {
				break;
			}
		}
		return set;
	}
}

public class Exam3 {

	public static void main(String[] args) {
		Set<Object> set = new TreeSet<>();
		set = new GenerateLottoSet(set).generateRandom();
		System.out.println(set);
	}
}
