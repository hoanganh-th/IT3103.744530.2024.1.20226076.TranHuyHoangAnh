package hust.soict.itep.aims.media;
// Tran Huy Hoang Anh - 20226076
public class Track implements Playable
{
	private String title;
	private int length;
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	public void play() {
		 System.out.println("Playing Track: " + this.getTitle());
	     System.out.println("Track length: " + this.getLength());
	}
	// Override method equals HoangAnh_20226076
	@Override
	public boolean equals(Object o) {
	    if (this == o) return true; // Cùng tham chiếu
	    if (o == null || getClass() != o.getClass()) return false; // Null hoặc khác lớp

	    Track track = (Track) o; // Ép kiểu sang Track
	    return title != null && title.equalsIgnoreCase(track.title) // So sánh title
	           && length == track.length; // So sánh length
	}

}
