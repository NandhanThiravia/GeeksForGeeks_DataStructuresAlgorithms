package in.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
	private BufferedReader br;

	public Reader() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	public String readString() throws IOException {
		return br.readLine();
	}

	public Long readLong() throws NumberFormatException, IOException {
		return Long.parseLong(br.readLine());
	}

	public int readInt() throws NumberFormatException, IOException {
		return Integer.parseInt(br.readLine());
	}

}
