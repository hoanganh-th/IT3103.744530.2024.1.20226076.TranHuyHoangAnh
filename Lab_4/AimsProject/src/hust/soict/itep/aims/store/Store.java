package hust.soict.itep.aims.store;
//Tran Huy Hoang Anh - 20226076
import java.util.ArrayList;
import hust.soict.itep.aims.media.Media;
public class Store {
	private ArrayList<Media> itemInStore = new ArrayList<Media>();
	// Method findMedia HoangAnh_226076
	public Media findMedia(String title) {
	        for (Media item : itemInStore) {
	            if (item.getTitle().equals(title)) {
	                return item;
	            }
	        }
	        return null;
	    }
    public ArrayList<Media> getItemsInStore() { return itemInStore; }
    // Method to add item HoangAnh_226076
    public void addMedia(Media item) {
    	if(itemInStore.contains(item)) {
    		System.out.println(item.getClass().getSimpleName() + ' ' + item.getTitle() + " is already in store!");
    	} else {
    		itemInStore.add(item);
    		System.out.println(item.getClass().getSimpleName() + ' ' + item.getTitle() + " was successfully added to store!");
    	}
    }
    //Method to remove item HoangAnh_226076
    public void removeMedia(Media item) {
    	if(itemInStore.contains(item)) {
    		itemInStore.remove(item);
    		System.out.println(item.getClass().getSimpleName() + ' ' + item.getTitle() + " was successfully removed from store!");
    	} else {
    		System.out.println(item.getClass().getSimpleName() + ' ' + item.getTitle() + " is not in store!");
    	}
    }
    // Method to show items in store HoangAnh_226076
    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("\n**********STORE***************\nitems in the store: \n");
        if(itemInStore.isEmpty()) string.append("There is no item in store!\n");
        else {
            for (Media item : itemInStore) {
                string.append(item.getTitle() + " - " + item.getCost() + " $\n");
            }
        }
        string.append("*********************************\n");
        return string.toString();
    }
}
