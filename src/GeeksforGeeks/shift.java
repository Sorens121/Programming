package GeeksforGeeks;

public class shift {
	public static void shiftright(int[] arr, int low, int high){
		int temp = arr[high];
		for(int i = high;i > 0;i--){
			arr[i] = arr[i-1];
		}
		arr[low] = temp;
	}
	
	public static void print(int[] arr){
		for(int i =0;i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args){
		int[] arr ={1,2,3,4,5};
		shiftright(arr, 0, arr.length-1);
		print(arr);
	}
}
