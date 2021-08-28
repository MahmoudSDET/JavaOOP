package package1;

public class ChildClass  extends BaseClass{

	
	public int A=6;
	protected int B=11;
	private int C=8;
	
	public void printPropertiesValues() {
		
		System.out.println(A + ","+B+","+C);
		
	}
	
	
	public static void main(String[] args) {
		
		// instance of child 
		ChildClass ch=new ChildClass();
		
		System.out.println(ch.x);
		ch.set(6);
		System.out.println(ch.get());
		
		
		
		// not logic
		
	//	ChildClass ch=new BaseClass();
		
		// instance from parent
		BaseClass bc=new BaseClass();
		
		bc.printPropertiesValues();
		
		// instance from child to parent
		
		BaseClass bc2=new ChildClass();
		bc2.printPropertiesValues();
		
		
		
		
 
	}

}
