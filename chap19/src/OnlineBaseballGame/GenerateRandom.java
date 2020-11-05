package OnlineBaseballGame;

public class GenerateRandom {

	ConstValue c = new ConstValue();
	public GenerateRandom() {
		// TODO Auto-generated constructor stub
	}
	public int[] GenerateRandomArray(){
		int[] array = new int[c.MAXNUM];
		boolean end = false;
		while (!end) { // 중복 안하는 난수 4개 생성
			end = true;
			for (int i = 0; i < array.length; i++) {
				array[i] = (int) (Math.random() * 9) + 1;
			}
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length; j++) {
					if (i == j) {
						continue;
					} else {
						if (array[i] == array[j]) {
							end = false;
						}
					}
				}
			}
		}
		System.out.println("random number array generate");
		return array;
	}
}
