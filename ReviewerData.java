import java.io.*;
import java.util.*;

// ReviewerData contains all of the necessary information concerning the
// reviewer, usually to be queried or written later to a file with a formated
// writer like ReviewerFormatWriter
class ReviewerData {
	// unique id
	byte[] id;

	// personal info
	String email;
	String fullName;

	// organization affiliated with the reviewer
	String institution;

	// location initials
	String country;
	String city;
}
