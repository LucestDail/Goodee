package chap6;

public class Exam2 {
	public static void main(String[] args) {
		Rectangle2[] rarr = new Rectangle2[5];
		int AreaSum = 0;
		int LengthSum = 0;
		//임의의 20 ~ 50 사이 가로, 세로 길이 가진 사각형 5개 생성
		// 모든 사각형의 넓이, 둘레 합 출력
		for(int i = 0; i < rarr.length;i++) {
			rarr[i] = new Rectangle2();
			rarr[i].width = (int)(Math.random()*30)+20;
			rarr[i].height = (int)(Math.random()*30)+20;
			rarr[i].serialNo = ++Rectangle2.sno;
			AreaSum += rarr[i].area();
			LengthSum += rarr[i].length();
		}
		for(int i = 0; i < rarr.length;i++) {
			System.out.println(rarr[i].toString());
		}
		System.out.println("전체 사각형 면적의 합 : " + AreaSum);
		System.out.println("전체 사각형 둘레의 합 : " + LengthSum);
	}
}
