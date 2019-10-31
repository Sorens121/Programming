package Array;

public class findClosest {
	public static void find(int[] arr, int x){
		int n = arr.length;
		int l = 0, r = n-1;
		int res_l = 0, res_r = 0;
		int diff = Integer.MAX_VALUE;
		while(l < r){
			if(Math.abs(arr[l] + arr[r] - x) < diff){
				res_l = l;
				res_r = r;
				diff = Math.abs(arr[l] + arr[r] - x);
			}
			
			if(arr[l] + arr[r] > x){
				r--;
			}else{
				l++;
			}
		}
		
		System.out.print(arr[res_l]+" and "+arr[res_r]);
	}
	
	public static void main(String[] args){
		int[] arr = {10,22,28,29,30,40};
		int x= 54;
		find(arr,x);
	}
}
