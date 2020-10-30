package Example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class GeneratorProductFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		String[] cars = { "Avante", "Grandure", "SM7", "BMW", "Ventz", "K9" };
		String[] remarks = { "IDK", "hate", "normal", "like" };
		int limit = 0;
		int con = 0;
		fos = new FileOutputStream("product.txt");
		PrintStream ps = new PrintStream(fos);
		while (limit++ < 1000) {
			ps.print((int) (Math.random() * 12) + 1 + ",");
			con = (int) (Math.random() * 3) + 1;
			ps.print(con + ",");
			ps.print(cars[(int) (Math.random() * cars.length)] + ",");
			ps.print((int) (Math.random() * 5) + 1);
			if (con == 3) {
				ps.print(",");
				ps.print(remarks[(int) (Math.random() * 3)]);
			}
			ps.println();
		}
		ps.flush();
	}
}
