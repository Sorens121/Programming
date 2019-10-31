package GeeksforGeeks;

public class missingNumberXOR {
	public static void main(String[] args){
		int[] arr = {1,2,3,5,6};
		int n = arr.length;
		int x1 = arr[0];
		int x2 = 1;
		for(int i = 1 ;i < n;i++){
			x1 ^= arr[i];
		}
		for(int i = 2;i <= n+1;i++){
			x2 ^= i;
		}
		int miss_no = x1 ^ x2;
		System.out.println("Missing no is "+miss_no);
	}
}
