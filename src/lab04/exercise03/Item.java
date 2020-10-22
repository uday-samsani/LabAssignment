package lab04.exercise03;

public abstract class Item {
	private String title, identificationNumber;
	private long copies;
	
	public Item(String title, String identificationNumber, long copies) {
		this.title=title;
		this.identificationNumber=identificationNumber;
		this.copies=copies;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public void setCopies(long copies) {
		this.copies = copies;
	}

	public void print() {
		System.out.println("Tilte :" + this.title);
		System.out.println("Identification Number :" + this.identificationNumber);
		System.out.println("Number of copies :" + this.copies);
	}

	public void checkIn() {
		this.copies = this.copies + 1;
	}

	public void checkOut() {
		this.copies = this.copies - 1;
	}

	public String getTitle() {
		return this.title;
	}
	public String getIdentificationNumber() {
		return this.identificationNumber;
	}
	
	public long getCopies() {
		return this.copies;
	}
}
