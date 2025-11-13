package Bookings;
import java.util.*;
public class Person {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name:");
		String name = sc.nextLine();
		while(true) {
			System.out.println("Destinations:"
					+ "1.Rajasthan\n2.Maharashtra\n3.Delhi\n4.Goa");
			System.out.print("Enter your choice of destination:");
			String destination = sc.nextLine();
			States st = new States();
			st.Choices(destination);
			List<Hotels> ls = st.initializeHotels(destination);
			System.out.println("Choose a hotel by entering its ID(Eg.101/202):");
			int idx = sc.nextInt();
			for(Hotels h: ls) {
				System.out.println("ID:"+h.id+", Name:"+h.name+", location:"+h.location+", price:"+h.price+", No. of room present:"+h.available_room);
			}
			
			System.out.println("Do you wish to book at another location(Yes/No)?");
			String cont = sc.nextLine();
			if(!cont.equalsIgnoreCase("yes")) {
				return;
			}
		}
	}
}


