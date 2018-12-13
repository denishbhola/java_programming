package oop.constructor;

public class instance {

	instance()
	{
		System.out.println("this is first constructor");
	}
    instance(int a)
		{
			System.out.println("this is second constructor");
		}
	
	public static void main(String[] args) {
		instance i = new instance();
		instance i1 = new instance(10);
	}
		
}

	