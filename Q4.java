package midsem;

import java.util.Arrays;
import java.util.HashMap;

public class Q4 {
	
	public static void sortArr(int[] arr1, int[] arr2) {
		HashMap<Integer,Integer> hmap= new HashMap<>();
		for(int i=0;i<arr1.length;i++) {
			if(hmap.containsKey(arr1[i])) {
				hmap.put(arr1[i], hmap.get(arr1[i])+1);
			}
			else {
				hmap.put(arr1[i], 1);
			}
		}
		for(int i=0;i<arr2.length;i++) {
			if(hmap.containsKey(arr1[i])) {
				int value = hmap.get(arr2[i]);
				while(value!=0) {
					System.out.print(arr2[i]+" ");
					value--;
				}
			}
		}
	}
	
	public static void smallestSubtract(int arr[]) {
		Arrays.sort(arr);
		//1,2,3,5,7
		System.out.println();
		System.out.println("Arrays is : "+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			int x = arr[i];
			for(int j=i;j<arr.length;j++) {
					
					arr[j]=arr[j]-x;

			}
			int c = 0;
			for(int k=0;k<arr.length;k++) {
				if(arr[k]>0) {
					c++;
				}
			}
			System.out.println(c);
		}
	}
	
	public static void main(String[] args) {
		int arr1[]= {1,2,3,2,3,3,5,5,4,5,4,5,4,4,5};
		int arr2[]= {1,2,3,4,5};
		sortArr(arr1,arr2);
		int arr[] = {2,3,1,5,7};
		smallestSubtract(arr);
	}
}