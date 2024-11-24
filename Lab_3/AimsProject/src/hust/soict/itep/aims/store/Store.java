package hust.soict.itep.aims.store;

import hust.soict.itep.aims.disc.DigitalVideoDisc;

// Tran Huy Hoang Anh - 20226076
public class Store {
	public static final int MAX_NUMBERS_ITEMS = 2;
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_NUMBERS_ITEMS]; 
    private int qtyInStore = 0; 

    // Method to add item HoangAnh_226076
    public void addDVD(DigitalVideoDisc dvd) {
        if (qtyInStore < itemsInStore.length) {
            itemsInStore[qtyInStore] = dvd;
            qtyInStore++;
            System.out.println("The DVD \"" + dvd.getTitle() + "\" has been added to the store.");
        } else {
            System.out.println("The store is full! Cannot add more DVDs.");
        }
    }

    // Method to remove item HoangAnh_226076
    public void removeDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i].equals(dvd)) { // Tìm DVD cần xóa
                // Dịch các phần tử còn lại
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[qtyInStore - 1] = null; // Xóa phần tử cuối cùng
                qtyInStore--;
                System.out.println("The DVD \"" + dvd.getTitle() + "\" has been removed from the store.");
                return;
            }
        }
        System.out.println("The DVD \"" + dvd.getTitle() + "\" is not found in the store.");
    }

    // Method to show items in store HoangAnh_226076
    public void printStore() {
        System.out.println("*************** STORE ***************");
        if (qtyInStore == 0) {
            System.out.println("The store is empty.");
        } else {
            for (int i = 0; i < qtyInStore; i++) {
                System.out.println((i + 1) + ". " + itemsInStore[i].toString());
            }
        }
        System.out.println("*************************************");
    }
}
