package Sorting;

public class insertionSort {
	
	public static void insertionSort(int[] arr, int n){
		for(int i = 1;i < n;i++){
			int start = arr[i];
			int j = i -1;
			while(j >= 0 && arr[j] > start){
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = start;
		}
	}
	public static void printArray(int[] arr){
		for(int i =0;i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args){
		int[] arr = {4,3,2,10,12,1,5,6};
		int t = 1;
		while(t-- > 0){
			//shift(arr,0,arr.length-1);
			insertionSort(arr,arr.length);
			printArray(arr);
		}
	}
}
