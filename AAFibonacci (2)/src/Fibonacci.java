
public class Fibonacci {

	public static int numOps;
	public static void main(String[] args) {
		int n = 128;
		//long result1 = fib1(n);
		long result2 = fib2(n);
//		System.out.println("the " + n + "th fib number is " + result1);
//		System.out.println("the number of operations is " + numOps);
		
		System.out.println("the " + n + "th fib number is " + result2);
		System.out.println("the number of operations is " + numOps);

	}
	//recursive version of calculating fibonacci's number
	public static long fib1(int digit){
		if (digit == 0) {
			numOps++;
			return 0;
		}
		if (digit == 1){
			numOps++;
			return 1;
		}
		else{
			numOps += 3;
			return fib1(digit-1)+fib1(digit-2);
		}
	}
	
	//iterative version 
		//create array, set each equal to the previous two values
	public static long fib2(int n){
		numOps++;
		int[] f = new int[n+1];
		numOps++;
		f[0] = 0;
		numOps++;
		f[1] = 1;
		numOps++;
		for(int i = 2; i <= n; i++){
			numOps++;
			numOps++;
			numOps++;
			numOps++;
			f[i] = f[i-1] + f[i-2];
		}
		
		numOps++;
		return f[n];
	}
	public static long fib3 (int n){
		return n; //same as fib2 but without array
	}
}
