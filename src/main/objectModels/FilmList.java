package main.objectModels;

import java.util.ArrayList;
/*
* Created by Gabe Castlebary
* Intended to be the main data object sent back in responses for all films, this object contains multiple FilmDOs.
*/
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
