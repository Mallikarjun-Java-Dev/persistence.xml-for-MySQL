package reverseString;

public class Prog10 {
	  public static boolean isLower(char ch)
	    {
	        return (ch >= 'a' && ch <= 'z');
	    }

	    public static void main(String[] args)
	    {
	        String str = "JaVaPrOgRaM";

	        char[] ch = str.toCharArray();

	        int i = 0;
	        int j = ch.length - 1;

	        while(i < j)
	        {
	            while(i < j && !isLower(ch[i]))
	            {
	                i++;
	            }

	            while(i < j && !isLower(ch[j]))
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
