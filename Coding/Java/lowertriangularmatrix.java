public class LowerTriangular    
{    
    public static void main(String[] args) {    
    int rows, cols;    
    //Initialize matrix a    
        int a[][] = {       
                        {1, 2, 3},    
                        {8, 6, 4},    
                        {4, 5, 6}    
                    };    
              
          //Calculates number of rows and columns present in given matrix    
          rows = a.length;    
          cols = a[0].length;    
            
          if(rows != cols){    
              System.out.println("Matrix should be a square matrix");    
          }    
          else {    
              //Performs required operation to convert given matrix into lower triangular matrix    
              System.out.println("Lower triangular matrix: ");    
              for(int i = 0; i < rows; i++){    
                  for(int j = 0; j < cols; j++){    
                    if(j > i)    
                      System.out.print("0 ");    
                    else    
                      System.out.print(a[i][j] + " ");    
                }    
                System.out.println();    
            }    
        }    
    }    
}    
