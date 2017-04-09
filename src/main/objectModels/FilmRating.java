package main.objectModels;

public class FilmRating {
	private final int id;
	private final float rating;
	
	public FilmRating( int id, float rating ) {
		this.id = id;
		this.rating = rating;
	}
	
	public int getId() { return id;	}
	
	public float getRating() { return rating; }
}
