package GeeksforGeeks;

public class shiftZero {
	public static void shift(int[] arr){
		int n = arr.length;
		int count = 0;
		for(int i =0;i < n;i++){
			if(arr[i] != 0){
				arr[count++] = arr[i];
			}
		}
		while(count < n){
			arr[count] = 0;
			count++;
		}
	}
	public static void main(String[] args){
		int[] arr = {1,9,8,4,0,0,2,7,0,6,0,9};
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		shift(arr);
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
