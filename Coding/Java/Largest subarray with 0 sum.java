int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int pre_sum=0;
        int res=0;
        for(int i=0;i<n;i++)
        {
            pre_sum+=arr[i];
            if(pre_sum==0)
            res=i+1;
            
            if(hm.containsKey(pre_sum)==false)
            {
                hm.put(pre_sum,i);
            }
            if(hm.containsKey(pre_sum))
            res=Math.max(res,i-hm.get(pre_sum));
            
            //System.out.println(res);
        }
        return res;
    }
