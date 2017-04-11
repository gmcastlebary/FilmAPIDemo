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

import main.objectModels.FilmDO;
import main.objectModels.FilmList;
import main.objectModels.FilmRating;
import main.objectModels.Links;

@RestController
public class FilmLibraryController {
	
	@GetMapping("/films")
	public FilmList allFilms(@RequestParam(required=false, defaultValue="") String filmId) { //http://localhost:8080/film?filmId=
		FilmCollection data = FilmCollection.getInstance();
		if( filmId.length() > 0 ) {
			ArrayList<FilmDO> single = new ArrayList<FilmDO>();
			single.add(data.getFilms().get(Integer.parseInt(filmId)-1));
			FilmList singleList = new FilmList( new Links("http://localhost:8080/films?filmId=" + single.get(0).getId(), "http://localhost:8080/films?filmId=" + (single.get(0).getId() + 1), "http://localhost:8080/films?filmId=10"), single);
			return singleList;
		}
		return new FilmList(new Links("http://localhost:8080/films", "", ""), data.getFilms() );
	}
	
	@PutMapping("/films")
	public @ResponseBody FilmRating rateFilm(@RequestBody String rating) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		FilmRating myRating = mapper.readValue(rating, FilmRating.class);
		FilmCollection.getInstance().getFilms().get(myRating.getId()-1).rateFilm(myRating.getRating());
		return myRating;
	}
}
