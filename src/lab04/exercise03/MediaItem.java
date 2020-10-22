package lab04.exercise03;

public class MediaItem extends Item {
	private int runtime;

	public MediaItem(String title, String identificationNumber, long copies, int runtime) {
		super(title, identificationNumber, copies);
		this.runtime=runtime;
	}
	
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public int getRuntime() {
		return this.runtime;
	}
}
