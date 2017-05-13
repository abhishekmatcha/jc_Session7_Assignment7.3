
	import java.util.*;
	import java.lang.String;
	import java.util.*;
	public class Find {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Please enter a String: ");
	        String s1 = input.next();
	        System.out.print("Please enter a substring  : ");
	        String s2 = input.next();
	        char a[]=s1.toCharArray();
	    char b[]=s2.toCharArray();
	    int i=0;
	    int j=0;

	    while(i<a.length && j<b.length)
	    {
	        if(a[i]==b[j])
	        {
	            i++;
	            j++;
	        }
	        else
	        {
	            i++;
	            j=0;
	        }
	    }
	        if(j == b.length)
	            System.out.println(s2+" "+"is a Substring of"+" "+s1);
	        else
	        System.out.println(s2+" "+"is not a Substring of"+" "+s1);
	  }
	}