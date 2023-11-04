package tp2java;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ExecuterCommande {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		ExecuterCommande ec = new ExecuterCommande();
		ec.executerCommande("notepad");
	}

public void  executerCommande(String commande) throws IOException, InterruptedException {
	Process p= Runtime.getRuntime().exec(commande);
	 boolean b = p.waitFor(5,TimeUnit.SECONDS);
	 if(!b) {
	 p.destroy();
	 System.out.println(p.exitValue());}
	 else {
		 System.out.println(p.exitValue());
	 }
	

}



}
