package Array;

public class closestPair {
	public static void findPair(int[] a, int[] b, int x){
		int n = a.length;
		int m = b.length;
		int l = 0 , r = m-1;
		int res_l = 0, res_r = 0;
		int diff = Integer.MAX_VALUE;
		while(l < n && r >= 0){
			if(Math.abs(a[l] + b[r] - x) < diff){
				res_l = l;
				res_r = r;
				diff = Math.abs(a[l] + b[r] - x);
			}
			
			if(a[l] + b[r] < x){
				l++;
			}else{
				r--;
			}
		}
		
		System.out.println("Pairs are "+a[res_l]+" and "+b[res_r]);
	}
	public static void main(String[] args){
		int[] arr1 ={1,4,5,7};
		int[] arr2 = {10,20,30,40};
		int sum = 32;
		findPair(arr1,arr2,sum);
	}
}
