package Assignment1;

import java.io.*;
import java.util.Scanner;

public class FileProcessing {

	public static void main(String[] args) {
		String path = "C:\\Users\\Neha Sharma\\Desktop\\CHUBB TRAINING\\eclipse-workspace\\November_13\\src\\Assignment1\\Text_file.txt";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the word you want to find:");
		String word = sc.next();
		int count = 0;
		try (BufferedReader buffer_reader = new BufferedReader(new FileReader(path))) {
			String str;
			while((str=buffer_reader.readLine())!=null) {
				System.out.println(str);
				String[] line = str.split("\\W+");
				// The \\W+ regular expression matches one or more non-word characters (spaces, punctuation, etc.), effectively separating the words.
				for(String w : line) {
					if(w.equalsIgnoreCase(word)){
						count++;
					}
				}
			}
			
			System.out.println("Total desired word count:"+count);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
