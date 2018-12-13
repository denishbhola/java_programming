package oop.superkeyword;


class Person
{
	String name="Parent ";
	int age=11; 
	
	void personInfo(){
		System.out.println("Person Info");
	}
	
	void personAddress(){
		System.out.println("Person Address");
	}
	
	
}

public class Super_Test extends Person{
	String name="Child";
	int age=1;
	
	void personInfo(){
		System.out.println("Person Info Child");
	}
	
	void details(){
		super.personInfo();
		super.personAddress();
		this.personOfficeAddress();
		System.out.println(super.name);
		System.out.println(super.age);
	}
	
	void personOfficeAddress(){
		System.out.println("PErson Office Address");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super_Test s = new Super_Test();
		
		s.details();
	}

}
