package Sorting;

public class mergeSort2 {
	int[] arr, temp;
	
	public mergeSort2(int[] arr){
		this.arr = arr;
		temp = new int[arr.length];
		split(0,arr.length-1);
	}
	
	private void split(int low, int high){
		if(high == low){
			return;
		}
		if(low < high){
			int mid = (high + low)/2;
			split(low,mid);
			split(mid+1,high);
			
			merge(low,mid,high);
		}
	}
	
	private void merge(int low, int mid, int high){

		int i = low, j = mid+1, k = low;
		while(i <= mid && j <= high){
			if(arr[i] <= arr[j]){
				temp[k++] = arr[i++];
			}else{
				temp[k++] = arr[j++];
			}
		}
		
		while(i <= mid){
			temp[k++] = arr[i++];
		}
		
		while(j <= high){
			temp[k++] = arr[j++];
		}
		
		for(int temppos = low; temppos <= high;temppos++ ){
			arr[temppos] = temp[temppos];
		}
	}
	
	public static void display(int[] arr){
		for(int i =0;i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args){
		int[] arr = {12,11,13,5,6,7};
		System.out.print("Original Array: ");
		display(arr);
		mergeSort2 obj = new mergeSort2(arr);
		obj.split(0,arr.length -1);
		System.out.print("After Sorting: ");
		display(arr);
	}
}
