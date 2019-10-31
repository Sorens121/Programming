package Sorting;

public class QuickSort {
	public static void quicksort(int[] arr,int low, int high){
		if(low < high){
			int pivot = partition(arr,low,high);
			//System.out.println("pivot "+arr[pivot]);
			quicksort(arr,low,pivot-1);
			quicksort(arr,pivot+1,high);
		}
	}
	
	public static void swap(int[] arr,int x, int y){
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	
	public static int partition(int[] arr, int low, int high){
		int pivot = arr[high];
		int i = low - 1;
		for(int j = low;j < high;j++) {
			if (arr[j] <= pivot) {
				i++;
				swap(arr,i,j);
				/*
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				*/
			}
		}
			swap(arr,i+1,high);
		/*
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		*/
		return i+1;
	}
	
	public static void main(String[] args){
		int[] arr = {3,4,1,2,7};
		quicksort(arr,0,arr.length-1);
		
		for(int i =0;i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
