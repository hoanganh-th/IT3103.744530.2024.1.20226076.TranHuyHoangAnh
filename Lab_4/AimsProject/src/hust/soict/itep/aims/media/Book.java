package hust.soict.itep.aims.media;
// Tran Huy Hoang Anh - 20226076
import java.util.List;
import java.util.ArrayList;
public class Book extends Media
{
	@Override
	public int compareTo(Media otherMedia) {
		if(otherMedia instanceof Book) {
			Book otherBook = (Book) otherMedia;
			int titleComparison = getTitle().compareTo(otherBook.getTitle());
			return (titleComparison == 0) ? Float.compare(getCost(), otherBook.getCost()) : titleComparison;
		} else {
			return super.compareTo(otherMedia);
		}
		
		
	}
	private List<String> authors = new ArrayList<String>();

    public Book(int id, String title, String category, float cost, List<String> authors) {
        super(id, title, category, cost);
        this.authors = authors;
    }

    public Book(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }
    // Method addAuthor HoangAnh_226076
	public void addAuthor(String authorName) {
		if(authors.contains(authorName)) {
			System.out.println(authorName + " is already in the list of authors!");
		}
		else {
			authors.add(authorName);
		}
	}
	// Method removeAuthor HoangAnh_226076
	public void removeAuthor(String authorName) {
		if(authors.contains(authorName)) {
			authors.remove(authorName);
		} else {
			System.out.println(authorName + " is not in the list of authors!");
		}
	}
	@Override
	public String toString() {
	    StringBuilder print = new StringBuilder("Book: " +
	            " [id = " + getId() +
	            ", title = " + getTitle() +
	            ", category = " + getCategory() +
	            ", authors: ");
	    for (int i = 0; i < authors.size(); i++) {
	        print.append(authors.get(i));
	        if (i < authors.size() - 1) { 
	            print.append(" + ");
	        }
	    }

	    print.append(", cost: ");
	    print.append(getCost());
	    print.append("$]");
	    return print.toString();
	}

}
