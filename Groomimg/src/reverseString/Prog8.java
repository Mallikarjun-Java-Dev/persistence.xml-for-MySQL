package reverseString;

public class Prog8 {
	   public static boolean isAlphabet(char ch)
	    {
	        return (ch >= 'A' && ch <= 'Z') ||
	               (ch >= 'a' && ch <= 'z');
	    }

	    public static void main(String[] args)
	    {
	        String str = "a1b2c3";

	        char[] ch = str.toCharArray();

	        int i = 0;
	        int j = ch.length - 1;

	        while(i < j)
	        {
	            while(i < j && !isAlphabet(ch[i]))
	            {
	                i++;
	            }

	            while(i < j && !isAlphabet(ch[j]))
	            {
	                j--;
	            }

	            char temp = ch[i];
	            ch[i] = ch[j];
	            ch[j] = temp;

	            i++;
	            j--;
	        }

	        System.out.println(ch);
	    }
}
