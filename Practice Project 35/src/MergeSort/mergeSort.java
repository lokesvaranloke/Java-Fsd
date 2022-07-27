package MergeSort;

public class mergeSort {

	public static void main(String[] args) {
		
		mergeSort ms = new mergeSort();
		int[] arr = {12, 11, 13, 5, 6, 7};
		ms.sort(arr, 0, arr.length-1);
		System.out.println("After Sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void sort(int[] a,int l, int h) {
		if(l<h) {
			int mid = (l+h)/2;
			sort(a,l,mid-1);
			sort(a,mid+1,h);
			merge(a,l,mid,h);
		}
	}
	
	public void merge(int[] a,int l, int m, int h) {
		int[] temp = new int[a.length];
		for(int i=l;i<=h;i++) {
			temp[i]=a[i];
		}
		int i=l,j=m+1,k=l;
		while(i<=m && j<=h) {
			if(temp[i]<=temp[j]) {
				a[k]=temp[i];
				i++;
			} else {
				a[k]=temp[j];
				j++;
			}
			k++;
		}
		while(i<=m) {
			a[k]=temp[i];
			i++;
			k++;
		}
	}
}
