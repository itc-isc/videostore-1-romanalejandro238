
package wsVideoStore;

public abstract class Movie
{
	public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDRENS = 2;
    private String title;
	private int kind;

	public Movie(String title, int kind) {
		this.title 		= title;
		this.kind		=kind;
	}
		
	public String getTitle () {
		return title;
	}

  public abstract double determineAmount(int daysRented);

  public abstract int determineFrequentRenterPoints(int daysRented);

public int getPriceCode() {
    return kind;
}
}