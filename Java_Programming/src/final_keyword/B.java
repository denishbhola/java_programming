package final_keyword;

class A{
// We can't inherit Final class 
	public final void add(){
		System.out.println("I am From Add");
	}
}

public class B extends A{
	
	// public void add(){}  We Can't override Final Method
	
	public static void main(String[] args) {
		B b = new B();
		b.add();
	}
}
