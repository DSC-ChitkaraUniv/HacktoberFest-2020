// Java program to find prime numbers in a given range

import java.util.*;
public class prime_java{

 public static void main(String args[]){

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter start value : ");
  int a = sc.nextInt();
  System.out.println("Enter end value : ");
  int b = sc.nextInt();
  System.out.println("Prime numbers between "+ a + " and "+ b +" are : ");
  while (a < b){	
     int flag = 0;
     for(int i = 2; i <= a/2; i++){
         if(a % i == 0){
         flag = 1;
     	 break;
         }
     }
     if (flag == 0)
     System.out.println(a +" ");
     a++;
    }
  }
}
