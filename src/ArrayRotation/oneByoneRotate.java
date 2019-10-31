package ArrayRotation;

public class oneByoneRotate {
	public static void rotate(int[] arr, int d){
		for(int i = 0;i < d;i++){
			leftrotate(arr);
		}
	}
	public static void leftrotate(int[] arr) {
		int i, temp = arr[0];
		for(i = 0; i< arr.length-1;i++){
			arr[i] = arr[i+1];
		}
		arr[i] = temp;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int d = 3;
		rotate(arr, d);
		for(int i =0;i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
