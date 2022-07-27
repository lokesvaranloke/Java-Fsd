package BubbleSort;

public class bubbleSort {
	
	public static void main(String[] args) {
		
		bubbleSort bs = new bubbleSort();
		int[] arr = {25,20,15,5,1};
		bs.bubblesort(arr);
		System.out.println("After Sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void bubblesort(int[] a) {
		boolean swap;
		for(int i=0;i<a.length;i++) {
			swap=false;
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					swap=true;
				}
			}
			if(swap==false) {
				break;
			}
		}
	}
}
