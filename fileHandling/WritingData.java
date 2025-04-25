package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WritingData {
	public static void main(String[] args) throws IOException{
		String path = "C:\\\\Users\\\\User\\\\Desktop\\\\FileHandlingKolkata\\\\test\\\\demo.txt";
		
		File file = new File(path);
		//FileOutputStream fos = new FileOutputStream(file, true);
		String message = " , bye bye birdie";
//		byte[] arr = message.getBytes();
//		fos.write(arr);
		
		FileWriter fw = new FileWriter(file, true);
		//char[] arr = message.toCharArray();
		
		for(int i = 0;i<message.length();i++) {
			fw.write(message.charAt(i));
		}
		fw.close();
	}

}

