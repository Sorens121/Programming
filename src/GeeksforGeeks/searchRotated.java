package GeeksforGeeks;

public class searchRotated {
	public static int findPivot(int[] arr, int low,int high){
		int mid = low +(high - low)/2;
		if(low > high)
			return -1;
		if(low == high)
			return low;
		if(arr[mid] < arr[mid - 1])
			return mid -1;
		if(arr[mid] > arr[mid+1])
			return mid;
		if(arr[low] > arr[mid])
			return findPivot(arr,low,mid-1);
		return findPivot(arr,mid+1,high);
	}
	public static int binarySearch(int[] arr,int low, int high, int key){
		if(low > high)
			return -1;
		/*if(low == high)
			return low;
			*/
		int mid = low + (high - low)/2;
		if(arr[mid] == key)
			return mid;
		if(arr[mid] > key)
			return binarySearch(arr,low, mid-1,key);
		return binarySearch(arr,mid+1,high,key);
	}
	public static int findBinary(int[] arr,int low, int high,int key){
		int pivot = findPivot(arr,low,high);
		if(pivot == -1)
			return binarySearch(arr,low,high,key);
		if(arr[pivot] == key)
			return pivot;
		if(arr[0] <= key)
			return binarySearch(arr,0,pivot-1,key);
		return binarySearch(arr,pivot+1,arr.length-1,key);
	}
	public static void main(String[] args){
		int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		int key = 6;
		//int pivot = findPivot(arr,0,arr.length-1);
		//System.out.println("Pivot "+arr[pivot]);
		int index = findBinary(arr,0,arr.length-1,key);
		if(index != -1){
			System.out.println("Found at index : "+index);
		}else{
			System.out.println("Not Found");
		}
	}
}
