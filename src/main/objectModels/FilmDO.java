package main.objectModels;

public class FilmDO {
	private String type;
	private int id;
	private FilmData data;
	
	public FilmDO() {
		this.type = "film";
		this.id = 0;
		this.data = new FilmData();
	}

	public String getType() {
		return type;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return data.getYear();
	}
	
	public float getAverageRating() {
		return data.getAverageRating();
	}

	public void setYear(int year) {
		data.setYear(year);
	}

	public String getTitle() {
		return data.getTitle();
	}

	public void setTitle(String title) {
		data.setTitle(title);
	}

	public String getDescription() {
		return data.getDescription();
	}

	public void setDescription(String description) {
		data.setDescription(description);
	}

	public String getUrl_slug() {
		return data.getUrl_slug();
	}

	public void setUrl_slug(String url_slug) {
		data.setUrl_slug(url_slug);
	}

	public int[] getRelated_film_ids() {
		return data.getRelated_film_ids();
	}

	public void setRelated_film_ids(int[] related_film_ids) {
		data.setRelated_film_ids(related_film_ids);
	}
	
	public void setAverageRating(float averageRating) {//for our purposes this will be useful for testing calculations
		data.setAverageRating(averageRating);
	}
	
	public void rateFilm(int rating) {
		data.getRatings().add(rating);
		int newAverage = 0;
		for(Integer i : data.getRatings()) {
			newAverage += i; 
		}
		data.setAverageRating((float) ((float) newAverage / (float) data.getRatings().size() ));
	}
}
