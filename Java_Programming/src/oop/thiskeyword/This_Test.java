package oop.thiskeyword;

class A
{
	String name="Webtek";
	int id=1;
	
	A()
	{
		System.out.println("I am Parent COnst");
	}
	
	void first()
	{
		System.out.println("first method");
	}
	
	void second()
	{
		System.out.println("second method");
	}
	
}
public class This_Test extends A

{
	String name_1="Denish";
	int id_1 =30;
	
	String customer_name;
	int customer_id;
	
	String customerDetails(String customer_name, int customer_id)
	{
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		
		return customer_name+"  "+customer_id;
	}

	public This_Test() {
		// TODO Auto-generated constructor stub
		System.out.println("Child Class Const");
	}
	
	
	void add(){
		
		this.first();
		this.second();
		System.out.println(this.name);
		System.out.println(this.name_1);
		System.out.println(this.id);
		System.out.println(this.id_1);
		System.out.println("I am Add Function...");
	}
	
	public static void main(String[] args) {
		
		This_Test ob = new This_Test();
		
		//ob.add();
		//ob.first();
		//ob.second();
		//System.out.println(ob.name_1);
		//System.out.println(ob.name);
		//System.out.println(ob.id_1);
		//System.out.println(ob.id);
		
		System.out.println(ob.customerDetails("Webtek",0010));
		System.out.println(ob.customer_id+"   "+ob.customer_name);
	}

}
