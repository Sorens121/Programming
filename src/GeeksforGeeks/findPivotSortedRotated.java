package GeeksforGeeks;

public class findPivotSortedRotated {
	public static int findPivot(int[] arr,int low,int high){
		if(low == high)
			return low;
		int mid = (low + high)/2;
		if(arr[mid] > arr[mid+1])
			return mid;
		if(arr[mid] < arr[mid-1])
			return mid-1;
		if(arr[low] <= arr[mid])
			return findPivot(arr,mid+1,high);
		return findPivot(arr,low,mid-1);
	}
	public static void main(String[] args){
		//int[] arr = {2,3,4,5,0,1};
		int[] arr = {1,2,3,4,5};
		int index = findPivot(arr,0,arr.length-1);
		System.out.println("Index:" +index+" "+arr[index]);
	}
}
