import java.io.*;
import java.util.*;

class UserInputHandler {
	// data reading for the command line interface (text based)
	public ReviewerData[] readDataCLI() {
		String choice;
		List<ReviewerData> reviewers = new ArrayList<ReviewerData>();
		ReviewerData current = new ReviewerData();

		// user has to write y, n, or nothing
		do {
			System.out.printf("Create reviewer? (y/N) ");
			choice = System.console().readLine().toLowerCase();
		} while(!(choice.equals("y") ||
		          choice.equals("n") || choice.equals("")));

		if (choice.equals("y")) {
			System.out.printf("Reviewer id (8 alphanum chars): ");
			current.id = System.console().readLine();
			System.out.printf("User password (6 chars): ");
			current.password = System.console().readLine();
			System.out.printf("Email account (user@example.com): ");
			current.email = System.console().readLine();
			System.out.printf("Reviewer name (Firstname Lastname): ");
			current.fullName = System.console().readLine();
			System.out.printf("Institution (uppercase initials): ");
			current.institution = System.console().readLine();
			System.out.printf("Country (uppercase initials): ");
			current.country = System.console().readLine();
			System.out.printf("City (uppercase initials): ");
			current.city = System.console().readLine();
			System.out.printf("Chosen field (IS[1-9] Example: IS3): ");
			current.field = System.console().readLine();
		}
		System.out.println("finished");

		ReviewerData[] revArr = new ReviewerData[reviewers.size()];
		reviewers.toArray(revArr);
		return revArr;
	}

	// method stub
	public void readDataGUI() {
	}
}
