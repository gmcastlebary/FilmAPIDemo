package main.objectControllers;
//Created this class to hold dummy film data so that it doesn't clog up RestControllers instantiating films to send back

import java.util.ArrayList;

import main.objectModels.FilmDO;
import main.objectModels.Links;

public class FilmCollection {
	private static final FilmCollection filmCollection = new FilmCollection();
	
	public static FilmCollection getInstance() { return filmCollection; }
	
	private ArrayList<FilmDO> filmList;
	
	private FilmCollection() {
		filmList = new ArrayList<FilmDO>();
		FilmDO wonderful = new FilmDO();
		wonderful.setId(1);
		wonderful.setTitle("A Wonderful Film");
		wonderful.setDescription("A cute film about lots of wonderful stuff.");
		wonderful.setUrl_slug("a_wonderful_film");
		wonderful.setYear(1973);
		wonderful.setRelated_film_ids(new int[] {2, 4, 7});
		wonderful.rateFilm(3);
		wonderful.rateFilm(3);
		wonderful.rateFilm(3);
		filmList.add(wonderful);
		
		FilmDO fandor = new FilmDO();
		fandor.setId(2);
		fandor.setTitle("All About Fandor");
		fandor.setDescription("Documentary telling the tail of Fandor.");
		fandor.setUrl_slug("all_about_fandor");
		fandor.setYear(2001);
		fandor.setRelated_film_ids(new int[] {1,4,7});
		fandor.rateFilm(10);
		fandor.rateFilm(10);
		fandor.rateFilm(10);
		filmList.add(fandor);
		
		FilmDO elephants = new FilmDO();
		elephants.setId(3);
		elephants.setTitle("Dancing with Elephants");
		elephants.setDescription("The classic tale of Dancing with Wovles, but with elephants!");
		elephants.setUrl_slug("dancing_with_elephants");
		elephants.setYear(2016);
		elephants.setRelated_film_ids(new int[] {});
		elephants.rateFilm(5);
		elephants.rateFilm(5);
		elephants.rateFilm(5);
		filmList.add(elephants);
		
		FilmDO george = new FilmDO();
		george.setId(4);
		george.setTitle("The Story of George");
		george.setDescription("A true story outlining the adventures of George");
		george.setUrl_slug("the_story_of_george");
		george.setYear(1974);
		george.setRelated_film_ids(new int[] {1, 2, 7});
		george.rateFilm(2);
		george.rateFilm(2);
		george.rateFilm(2);
		filmList.add(george);
		
		FilmDO skiing = new FilmDO();
		skiing.setId(5);
		skiing.setTitle("Zee and Bee Go Skiing");
		skiing.setDescription("The tragic story of Zee and Bee on their snowy adventures");
		skiing.setUrl_slug("zee_and_bee_go_skiing");
		skiing.setYear(1991);
		skiing.setRelated_film_ids(new int[] {6, 8,9, 10});
		skiing.rateFilm(7);
		skiing.rateFilm(7);
		skiing.rateFilm(7);
		filmList.add(skiing);
		
		FilmDO time = new FilmDO();
		time.setId(6);
		time.setTitle("Ahed of Its Time");
		time.setDescription("A story about the future.");
		time.setUrl_slug("ahead_of_its_time");
		time.setYear(2088);
		time.setRelated_film_ids(new int[] {8, 9, 10});
		time.rateFilm(3);
		time.rateFilm(3);
		time.rateFilm(3);
		filmList.add(time);
		
		FilmDO jerry = new FilmDO();
		jerry.setId(7);
		jerry.setTitle("My Name is Jerry");
		jerry.setDescription("The life of the cat named Jerry.");
		jerry.setUrl_slug("my_name_is_jerry");
		jerry.setYear(1989);
		jerry.setRelated_film_ids(new int[] {1,2,4});
		jerry.rateFilm(1);
		jerry.rateFilm(1);
		jerry.rateFilm(1);
		filmList.add(jerry);
		
		FilmDO gems = new FilmDO();
		gems.setId(8);
		gems.setTitle("Gems and Trestle");
		gems.setDescription("Is it about web development? Mining history? You'll never know.");
		gems.setUrl_slug("gems_and_trestle");
		gems.setYear(2011);
		gems.setRelated_film_ids(new int[] {9, 10});
		gems.rateFilm(10);
		gems.rateFilm(10);
		gems.rateFilm(10);
		filmList.add(gems);
		
		FilmDO react = new FilmDO();
		react.setId(9);
		react.setTitle("How To React Natively");
		react.setDescription("A step by step journey through developing a React Native application.");
		react.setUrl_slug("how_to_react_natively");
		react.setYear(2000);
		react.setRelated_film_ids(new int[] {10});
		react.rateFilm(8);
		react.rateFilm(8);
		react.rateFilm(8);
		filmList.add(react);
		
		FilmDO potter = new FilmDO();
		potter.setId(10);
		potter.setTitle("Perry Hotter: A Lizard's Tale");
		potter.setDescription("It's a story all about a lizard named Perry");
		potter.setUrl_slug("perry_hotter_a_lizards_tale");
		potter.setYear(2017);
		potter.setRelated_film_ids(new int[] {});
		potter.rateFilm(10);
		potter.rateFilm(10);
		potter.rateFilm(10);
		filmList.add(potter);
	}
	
	public ArrayList<FilmDO> getFilms() { return filmList; }
}
