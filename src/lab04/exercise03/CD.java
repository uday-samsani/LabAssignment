package lab04.exercise03;

public class CD extends MediaItem {
	private String artist, genre;

	public CD(String title, String identificationNumber, long copies, int runtime, String artist, String genre) {
		super(title, identificationNumber, copies, runtime);
		this.artist = artist;
		this.genre = genre;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
