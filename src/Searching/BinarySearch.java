package Searching;

public class BinarySearch {
	public static int search(int[] arr, int low, int high, int key){
		while(high - low > 1){
			int mid = low + (high - low)/2;
			if(arr[mid] > key){
				high = mid;
			}else{
				low = mid;
			}
		}
		if(arr[low] == key){
			return low;
		}
		return -1;
	}
	public static void main(String[] args){
		int[] arr = {1,3,5,6,10,23};
		int key = 0;
		int res = search(arr,0,arr.length,key);
		System.out.println("Found at index "+res);
	}
}
