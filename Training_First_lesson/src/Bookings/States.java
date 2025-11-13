package Bookings;

import java.util.*;

public class States{
	
	public List<Hotels> initializeHotels(String dest) {
		List<Hotels> ll = new ArrayList<Hotels>();
		if(dest.equalsIgnoreCase("rajasthan")) {
			List<Hotels> raj = new ArrayList<Hotels>();
			raj.add(new Hotels(101,"Taj Lake Palace","Udaipur, Rajasthan",45,20000));
			raj.add(new Hotels(102,"Rambagh Palace","Jaipur, Rajasthan",56,15000));
			raj.add(new Hotels(103,"Umaid Bhawan Palace","Jodhpur, Rajasthan",36,16000));
			raj.add(new Hotels(104,"Rambagh Palace","Jaipur, Rajasthan",35,25000));
			return raj;
		}
		else if(dest.equalsIgnoreCase("maharashtra")) {
			List<Hotels> ma = new ArrayList<Hotels>();
			ma.add(new Hotels(201,"Four Seasons Hotel","Mumbai, Maharashtra",24,50000));
			ma.add(new Hotels(202,"Shalini Palace","Kolhapur, Maharashtra",46,22000));
			ma.add(new Hotels(203,"Taj Mahal Palace and Tower","Mumbai, Maharashtra",26,35000));
			ma.add(new Hotels(204,"Watson's Hotel","Mumbai, Maharashtra",35,35000));
			return ma;
		}
		else if(dest.equalsIgnoreCase("delhi")) {
			List<Hotels> del = new ArrayList<Hotels>();
			del.add(new Hotels(301,"The Leela Palace","New Delhi",35,40000));
			del.add(new Hotels(302,"The Imperial","New Delhi",56,35000));
			del.add(new Hotels(303,"Ashok Hotel","Delhi",56,34000));
			del.add(new Hotels(304,"Maiden Hotel","Delhi",35,64000));
			return del;
		}
		else if(dest.equalsIgnoreCase("goa")) {
			List<Hotels> goa = new ArrayList<Hotels>();
			goa.add(new Hotels(101,"Taj Lake Palace","Udaipur, Rajasthan",45,20000));
			goa.add(new Hotels(102,"Rambagh Palace","Jaipur, Rajasthan",56,15000));
			goa.add(new Hotels(103,"Umaid Bhawan Palace","Jodhpur, Rajasthan",36,16000));
			goa.add(new Hotels(104,"Rambagh Palace","Jaipur, Rajasthan",35,25000));
			return goa;
		}
		System.out.println("Hotel for this state isn't currently available with us.");
		return ll;
	}
	public static void Choices(String dest) {
		switch(dest.toLowerCase()) {
			case "rajasthan":
				System.out.println("101.Taj Lake Palace: Udaipur\r\n"
						+ "102.Rambagh Palace: Jaipur\r\n"
						+ "103.Umaid Bhawan Palace: Jodhpur\r\n"
						+ "104.Jai Mahal Palace: Jaipur");
				break;
			case "maharashtra":
				System.out.println("201.Four Seasons Hotel Mumbai, Mumbai\r\n"
						+ "202.Shalini Palace, Kolhapur\r\n"
						+ "203.Taj Mahal Palace and Tower, Mumbai\r\n"
						+ "204.Watson's Hotel, Mumbai");
				break;
			case "delhi":
				System.out.println("301.The Leela Palace, New Delhi\r\n"
						+ "302.The Imperial, New Delhi\r\n"
						+ "303.Ashok Hotel, Delhi\r\n"
						+ "304.Maidens Hotel, Delhi");
				break;
			case "goa":
				System.out.println("401.Grand Hyatt Goa\r\n"
						+ "402.Planet Hollywood Goa\r\n"
						+ "403.Ronil Royale\r\n"
						+ "404.Taj Fort Aguada Resort");
				break;
			default:
				System.out.println("1.Hotel for this state isn't currently available with us.");
				break;
			
		}
		
				
			
	}
}
