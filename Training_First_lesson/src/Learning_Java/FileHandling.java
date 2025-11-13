package Learning_Java;

import java.util.*;
import java.util.Scanner;
import java.io.*;

public class FileHandling {
	public static void main(String[] args) throws Exception{
		File f = new File("entry.txt");
		List<FileInput> in = new ArrayList<>();
		Scanner red = new Scanner(f);
		int i=0;
		while(red.hasNext()) {
			String data = red.nextLine();
			System.out.println(data);
//			String[] parts = data.split(",");
//			in.add(setOwn_name(parts[0]));
//			in[0]
		}
		
	}
	
}
