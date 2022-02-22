Reversing a number without using third variable

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter two numbers");
		int name = sc.nextInt();
		int num = sc.nextInt();
		 name+=num;
		 num=name-num;
		 name-=num;
		
		
			System.out.println("Arter Swapping two numbers :"+name+" "+num);
	}
}
