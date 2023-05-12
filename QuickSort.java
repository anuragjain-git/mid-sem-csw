package midsem;

public class QuickSort {
	
	public static void quicksort(int arr[], int s, int e) {
		if(s<e) {
			int q = partition(arr,s,e);
			quicksort(arr,s,q-1);
			quicksort(arr,q+1,e);
		}
	}
	
	public static int partition(int arr[], int s, int e) {
		int pivot = arr[e];
		int i = s ;
		for (int j = s; j < e; j++) {
			if (arr[j] <= pivot) {
				int temp = arr[i];
				arr[i]= arr[j];
				arr[j]=temp;
				i = i + 1;
			}
		}		
		int temp = arr[i];
		arr[i]= arr[e];
		arr[e]=temp;
		return i;
	}
	
	public static void printArray(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {6,5,3,4};
		int size = arr.length;
		quicksort(arr,0,size - 1);
		printArray(arr);
	}
}
