package oop.static_control_flow;

class Addition
{
	Addition()
	{
		System.out.println("addition of two numbers");
	}
	
	void add()
	{
		System.out.println("please add two numbers");
	}
	{
		System.out.println("first instance block");
	}
}

public class Static_ControlFlow extends Addition
{
	
	static
	{
		System.out.println("first static block");
	}
	
	{
		System.out.println("second instance block");
	}
	
	{
		System.out.println("third static block");
	}
	
	static
	{
		System.out.println("second static block");
	}
	public static void main(String args[])
	{
		Static_ControlFlow s = new Static_ControlFlow();
		
	}
}
