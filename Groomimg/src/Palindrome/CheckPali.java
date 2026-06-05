package Palindrome;

public class CheckPali {
public static Boolean isPalindrome(String str) {
	    int i=0, j=str.length()-1;
	    while(i<j) {
	    	if(str.charAt(i)!= str.charAt(j)) {
	    		return false;
	    	}
	    	i++;
	    	j--;
	    }
	    return true;
}
public static void main(String[] args) {
	String str = "madam";
	
	if(isPalindrome(str)) {
		System.out.println(str + " is a palindrome");
	} else {
		System.out.println(str + " is not a palindrome");
	}
	PaliSentence();
}
public static void PaliSentence() {
   String str ="mom told to learn malayalam";
   String[] s1=str.split(" ");
   for (String str1 : s1) {
		if (isPalindrome(str1)) {
			System.out.println(str1 + " is a palindrome");
		}
}
}
public static void Paliword() {
	String str="madam";
	String rev="";
	for(int i=str.length()-1; i>=0;i--){
		rev+=str.charAt(i);
	}
	if(s)
	
}
}
