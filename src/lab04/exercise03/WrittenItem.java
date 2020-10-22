package lab04.exercise03;

public abstract class WrittenItem extends Item {
	private String authorName;

	public WrittenItem(String title, String identificationNumber, long copies, String authorName) {
		super(title, identificationNumber, copies);
		this.authorName=authorName;
	}
	
	public String getAuthorName() {
		return this.authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	

}
