package ArrayRotation;

public class reversalArray {
	// rotate function
	public static void rotate(int[] arr, int d) {
		int n = arr.length;
		reverse(arr,0,d-1);
		//printArray(arr);
		reverse(arr,d,n-1);
		//printArray(arr);
		reverse(arr,0,n-1);
		//printArray(arr);
	}
	// reverse function
	public static void reverse(int[] arr, int l, int r) {
		while(r > l){
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			r--;
			l++;
		}
	}
	
	// print utility function
	public static void printArray(int[] arr){
		for(int i = 0 ;i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		int[] arr = {1,2,3,4};
		int d = 2;
		//reverse(arr);
		rotate(arr,d);
		printArray(arr);
	}
}
