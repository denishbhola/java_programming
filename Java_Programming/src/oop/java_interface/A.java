package oop.java_interface;

import sun.applet.Main;

//class A implements I1,I2,I3,I4{
class A implements I4{
	
	 public void add()
	 {
		 System.out.println("addition of two numbers");
	 }
	 
	public  void sub()
	 {
		 System.out.println("subtraction of two numbers");
	 }
	 
	  public void mul()
	 {
		 System.out.println("multiplication of two numbers");
	 }
	 
	  public void div()
	 {
		 System.out.println("division of two numbers");
	 }
	 
	public static void main(String args[])
	{
		A a = new A();
		a.add();
		a.sub();
		a.mul();
		a.div();
		
		I1 a1 = new I1(){
			public void add(){}
			public void sub(){}
			public void div(){}
			public void mul(){}
		};
	}
	 
	

} 
