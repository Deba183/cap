package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeEmployee {
	public static void main(String[] args) throws Exception{
		String path = "C:\\Users\\User\\Desktop\\FileHandlingKolkata\\test\\serialize.txt";
		File file = new File(path);
		
		file.createNewFile();
		
		Employee employee = new Employee(1, "Debanjana", 21);
		
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(employee);
		oos.flush();
		
		oos.close();
		fos.close();
	}

}
