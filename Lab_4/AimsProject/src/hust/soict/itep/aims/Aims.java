package hust.soict.itep.aims;
// Tran Huy Hoang Anh - 20226076

import java.util.*;
import hust.soict.itep.aims.media.*;
import hust.soict.itep.aims.cart.Cart;
import hust.soict.itep.aims.store.Store;
public class Aims {
public static void main(String[] args) {
	// Khoi tao cac item HoangAnh_226076
	Media dvd = new DigitalVideoDisc(1, "The Lion King", "Animation", 19.95f, 87, "Roger Allers");
		 
	List<String> authors = new ArrayList<String>();
	authors.add("To Hoai");
	authors.add("Nguyen Huy Tuong");
	Media book = new Book(2,"Tuoi tre du doi", "Ki su", 6.5f, authors);
	     
	ArrayList<Track> tracks = new ArrayList<Track>();
	tracks.add(new Track("End of the world",3));
	tracks.add(new Track("Eternal sunshine",4));
	Media cd = new CompactDisc(3, "Eternal sunshine", "Pop" , 5.5f, "Ariana Grande", tracks);
	Store store = new Store();
	store.addMedia(cd);
	store.addMedia(dvd);
	store.addMedia(book);
	Cart cart = new Cart();
	Scanner scanner = new Scanner(System.in);
    showMenu(scanner, store, cart);
}
	// ShowMenu HoangAnh_226076
public static void showMenu(Scanner scanner, Store store, Cart cart) {
    while (true) {
        System.out.println(
                """
                                       
                        AIMS:
                        --------------------------------
                        1. View store
                        2. Update store
                        3. See current cart
                        0. Exit
                        --------------------------------
                        Please choose a number: 0-1-2-3
                                 """);
        int option = scanner.nextInt();
        switch (option) {
            case 0 -> {
                scanner.close();
                System.exit(0);
            }
            case 1 -> storeMenu(scanner, store, cart);
            case 2 -> updateStoreMenu(scanner, store);
            case 3 -> {
                cart.print();
                cartMenu(scanner,cart);
            }
        }
    }
}
	// updateStore HoangAnh_226076
public static void updateStoreMenu(Scanner scanner, Store store) {
    System.out.println("""
            ==========================
            1. add Media
            2. delete Media
            3. update Media in Store
            0. Back
            ==========================
            Option: """);
    int option = scanner.nextInt();
    switch (option) {
        case 1 -> {
            System.out.println("""
                    1.DigitalVideoDisc
                    2.CompactDisc
                    3.Book
                    -------
                    -> Your type:""");
            int option2 = scanner.nextInt();
            System.out.print("Enter id: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter title: ");
            String title = scanner.nextLine();
            System.out.print("Enter category: ");
            String category = scanner.nextLine();
            System.out.print("Enter cost: ");
            float cost = scanner.nextFloat();
            scanner.nextLine();
            switch (option2) {
                case 1 ->
                {
                    System.out.print("Enter director's name: ");
                    String director = scanner.nextLine();
                    System.out.print("Enter dvd's length: ");
                    int length = scanner.nextInt();
                    scanner.nextLine();
                    store.addMedia(new DigitalVideoDisc(id,title,category,cost,length, director));
                }
                case 3 -> {
                    System.out.print("Enter author's name (Enter nothing to skip): ");
                    StringBuilder author = new StringBuilder(scanner.nextLine());
                    ArrayList<String> authors = new ArrayList<String>();
                    while (!author.isEmpty()) {
                        authors.add(author.toString());
                        System.out.print("Enter author's name (Enter nothing to skip): ");
                    }
                    store.addMedia(new Book(id,title,category,cost,authors));
                }
                case 2 -> {
                    System.out.print("Enter artist's name: ");
                    StringBuffer artist = new StringBuffer(scanner.nextLine());
                    System.out.print("Enter number of track: ");
                    int nbTrack = scanner.nextInt();scanner.nextLine();
                    ArrayList<Track> tracks = new ArrayList<Track>();
                    StringBuilder name = new StringBuilder();
                    for(int i = 0;i< nbTrack;i++) {
                        System.out.print("Enter Track[" + i + "]'s name: ");
                        name.replace(0,name.length(),scanner.nextLine());
                        System.out.print("Enter Track[" + i + "]'s length: ");
                        int length = scanner.nextInt();
                        tracks.add(new Track(name.toString(), length));
                        scanner.nextLine();

                    }
                    store.addMedia(new CompactDisc(id,title,category,cost,artist.toString(),tracks));
                }
            }
        }
        case 2 -> {
            System.out.println("Enter item's title: ");
            scanner.nextLine();
            String title = scanner.nextLine();
            Iterator<Media> iter = store.getItemsInStore().iterator();
            while (iter.hasNext()) {
                Media item = iter.next();
                if(item.getTitle().equals(title)) {
                    iter.remove();
                    System.out.println(item.getClass().getSimpleName() + " " + item.getTitle() + "'ve been deleted from the store !");
                }
            }

        }
        case 3 -> {
            System.out.println("Enter item's id: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter title: ");
            String title = scanner.nextLine();
            System.out.print("Enter category: ");
            String category = scanner.nextLine();
            System.out.print("Enter cost: ");
            float cost = scanner.nextFloat();
            store.getItemsInStore().get(id).setCost(cost);
            store.getItemsInStore().get(id).setTitle(title);
            store.getItemsInStore().get(id).setCategory(category);
            System.out.println(store);
        }
    }
}
	// mediaDetailsMenu HoangAnh_226076
public static void mediaDetailsMenu(Scanner scanner, Store store, Cart cart) {
    System.out.print("Enter media's title: ");
    String title = scanner.nextLine();
    Media item = store.findMedia(title);
    if(item == null) {
        System.out.println("There is no such media !");
        return;
    }
    System.out.println(item);
    while (true) {
        System.out.println("""
                        Options:
                        --------------------------------
                        1. Add to cart
                        2. Play
                        0. Back
                        --------------------------------
                        Please choose a number: 0-1-2""");
        int option = scanner.nextInt();
        scanner.nextLine();
        switch (option) {
            case 1 -> {
                cart.addMedia(item);
            }
            case 2 -> {
                if (item.getClass().getSimpleName().equals("Book")) {
                    System.out.println("This media is unplayable");
                } else {
                    if (item instanceof DigitalVideoDisc dvd) {
                        dvd.play();
                    }
                    if (item instanceof CompactDisc cd) {
                        cd.play();
                    }
                }
            }
            case 0 -> {
                return;
            }
        }
    }
}
	// storeMenu HoangAnh_226076
public static void storeMenu(Scanner scanner, Store store, Cart cart) {
    System.out.println(store);
    while (true) {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
        int option = scanner.nextInt();
        scanner.nextLine();
        switch (option) {
            case 1 -> mediaDetailsMenu(scanner, store, cart);
            case 0 -> {
                return;
            }
            case 2 -> {
                System.out.print("Enter media's title: ");
                String title = scanner.nextLine();
                Media item = store.findMedia(title);
                if (item == null) {
                    System.out.println("There is no such media !");
                } else {
                    cart.addMedia(item);
                }
            }
            case 3 -> {
                System.out.print("Enter media's title: ");
                String title = scanner.nextLine();
                Media item = store.findMedia(title);
                if (item == null) {
                    System.out.println("There is no such media !");
                } else {
                    if (item.getClass().getSimpleName().equals("Book")) {
                        System.out.println("This media is unplayable");
                    } else {
                        if (item instanceof DigitalVideoDisc dvd) {
                            dvd.play();
                        }
                        if (item instanceof CompactDisc cd) {
                            cd.play();
                        }
                    }
                }
            }
            case 4 -> {
                cart.print();
                cartMenu(scanner,cart);
            }
        }
    }
}
	// cartMenu HoangAnh_226076
public static void cartMenu(Scanner scanner,Cart cart) {
    while (true) {
        System.out.println("""
                Options:
                --------------------------------
                1. Filter medias in cart
                2. Sort medias in cart
                3. Remove media from cart
                4. Play a media
                5. Place order
                0. Back
                --------------------------------  
                "Please choose a number: 0-1-2-3-4-5""");
        int option = scanner.nextInt();
        scanner.nextLine();
        switch (option) {
            case 0 -> {
                return;
            }
            case 1 -> {
                System.out.println("""
                        1. Filter by id
                        2. Filter by title
                        ----------------
                        your option:
                        """);
                int option2 = scanner.nextInt();
                scanner.nextLine();
                if (option2 == 1) {
                    int id = scanner.nextInt();
                    cart.searchById(id);
                } else {
                    String title = scanner.nextLine();
                    cart.searchByTitle(title);
                }
            }
            case  2 -> {
                System.out.println("""
                        1. sort by title cost
                        2. sort by cost title
                        ----------------
                        your option:
                        """);
                int option2 = scanner.nextInt();
                scanner.nextLine();
                if (option2 == 1) {
                    cart.sortByTitleCost();
                    cart.print();
                } else {
                    cart.sortByCostTitle();
                    cart.print();
                }
            }
            case 3 -> {
                System.out.print("Enter media's title: ");
                String title = scanner.nextLine();
                Media item = cart.findMedia(title);
                if (item == null) {
                    System.out.println("There is no such media !");
                } else {
                    cart.removeMedia(item);
                }
            }
            case 4 -> {
                System.out.print("Enter media's title: ");
                String title = scanner.nextLine();
                Media item = cart.findMedia(title);
                if (item == null) {
                    System.out.println("There is no such media !");
                } else {
                    if (item.getClass().getSimpleName().equals("Book")) {
                        System.out.println("This media is unplayable");
                    } else {
                        if (item instanceof DigitalVideoDisc dvd) {
                            dvd.play();
                        }
                        if (item instanceof CompactDisc cd) {
                            cd.play();
                        }
                    }
                }
            }
            case  5 -> {
                System.out.println("Your cart have been paid\nThanks for using our service");
                cart.emptyCart();
            }
        }
    }
    }
}
