package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class ConstValues {
	final int LOTTO_MAX = 1000;
	final int LOTTO_SET_MAX = 6;
	final int FIRST_PRIZE = 5;
	final int SECOND_PRIZE = 3;
	final int THIRD_PRIZE = 0;
	final int FIRST_PRIZE_DECLARE = 0;
	final int SECOND_PRIZE_DECLARE = 1;
	final int THIRD_PRIZE_DECLARE = 3;
	final int INIT_PRIZE_COUNTER = 3;
	final int INIT_PRINT_COUNTER = 0;
	final int INIT_PRIZE_COUNTER_DECLARE = 1;
	final int INIT_PRINT_COUNTER_DECLARE = 0;
}

class LottoSet {
	Set<Integer> set;

	LottoSet(Set<Integer> set) {
		this.set = set;
	}
}

class GenerateLottoSet extends LottoSet {

	ConstValues CONST = new ConstValues();

	GenerateLottoSet(Set<Integer> set) {
		super(set);
		// TODO Auto-generated constructor stub
	}

	public Set<Integer> generateRandom() {
		Set<Integer> set = new LinkedHashSet<>();
		while (true) {
			set.add((int) (Math.random() * CONST.LOTTO_MAX) + 1);
			if (set.size() == CONST.LOTTO_SET_MAX) {
				break;
			}
		}
		return set;
	}

}

class LottoPrinter extends LottoSet {

	ConstValues CONST = new ConstValues();

	LottoPrinter(Set<Integer> set) {
		super(set);
		// TODO Auto-generated constructor stub
	}

	public void LottoPrinting() {
		int prizeCounter = CONST.INIT_PRIZE_COUNTER;
		int printCounter = CONST.INIT_PRINT_COUNTER;
		for (int item : set) {
			if (printCounter == CONST.THIRD_PRIZE || printCounter == CONST.SECOND_PRIZE
					|| printCounter == CONST.FIRST_PRIZE) {
				System.out.println(prizeCounter + "등 복권 추첨합니다.");
				prizeCounter--;
			}
			System.out.println(item);
			printCounter++;
		}
	}
}

class ListLottoSet {
	List<Integer> setArrayList;

	ListLottoSet(List<Integer> setArrayList) {
		this.setArrayList = setArrayList;
	}
}

class ListLottoSetPrinter extends ListLottoSet {

	ConstValues CONST = new ConstValues();

	ListLottoSetPrinter(List<Integer> setArrayList) {
		super(setArrayList);
		// TODO Auto-generated constructor stub
	}

	public void LottoPrinting() {
		System.out.println("*** 복권 추첨 결과 ***");
		int prizeCounter = CONST.INIT_PRIZE_COUNTER_DECLARE;
		int printCounter = CONST.INIT_PRINT_COUNTER_DECLARE;
		for (int item : setArrayList) {
			if (printCounter == CONST.THIRD_PRIZE_DECLARE || printCounter == CONST.SECOND_PRIZE_DECLARE
					|| printCounter == CONST.FIRST_PRIZE_DECLARE) {
				System.out.print(prizeCounter + "등:");
				prizeCounter++;
			}
			System.out.print(item + " ");
			printCounter++;
			if (printCounter == CONST.THIRD_PRIZE_DECLARE || printCounter == CONST.SECOND_PRIZE_DECLARE
					|| printCounter == CONST.FIRST_PRIZE_DECLARE) {
				System.out.println();
			}
		}
	}

}

public class Test2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.println("[결과]");

		Set<Integer> set = new LinkedHashSet<>();
		set = new GenerateLottoSet(set).generateRandom();
		new LottoPrinter(set).LottoPrinting();

		List<Integer> setArrayList = new ArrayList<>(set);
		Collections.reverse(setArrayList);
		new ListLottoSetPrinter(setArrayList).LottoPrinting();

	}

}
