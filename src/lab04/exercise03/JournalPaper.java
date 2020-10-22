package lab04.exercise03;

public class JournalPaper extends WrittenItem {
	private int yearPublished;
	public JournalPaper(String title, String identificationNumber, long copies, String authorName, int yearPublished) {
		super(title, identificationNumber, copies, authorName);
		this.yearPublished=yearPublished;
	}

	public int getYearPublished() {
		return this.yearPublished;
	}
}
