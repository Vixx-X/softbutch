import java.io.*;
import java.util.*;

// ReviewerGen is the application class
// it must only contain the main function
class ReviewerGen {
	public static void main(String[] args) {
/*		ReviewerFormatWriter revwriter =
			new ReviewerFormatWriter("Revisores.txt");
		revwriter.closeFile();
		*/
		UserInputHandler handler = new UserInputHandler();
		handler.readDataCLI();
	}
}
