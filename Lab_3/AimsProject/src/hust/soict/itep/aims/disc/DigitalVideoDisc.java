// Tran Huy Hoang Anh 20226076
package hust.soict.itep.aims.disc;

public class DigitalVideoDisc 
{
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private int id;
	private static int nbDigitalVideoDiscs = 0;
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public int getId() {
		return id;
	}
	public static int getNbDigitalVideoDisc() {
		return nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title) {
		this.title = title;
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, Float cost) {
		this.category = category;
		this.title = title;
		this.cost = cost;
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String director, String category, String title, Float cost) {
		this.director = director;
		this.category = category;
		this.title = title;
		this.cost = cost;
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs;
	}
	@Override
	public String toString() {
	    return "DVD - " + title + " - " + category + " - " + director + " - " + length + " mins: " + cost + " $";
	}

	public boolean isMatch(String title) {
	    return this.title.equalsIgnoreCase(title);
	}

	public void setTitle(String title){ this.title = title; }
	public void setCategory(String category){ this.category = category; }
	public void setDirector(String director){ this.director = director; }
	public void setLength(int length){ this.length = length; }
	public void setCost(float cost){ this.cost = cost; }
}
