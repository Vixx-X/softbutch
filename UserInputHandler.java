import java.util.*;

class UserInputHandler {
	// data reading for the command line interface (text based)
	public ReviewerData[] readDataCLI() {
		List<ReviewerData> reviewers = new ArrayList<ReviewerData>();
		ReviewerData r = new ReviewerData();

		while (promptCreateReviewer()) {
			r.id = promptRead("Reviewer id (8 alphanum chars)");
			r.password = promptRead("User password (6 chars)");
			r.email = promptRead("Email account (user@example.com)");
			r.fullName = promptRead("Reviewer name (Firstname Lastname)");
			r.institution = promptRead("Institution (uppercase initials)");
			r.city = promptRead("City (uppercase initials)");
			r.country = promptRead("Country (uppercase initials)");
			r.field = promptRead("Chosen field (IS[1-9] Example: IS3)");
		}

		reviewers.add(r);

		ReviewerData[] revArr = new ReviewerData[reviewers.size()];
		reviewers.toArray(revArr);
		return revArr;
	}

	private boolean promptCreateReviewer() {
		String choice;
		// user has to write y, n, or nothing
		do {
			System.out.printf("Create reviewer? (y/N) ");
			choice = System.console().readLine().toLowerCase();
		} while(!(choice.equals("y") ||
		          choice.equals("n") || choice.equals("")));
		return choice.equals("y");
	}

	private String promptRead(String prompt) {
		System.out.printf("%s: ", prompt);
		return System.console().readLine();
	}

	// method stub
	public void readDataGUI() {
	}
}
