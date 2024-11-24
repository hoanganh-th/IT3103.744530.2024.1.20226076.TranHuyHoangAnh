// Tran Huy Hoang Anh 20226076
package hust.soict.itep.aims.card;

import hust.soict.itep.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    int qtyOrdered = 0; 

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The DVD " + '\"' +disc.getTitle() + '\"' + " has been added!");
        } else {
            System.out.println("The cart is full! Cannot add more discs.");
        }
    }
    //Method overloading khac kieu tham so HoangAnh_226076
    /*public void addDigitalVideoDisc(DigitalVideoDisc dvdList[]) {
    	for(DigitalVideoDisc disc : dvdList) {
    		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
    			itemsOrdered[qtyOrdered] = disc;
    			qtyOrdered++;
            System.out.println("The DVD " + '\"' +disc.getTitle() + '\"' + " has been added!");
    		} else {
            System.out.println("The cart is full! Cannot add more discs.");
            break;
    		}
    	}
    }*/
    public void addDigitalVideoDisc(DigitalVideoDisc... discs) {
        for (DigitalVideoDisc disc : discs) {
            if (qtyOrdered < MAX_NUMBERS_ORDERED) {
                itemsOrdered[qtyOrdered] = disc;
                qtyOrdered++;
                System.out.println("The DVD \"" + disc.getTitle() + "\" has been added!");
            } else {
                System.out.println("The cart is full! Cannot add more discs.");
                break; 
            }
        }
    }
    // Method overloading khac so luong tham so HoangAnh_226076
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
    	if(qtyOrdered + 2 <= MAX_NUMBERS_ORDERED) {
    		itemsOrdered[qtyOrdered] = dvd1;
    		qtyOrdered++;
    		itemsOrdered[qtyOrdered] = dvd2;
    		qtyOrdered++;
    		System.out.println("The DVD \"" + dvd1.getTitle() + "\" and \"" + dvd2.getTitle() + "\" have been added!");
    	} else {
    		System.out.println("The cart is not enough to add two cards!");
    	}
    }
    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) { 
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null; 
                qtyOrdered--; 
                System.out.println("Remove DVD " + '\"'+ disc.getTitle() + '\"' + " successfully!");
                return;
            }
        }
        System.out.println("Disc not found in cart.");
    }

    public float totalCost(){
        float result = 0;
        for(int i = 0; i < qtyOrdered; i++){
            result += itemsOrdered[i].getCost();
        }
        return result;
    }
    // Method to print cart HoangAnh_226076
    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + itemsOrdered[i].toString());
        }
        float totalCost = totalCost();
        System.out.println("Total cost: " + totalCost + " $");
        System.out.println("***************************************************");
    }
    // Method to search by id HoangAnh_226076
    public void searchById(int id) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
            	System.out.println("DVD with id " + "\"" + id + "\"" + " found:\n" + itemsOrdered[i].toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No DVD found with ID: " + id);
        }
    }
    // Method to search by title HoangAnh_226076
    public void searchByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title)) {
                System.out.println("DVD " + "\"" + title + "\"" + " found:\n" + itemsOrdered[i].toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVD found with title: " + title);
        }
    }

}