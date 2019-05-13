import java.math.*;

class factorial{

	public static void main(String []args){
		
		System.out.println("Test Java");
		BigInteger bi1 = BigInteger.ONE; 
		BigInteger iVal;
		for(int i=1; i <= 30 ; i++){
			iVal= BigInteger.valueOf(i);
			bi1 = bi1.multiply(iVal);
		}
		
		System.out.println(bi1);

		
	}

}
//https://webcache.googleusercontent.com/search?q=cache:nEi2Nv52iDUJ:https://www.hackerrank.com/challenges/extra-long-factorials+&cd=1&hl=en&ct=clnk&gl=sg
