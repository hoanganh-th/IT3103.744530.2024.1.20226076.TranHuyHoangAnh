package hust.soict.itep.aims.media;
//Tran Huy Hoang Anh 20226076
public class DigitalVideoDisc extends Disc implements Playable
{
	//private static int nbDigitalVideoDiscs = 0;
	
	/*public static int getNbDigitalVideoDisc() {
		return nbDigitalVideoDiscs;
	}*/

	public DigitalVideoDisc(int id, String title, String category, float cost) {
		super(id, title, category, cost);
		//nbDigitalVideoDiscs++;
		//this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(int id, String title, String category, float cost, int length, String director) {
		super(id, title, category, cost, length, director);
		//nbDigitalVideoDiscs++;
		//this.id = nbDigitalVideoDiscs;
	}
	public void play() {
	     System.out.println("Playing DVD: " + this.getTitle());
	     System.out.println("DVD length: " + this.getLength());
	}

}
