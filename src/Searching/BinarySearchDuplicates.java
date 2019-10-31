package Searching;

public class BinarySearchDuplicates {
	public static int search(int[] arr, int low, int high,int key){
		while(high - low > 1){
			int mid = low +(high - low)/2;
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
		int[] arr ={ 1,4,4,4,4,5,6};
		int key = 4;
		int res = search(arr,0,arr.length, key);
		System.out.println("Found at index "+res);
	}
}
