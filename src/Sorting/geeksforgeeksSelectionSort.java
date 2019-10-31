package Sorting;

public class geeksforgeeksSelectionSort {
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		for(int i = n-1; i >= 0; i--){
			int j = select(arr,i);
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	
	public static int select(int[] arr, int i){
		int n = arr.length;
		int min = i;
		for(int j = i-1 ; j >= 0 ; j--){
			if(arr[j] > arr[min]) {
				min = j;
			}
		}
		return min;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {119, 160, 390, 947, 604, 251};
		selectionSort(arr);
		StringBuffer sb = new StringBuffer();
		for(int i =0;i < arr.length;i++){
			sb.append(arr[i]+" ");
		}
		System.out.print(sb);
	}
}
