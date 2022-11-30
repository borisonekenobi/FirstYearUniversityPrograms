package Polymorphism_with_Interfaces;

public class CompactDisc implements RetailItem {
	private String title; // The CD's title
	private String artist; // The CD's artist
	private double retailPrice; // The CD's retail price

	public CompactDisc (String cdTitle, String cdArtist, double cdPrice) {
		title = cdTitle;
		artist = cdArtist;
		retailPrice = cdPrice;
	}

	public String getTitle () {
		return title;
	}

	public String getArtist () {
		return artist;
	}

	public double getRetailPrice () {
		return retailPrice;
	}
}