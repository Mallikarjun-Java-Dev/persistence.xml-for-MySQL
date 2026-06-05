package reverseString;

public class Prog9 {
	public static boolean isUpper(char ch) {
		return (ch >= 'A' && ch <= 'Z');
	}

	public static void main(String[] args) {
		String str = "JaVaPrOgRaM";

		char[] ch = str.toCharArray();

		int i = 0;
		int j = ch.length - 1;

		while (i < j) {
			while (i < j && !isUpper(ch[i])) {
				i++;
			}

			while (i < j && !isUpper(ch[j])) {
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
