package lab04.exercise03;

public class Video extends MediaItem {
	private String director, genre;
	private int yearReleased;

	public String getDirector() {
		return director;
	}

	public Video(String title, String identificationNumber, long copies, int runtime, String director, String genre,
			int yearReleased) {
		super(title, identificationNumber, copies, runtime);
		this.director = director;
		this.genre = genre;
		this.yearReleased = yearReleased;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYearReleased() {
		return yearReleased;
	}

	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}
}
