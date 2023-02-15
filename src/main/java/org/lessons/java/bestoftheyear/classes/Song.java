package org.lessons.java.bestoftheyear.classes;

public class Song {

	private int id;
	private String titolo;

	public Song(int id, String titolo) {
		this.id = id;
		this.titolo = titolo;
	}

	public String getTitle() {
		return titolo;
	}

	public int getId() {
		return id;
	}

}
