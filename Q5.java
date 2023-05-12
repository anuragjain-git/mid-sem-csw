package midsem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q5 {
	
	public static void majorityElement(int arr[]) {
		HashMap<Integer,Integer> hmap= new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(hmap.containsKey(arr[i])) {
				hmap.put(arr[i], hmap.get(arr[i])+1);
			}
			else {
				hmap.put(arr[i], 1);
			}
		}
		int c=0;
		for(Map.Entry<Integer, Integer> e : hmap.entrySet()) {
			if(e.getValue()>arr.length/2) {
				System.out.println(e.getKey());
				c++;
			}
		}
		if(c==0) {
			System.out.println("Majority Element : 0");
		}
	}
	
	public static void triplet(int arr1[]) {
		Arrays.sort(arr1);
		int key = 11;
		for(int i=0;i<arr1.length;i++) {
			int f = i+1;
			int l = arr1.length-1;
			while(f<l) {
				if(arr1[i]+arr1[f]+arr1[l]==key) {
					System.out.println(arr1[i]+" "+arr1[f]+" "+arr1[l]);
					break;
				}
				else if(arr1[i]+arr1[f]+arr1[l]<key) {
					f++;
				}
				else {
					l--;
				}
			}
		}
	}
	
	public static void count(int arr[]) {
		int xorSum = 0;
		int f = 0;
		int s = 0;
		int currBit;
		for (int i = 0; i < arr.length; i++) {
			xorSum = xorSum ^ arr[i];
		}
		currBit = xorSum & ~(xorSum - 1);
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] & currBit) != 0)
				f ^= arr[i];
			else
				s ^= arr[i];
		}
		System.out.println(f+" "+s);
	}
	
	public static void main(String[] args) {
		int arr[] = {1,1,1,2,2,2,1,2};
		majorityElement(arr);
		int arr1[] = {1,2,3,4,5};
		triplet(arr1);	
		int arr2[] = {1,1,1,2,2,2,3,3};
		count(arr2);
	}
}