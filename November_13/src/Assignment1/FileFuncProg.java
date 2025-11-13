package Assignment1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class FileFuncProg {
	public static void main(String[] args) {
		String path = "C:\\Users\\Neha Sharma\\Desktop\\CHUBB TRAINING\\eclipse-workspace\\November_13\\src\\Assignment1\\Text_file.txt";
		Path p = Paths.get(path);
		AtomicInteger count = new AtomicInteger(0);
		String target = "india";
		try {
			Files.lines(p).forEach(line -> {
				Arrays.stream(line.split("\\W+"))
				.filter(word -> !word.isEmpty())
				.filter(word->word.equalsIgnoreCase(target))
				.forEach(word->count.getAndIncrement());
			});
			System.out.println("Count of desired word:"+count.get());
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
