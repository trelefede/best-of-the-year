package org.lessons.java.bestoftheyear.controller;

import java.util.ArrayList;
import java.util.List;

import org.lessons.java.bestoftheyear.classes.Movie;
import org.lessons.java.bestoftheyear.classes.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class MainController {

	@GetMapping("index")
	public String home(Model model) {
		model.addAttribute("myName", "bestemmie");
		return "index";
	}

	private List<Movie> getBestMovies() {
		List<Movie> movies = new ArrayList<>();

		Movie film1 = new Movie(1, "Titolo 1");
		movies.add(film1);

		Movie film2 = new Movie(2, "Titolo 2");
		movies.add(film2);

		Movie film3 = new Movie(3, "Titolo 3");
		movies.add(film3);

		Movie film4 = new Movie(4, "Titolo 4");
		movies.add(film4);

		return movies;
	}

	private List<Song> getBestSongs() {
		List<Song> songs = new ArrayList<>();

		Song canzone1 = new Song(1, "Titolo Brano 1");
		songs.add(canzone1);

		Song canzone2 = new Song(2, "Titolo Brano 2");
		songs.add(canzone2);

		Song canzone3 = new Song(3, "Titolo Brano 3");
		songs.add(canzone3);

		Song canzone4 = new Song(4, "Titolo Brano 4");
		songs.add(canzone4);

		return songs;
	}

	@GetMapping("movies")
	public String printMovies(Model model) {
		List<Movie> movies = getBestMovies();
		model.addAttribute("movies", movies);
		return "movies";
	}

	@GetMapping("songs")
	public String printSongs(Model model) {
		List<Song> songs = getBestSongs();
		model.addAttribute("songs", songs);
		return "songs";
	}
}
