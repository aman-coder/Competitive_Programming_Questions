// reversing string without using character array

import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the string");
    String sr = sc.nextLine();
    String mid = "";
    char ch;
    for(int i=0;i<sr.length();i++){
      ch=sr.charAt(i);
      mid=ch+mid;
    }
    System.out.println("Reversed String is : "+mid);
  }
}
