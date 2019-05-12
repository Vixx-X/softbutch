import java.io.*;

// ReviewerFormatWriter contains utility functios for creating and writing
// to the given file with the Revisores.txt format
class ReviewerFormatWriter {
	// the file content is written when the buffer is closed
	PrintWriter file;

	// exception safe file opening
	public ReviewerFormatWriter(String path) {
		try {
			file = new PrintWriter(new FileWriter(path, true));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}

	public void closeFile() {
		file.close();
	}

	// append ReviewerData to the file
	public void writeList(ReviewerData[] reviewers) {
		for (ReviewerData r : reviewers) {
			file.printf(
				"#%s#%s#%s#%s#%s#%s#%s#%s#\n",
				r.id,
				r.password,
				r.email,
				r.fullName,
				r.institution,
				r.city,
				r.country,
				r.field
			);
		}
	}
}
