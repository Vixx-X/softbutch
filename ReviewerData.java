// ReviewerData contains all of the necessary information concerning the
// reviewer, usually to be queried or written later to a file with a formated
// writer like ReviewerFormatWriter
class ReviewerData {
	// unique id
	String id;

	// personal info
	String password;
	String email;
	String fullName;

	// intials of the organization affiliated with the reviewer
	String institution;

	// location initials
	String city;
	String country;

	// 3 char code of the chosen field
	String field;
}
