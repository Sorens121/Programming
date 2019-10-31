package GeeksforGeeks;

public class decreasingSearch {
	public static int search(int[] arr, int low, int high, int key){
		int mid = low + (high - low)/2;
		if(low > high)
			return -1;
		if(low == high)
			return low;
		if(arr[mid] == key)
			return mid;
		
		if(arr[mid] < key){
			return search(arr,low,mid-1,key);
		}
		return search(arr,mid+1,high,key);
	}
	public static void main(String[] args){
		int[] arr ={7,6,5,4,3,2,1};
		int key = 2;
		int index = search(arr,0,arr.length-1,key);
		System.out.println(index);
	}
}
