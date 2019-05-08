import java.io.*;
import java.util.*;

// ReviewerData contains all of the necessary information concerning the
// reviewer, usually to be queried or written later to a file with a formated
// writer like ReviewerFormatWriter
class ReviewerData {
	// unique id
	String id;

	// personal info
	String email;
	String fullName;
	// TODO: encrypt with sha256 or another hashing algorithm
	// for security reasons. DO NOT USE as plain text, this is a PROTOTYPE
	String password;

	// intials of the organization affiliated with the reviewer
	String institution;

	// location initials
	String country;
	String city;

	// 3 char code of the chosen field
	String field;
}
