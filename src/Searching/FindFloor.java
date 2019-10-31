package Searching;

public class FindFloor {
	public static int searchFloor(int[] arr, int low, int high, int key){
		while(high -low > 1){
			int mid = low +(high - low)/2;
			if(arr[mid] <= key){
				low = mid;
			}else{
				high = mid;
			}
		}
		return arr[low];
	}
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,8,9,10};
		int key = 7;
		int floor = searchFloor(arr,0,arr.length,key);
		System.out.println("Floor value is "+floor);
	}
}
