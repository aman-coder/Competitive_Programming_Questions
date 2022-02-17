// For hashcode Google
import java.util.*;
import java.io.*;
// import com.google.common.primitives.Chars;

public class Main{
    public static boolean contains(char[] vowel, char s){
        boolean z = false;
        for(char x : vowel){
            if(x == s)
                z = true;
        }
        return z;
    }
    public static void main(String args[]){
        try{
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        char[] vowel = {'a','e','i','o','u','A','E','I','O','U'};
        sc.nextLine();
        for(int t=1; t<=k;t++){
                String cityNames=sc.nextLine();
                int len = cityNames.length();
                char s = cityNames.charAt(len-1);
                if(contains(vowel,s)){
                    System.out.println("Case #"+t+": "+cityNames+" is ruled by "+"Alice.");
                    
                }else if(s == 'y'){
                     System.out.println("Case #"+t+": "+cityNames+" is ruled by "+"nobody.");
                }else {
                     System.out.println("Case #"+t+": "+cityNames+" is ruled by " +"Bob.");
                }
            
        }}catch(Exception e){
            System.out.println(e);
        }
    }
}
