package Example;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriterEx1 {
	public static void main() throws IOException{
		Writer out = new OutputStreamWriter(System.out);
		out.write('1');
		out.write('2');
		out.write('3');
		out.write('a');
		out.write('b');
		out.write('c');
		out.write('°¡');
		out.write('³ª');
		out.write('´Ù');
		out.flush();
	}
}
