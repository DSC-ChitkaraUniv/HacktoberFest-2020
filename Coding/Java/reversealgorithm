package arrays;



public class reversealgorithm {
	  
	
	
	static void rotatby(int arr[],int k) {
		int len =arr.length;
		k=k%len;
		reverse(0,len-k-1,arr);
		reverse(len-k,len-1,arr);
		reverse(0,len-1,arr);
		
	}
	static void reverse(int start,int end,int arr[]) {
		while(start<end) {
			int temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
			
		}
		for(int i:arr)
			System.out.print(i);
	
	}
	static void pr(int arr[],int k) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
	}
	
	
	
public static void main(String[] args) {
	reversealgorithm obj=new reversealgorithm();
	
	int arr[]= {1,2,3,4,5,6,7};
	int k=2;
	l(arr,k);
//	for(int i=0;i<arr.length;i++)
//		System.out.print(arr[i] + " ");
	obj.pr(arr, k);
}
public static void l(int arr[],int k) {
	int l=arr.length;
	k=k%l;
	rv(0,l-k-1,arr);
	rv(l-k,l-1,arr);
	rv(0,l-1,arr);
	
	
}
public static void rv(int start,int end,int arr[]) {
	while(start<end) {
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
	}
}
}
