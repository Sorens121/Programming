package Sorting;

public class unsortedFindPair {
	static class mergeSort{
		int[] arr, temp;
		
		public mergeSort(int[] arr){
			this.arr = arr;
			temp = new int[arr.length];
		}
		
		public void split(int low, int high){
			if(low == high){
				return;
			}
			
			if(low < high){
				int mid = (high + low)/2;
				split(low, mid);
				split(mid+1,high);
				
				merge(low, mid, high);
			}
		}
		
		public void merge(int low, int mid, int high){
			int i = low, j = mid +1, k = low;
			
			while(i <= mid && j <= high){
				if(arr[i] <= arr[j]){
					temp[k++] = arr[i++];
				}else{
					temp[k++] = arr[j++];
				}
			}
			
			// if any of the sub array is exhausted
			while(i <= mid){
				temp[k++] = arr[i++];
			}
			
			while(j <= high){
				temp[k++] = arr[j++];
			}
			
			// replacing the origianl array with the sorted temp array.
			
			for(int temppos = low; temppos <= high; temppos++){
				arr[temppos] = temp[temppos];
			}
		}
	}
	public static boolean checksum(int[] arr, int sum){
		int i = 0, j = arr.length -1;
		while(i < j){
			if(arr[i] + arr[j] == sum){
				return true;
			}
			
			if(arr[i] + arr[j] < sum){
				i++;
			}else{
				j--;
			}
		}
		return false;
	}
	public static void display(int[] arr){
		for(int i =0;i < arr.length; i++){
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
	public static void main(String[] args){
		int[] arr = {10,9,11,38,26,15};
		display(arr);
		mergeSort obj = new mergeSort(arr);
		obj.split(0, arr.length-1);
		display(arr);
		boolean res = checksum(arr, 19);
		if(res){
			System.out.println("Found Pair.");
		}else{
			System.out.println("Pair doesn't exist.");
		}
	}
}
