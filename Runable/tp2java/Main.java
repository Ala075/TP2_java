package tp2java;


public class Main{
	
	public static void main(String[] args) {
		AndroidRunable ar=new AndroidRunable();
		PythonRunable pr= new PythonRunable();
		Thread arth=new Thread(ar);
		Thread prth=new Thread(pr);
		arth.setName("Th-android");
		prth.setName("Th-python");
		arth.setPriority(Thread.MAX_PRIORITY);
		prth.setPriority(Thread.MAX_PRIORITY);
		
		arth.start();
		prth.start();

	}

}
