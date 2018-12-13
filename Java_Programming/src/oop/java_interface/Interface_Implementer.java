package oop.java_interface;

class Iterface_Implementer implements Interface_First{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("I am ADD");
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("I am Sub");
	}
	
	public static void main(String[] args) {
		Iterface_Implementer i = new Iterface_Implementer();
		
		i.add();
		i.sub();
		// name = "My Name is Rahul";
		System.out.println(i.name);
	}
}
