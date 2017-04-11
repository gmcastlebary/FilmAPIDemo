package main.objectModels;

import java.util.ArrayList;

public class FilmList {
	private Links links;
	private ArrayList<FilmDO> data;
	
	public FilmList(Links links, ArrayList<FilmDO> data) {
		this.links = links;
		this.data = data;
	}
	
	public Links getLinks() { return links; }
	public ArrayList<FilmDO> getFilms() { return data; }
}
