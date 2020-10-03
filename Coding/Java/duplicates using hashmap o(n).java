import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int a[]=new int[n];
		Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
		     a[i]=obj.nextInt();
		}
		for(int x : a)
		{
		    if(!hm.containsKey(x))
		    {
		        hm.put(x,1);
		    }
		    else{
		        hm.put(x,hm.get(x)+1);
		        }
		}
		for(int x : hm.keySet())
		{
		    if(hm.get(x)>1)
		    {
		        System.out.printf("%d ",x);
		    }
		}
	}
}
