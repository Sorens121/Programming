package ArrayRotation;

public class SearchSortedRotated {
	
	public static int bsearch(int[] arr, int low, int high, int key){
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int key = 2;
		int index = bsearch(arr, 0, arr.length-1, key);
		System.out.print("Found at index "+ index);
	}
}
