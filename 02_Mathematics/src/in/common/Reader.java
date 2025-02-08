package in.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
	private BufferedReader br;

	public Reader() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	public String getString() throws IOException {
		System.out.print("Enter a string: ");
		return br.readLine();
	}

	public Long getLong() throws NumberFormatException, IOException {
		return Long.parseLong(br.readLine());
	}

}
