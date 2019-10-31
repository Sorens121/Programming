package Array;

public class arrangePosNev {
	/*
	public static void quickSort(int[] arr, int low, int high){
		if(low < high){
			int pivot = partition(arr,low, high);
			quickSort(arr,low,pivot-1);
			quickSort(arr,pivot+1,high);
		}
	}
	*/
	public static void swap(int[] arr, int x, int y){
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	public static void partition(int[] arr, int low, int high){
		//int pivot = arr[low];
		int i = -1;
		for(int j = low;j < high;j++){
			if(arr[j] < 0){
				i++;
				swap(arr,i,j);
			}
		}
		//System.out.println(i);
		//swap(arr,i+1,high);
		//return i+1;
		
		int pos = i+1, neg = 0;
		while(pos < arr.length && neg < pos && arr[neg] < 0){
			swap(arr,neg,pos);
			pos++;
			neg += 2;
		}
	}
	public static void main(String[] args){
		int[] arr = {-1,2,-3,4,5,6,-7,8,9};
		partition(arr,0,arr.length-1);
		for(int i =0;i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
