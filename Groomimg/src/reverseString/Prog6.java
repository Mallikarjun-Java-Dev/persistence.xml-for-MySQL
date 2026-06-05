package reverseString;

public class Prog6 {
	  static String reverse(String str)
	    {
	        if (str.isEmpty())
	        {
	            return str;
	        }

	        return reverse(str.substring(1)) + str.charAt(0);
	    }

	    public static void main(String[] args)
	    {
	        String s = "Java";
	        System.out.println(reverse(s));
	    }
}
