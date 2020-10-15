public static int findSubarray(int[] arr ,int n) 
{
    //Your code here
    HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
    int sum = 0;
		    hs.put(0,1);
		    int res = 0;
		    for(int i = 0; i < n; i++) {
		        sum += arr[i];
		        if(hs.containsKey(sum)) {
		            res += hs.get(sum);
		            hs.put(sum,hs.get(sum) + 1);
		        }
		        else {
		            hs.put(sum,1);
		        }
		    }
		    return res;
}
