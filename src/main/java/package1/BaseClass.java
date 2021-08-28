package package1;

public class BaseClass {
	
	// non static 
	public double x=5;
	protected double y=3;
	
	private double z=2;
	
	
	// static properites
	public static double A=7;
	protected static double B=8;
	
	private static double C=9;
	
	
	// Constructor
	
	public BaseClass() {
		
		System.out.print("1 day");
	}
	public void set(int m) {
		
		this.z=m;
	}
	
	// non static
public double get() {
		
		return z;
	}

public void printPropertiesValues() {
	
	System.out.println(x + ","+y+","+z);
	
}

//static method
public static void printPropertiesValues_2() {
	
	System.out.println(A + ","+B+","+C);
	
}
public static void main(String[] args) {
	
	System.out.println("Hello world");
	
	// non static calling
	BaseClass bc=new BaseClass();
	
	bc.get();
	bc.printPropertiesValues();
	
	
	
	System.out.println("-----------------------------------");
	
	// static calling
	
	printPropertiesValues_2();
	//BaseClass bc2=new ChildClass();

	

}

}
