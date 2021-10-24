1).Implement an algorithm to determine if a string has all unique characters. 
What if you can not use additional data structures?

Ans).
	public uniquelement( String st[])
	{
	 boolean[] char_set = new boolean[256];
	for( int i =0; i<st.length();i++)
`		int val = st.charAt(i);
		
		if(char_set[val]) return false;
		char_set[val] = true;
	}
	return true;
}

time complexity  -----> O(N)
Space complexity -----> O(N)

If we are allowed to destroy the input string, 
we could sort the string in O(n log n) time and then linearly 
check the string for neighboring characters that are identical. 
Careful, though - many sorting algorithms take up extra space.

2).


Write code to reverse a C-Style String. 
(C-String means that “abcd” is represented as five characters, including the null character.)

Ans).
	
import java.util.*;
class codechef{
    public static void main(String arg[])
    {
         String str ="My name is Anish jha!";
         System.out.println(reverse(str));
    }
    static String reverse(String str)
    {
        char [] c = str.toCharArray();
        int i =0;
        int j = c.length -1;
        char copy;
        while(i<j)
        {
            copy = c[i];
            c[i] = c[j];
            c[j] = copy;
            i++;
            j--;
        }
        String s = new String(c);
        return s;
    }
}