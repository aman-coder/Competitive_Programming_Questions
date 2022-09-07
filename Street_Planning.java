## Planning street where space is allowed to be together but not the building
import java.util.*;
public class Main
{
    static int binary(int s){
       int bul =1;
       int spc = 1;
       for(int i=2;i<=s;i++){
           int nbul=spc;
           int nspc=spc+bul;
           
           bul=nbul;
           spc=nspc;
       }
       int total = bul+spc;
       total = total*total;
       return total;
    }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int s;
      System.out.println ("Enter number");
      s = sc.nextInt ();
      System.out.println(binary(s));
  }
}
