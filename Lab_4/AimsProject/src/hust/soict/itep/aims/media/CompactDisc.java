package hust.soict.itep.aims.media;
// Tran Huy Hoang Anh - 20226076
import java.util.ArrayList;
public class CompactDisc extends Disc implements Playable
{
	private String artist;
	private ArrayList<Track> tracks;
	public String getArtist() {
		return artist;
	}
	
    public CompactDisc(int id, String title, String category, float cost, String artist, ArrayList<Track> tracks) {
        super(id, title, category, cost);
        this.tracks = tracks;
        this.artist = artist;
        this.setLength(getLength());
    }

    public CompactDisc(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }
    // Method addTrack HoangAnh_226076
    public void addTrack(Track song) {
        if(tracks.contains(song)) {
            System.out.println(song.getTitle() + " is already in the CD");
        } else {
            tracks.add(song);
        }
    }
    // Method removeTrack HoangAnh_226076
    public void removeTrack(Track song) {
        if(tracks.contains(song)) {
            tracks.remove(song);
        } else {
            System.out.println(song.getTitle() + " is not in the CD");
        }
    }
    // Method getLength HoangAnh_226076
    @Override
    public int getLength() {
    	int totalLength = 0;
    	for(Track song : tracks) {
    		totalLength += song.getLength();
    	}
    	return totalLength;
    }
    //Method play HoangAnh_226076
    public void play(){
    	System.out.println("Title: " + getTitle() + "/n" + "Length: " + getLength() + "/n"
    			+ "Artist: " + getArtist() + "/n" + "Director: " + getDirector());
    	for(Track song : tracks)
    	{
    		song.play();
    	}
    }
    
    @Override
    public String toString() {
        StringBuilder print = new StringBuilder("CD: " +
                " [id = "  + getId() +
                ", artist: " + artist +
                ", title = " + getTitle() +
                ", category = " + getCategory() +
                ", length: " + getLength() + " min" +
                ", cost = " + getCost() + "$]" + '\n' + "Tracks: \n"
                + "===================" + '\n');
        for (Track track : tracks) {
            print.append(track.getTitle());
            print.append('\t');
            print.append(track.getLength());
            print.append(" min");
            print.append('\n');
        }
        return print.toString();
    }

}
