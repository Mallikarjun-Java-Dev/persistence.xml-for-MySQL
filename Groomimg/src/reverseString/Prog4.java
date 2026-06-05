package reverseString;

public class Prog4 {
	static String reverse(String str)
	{
		char[] ch=str.toCharArray();
		int i=0,j=ch.length-1;
		while(i<j)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		return new String(ch);
	}
	public static void main(String[] args) {
		String str="I Love Java";
		System.out.println(reverse(str));
		
	}
}
