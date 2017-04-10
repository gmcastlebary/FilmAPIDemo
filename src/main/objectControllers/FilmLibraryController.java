package main.objectControllers;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import main.DummyFilmData;
import main.objectModels.Film;
import main.objectModels.FilmRating;

@RestController
public class FilmLibraryController {
	
	@GetMapping("/films")
	public ArrayList<Film> allFilms(@RequestParam(required=false, defaultValue="") String filmId) { //http://localhost:8080/film?filmId=
		DummyFilmData data = new DummyFilmData();
		if( filmId.length() > 0 ) {
			ArrayList<Film> single = new ArrayList<Film>();
			single.add(data.getFilms().get(Integer.parseInt(filmId)-1));
			return single;
		}
		return data.getFilms();
	}
	
	@PutMapping("/films")
	public @ResponseBody FilmRating rateFilm(@RequestBody String rating) throws JsonParseException, JsonMappingException, IOException {
		System.out.println(rating);
		ObjectMapper mapper = new ObjectMapper();
		FilmRating myRating = mapper.readValue(rating, FilmRating.class);
		System.out.println( "Film ID: " + myRating.getId() + "/Rating: " + myRating.getRating());
		return myRating;
	}
}
