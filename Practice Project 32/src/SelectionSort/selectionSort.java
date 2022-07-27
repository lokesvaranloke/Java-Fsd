package SelectionSort;

public class selectionSort {

	public static void main(String[] args) {
		
		selectionSort ss = new selectionSort();
		int[] arr= {9,6,3,1,2,4,5};
		ss.selectionSort(arr);
		System.out.println("After Sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void selectionSort(int[] a) {
		for(int i=0;i<a.length;i++) {
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
	}
}
