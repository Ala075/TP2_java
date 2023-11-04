package tp2_threads;

public class Main {

	public static void main(String[] args) {
		AndroidThread at=new AndroidThread();
		PythonThread pt= new PythonThread();
		
		at.setName("Th-android");
		pt.setName("Th-python");
		at.setPriority(Thread.MAX_PRIORITY);
		pt.setPriority(Thread.MAX_PRIORITY);
		
		at.start();
		pt.start();
	}

}
