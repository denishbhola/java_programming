package oop.abstractclass;

public abstract class AbstractTest {
	String name = "My Name";
	static int age = 20;
	
	public AbstractTest() {
		// TODO Auto-generated constructor stub
		System.out.println("I am Abstract Class Const.");
	}
	
	void add(){
		System.out.println("I am Add Method");
	}
	
	abstract void div();
	
	static
	{
		System.out.println("Static BLock");
	}
	
	void sub(){
		System.out.println("I am Sub Method");
	}
	
	static void mul(){
		System.out.println("I am Multiply Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mul();
		System.out.println(age);
		
		/*
		 * AbstractTest a = new AbstractTest() {
		 
			
			@Override
			void div() {
				// TODO Auto-generated method stub
				System.out.println("I am Div Method");
			}
		};
		
		a.div();
		
		System.out.println(a.name);
		System.out.println(a.age);
		*/
	}

}
