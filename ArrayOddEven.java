package Advanced;

import java.util.Scanner;

public class ArrayOddEven {

	public static void main(String[] args) {
		int i, n; 
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number of elements in an Array: ");
		n = s.nextInt();
		int a[]= new int[n];
		System.out.println("Enter the Elements Array: ");
		for(i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		
		for(i=0;i<n;i++) {
			if(a[i]%2 !=0) {
				System.out.println("Odd Numbers are: " +a[i]);
			}			
		}
		
		for(i=0;i<n;i++) {
			if(a[i]%2==0) {
				System.out.println("Even Numbers are:" +a[i]);
			}
		}
		

	}

}
