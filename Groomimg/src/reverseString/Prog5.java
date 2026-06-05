package reverseString;

public class Prog5 {
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
		String str="ab cd ef";
		String s1[] = str.split(" ");
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(reverse(s1[i])+ " ");
		}
	}
}
