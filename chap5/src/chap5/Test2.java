package chap5;
public class Test2 {

	public static void main(String[] args) {
		int[][] score = {{90,80,70},{95,85,75},{70,80,75},{75,70,85},{70,75,80}};
		int[][] result = new int[score.length+1][score[0].length+1]; // new int[6][4]
		//clone
		for(int i = 0;i<score.length;i++) {
			for(int j = 0; j<score[i].length;j++) {
				result[i][j] = score[i][j];
			}
		}
		
		//sum
		for(int i = 0; i < result.length-1;i++) {
			for(int j = 0; j < result[i].length-1;j++) {
				result[i][result[i].length-1] += result[i][j];
				result[result.length-1][j] += result[i][j];
				result[result.length-1][result[i].length-1] += result[i][j];
			}
		}
		
		//print
		for(int[] itemRow : result) {
			for(int itemCol : itemRow) {
				System.out.print(itemCol + "\t");
			}
			System.out.println();
		}
	}

}