import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:- ");
		String s=sc.next();
		int c=vowelCounter(s);
		System.out.println("Number of vowels present is:- "+c);
		
	}

	public static int vowelCounter(String s) {
		int c=0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				c++;
			}
		}
		return c;
	}

}
