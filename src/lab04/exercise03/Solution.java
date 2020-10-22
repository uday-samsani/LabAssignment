package lab04.exercise03;

public class Solution {

	public static void main(String[] args) {
		Book a = new Book("Permenant Record", "154252", 4534, "Edward J Snowden");
		JournalPaper b = new JournalPaper("Great Hack", "46465465", 45826, "Uday Samsani", 2020);
		Video c = new Video("Dunkirk", "3123425", 200, 3, "Christopher Nolan", "historical", 2017);
		CD d = new CD("Interstellar", "3123425", 200, 3, "Christopher Nolan", "Sci-Fi");

		System.out.println("--------------------");
		a.print();
		System.out.println("--------------------");
		b.print();
		System.out.println("--------------------");
		c.print();
		System.out.println("--------------------");
		d.print();

	}
}
