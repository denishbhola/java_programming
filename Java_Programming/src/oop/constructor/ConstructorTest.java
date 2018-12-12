package oop.constructor;

class A {

	A() {
	
		System.out.println("HJiiiii Constr");
	}
}
public class ConstructorTest extends A
	{
		ConstructorTest(int a )
		{
			System.out.println("second constructor");
		}
		ConstructorTest(float b)
		{
			System.out.println("third constructor");
		}
		public static void main(String args[])
		{
			ConstructorTest C = new ConstructorTest(10);
			ConstructorTest C1 = new ConstructorTest(10.0056f);
			
		}
	}












