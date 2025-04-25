package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingData {
	public static void main (String[] args) throws IOException {
		String path = "C:\\\\Users\\\\User\\\\Desktop\\\\FileHandlingKolkata\\\\test\\\\demo.txt";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		
		int x;
		
	}

}
