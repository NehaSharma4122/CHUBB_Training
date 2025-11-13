package BankingApp;

import java.io.*;
import java.util.Scanner;
public class FileReadOps {
	public static void main(String[] args) throws IOException{
		File file = new File("sample.txt");
		try(FileWriter writ = new FileWriter(file)){
			writ.write("Hello Java\n This is scanner");	
		}
		File f = new File("");
		FileWriter obj = new FileWriter(file);
		obj.write("This is test");
		obj.flush();
		obj.close();
		try(Scanner sc = new Scanner(file)){
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
	}
}
