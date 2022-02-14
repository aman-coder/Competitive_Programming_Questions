##Fibonacci sum Question from Leetcode 509##
```java
import java.util.*;
import java.io.*;
class Solution{
    public void fib(int k){
      int i=0,j=1,sum=0;
      if(k==0){
          System.out.println(0);
          
      }
      else if(k==1){
          System.out.println(1);
      }else{
      while(k!=1){
      sum=i+j;
      i=j;
      j=sum;
      k--;
      }
      System.out.println(sum);
      }
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of which fibonacci seires");
		n=sc.nextInt();
		Solution sol = new Solution();
		sol.fib(n);
		sc.close();
		
	}
}
```
## For N-th Fibonacci number of 3 numbers
```java
import java.util.*;
import java.io.*;
class Solution{
    public void fib(int k){
      int i=0,j=1,l=1,sum=0;
      if(k==0){
          System.out.println(0);
          
      }
      else if(k==1){
          System.out.println(1);
      }else if(k==2){
          System.out.println(1);
          }else{
      while(k!=2){
      sum=i+j+l;
      i=j;
      j=l;
      l=sum;
      k--;
      }
      System.out.println(sum);
      }
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of which fibonacci seires");
		n=sc.nextInt();
		Solution sol = new Solution();
		sol.fib(n);
		sc.close();
		
	}
}
```
