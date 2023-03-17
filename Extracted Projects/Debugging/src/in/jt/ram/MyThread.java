package in.jt.ram;

public class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("run : method starts ");
		System.out.println("run : method ends ");
	}
	
	public static void main(String[] args) {
		MyThread mt1 = new MyThread();
		mt1.start();
		mt1.start();
	}
}
