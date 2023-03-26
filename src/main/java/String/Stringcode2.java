/**
 * 
 */
package String;

/**
 * @author Administrator
 *
 */
public class Stringcode2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str="RajaRamMohanRoy";
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		// TODO Auto-generated method stub
		System.out.println(str.toLowerCase());
		System.out.println(str.charAt(1));
		//System.out.println(str.charAt(120));//Exception
		int a= 10 + str.charAt(1);
		System.out.println(a);
		System.out.println(str.indexOf('R'));
		System.out.println(str.indexOf('z'));
		System.out.println(str.startsWith("Raja"));
		System.out.println(str.startsWith("Roja"));
		System.out.println(str.endsWith("Raja"));
		System.out.println(str.endsWith("Roy"));
		System.out.println(str.contains("Raja"));
		System.out.println(str.contains("Rohan"));
	}

}
