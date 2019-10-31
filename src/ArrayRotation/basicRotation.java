package ArrayRotation;

public class basicRotation {
	public static int[] rotate(int[] arr, int d) {
		int[] temp = new int[d];
		for(int i =0;i < temp.length; i++){
			temp[i] = arr[i];
		}
		
		for(int j = d; j < arr.length;j++){
			arr[j-d] = arr[j];
		}
		
		for(int k = arr.length - d, m = 0;k < arr.length && m < d; k++,m++){
			arr[k] = temp[m];
		}
		
		return arr;
	}
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7};
		int d = 2;
		int[] res = rotate(arr,d);
		for(int i =0;i < res.length;i++){
			System.out.print(res[i]+" ");
		}
	}
}
