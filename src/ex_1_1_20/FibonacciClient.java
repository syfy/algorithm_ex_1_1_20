package ex_1_1_20;

public class FibonacciClient {

	
	public static long[] fib(int i){
		
		long[] fib = new long[i];
		fib[0] = 0;
		fib[1] = 1;
		fib[2] = 2;
				
		if(i>2){
			for(int x = 1; x<i-2 ;x++){
				fib[x+2] = Math.abs(fib[x])+Math.abs(fib[x+1]);
			}
		}
		
		return fib;
		
	}
	
	public static void main(String[] args) {

		for(long t : fib(99)){
			System.out.print(" " + t);
		}
		
	}

}
