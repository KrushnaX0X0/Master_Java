package Array;

public class BasicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,23,3,42,45,34,12,14,15,16,10}; 
		
		int[] marks ;
		
		marks = new int[5];
//		System.out.println(marks);
		
//		for(int i=0; i < arr.length ; i++) {
//			System.out.println(arr[i]);
//		}
		
		for(int ele : arr) {
			System.out.println(ele);
		}

		
		
	}

}
