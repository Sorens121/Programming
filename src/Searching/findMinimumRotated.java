package Searching;

public class findMinimumRotated {
	public static int findmin(int[] arr, int low, int high){
		if(low > high){
			return -1;
		}
		while(low <= high){
			if(low == high){
				return low;
			}
			int mid = low +(high - low)/2;
			if(arr[mid] <= arr[high] && mid < high){
				high = mid;
			}else{
				low = mid + 1;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		//int[] arr = {6,7,8,9,1,2,3,4,5};
		//int[] arr = {2,1,2,2,2,2};
		int[] arr = {2,2,2,2,2,1,2};
		int index = findmin(arr,0,arr.length -1);
		System.out.println("The minimum is "+arr[index]+" at index "+index);
	}
}
