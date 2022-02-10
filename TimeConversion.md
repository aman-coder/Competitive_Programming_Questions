- Given a time in -hour AM/PM format, convert it to military (24-hour) time.
- Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock. 
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
## Disadvantage ##
- In this 12:00:00AM such time will be converted
```java
import java.util.*;
import java.io.*;
import java.text.*;

public class Main
{
	public static void main(String[] args) throws Exception {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Please enter time");
		String time = sc.nextLine();
		Date jk=null;
		String sd="";
		DateFormat ff = new SimpleDateFormat("hh:mm:ssaa");
		DateFormat military = new SimpleDateFormat("HH:mm:ss");
		 jk = ff.parse(time);
		sd = military.format(jk);
		System.out.println(sd);
	}
}
```
## Just implementation of above code ##
```java
import java.util.*;
import java.io.*;
import java.text.*;
class Res{
public static void Conttime(String s){
    int n1=(int)s.charAt(1)-'0';
    int n2=(int)s.charAt(0)-'0';
    int hh=((n2*10 + n1%10));
    if(s.charAt(8) == 'A'){
        if(hh == 12){
            System.out.print("00");
            for(int i=2;i<7;i++){
                System.out.print(s.charAt(i));
            }
        }else{
            for(int i=0;i<=7;i++){
                System.out.print(s.charAt(i));
            }
        }
    }else{
        if(hh == 12){
            System.out.print("12");
            for(int i =2; i<7;i++){
                System.out.print(s.charAt(i));
            }
            }else{
                 hh = hh + 12;
                System.out.print(hh);
                for(int i =2 ; i<=7; i++){
                    System.out.print(s.charAt(i));
                }
            }
        
    }
   }
}
public class Main
{
	public static void main(String[] args) throws Exception {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Please enter time");
		String time = sc.nextLine();
		Res.Conttime(time);
	}
}
```

## Just Some Changes inorder for different way ##
- Given a time in -hour AM/PM format, convert it to military (24-hour) time.
- Note: - 12:00:00 AM on a 12-hour clock is 00:00:00 on a 24-hour clock. 
- 12:00:00 PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
```java
import java.util.*;
import java.io.*;
import java.text.*;
class Res{
public static void Conttime(String s){
    int n1=(int)s.charAt(1)-'0';
    int n2=(int)s.charAt(0)-'0';
    int hh=((n2*10 + n1%10));
    if(s.charAt(9) == 'A'){
        if(hh == 12){
            System.out.print("00");
            for(int i=2;i<7;i++){
                System.out.print(s.charAt(i));
            }
        }else{
            for(int i=0;i<=7;i++){
                System.out.print(s.charAt(i));
            }
        }
    }else{
        if(hh == 12){
            System.out.print("12");
            for(int i =2; i<7;i++){
                System.out.print(s.charAt(i));
            }
            }else{
                 hh = hh + 12;
                System.out.print(hh);
                for(int i =2 ; i<=7; i++){
                    System.out.print(s.charAt(i));
                }
            }
        
    }
   }
}
public class Main
{
	public static void main(String[] args) throws Exception {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Please enter time");
		String time = sc.nextLine();
		Res.Conttime(time);
	}
}
```
## Using DateFormat of JAVA for Above Changes ##
```java
import java.util.*;
import java.io.*;
import java.text.*;

public class Main
{
	public static void main(String[] args) throws Exception {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Please enter time");
		String time = sc.nextLine();
		Date jk=null;
		String sd="";
		DateFormat ff = new SimpleDateFormat("hh:mm:ss aa");
		DateFormat military = new SimpleDateFormat("HH:mm:ss");
		 jk = ff.parse(time);
		sd = military.format(jk);
		System.out.println(sd);
	}
}
```
