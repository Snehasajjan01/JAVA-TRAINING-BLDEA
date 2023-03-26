/**
 * 
 */
package String;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Stringcode4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s=sc.nextLine();
		String originalString=s;
		
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
				
			
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'
					|| s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U') {
				System.out.println("Found a vowel"+(i));
				String front = s.substring(0, i);
				String back = s.substring(i + 1);
				s = front + "@" + back;
				
			}
			
			
		}
		System.out.println(originalString);
		System.out.println(s);
		}
}
		
		
	


