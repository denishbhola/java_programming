package final_keyword;

public class Final {

	final String name;
	static final int age;
	public Final() {
		// TODO Auto-generated constructor stub
		//name = "ABC";
		// age = 20;
	}
	{
		name = "ABC";
	}
	static{
		
		age = 35;
	}
	public static void main(String[] args) {
		
	//final String name= "ABC";
	Final f = new Final();
	System.out.println(f.name);
	System.out.println(f.age);	
		

	}

}
