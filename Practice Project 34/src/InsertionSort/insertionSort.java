package InsertionSort;

public class insertionSort {

	public static void main(String[] args) {

		insertionSort is = new insertionSort();
		int[] arr = {9,12,3,21,44};
		is.insertionSort(arr);
		System.out.println("After Sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

	public void insertionSort(int[] a) {
		for(int i=1;i<a.length;i++) {
			int temp=a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp) {
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=temp;
		}
	}
}
