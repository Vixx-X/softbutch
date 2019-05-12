import java.io.*;

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

	// truncate file contents and write the formated data given
	// TODO: this is just a method stub. finish writing the formatted
	// output to the file
	public void writeList(ReviewerData[] reviewers) {
		try {
			for (ReviewerData rev : reviewers) {
				out.write("stub!");
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}
}
