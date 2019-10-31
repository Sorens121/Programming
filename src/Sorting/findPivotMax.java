package Sorting;
// array has increating and then decreasing trend

public class findPivotMax {
	public static int findPivot(int[] arr, int low, int high){
		if(low > high){
			return -1;
		}
		if(low == high){
			return low;
		}
		// if the array has only two elements
		if(high == low + 1 && arr[low] >= arr[high]){
			return low;
		}
		if(high == low +1 && arr[high] >= arr[low]){
			return high;
		}
		
		int mid = (high + low)/2;
		if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid -1]){
			return mid;
		}
		
		if(arr[mid] > arr[mid+1] && arr[mid] < arr[mid -1]){
			return findPivot(arr,low, mid-1);
		}
		else{
			return findPivot(arr,mid+1,high);
		}
	}
	public static void main(String[] args){
		 //int[] arr = {2,4,6,8,10,3,1}; //-> pivot lies on right of mid
		//int[] arr = {3,50,10,9,7,6}; // -> pivot lies on left of mid
		//int[] arr = {1,2,3,4,5}; // -> strictly increasing
		int[] arr = {5,4,3,2,1}; // -> strictly decreasing
		
		int index = findPivot(arr, 0, arr.length -1);
		System.out.println("Pivot is "+arr[index]);
	}
}
