import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    static double totalPrice(int w,int arr[]){
        int[] weight=new int[arr.length/2];
        double[] value=new double[arr.length/2];
        int k1=0,k2=0;
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                weight[k1]=arr[i];
                k1++;
            }
            else{
                value[k2]=arr[i];
                k2++;
            }
        }
        double pwvalue[]=new double[arr.length/2];
        for(int i=0;i<arr.length/2;i++){
            pwvalue[i]=value[i]/weight[i];
        }
        for(int i=0;i<(arr.length/2)-1;i++){
           for(int j=i+1;j<arr.length/2;j++){
               if(pwvalue[i]<pwvalue[j]){
                   double swap=pwvalue[i];
                   pwvalue[i]=pwvalue[j];
                   pwvalue[j]=swap;
                   int change=weight[i];
                   weight[i]=weight[j];
                   weight[j]=change;
                   double temp=value[i];
                   value[i]=value[j];
                   value[j]=temp;
               }
           } 
        }
        double ww=w;
        double sum=0;
        for(int i=0;i<arr.length/2;i++){
            if(ww>0){
             if(ww-weight[i]>0){
                 ww=ww-weight[i];
                 sum+=value[i];
            } 
            else{
                double x=(ww/weight[i])*value[i];
                sum+=x;
                break;
            }
            }
        }
        return sum;
    }
    
	public static void main (String[] args) {
		Scanner ss=new Scanner(System.in);
		int t=ss.nextInt();
		for(int m=0;m<t;m++){
		    int n=ss.nextInt();
		    int w=ss.nextInt();
		    int arr[]=new int[2*n];
		    for(int i=0;i<2*n;i++){
		        arr[i]=ss.nextInt();
		    }
		    double result=totalPrice(w,arr);
		    System.out.format("%.2f",result);
		    System.out.println();
		}
	}
}