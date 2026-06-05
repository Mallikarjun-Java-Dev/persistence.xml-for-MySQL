package reverseString;

public class prog2 {
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
		String str="Java Is Easy";
		String s1[] = str.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			if(i==s1.length-1)
			{
				System.out.print(reverse(s1[i])+ " ");
			}
			else {
				System.out.print(s1[i] + " ");
			}
		}
	}
}
