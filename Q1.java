package midsem;

public class Q1 {

	public static void main(String[] args) {		
		int arr[]= {0,1,3,4,5};
		missingNumber(arr);
	}
	
	public static void missingNumber(int arr[]) {
		boolean x[] = new boolean[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<arr.length){
				x[arr[i]]=true;
			}
		}		
		for(int i=0;i<arr.length;i++) {
			if(x[i]!=true){
				System.out.println(i);
				break;
			}
		}
	}

}