package tp2java;

import java.io.FileWriter;
import java.io.IOException;

public class PythonRunable implements Runnable {

	@Override
	public void run() {
		try {
			FileWriter file=new FileWriter("C:/Users/Desktop/fichier1.txt",true);
			for (int i=0;i<10;i++) {
				file.write("I love Python \n");
				file.flush();
			}
			

			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
