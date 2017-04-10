package main.objectModels;

import java.util.ArrayList;

public class FilmDO {
	private int id, year;
	private String title, description, url_slug;
	private int[] related_film_ids;
	private float averageRating;
	private ArrayList<Integer> ratings;
	
	public FilmDO() {
		this.id = 0;
		this.year = 0;
		this.title = "no title available";
		this.description = "no description available";
		this.url_slug = "undefined";
		this.related_film_ids = new int[] { -1 };
		this.averageRating = 0.0f;
		ratings = new ArrayList<Integer>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}
	
	public float getAverageRating() {
		return averageRating;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl_slug() {
		return url_slug;
	}

	public void setUrl_slug(String url_slug) {
		this.url_slug = url_slug;
	}

	public int[] getRelated_film_ids() {
		return related_film_ids;
	}

	public void setRelated_film_ids(int[] related_film_ids) {
		this.related_film_ids = related_film_ids;
	}
	
	public void setAverageRating(float averageRating) {//for our purposes this will be useful for testing calculations
		this.averageRating = averageRating;
	}
	
	public void rateFilm(int rating) {
		ratings.add(rating);
		int newAverage = 0;
		for(Integer i : ratings) {
			newAverage += i; 
		}
		averageRating = (float) ((float) newAverage / (float) ratings.size() );
	}
}
