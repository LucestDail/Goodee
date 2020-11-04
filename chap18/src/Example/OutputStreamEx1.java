package Example;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		OutputStream out = System.out;
		out.write('1');
		out.write('2');
		out.write('3');
		out.write('a');
		out.write('b');
		out.write('c');
		out.flush();

	}

}
