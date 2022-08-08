package test.main;

import java.util.Scanner;

public class test {
	 public static void main(String args[])
	    {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int k = sc.nextInt();
	        int[] s = new int[n+1];
	        for(int i=1; i<=n; i++)
	        {
	        	s[i] = sc.nextInt();
	        }
	        for(int i=0; i<k; i++)
	        {
	        	int a = sc.nextInt();
	        	int b = sc.nextInt();
	        	double sum = 0;
	  	        int count = 0;

		        for(int j = a; j<=b; j++) {
		        	sum += s[j];
		            count++;
		        }
		        double result = (sum / count);
		        System.out.printf("%.2f", result);
	        }
	    }
}
