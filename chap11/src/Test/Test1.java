package Test;

/*
1. 다음의 결과가 나오도록 프로그램을 수정하기

[결과]
fullPath:c:/jdk14/work/Test.java
path:c:/jdk14/work
fileName:Test.java
 */



public class Test1 {
	public static void main(String[] args) {
		String fullPath = "c:/jdk14/work/Test.java";
		String path = fullPath.substring(0,13);
		String fileName = fullPath.substring(14);
		System.out.println("fullPath:" + fullPath);
		System.out.println("path:" + path);
		System.out.println("fileName:" + fileName);
	}
}