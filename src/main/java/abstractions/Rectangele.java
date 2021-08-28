package abstractions;

public class Rectangele extends Shape {

	double x=5;
	double y=6;
	
	
	
	
	
	




	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}





	@Override
	public double calculateradius() {
		// TODO Auto-generated method stub
		
		return (x+y)*2;
	}

	
	
	public static void main(String[] args) {
		
		Rectangele re=new Rectangele();
	System.out.println(	re.calculateradius());
	
	System.out.println(re.printH());
	
	// applied polymerthism;
	Shape sh=new Rectangele();
	
	System.out.println(	sh.calculateradius());
	System.out.println(	sh.printH());
	

	}

}
