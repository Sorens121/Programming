package GeeksforGeeks;
// takes O(n) space
public class arrangePosNeg {
	public static int[] shift(int[] arr, int n){
		int[] temp = new int[n];
		int count=0;
		for(int i =0;i < n;i++){
			if(arr[i] <=0){
				temp[count++] = arr[i];
			}
		}
		for(int i =0;i < n;i++){
			if(arr[i] >0){
				temp[count++] = arr[i];
			}
		}
		return temp;
	}
	
	public static void main(String[] args){
		int[] arr = {12,11,-13,-5,6,-7,5,-3,-6};
		int[] res = shift(arr,arr.length);
		for(int i =0;i < res.length;i++){
			System.out.print(res[i]+" ");
		}
	}
}
