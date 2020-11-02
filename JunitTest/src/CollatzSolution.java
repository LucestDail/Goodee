
public class CollatzSolution {

	public static int solution(int num) {
		long target = num;
		long count = 0;
		while (count <= 500) {
			count++;
			if (target % 2 == 0) {
				target /= 2;
			} else {
				target = (3 * target) + 1;
			}
			if(target == 1) {
				break;
			}
		}
		if (count <= 500) {
			return (int)count;
		} else {
			return -1;
		}
	}
}
