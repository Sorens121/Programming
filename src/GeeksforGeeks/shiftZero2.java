package GeeksforGeeks;

public class shiftZero2 {
	public static void swap(int[] arr, int x, int y){
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	
	public static void shift(int[] arr,int n){
		int count = -1;
		for(int i =0;i < n;i++){
			if(arr[i] != 0){
				count++;
				swap(arr,i,count);
			}
		}
	}
	
	public static void main(String[] args){
		//int[] arr = {1,2,0,0,0,3,6};
		int[] arr = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		shift(arr,arr.length);
		for(int i =0;i < arr.length ;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
