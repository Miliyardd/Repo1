
import java.util.Random;
//import java.util.Formatter;

public class Test {

	public static void main(String[] args) {
	
		double[] arr = {19,12.89,16.5,200,13.7};
		double sum = 0.0;
		for(int i = 0; i < arr.length; i++){ 
			sum += arr[i];
		}
		double av = sum/arr.length;
		System.out.format("The average is: %.3f", av);
		
	}
	
	static int isPerfectSquare(int n) { 
	    int m = (int)Math.floor(Math.sqrt(n)) + 1; 
	  
	    return m*m; 
	
	}
	
	static int a6(int[] a)
	{
	 if (a.length < 3) return -1;
	 int i = 0;
	 int j = a.length - 1;
	 int idx = 1;
	 int leftSum = a[i];
	 int rightSum = a[j];
	 for (int k = 1; k < a.length - 2; k++)
	 {
	 if (leftSum < rightSum)
	 {
	i++;
	leftSum += a[i];
	idx = i + 1;
	 }
	 else
	 {
	j--;
	rightSum += a[j];
	idx = j - 1;
	 }
	 }
	 if (leftSum == rightSum)
	 return idx;
	 else
	 return -1;
	}
	
	
	//question number five
	static int[] a5(int[] first, int[] second)
	 {
	 if (first == null || second == null) return null;
	 if (first.length == 0 || second.length == 0) return new int[0];
	 int min =
	(first.length < second.length) ? first.length : second.length;
	 int[] a,b;
	 
	 if (min == first.length)
	 {
	a = first;
	b = second;
	 }
	 else
	 {
	a = second;
	b = first;
	 }
	 int[] c = new int[min];
	 int k = 0;
	 for (int i = 0; i < a.length; i++)
	for (int j = 0; j < b.length; j++)
	 if (a[i] == b[j])
	 {
	 c[k] = a[i];
	 k++;
	 }
	 
	 int[] retArray = new int[k];
	 for (int t = 0; t < retArray.length; t++)
	retArray[t] = c[t];
	 return retArray;
	}
	
	
	static int a4(int n)
	 {
	int sign = 1;
	if (n == 0) return 0;
	if (n < 0)
	{
	 sign = -1;
	 n = -n;
	}
	int reverse = 0;
	while (n != 0)
	{
	 reverse = (reverse * 10) + (n % 10);
	 System.out.println(reverse);
	 n /= 10;
	}
	return sign * reverse;
	 }

	static char[] f1(char[] a, int start, int length) {
		if(start < 0 || length < 0 || start + length -1 >= a.length) { 
			return null;
		}
		
		char[] sub = new char[length];
		for(int i = start, j = 0; j < length; i++,j++) {
			sub[j]= a[i];
	
		}
		return sub;
	}
	
	
	static int f(int[] a) {
		int sumEven = 0;
		int sumOdd = 0;
		
		for(int i=0; i< a.length; i++) {
			if(a[i]%2 == 0) 
				sumEven += a[i];
				else
					sumOdd += a[i];
			}
			
				return sumOdd - sumEven;
	}
	
	
	
	
	static int al(int[] x) {
		if(x == null || x.length%2 == 0) return 0;
		int midIndex = x.length/2;
		int midItem = x[midIndex];
		for(int i= 0; i < x.length; i++) 
		{
			
		if(i != midIndex && midItem >= x[i])
			return 0;
		}
		
		return 1;
	}
}
