package weeks1;

public class Lcm {
	public static int findGcd(int a, int b){
		if(a == 0)
			return b;
		if(b == 0)
			return a;
		
		int x = a % b;
		a = b;
		b = x;
		return findGcd(a,b);
	}
	public static int findLcm(int a, int b){
		return (a * b) / findGcd(a,b);
	}
	
	public static void main(String[] args){
		int a = 270, b = 192;
		int res = findLcm(a, b);
		System.out.print(res);
	}
}
