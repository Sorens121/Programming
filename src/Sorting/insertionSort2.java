package Sorting;

public class insertionSort2 {
	public static void sort(int[] arr){
		for(int i =1;i < arr.length;i++){
			int j, val = arr[i];
			for(j = i-1; j >=0;j--){
				if(arr[j] <= val)
					break;
				arr[j+1] = arr[j];
			}
			arr[j+1] = val;
		}
	}
	public static void main(String[] args){
		int[] arr = {4,3,2,10,12,1,5,6};
		sort(arr);
		for(int i =0;i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
