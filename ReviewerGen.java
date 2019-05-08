import java.io.*;
import java.util.*;

class ReviewerGen {
	public static void main(String[] args) {
		ReviewerFormatWriter revwriter =
			new ReviewerFormatWriter("Revisores.txt");
		revwriter.write("Test File Body");
		revwriter.closeFile();
	}
}
