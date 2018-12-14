package java_array;

public class ArrayTest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [][] = new int[5][];
		a[0] = new int[5];
		a[1] = new int[6];
		a[2] = new int[7];
		a[3] = new int[8];
		a[4] = new int[9];
		a[5] = new int[10];
		
		
		int a1 [][][] = new int[5][][];
		
		a1[0] = new int[2][];
		a1[0][0] = new int[4];
		a1[0][1] = new int[2];
		
		
		System.out.println(a[1].length);

	}

}
