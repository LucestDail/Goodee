package Exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 1. 대만민국 = 서울, 캐나다 = 오타와, 영국 = 런던을 hashMap에 저장 화면에서 나라 이름을 입력받아 해당 나라의 수도를
 * 출력하는 프로그램 구현하기 만약 등록된 나라가 아닌 경우 등록된 나라가 아닙니다 출력 2. '종료' 문자가 입력되면 프로그램 종료 3.
 * 등록된 나라가 아닐 경우 나라 추가
 * 
 * @author GDJ30
 *
 */

public class Exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		String[] nation = { "대한민국", "캐나다", "영국" };
		String[] country = { "서울", "오타와", "런던" };
		final String endMessage = "종료";
		for (int i = 0; i < nation.length; i++) {
			map.put(nation[i], country[i]);
		}
		System.out.println(map);
		while (true) {
			System.out.println("나라 이름을 입력하세요(\"종료\" 입력시 프로그램 종료)");
			Scanner scan = new Scanner(System.in);
			String target = scan.nextLine();
			if (target.equals(endMessage)) {
				for (Map.Entry<String, String> entry : map.entrySet()) {
					System.out.println(entry.getKey() + "= " + entry.getValue());
				}
				break;
			}
			if (map.containsKey(target)) {
				System.out.println(map.get(target));
			} else {
				System.out.println("등록된 나라가 아닙니다. " + target + "의 수도를 입력해주세요");
				String targetValue = scan.nextLine();
				map.put(target, targetValue);
				System.out.println(target + " : " + targetValue + " 등록 되었습니다.");
			}
		}

	}

}
