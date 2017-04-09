package main.objectControllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import main.DummyFilmData;
import main.objectModels.Film;

@RestController
public class FilmLibraryController {
	
	@GetMapping("/films")
	public ArrayList<Film> allFilms(@RequestParam(required=false, defaultValue="") String filmId) { //http://localhost:8080/film?filmId=
		DummyFilmData data = new DummyFilmData();
		if( filmId.length() > 0 ) {
			ArrayList<Film> single = new ArrayList<Film>();
			single.add(data.getFilms().get(Integer.parseInt(filmId)));
			return single;
		}
		return data.getFilms();
	}
}
