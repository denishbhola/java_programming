package java_array;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	byte b = 10;
		//char c = 'A';
	//	int students [] = new int[c];
		int students [] = new int[10];
		students[0] = 1;
		students[1] = 2;
		students[2] = 3;
		students[3] = 4;
		students[4] = 5;
		students[5] = 6;
		students[6] = 7;
		students[7] = 8;
		students[8] = 9;
		students[9] = 10;
		
		
		for(int i=0;i<=9;i++){
			System.out.println(students[i]);
		}
		
		int a[] = {1,2,3,4,5};
		
		for(int i=0;i<=4;i++){
			System.out.println(a[i]);
		}
		
		System.out.println(students.length);
		

	}

}
