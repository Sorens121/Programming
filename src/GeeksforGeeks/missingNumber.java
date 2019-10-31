package GeeksforGeeks;

public class missingNumber {
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,7,8};
		int n = arr.length;
		int sum = 0;
		for(int i=0;i < n;i++){
			sum += arr[i];
		}
		int sum_n = (n+1)*(n+2)/2;
		int missNo = sum_n - sum;
		System.out.println("Missing no is "+missNo);
	}
}

//1.88