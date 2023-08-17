import java.util.Iterator;

public class ArraysByExample {
	
/**
	data_type[] arr; //declare only
	data_type []arr; //declare only
	data_type arr[]; //declare only
	data_type[] arr = new data_type[size] //declare and instantiate
	data_type[] arr = {val1, val2, val3....} //declare, instantiate, initialize
	arr[index] = value //initialization | assigning value to an array element
*/
	
	public static void main(String[] args) {
//		//decalre
//		int[] ia1;
//		int []ia2;
//		int ia3[];
//		
//		int[] arr10 = new int[10]; // declare and instantiate
//		arr10[0] = 12; //assignments
//		System.out.println(arr10[0]);
//		arr10[9] = 14124;
//		System.out.println(arr10[9]);
////		arr10[10] = 14124;
////		arr10[-12] = 123;
//		
//		int[] arr5 = {1,2,3,4,5}; // declare and initialize
////		System.out.println(arr5[0]);
////		System.out.println(arr5[4]);
////		System.out.println(arr5[5]);
//		
//		for (int i = 0; i < arr5.length; i++) {
//			System.out.println(arr5[i]);
//		}
//		
//		
//		int[][] arr2d = new int[3][2]; // 3x2
//		arr2d[0][0] = 123;
//		System.out.println(arr2d[0][0]);
//		arr2d[2][1] = 14432;
//		System.out.println(arr2d[2][1]);
////		arr2d[2][13] = 14432;
//		
//		int[][] arr2d2 = {{1,2,3,4}, 
//						  {5,6,7,8}, 
//						  {9,0,0,0}}; //3x2
////		System.out.println(arr2d2[0][0]);
////		System.out.println(arr2d2[2][1]);
////		System.out.println(arr2d2[1][2]);
//
//		for (int i = 0; i < arr2d2.length; i++) {
//			for (int j = 0; j < arr2d2.length; j++) {
//				System.out.print(arr2d2[i][j] + "");
//			}
//			System.out.println();
//		}		
		
		
		int[] arrads = {1,2,3,4,5}; // declare and initialize
		System.out.println(sum(arrads));

	}
	
	
	public static int sum(int[] values) {
		int s = 0;
		for (int i = 0; i < values.length; i++) {
			s = s + values[i];
		}
		return s;
	}
	
	
//	public static void main(String []args) {
//		
//	}
//	
//	public static void main(String args[]) {
//		
//	}

}
