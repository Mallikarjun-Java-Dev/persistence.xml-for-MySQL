package reverseString;

public class Prog12 {
	 public static String reverse(String str)
	    {
	        char[] ch = str.toCharArray();

	        int i = 0;
	        int j = ch.length - 1;

	        while(i < j)
	        {
	            char temp = ch[i];
	            ch[i] = ch[j];
	            ch[j] = temp;

	            i++;
	            j--;
	        }

	        return new String(ch);
	    }

	    public static void main(String[] args)
	    {
	        String str = "Java Is Very Easy";

	        String[] arr = str.split(" ");

	        for(int i = 0; i < arr.length; i++)
	        {
	            if(arr[i].length() % 2 != 0)
	            {
	                arr[i] = reverse(arr[i]);
	            }
	        }

	        for(String s : arr)
	        {
	            System.out.print(s + " ");
	        }
	    }
}
