package Sorting;

public class mergeSort {
	public static void merge(int[] arr, int l, int mid, int r){
		int n = mid - l + 1;
		int m = r - mid;
		int[] L = new int[n];
		int[] R = new int[m];
		
		for(int i =0; i < n;i++){
			L[i] = arr[l + i];
		}
		for(int j =0;j < m;j++){
			R[j] = arr[mid + 1 + j];
		}
		
		// merging the arrays
		int i = 0, j =0;
		int k = l;
		while(i < n && j < m){
			if(L[i] <= R[j]){
				arr[k] = L[i];
				i++;
			}else{
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		// copying rest of the elements
		while(i < n){
			arr[k] = L[i];
			i++;
			k++;
		}
		while(j < m){
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	
	public static void mergesort(int[] arr, int l, int r){
		if(l < r) {
			int mid = (l + r) / 2;
			mergesort(arr, l, mid);
			mergesort(arr, mid+1, r);
			merge(arr, l, mid, r);
		}
	}
	
	public static void print(int[] arr){
		for(int i =0;i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args){
		//System.out.println("Hello World!");
		int[] arr = {38,27,43,3,9,82,10};
		mergesort(arr,0,arr.length-1);
		print(arr);
	}
}
