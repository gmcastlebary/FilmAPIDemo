package main.objectModels;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class FilmRating {
	@Resource
	private int id;
	@Resource
	private int rating;
	
	public FilmRating() {
		this.id = -1;
		this.rating = -1;
	}
	
	public FilmRating( int id, int rating ) {
		this.id = id;
		this.rating = rating;
	}
	
	public void setId( int id ) { this.id = id; }
	
	public void setRating( int rating ) { this.rating = rating; }
	
	public int getId() { return id;	}
	
	public int getRating() { return rating; }
}
