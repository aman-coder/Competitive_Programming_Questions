import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n,temp,num=0,b;
		System.out.println("Enter number of steps");
		n=sc.nextInt();
	    b=n;
		while(n>0){
		temp=n%10;
		num=(num*10)+temp;
		n=n/10;
	}
	if(num == b){
		System.out.println("Pallindrome");
	}else{
	    System.out.println("Not A Pallindrome");
	}
	}
}
