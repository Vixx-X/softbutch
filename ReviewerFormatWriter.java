import java.io.*;
import java.util.*;

// TODO: take parameters for formatted writting
// ReviewerFormatWriter contains utility functios for creating and writing
// to the given file with the Revisores.txt format
class ReviewerFormatWriter {
	// the file content is written when the buffer is closed
	BufferedWriter out;

	// exception safe file opening
	public ReviewerFormatWriter(String path) {
		try {
			out = new BufferedWriter(new FileWriter(path));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}

	// exception safe file closing
	public void closeFile() {
		try {
		out.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}

	// truncate file contents and write arg instead
	public void write(String arg) {
		try {
			out.write(arg);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}
}
