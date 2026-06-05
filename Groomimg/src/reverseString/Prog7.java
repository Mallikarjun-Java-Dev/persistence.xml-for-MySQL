package reverseString;

public class Prog7 {
	 public static boolean isVowels(char ch)
	    {
	        return ch=='a' || ch=='e' || ch=='i' ||
	               ch=='o' || ch=='u';
	    }

	    public static void main(String[] args)
	    {
	        String str = "hello";

	        char[] ch = str.toCharArray();

	        int i = 0;
	        int j = ch.length - 1;

	        while(i < j)
	        {
	            while(i < j && isVowels(ch[i]))
	            {
	                i++;
	            }

	            while(i < j && isVowels(ch[j]))
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
