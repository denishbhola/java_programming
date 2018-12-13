package oop.abstractclass;

public class Test extends AbstractTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t = new Test();
		
		System.out.println(t.name);
		System.out.println(t.age);
		t.add();
		t.div();
		t.sub();

	}

	@Override
	void div() {
		// TODO Auto-generated method stub
		System.out.println("I am Div Method");
	}

}
