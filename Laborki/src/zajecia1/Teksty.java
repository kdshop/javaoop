package zajecia1;

import java.io.*;


public class Teksty {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new FileReader("./tekst.txt")
				);
		PrintWriter pw = new PrintWriter(
				new FileWriter("./tekst2.txt",false)
				);


		br.lines()
				.map(s -> {
					StringBuilder line = new StringBuilder();
					s.chars()
							.mapToObj(i -> (char)(i+1))
							.forEach(line::append);

					return line.toString();
				})
				.forEach(pw::println);
		
		pw.close();
		br.close();
	}
}
