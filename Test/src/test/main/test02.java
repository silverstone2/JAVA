package test.main;

import java.util.Scanner;

public class test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[8];
		for(int i=0; i<8; i++) {
			arr[i] = sc.nextInt(); 
		}

		for(int i=0; i<arr.length;i++)
		{
			if(arr[i] == i+1)
				System.out.println("ascending");
			else
			{
				if(arr[7-i] == (8-i))
				{
					System.out.println("descending");
				}
				else
					System.out.println("mixed");
			}
		}
	}
}
