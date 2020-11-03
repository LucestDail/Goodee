package Example;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 보조 스트림
 * 1. 새로운 기능을 추가한 입출력 스트림
 * 2. 객체 생성시 다른 스트림을 매개변수로 받음(!)
 * 		new BufferedReader(Reader)
 * 			 - 버퍼 기능을 확장하여 성능 향상 시킴
 * 			=> readLine() : 문자형 데이터를 읽을 때 한 줄씩 읽는 기능
 * 
 * 		new BufferedInutStream(InputStream)
 * 
 * @author ubuntu
 * 키보드에서 내용을 입력받아, buffered.txt 파일에 저장하기
 */
public class BufferedReaderEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw = new FileWriter("buffered.txt");
		String data = null;
		while((data = bf.readLine()) != null) {
			System.out.println(data);
			fw.write(data + "\n");
		}
		fw.flush();
		fw.close();
		bf.close();
	}

}
