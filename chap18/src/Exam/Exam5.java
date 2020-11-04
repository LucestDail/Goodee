package Exam;

import java.io.File;

/**
 * Documents 폴더의 하위 폴더 갯수, 파일의 총 크기
 * 
 * @author ubuntu
 *
 */
public class Exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "/home/ubuntu/Documents/GitHub/Goodee/chap18";
		File f1 = new File(filePath);
		String[] files = f1.list();
		int byteSum = 0;
		int byteFileCounter = 0;
		int dirCounter = 0;
		for (String f : files) {
			File f2 = new File(filePath, f);
			if (f2.isDirectory()) {
				dirCounter++;
				System.out.printf("%s : Directory%n", f);
			} else {
				byteSum += f2.length();
				byteFileCounter++;
				System.out.printf("%s : File(%,dbyte)%n", f, f2.length());
			}
		}
		System.out.println("Current Directory path : " + filePath);
		System.out.println("Current Directory file number : " + files.length);
		System.out.println("Total byte file number : " + byteFileCounter);
		System.out.println("Total directory number : " + dirCounter);
		System.out.printf("Total file size : %,dbyte%n",byteSum);
	}

}
