package Learning_Java;

import java.util.*;

public class Employer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,List<String>> mp = new HashMap<>();
		while(true) {
			List<String> ls = new ArrayList<>();
			System.out.print("Do you want to insert a company:");
			String flag = sc.next(); 
			if(!flag.equalsIgnoreCase("yes")) {
				break;
			}
			System.out.println("Enter elements of list(type -1 to stop adding):");
			while(true) {
				String s = sc.next().toLowerCase();
				if(s.equalsIgnoreCase("-1")) {
					break;
				}
				ls.add(s);
			}
			System.out.print("Enter company name of these employees:");
			String name = sc.next();
			mp.put(name, ls);
		}
		for(Map.Entry<String,List<String>> e: mp.entrySet()) {
			System.out.println("Company:"+e.getKey());
			System.out.println("Employees:"+e.getValue());
		}
		int pg = 0;
		for(Map.Entry<String,List<String>> e: mp.entrySet()) {
			if(e.getValue().contains("ram")) {
				pg = 1;
				if(e.getKey().equalsIgnoreCase("Cognizant")) {
					System.out.println("Ram is working in Cognizant");
				}
				else {
					System.out.println("Ram is working in "+e.getKey());
				}
			}
		}
		if(pg == 0){
			System.out.println("Ram not found");
		}
		
		
		
	}
}
