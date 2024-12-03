package hust.soict.itep.test.polymorphism;
// Tran Huy Hoang Anh - 20226076
import java.util.ArrayList;
import java.util.List;
import hust.soict.itep.aims.media.*;

public class TestPolymorphism {
	public static void main(String[] args) {
		 List<Media> mediae = new ArrayList<Media>();
		 Media dvd = new DigitalVideoDisc(1, "The Lion King", "Animation", 19.95f, 87, "Roger Allers");
		 
		 List<String> authors = new ArrayList<String>();
	     authors.add("To Hoai");
	     authors.add("Nguyen Huy Tuong");
	     Media book = new Book(2,"Tuoi tre du doi", "Ki su", 6.5f, authors);
	     
	     ArrayList<Track> tracks = new ArrayList<Track>();
	     tracks.add(new Track("End of the world",3));
	     tracks.add(new Track("Eternal sunshine",4));
	     Media cd = new CompactDisc(3, "Eternal sunshine", "Pop" , 5.5f, "Ariana Grande", tracks);
	     
	     mediae.add(dvd);
	     mediae.add(cd);
	     mediae.add(book);
	     
	     for(Media item : mediae) {
	            System.out.println(item.toString());
	        }
	}

}
