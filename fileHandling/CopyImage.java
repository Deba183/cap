package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyImage {
	public static void main(String[] args) throws Exception{
		
		//creating new jpg file
		String destinationPath = "C:\\\\\\\\Users\\\\\\\\User\\\\\\\\Desktop\\\\\\\\FileHandlingKolkata\\\\\\\\test\\\\\\\\image.jpg";
		File destinationfile = new File(destinationPath);
		destinationfile.createNewFile();
		
		//creating file object of source image
		String sourcePath = "C:\\Users\\User\\Pictures\\Saved Pictures";
		File sourceFile = new File(sourcePath);
		
		
		FileInputStream fis = new FileInputStream(sourceFile);
		byte[] arr = new byte[(int)sourceFile.length()];
		fis.read(arr);
		
		FileOutputStream fos = new FileOutputStream(destinationfile);
		
		fos.close();
		fis.close();
	}

}
