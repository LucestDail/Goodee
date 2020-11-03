package Exam;
/**
 * 화면에서 파일명을 입력받고, 출력을 시작할 시작라인, 종료 라인을수를 입력받아서
 * 시작라인부터 라인수의 내용을 홤ㄴ에 출력하기
 * 단 출력시, 라인수도 함께 출력하기, Scanner 사용하지 말기!
 */
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Exam3Another {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("input your creating file name");
		Scanner scan = new Scanner(System.in);
		String filename = scan.next();
		StringBuffer sb = new StringBuffer();
		sb.append(filename + ".txt");
		FileWriter fw = new FileWriter(sb.toString());
		System.out.println("your file will be created as " + sb.toString() + ", fill it your word");
		while(true) {
			scan = new Scanner(System.in);
			String word = scan.nextLine();
			if(word.equals("exit")) {
				break;
			}
			fw.write(word + "\n");
		}
		fw.flush();
		fw.close();
	}
}
