// Tran Huy Hoang Anh 20226076
package hust.soict.itep.aims;

import hust.soict.itep.aims.card.Cart;
import hust.soict.itep.aims.disc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        // Tao cart rong
        Cart anOrder = new Cart();
        // Tao DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Start Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);

        /*DigitalVideoDisc[] dvdList = {dvd1, dvd2, dvd3};
        anOrder.addDigitalVideoDisc(dvdList); */
        
        anOrder.addDigitalVideoDisc(dvd1, dvd2, dvd3);
        
        //anOrder.addDigitalVideoDisc(dvd1, dvd2);
        System.out.println("The ID of DVD " + "\"" + dvd1.getTitle() + "\"" +": " + dvd1.getId()); 
        System.out.println("The ID of DVD " + "\"" + dvd2.getTitle() + "\"" +": " + dvd2.getId());
        System.out.println("The ID of DVD " + "\"" + dvd3.getTitle() + "\"" +": " + dvd3.getId());
        System.out.println("Number of DVD: " + DigitalVideoDisc.getNbDigitalVideoDisc());
        // Them DVD vao cart
        /* anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);
        anOrder.addDigitalVideoDisc(dvd3); */   
        // Hien thi gia 
        System.out.printf("Total Cost is: %.2f\n", anOrder.totalCost());
        anOrder.removeDigitalVideoDisc(dvd3);
        System.out.printf("Total Cost is: %.2f\n", anOrder.totalCost());
        anOrder.removeDigitalVideoDisc(dvd2);
        System.out.printf("Total Cost is: %.2f\n", anOrder.totalCost());
        anOrder.removeDigitalVideoDisc(dvd1);
        System.out.printf("Total Cost is: %.2f\n", anOrder.totalCost());        
    }
}
