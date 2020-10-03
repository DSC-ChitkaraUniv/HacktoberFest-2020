import java.util.Scanner;
import java.lang.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char str[]=s.toCharArray();
        int n=str.length,i,j=0,k,l;
        int a,b;
        a=(int)Math.floor(Math.sqrt((double)n));
        b=(int)Math.ceil(Math.sqrt((double)n));
        if(a*b<n)
            a=(int)Math.ceil(Math.sqrt((double)n));
        String [] arr=new String[a];
        for(i=0;i<a;i++)
        arr[i]="";
        l=0;
        for(i=0;i<a*b;i++){
            if(i<n)
            arr[j]+=str[i];
            else{
                arr[j]+="#";
            }
            if((i+1)%b==0&&i>0){
                j++;
            }
        }
        for(i=0;i<b;i++){
            for(j=0;j<a;j++){
                if((arr[j].toCharArray())[i]!='#')
                System.out.print((arr[j].toCharArray())[i]);
                else
                continue;
               
            }
             System.out.print(" ");
        }       
    }
}
