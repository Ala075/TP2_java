package tp2_threads;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class AndroidThread extends Thread {

	@Override
	public void run() {
		try {
			FileWriter file=new FileWriter("C:/Users/Desktop/fichier.txt",true);
			long debut = System.currentTimeMillis();

			for (int i=0;i<10000;i++) {
				file.write("I love Android \n");
				file.flush();
			}
			long fin = System.currentTimeMillis()-debut;
			System.out.println(getName()+ fin);
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
