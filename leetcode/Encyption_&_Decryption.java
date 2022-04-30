/******************************************************************************
Encryption of the word given with the k units whether it is for right shift or the left shift and also considering the letter for 
both capital and small 
test case 1 - dgbi
        k=3
cipher text = adhi
*******************************************************************************/
import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the plain text");
		String plaintxt = sc.nextLine();
		System.out.println("Enter the shifting value");
		int k = sc.nextInt();
		String ciphertxt = "";
	    for(int i=0; i<plaintxt.length();i++){
	        char c = plaintxt.charAt(i); //IT RETURNS THE FIRST VALUE OF THE STRING IF THE EG., IS DGEO THEN IT WILL RETURN D 1`ST
	        if(c >= 'a' && c <='z'){
	            c = (char)(c-k); // as java internally convert the char into ASCII value that is why many Arithmetic operations can work in jav
	            if(c<'a'){
	                 c = (char)(c-'a'+'z'+1);
	            }
	            ciphertxt = ciphertxt+c;
	        }else if(c >= 'A' && c<='Z'){
	            c = (char)(c-k);
	            if(c<'A'){
	                c = (char)(c-'A'+'Z'+1);
	            }
	            ciphertxt = ciphertxt+c;
	        } else{
	            ciphertxt = ciphertxt+c;
	        }
	    }
	    System.out.println("Decrypted message  "+ciphertxt);
	}
}
