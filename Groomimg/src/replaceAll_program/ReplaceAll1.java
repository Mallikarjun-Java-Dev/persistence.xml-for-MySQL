package replaceAll_program;

public class ReplaceAll1 {
public static void main(String[] args) {
	String s = "hi       hEllo How aRe yoU        123 @#$ fiN23e";
	System.out.println(s.replaceAll(" ", ""));              //Remove all spaces
	System.out.println(s.replaceAll("[0-9]", ""));          //Remove all digits
	System.out.println(s.replaceAll("[a-zA-Z]", ""));       //Remove all alphabets
	System.out.println(s.replaceAll("[^0-9]", ""));         //Extract only digits
	System.out.println(s.replaceAll("[^a-zA-Z]", ""));      //Extract only alphabets
	System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));   //Remove all special characters
	System.out.println(s.replaceAll("[aeiouAEIOU]", "*"));  //Replace all vowels with '*'
	System.out.println(s.replaceAll("[0-9]", "#"));         //Replace all digits with '#'
	System.out.println(s.replaceAll(" +", " "));            //Replace multiple spaces with a single space
	System.out.println(s.replaceAll(" +", " ").trim());     //Remove duplicate spaces from a sentence
	System.out.println(s.replaceAll("[A-Z]", ""));          //Remove all uppercase letters
	System.out.println(s.replaceAll("[a-z]", ""));          //Remove all lowercase letters
	System.out.println(s.replaceAll("[0-9a-zA-Z]", ""));    //Extract only special characters
	System.out.println(s.replaceAll("[a-zA-Z]", " "));      //Replace every non-alphabet character with a space
	System.out.println(s.replaceAll("[^0-9]", "").length());//Count the number of digits using replaceAll()
	
	
	
	
	//ASsignment
	
	String s1 = "Hello@123#Java! Java is powerfull";
	System.out.println(s1.replaceAll("[AEIOUaeiou]", ""));       //Remove all vowels from a string
	System.out.println(s1.replaceAll("[^AEIOUaeiou\\s]", ""));    //Remove all consonants from a string
	System.out.println(s1.replaceAll(" ", "-"));                 //Replace all whitespace characters with '-'
	System.out.println(s1.replaceAll("[^A-Z]", ""));              //Extract only uppercase letters
	System.out.println(s1.replaceAll("[^a-z]", ""));              //Extract only lowercase letters
	System.out.println(s1.replaceAll("[0-9]", "").isEmpty());     //Check whether a string contains only digits
	System.out.println(s1.replaceAll("[A-Za-z]", "").isEmpty());   //Check whether a string contains only alphabets
	System.out.println(s1.replaceAll("[A-Za-z0-9]", "").isEmpty());//Check whether a string is alphanumeric
	System.out.println(s1.replaceAll("[^AEIOUaeiou]", ""));        //Remove all characters except vowels
	System.out.println(s1.replaceAll("[^A-Za-z0-9]", "@"));        //Replace every special character with '@'
	System.out.println(s1.replaceAll("[A-Za-z0-9]", "").length()); //Count the number of special characters
	System.out.println(s1.replaceAll("[^A-Za-z]", "").length());   //Count the number of alphabets using replaceAll()
	System.out.println(s1.replaceAll("[^A-Z]", "").length());       //Count the number of uppercase letters
	System.out.println(s1.replaceAll("[^a-z]", "").length());       //Count the number of lowercase letters
	System.out.println(s1.replaceAll("Java", ""));                 //Remove all occurrences of a specific word
}
}
