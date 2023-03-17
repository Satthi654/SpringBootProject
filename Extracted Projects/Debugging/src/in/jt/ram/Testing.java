package in.jt.ram;

public class Testing {
	static int l = 10;	 
	static int m = 20;
	static {
		System.out.println("STATIC BLOCK STARTS");
		int n = m2();
		
		String s = new Testing().m3();
		
		//System.out.println("s value is: "+s.toUpperCase());
		
		System.out.println("n value is: "+n);
		System.out.println("STATIC BLOCK ENDS");
	}
	
	static int m2() {
		System.out.println("m2 method starts");
		System.out.println("m2 method ends");
		return 222;
		
	}
	public static void main(String[] args) {
		System.out.println("MAIN METHOD STARTS");
		int d = 20;
		calculate();
		if(d%2 ==0) {
			System.out.println("D IS AN EVEN NUMBER");
		}
		else {
			System.out.println("D IS AN ODD NUMBER");
		}
		System.out.println("MAIN METHOD ENDS");
	}
	
	public static void calculate() {
		System.out.println("CALCULATE METHOD STARTS");
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("C Value Is: "+c);
		System.out.println("CALCULATE METHOD ENDS");
	}
	
	 String m3() {
		System.out.println("m3 method starts");
		System.out.println("m3 method ends");
		//return "ram";
		
		return null;
		
	}
}
