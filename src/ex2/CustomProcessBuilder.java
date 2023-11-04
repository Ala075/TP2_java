package ex2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomProcessBuilder {
	

		public static void main(String[] args) throws IOException {
			List<String> liste= new ArrayList<String>();
			liste.add("cmd.exe");
			liste.add("/c");
			liste.add("dir");
			liste.add("/s");
			liste.add("/b");
			ProcessBuilder pb= new ProcessBuilder(liste);
			Process p= pb.start();
			Scanner s =new Scanner(p.getInputStream());
			while(s.hasNextLine()) {
				String line =s.nextLine();
				System.out.println(line);
			
			}
			
	}
	}


