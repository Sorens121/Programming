package GeeksforGeeks;

public class searchRotated2 {
	public static int search(int[] arr, int low, int high,int key){
		int mid = low + (high - low)/2;
		if(low > high)
			return -1;
		if(arr[mid] == key)
			return mid;
		
		if(arr[low] <= arr[mid]){ // searching left of mid sorted array
			if(arr[low] < key && arr[mid] > key)
				return search(arr,low,mid-1,key);
			return search(arr,mid+1,high,key);
		}
		if(arr[high] < key && arr[mid] > key)
			return search(arr,mid+1,high,key);
		return search(arr,low,mid-1,key);
	}
	public static void main(String[] args){
		int[] arr = {4,5,6,7,8,9,1,2,3};
		int key = 1;
		int index = search(arr,0,arr.length-1,key);
		if(index != -1){
			System.out.println("Found at index "+index);
		}else{
			System.out.println("Not Found.");
		}
	}
}
