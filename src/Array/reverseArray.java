package Array;

public class reverseArray {
	public static void reverse(int[] arr, int low, int high){
		while(low <= high){
			int temp = arr[high];
			arr[high] = arr[low];
			arr[low] = temp;
			low++;
			high--;
		}
	}
	public static void main(String[] args){
		int[] arr = {4,5,1,2};
		reverse(arr,0,arr.length-1);
		for(int i =0;i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
