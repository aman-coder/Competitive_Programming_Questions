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
