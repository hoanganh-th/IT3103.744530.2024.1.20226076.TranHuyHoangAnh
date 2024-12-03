package hust.soict.itep.aims.cart;
//Tran Huy Hoang Anh - 20226076
import hust.soict.itep.aims.media.Media;
import java.util.ArrayList;
import java.util.Collections;
public class Cart {
   private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
   // Method addMedia HoangAnh_226076
   public void addMedia(Media item) {
	   if(itemsOrdered.contains(item)) {
           System.out.println(item.getClass().getSimpleName() + ' ' + item.getTitle() + " is already in cart!");
       } else {
           itemsOrdered.add(item);
           System.out.println(item.getClass().getSimpleName() + ' ' + item.getTitle() + " is now in cart!");
       }
   }
   // Method removeMedia HoangAnh_226076
   public void removeMedia(Media item) {
	   if(itemsOrdered.contains(item)) {
		   itemsOrdered.remove(item);
		   System.out.println(item.getClass().getSimpleName() + ' ' + item.getTitle() + " was successfully removed from cart!");
	   } else {
		   System.out.println(item.getClass().getSimpleName() + ' ' + item.getTitle() + " is not in the cart!");
	   }
   }
    // Method totalCost HoangAnh_226076
    public float totalCost(){
        float totalPrice = 0;
        for(Media item : itemsOrdered){
            totalPrice += item.getCost();
        }
        return totalPrice;
    }
    // Method print cart HoangAnh_226076
    public void print() {
        StringBuilder output = new StringBuilder("*************CART************************** \nOrdered items: \n");
        if(itemsOrdered.isEmpty()) {
            output.append("No time\n");
        } else {
            int i = 1;
            for (Media item : itemsOrdered) {
                output.append(i + ".[" + item.getTitle() + "] - [" + item.getCategory() + "] - "
                        + item.getCost() + " $\n");
                i++;
            }
        }
        output.append("total: ").append(totalCost()).append(" $\n");
        output.append("================================================\n");
        System.out.println(output);
    }
    // Method searchById HoangAnh_226076
    public void searchById(int i) {
        if(i > itemsOrdered.size()) {
            System.out.println("No match found !");
        } else {
            System.out.println("Result: " +  "[" + itemsOrdered.get(i-1).getTitle() +
                    "] - [" + itemsOrdered.get(i-1).getCategory() + "] -"
                    +  + itemsOrdered.get(i-1).getCost() + " $\n");
        }
    }
    // Method searchByTitle HoangAnh_226076
    public void searchByTitle(String title) {
        for(Media item : itemsOrdered) {
            if(item.getTitle().equals(title)) {
                System.out.println("Result: " +  "[" + item.getTitle() +
                        "] - [" + item.getCategory() + "] -"
                        +item.getCost() + " $\n");
                return;
            }
        }
        System.out.println("No match found");
    }
    // Method findMedia HoangAnh_226076
    public Media findMedia(String title) {
        for (Media item : itemsOrdered) {
            if (item.getTitle().equals(title)) {
                return item;
            }
        }
        return null;
    }

    public void emptyCart() {
        itemsOrdered.removeAll(itemsOrdered);
    }
    // Method sortByTitleCost HoangAnh_226076
    public void sortByTitleCost() {
        Collections.sort(itemsOrdered,Media.COMPARE_BY_TITLE_COST);
    }
    // Method sortByCostTitle HoangAnh_226076
    public void sortByCostTitle() {
        Collections.sort(itemsOrdered,Media.COMPARE_BY_COST_TITLE);
    }

}