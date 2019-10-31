package ArrayRotation;

public class cyclicRotateOnebyOne {
	
	public static void rotate(int[] arr) {
		// store last element in temp
		int n = arr.length;
		int temp = arr[n-1];
		for(int i = n-1 ; i > 0 ; i--){
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
		// shift all elements by one
		// replace first element by temp
	}
	
	public static void displayArr(int[] arr) {
		for(int i =0;i< arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		rotate(arr);
		displayArr(arr);
	}
}
