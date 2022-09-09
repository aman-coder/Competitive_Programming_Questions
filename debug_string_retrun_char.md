#### Nth character in Decrypted String 
-- Every Character in the String is followed by its frequency you have to decrypt and return the asked value
-- input1: a1b2c3
-- input2: 5
-- Output: c

```java
import java.util.*;
public class Main
{
    static String charo(String aa, int n){
        ArrayList<Character> arr = new ArrayList<Character>();
        char temp='\0';
        for(int i=0;i<aa.length();i++){
            if(aa.charAt(i)>='a' && aa.charAt(i)<='z'){
                arr.add(aa.charAt(i));
                temp = aa.charAt(i);
            }
            if(aa.charAt(i)>='1' && aa.charAt(i)<='9'){
                for(int j=1;j<Integer.parseInt(String.valueOf(aa.charAt(i)));j++)
                {
                arr.add(temp);
                }
            }
        }
        if(arr.size()<n){
            return "-1";
        }else{
             return String.valueOf(arr.get(n-1));
            //return arr;
        }
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String aa;
	    int n;
		System.out.println("Enter the String");
		aa=sc.nextLine();
		System.out.println("Enter the number of Character");
		n=sc.nextInt();
		System.out.println("The Requested Character is: "+charo(aa,n));
	}
}
```
