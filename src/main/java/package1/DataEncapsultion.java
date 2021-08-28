package package1;

import java.lang.invoke.ConstantCallSite;

public class DataEncapsultion {
	
	
	  
	   Object x;
       Object y;
       Object sum;
        
 // Integer // wrapper class
       
       // int // int
  
	Object sum()
    {
    	
		 
    	
		if(x instanceof Integer && y instanceof Integer){
			int newx=(Integer)x;
		    int newy=(Integer)y;
    		sum=newx+newy;
		}	
    	else if (x instanceof Double&&y instanceof Double) {
    	
    		double newdx=(double)x;
		    double newdy=(double)y;
    		sum=newdx+newdy;
    		 
    	}
    		
    	return sum;
    
     }
  
   
    int sum(int t,int m)
    {
       	
   	  return t+m;
       
    }
   
    
    double sum(double t,double m)
    {
       	
   	  return t+m;
       
    }
   DataEncapsultion(){
		  
		  
   }
 
   DataEncapsultion(int w,int o){
	 
	      x=w;
	 
	  
	      y=o;
	  
  }
  
 

  DataEncapsultion(double t,double m){
	  
	  x=t;
	  y=m;
/*
  newx  = Double.valueOf(x);
  newy= Double.valueOf(y);
    newx=t;
    newy=m;
    */
	  
  }
 
public static void main(String [] args)
{
	
	DataEncapsultion d1=new DataEncapsultion();
	
	DataEncapsultion d2=new DataEncapsultion(5,6);
   System.out.println(d2.x+","+d2.y);
	
    System.out.println(d2.sum());
	
	DataEncapsultion d3=new DataEncapsultion(12.5,6.25);
	////////////////////////////////////////////////////////////
/*	System.out.println(d1.x+","+d1.y);
	
    System.out.println(d1.sum(d1.x,d1.y));*/
  //////////////////////////////////////////////////////////////////////////// 
     
   /////////////////////////////////////////////////////////////////////////////////// 
    System.out.println(d3.x+","+d3.y);
	
    System.out.println(d3.sum());
}
}
