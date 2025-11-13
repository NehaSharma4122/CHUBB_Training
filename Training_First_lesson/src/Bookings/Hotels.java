package Bookings;

public class Hotels {
	public int id;
	public String name;
	public String location;
	public int available_room;
	public double price;
	public Hotels(int id, String name, String location, int available_room,double price){
		this.id = id;
		this.name = name;
		this.location = location;
		this.available_room = available_room;
		this.price = price;
	}
	public void bookRoom(int num) {
		if(num>available_room) {
			System.out.println("Sorry! "+available_room+" are present in hotel");
		}
		else if(num<=available_room) {
			System.out.println("Rooms successfully booked");
			available_room -= num;
		}
	}	
}
