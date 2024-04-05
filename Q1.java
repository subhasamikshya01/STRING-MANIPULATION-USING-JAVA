import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:- ");
		String s=sc.next();
		s=s.toLowerCase();
		char[]c=new char[s.length()];
		c=s.toCharArray();
		int i=0,j=s.length()-1;
		while(i<j) {
			if(c[i]!=c[j]) {
				System.out.println("Not palindrome!");
				System.exit(0);
			}
			i++;j--;
		}
		System.out.println("Palindrome!");
	}

}
