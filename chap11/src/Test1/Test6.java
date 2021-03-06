package Test1;

public class Test6 {
    public static void main(String[] args) {
        String src = "12345";
        System.out.println(fillZero(src, 10));
        System.out.println(fillZero(src, -1));
        System.out.println(fillZero(src, 3));
        System.out.println(fillZero(null, 3));
    }

	public static String fillZero(String src, int i) {
		String sf = "";
		if(src == null) {
			return src;
		}else if(i < 0) {
			return "";
		}else {
			if(src.length() < i) {
				sf = String.format("%0" + i + "d", Integer.parseInt(src));
			}else if(src.length() > i) {
				sf = String.format("%d", Integer.parseInt(src.substring(0,i)));
			}else
				return sf = src;
		}
		return sf;
	}
}
