package hust.soict.itep.test.card;

import hust.soict.itep.aims.card.Cart;
import hust.soict.itep.aims.disc.DigitalVideoDisc;

// Tran Huy Hoang Anh - 20226076
public class TestCard {
	  public static void main(String[] args) {
	        // Tao cart rong
	        Cart cart = new Cart();
	        // Tao DVD
	        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
	        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Start Wars", "Science Fiction", "George Lucas", 87, 24.95f);
	        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
	        cart.addDigitalVideoDisc(dvd1, dvd2, dvd3);
	        //Test the print method
	        cart.print();
	        //Test search by ID method
	        cart.searchById(2);
	        cart.searchById(4);
	        //Test search by Title method
	        cart.searchByTitle("The Lion King");
	        cart.searchByTitle("Avatar 1");
	  }
}