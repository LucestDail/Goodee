class DartGameSolution {
	public static int solution(String dartResult) {

		final int MAX_POINT_COUNT = 3;
		int answer = 0;

		char[] SDTArray = new char[MAX_POINT_COUNT];
		int[] pointArray = new int[MAX_POINT_COUNT];
		String[] optionArray = { "", "", "" };

		// 숫자 분리
		String[] parsingArray = dartResult.split("S[*#]*|D[*#]*|T[*#]*");
		for (int i = 0; i < pointArray.length; i++) {
			pointArray[i] = Integer.parseInt(parsingArray[i]);
		}

		// option 분리
		String parsingStmt = dartResult.replaceAll("[0-9]", "");
		String[] optionStmt = parsingStmt.split("[A-Z]");
		for (int i = 1; i < optionStmt.length; i++) {
			optionArray[i - 1] = optionStmt[i];
		}

		// SDT 분리
		parsingStmt = parsingStmt.replaceAll("\\W", "");
		for (int i = 0; i < parsingStmt.length(); i++) {
			SDTArray[i] = parsingStmt.charAt(i);
		}

		// 계산
		for (int i = 0; i < MAX_POINT_COUNT; i++) {
			int target = pointArray[i];
			switch (SDTArray[i]) {
			case 'S':
				if (optionArray[i].equals("*")) {
					if (i == 0) {
						target *= 2;
					} else {
						target *= 2;
						pointArray[i - 1] *= 2;
					}
				} else if (optionArray[i].equals("#")) {
					target *= -1;
				}
				break;
			case 'D':
				target = target * target;
				if (optionArray[i].equals("*")) {
					if (i == 0) {
						target *= 2;
					} else {
						target *= 2;
						pointArray[i - 1] *= 2;
					}
				} else if (optionArray[i].equals("#")) {
					target *= -1;
				}
				break;
			case 'T':
				target = target * target * target;
				if (optionArray[i].equals("*")) {
					if (i == 0) {
						target *= 2;
					} else {
						target *= 2;
						pointArray[i - 1] *= 2;
					}
				} else if (optionArray[i].equals("#")) {
					target *= -1;
				}
				break;
			default:
				continue;
			}
			pointArray[i] = target;
		}

		for (int item : pointArray) {
			answer += item;
		}
		return answer;
	}
}