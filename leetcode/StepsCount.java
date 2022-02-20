- leetcode question to find the number of steps person could take to reach the destination 
- has linear runtime i.e., O(n)
import java.util.*;

public class Main
{
    private static int countSteps(int n){
          int count =0,k=1,l=2;
         if(n ==0 || n==1 || n==2) return n;
        for(int i=2;i<n;i++){
            count = k+l;
            k=l;
            l=count;
        }
        return count;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the number of step");
		int n = sc.nextInt();
		int result = countSteps(n);
		System.out.println("Possible number of steps to reach is: "+result);
	}
}
