package abstractions;

public class OrdinaryClass extends Rectangele implements InterfaceParent,InterfaceChild{

	public static void main(String[] args) {
		
		
		// can not take instance from interfaces
		     //InterfaceParent tc=new InterfaceParent();
		
		// can not take instance from interfaces
		       //  InterfaceParent tc1=new InterfaceChild();
		
		// no relation
		      //InterfaceParent tc2=new Rectangele();
		
		
		// no relation
		           //InterfaceChild	 tc2=new Rectangele();
		
		// applied polymerpthim
		
		InterfaceChild tc3=new OrdinaryClass();
		
		System.out.println(tc3.calculateradius());
		System.out.println(tc3.calculateArea());
		  tc3.printHello();
		// applied  polymerpthim
		
		InterfaceParent tc4=new OrdinaryClass();
		
		System.out.println(tc4.calculateradius());
		
		System.out.println(tc4.calculateArea());
		// applied  polymerpthim
		
		Rectangele TC=new OrdinaryClass();
		
		System.out.println(TC.calculateradius());
		System.out.println(TC.printH());
		////////////////////////////////////////////
		
		Rectangele TC22=new Rectangele();
		
		System.out.println(TC22.calculateradius());
		///////////////
		
		
		
		OrdinaryClass oc=new OrdinaryClass();
		System.out.println(oc.calculateradius());

	}

	@Override
	public void printHello() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateradius() {
		// TODO Auto-generated method stub
		return (x+y)*3;
	}

}
