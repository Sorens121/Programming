package Sorting;

public class rotatedPairSum {
	public static boolean findPair(int[] arr, int sum){
		int n = arr.length;
		int index = findPivot(arr, 0, n -1);
		int high = index;
		int low = (index + 1) % n;
		
		while(low != high){
			if(arr[low] + arr[high] == sum){
				System.out.println(arr[low]+","+ arr[high]);
				return true;
			}
			
			if(arr[low] + arr[high] > sum){
				high = (high + n - 1) % n;
			}else{
				low = (low + 1) % n;
			}
		}
		return false;
	}
	public static int findPivot(int[] arr, int low, int high){
		if(low > high){
			return 0;
		}
		if(low == high){
			return low;
		}
		int mid = (high + low)/2;
		if(low < mid && arr[mid -1] > arr[mid]){
			return mid -1;
		}
		if(mid < high && arr[mid] > arr[mid +1]){
			return mid;
		}
		if(arr[low] >= arr[mid]){
			return findPivot(arr,low, mid -1);
		}
		return findPivot(arr, mid+1,high);
	}
	
	public static void main(String[] args){
		int[] arr = {11,15,6,8,9,10};
		boolean res = findPair(arr, 11);
		if(res){
			System.out.println("Found pair");
		}else{
			System.out.println("Not Found.");
		}
		int index = findPivot(arr, 0, arr.length-1);
		System.out.print("Pivot is "+arr[index]);
	}
}
