package GeeksforGeeks;

import java.math.BigInteger;

public class bigInteger {
	public static void main(String[] args){
		BigInteger A, B;
		int a = 54;
		int b = 23;
		A = BigInteger.valueOf(a);
		B = BigInteger.valueOf(b);
		BigInteger C = A.add(B);
		BigInteger D = A.multiply(B);
		BigInteger E = A.add(B.multiply(C));
		System.out.println(C);
		System.out.println(D);
		System.out.println(E);
	}
}
