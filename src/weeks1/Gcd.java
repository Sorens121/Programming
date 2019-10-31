package weeks1;

public class Gcd {
	
	public static int findGcd(int a, int b){
		if(a == 0)
			return b;
		if(b == 0)
			return a;
		int x = a % b;
		a = b;
		b = x;
		return findGcd(a, b);
	}
	
	public static void main(String[] args){
		int a = 12, b = 3;
		int res = findGcd(a,b);
		System.out.print(res);
	}
}
