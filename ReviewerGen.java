// ReviewerGen is the application class
// it must only contain the main function
class ReviewerGen {
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			joderExistencia();
		}
		ReviewerFormatWriter revwriter =
			new ReviewerFormatWriter("Revisores.txt");

		UserInputHandler handler = new UserInputHandler();
		revwriter.writeList(handler.readDataCLI());
	}

	// Wan't me to use Java? Suffer the consequences
	private static void joderExistencia() {
		System.out.printf("\007");
	}
}
