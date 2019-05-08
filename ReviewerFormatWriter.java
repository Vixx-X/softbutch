import java.io.*;
import java.util.*;

class ReviewerFormatWriter {
	BufferedWriter out;

	public ReviewerFormatWriter(String path) {
		try {
			out = new BufferedWriter(new FileWriter(path));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}

	public void write(String arg) {
		try {
			out.write(arg);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}

	public void closeFile() {
		try {
		out.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}
}
