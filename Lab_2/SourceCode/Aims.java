// Tran Huy Hoang Anh 20226076
package hust.soict.itep.aims;

public class Aims {
    public static void main(String[] args) {
        // Tao cart rong
        Cart anOrder = new Cart();
        // Tao DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Start Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        // Them DVD vao cart
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);
        anOrder.addDigitalVideoDisc(dvd3);
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
