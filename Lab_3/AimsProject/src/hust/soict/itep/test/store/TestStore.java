package hust.soict.itep.test.store;

import hust.soict.itep.aims.disc.DigitalVideoDisc;
import hust.soict.itep.aims.store.Store;

// Tran Huy Hoang Anh - 20226076
public class TestStore {
	  public static void main(String[] args) {
	        Store store = new Store();
	        // Tao DVD
	        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
	        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Start Wars", "Science Fiction", "George Lucas", 87, 24.95f);
	        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
	        // Test method addDVD
	        store.addDVD(dvd1);
	        store.addDVD(dvd2);
	        store.addDVD(dvd3);
	        
	        store.printStore();
	        
	        // Test method removeDVD
	        store.removeDVD(dvd2);
	        store.printStore();
	        store.removeDVD(dvd2);
	        store.printStore();
	        
	  }
}