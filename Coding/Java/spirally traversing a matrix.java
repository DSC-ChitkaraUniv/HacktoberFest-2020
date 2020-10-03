public class spirally traversing a matrix {

  static void printSpiral(int a[][], int r, int c)
  {
    int i,k=0,l=0; //m=r,n=c
    while(k<r && l<c){
      for(i=l;i<c;i++)
        System.out.println(a[k][i]);
      k++;
      for(i=k;i<r;i++)
        System.out.println(a[i][c-1]);
      c--;
        if(k<r){
          for(i=c-1;i>=l;i--)
            System.out.println(a[r-1][i]);
      r--;}
      if(l<c){
        for(i=r-1;i>=k;i--)
          System.out.println(a[i][l]);
        l++;
      }
    }
  }
}

