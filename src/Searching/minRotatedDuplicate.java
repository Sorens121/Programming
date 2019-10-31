package Searching;

public class minRotatedDuplicate {
	public static int searchMin(int[] arr, int low, int high){
		if(low > high){
			return 0;
		}
		int mid = low +(high - low)/2;
		if(mid == 0){
			if(arr[mid] > arr[mid+1]){
				return mid+1;
			}
		}else if(mid == arr.length -1){
			if(arr[mid] < arr[mid -1]){
				return mid;
			}
		}else{
			if(arr[mid] < arr[mid-1]){
				return mid;
			}
		}
		// decision making
		if(arr[mid] > arr[high]){
			return searchMin(arr,mid+1,high);
		}else if(arr[low] > arr[mid]){
			return searchMin(arr,low,mid-1);
		}else{
			int left = searchMin(arr,low, mid-1);
			int right = searchMin(arr,mid+1,high);
			if(left == 0){
				return right;
			}else {
				return left;
			}
		}
	}
	public static void main(String[] args){
		//int[] arr = {3,4,5,6,1,2}; // right side
		//int[] arr = {6,1,2,3,4,5}; // left side
		//int[] arr ={5,4,1,2,3}; // middle
		int[] arr = {1,2,3,4,5}; // start
		//int[] arr = {2,3,4,5,1}; // end
		//int[] arr = {2,1,2,2,2,2}; // left duplicates
		//int[] arr = {2,2,2,2,2,2,1,2,2}; // right duplicates
		int index = searchMin(arr,0,arr.length -1);
		System.out.println("Minimum: "+arr[index]);
		System.out.println("At Index: "+index);
	}
}


// System.out.println(mid);