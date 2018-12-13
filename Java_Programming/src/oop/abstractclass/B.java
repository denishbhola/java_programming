package oop.abstractclass;

abstract class A
{
	abstract void add();
	
	abstract void sub();
	
}
abstract public class B extends A{

	void add(){
		System.out.println("I am ADD");
	}
}

class C  extends B{

	@Override
	void sub() {
		// TODO Auto-generated method stub
		
	}
	
}
