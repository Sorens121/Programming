package Sorting;
// array has increasing increasing nature

public class findPivotIncInc {
	
	public static int findPivot(int[] arr, int low, int high){
		// base cases
		if(low > high){
			return -1;
		}
		if(low == high){
			return low;
		}
		// if array has only two elements
		if(high == low +1 && arr[low] >= arr[high]){
			return low;
		}
		
		if(high == low + 1 && arr[high] >= arr[low]){
			return high;
		}
		
		int mid = (high + low)/2;
		if(arr[mid] < arr[mid-1] && arr[mid] < arr[mid+1]){
			return mid -1;
		}
		
		if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]){
			// lies on right of mid
			if(arr[low] >= arr[mid]){
				return findPivot(arr, low, mid -1);
			}else {
				return findPivot(arr, mid + 1, high);
			}
		}else{
			return findPivot(arr, low, mid -1);
		}
	}
	
	public static void main(String[] args){
		// test cases
		//int[] arr = {15,18,2,3,6,12};
		//int[] arr = {7,9,11,12,5};
		//int[] arr = {7,9,11,12,5,6};
		//int[] arr = {5,1,2,3,4};
		int[] arr = {1,2,3,4,5};
		//int[] arr = {3,6};
		//int[] arr = {2,1};
		int index = findPivot(arr, 0, arr.length -1);
		System.out.println(arr[index]);
	}
}
