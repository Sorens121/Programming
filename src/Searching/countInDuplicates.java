package Searching;

public class countInDuplicates {
	public static int floorRight(int[] arr, int low, int high,int key){
		while(high - low > 1){
			int mid = low +(high - low)/2;
			if(arr[mid] <= key){
				low = mid;
			}else{
				high = mid;
			}
		}
		return low;
	}
	
	public static int floorLeft(int[] arr, int low, int high,int key){
		while(high - low > 1){
			int mid = low +(high - low)/2;
			if(arr[mid] >= key){
				high = mid;
			}else{
				low = mid;
			}
		}
		return high;
	}
	public static int count(int[] arr,int key){
		int size = arr.length;
		int left = floorLeft(arr,-1,size-1,key);
		int right = floorRight(arr,0,size,key);
		int counter = (arr[left] == key && arr[right] == key ? (right - left +1):0);
		return counter;
	}
	public static void main(String[] args){
		int[] arr = {1,3,3,4,4,4,5,6,7};
		int res = count(arr,3);
		System.out.println("Count is "+res);
	}
}
