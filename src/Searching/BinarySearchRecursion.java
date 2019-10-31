package Searching;

public class BinarySearchRecursion {
	public static int search(int[] arr, int low, int high, int key){
		if(high >= low){
			int mid = low + (high - low)/2;
			if(arr[mid] == key){
				return mid;
			}
			if(arr[mid] > key){
				return search(arr,low,mid-1,key);
			}else{
				return search(arr,mid+1,high,key);
			}
		}
		return -1;
	}
	public static void main(String[] args){
		int[] arr = {1,3,4,5,10,12,15};
		int key = 1;
		int res = search(arr,0, arr.length-1,key);
		System.out.println("Found at index "+res);
	}
}
