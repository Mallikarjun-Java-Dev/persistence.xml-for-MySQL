package reverseString;

public class Reverseasenten {
public static void main(String[] args) {
	String str = "hello java program";
	String[] s1= str.split(" ");
	int i=0, j=s1.length-1;
	while(i<j) {
		String temp = s1[i];
		s1[i] = s1[j];
		s1[j] = temp;
		i++;
		j--;
 	}
	for (String word : s1) {
        System.out.print(word + " ");
}
}
}
