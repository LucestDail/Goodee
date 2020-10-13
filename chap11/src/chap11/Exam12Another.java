package chap11;

public class Exam12Another {
	public static void main(String[] args) {
		String names = "Java   and JSP and  Spring and HTML and JavaScript and Jquery";
		String[] arr = names.split("\\s*and\\s*");
		for(String s : arr) {
			System.out.println(s);
		}
		System.out.println();
	}
}
