package arrays;

import java.util.Scanner;

public class rotateArray {
	
	public static void main(String[] args) {

		rotateArray ar = new rotateArray();
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rotations:");
		int n = sc.nextInt();

		ar.rotation(arr, n);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void rotation(int[] a, int n) {

		for(int i=0;i<n;i++) {
			int j,last;
			last=a[a.length-1];
			
			for(j=a.length-1;j>0;j--) {
				a[j]=a[j-1];
			}
			a[0]=last;
			
		}
		
	}

}
