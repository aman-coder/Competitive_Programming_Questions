question no. 746
import java.util.*;

public class Main
{
    private static int countSteps(int[] cost){
        int len=cost.length;
        int temp=0,min=0,num=0;
        if (cost[0]<cost[1]){
            for(int k=0;k<len;k+=2){
                temp+=cost[k];
            }
            for(int k=0;k<len;k++){
                num+=cost[k];
            }
            min=Math.min(num,temp);
        }
        else if(cost[0]>cost[1]){
            for(int k=0;k<len;k+=2){
                temp+=cost[k];
            }
            for(int k=0;k<len;k++){
                num+=cost[k];
            }
            min=Math.min(num,temp);
        }
        return min;
    }
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    	System.out.println("Please Enter the size of cost for steps");
	    	int n=sc.nextInt();
	    	int[] cost = new int[n];
		System.out.println("Please Enter the cost for steps");
		for(int i=0; i<n; i++){
		cost[i]=sc.nextInt();
		}
		int res = countSteps(cost);
		System.out.println("The minimum cost for the steps are: "+res);
	}
}
