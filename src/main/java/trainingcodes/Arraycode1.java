/**
 * 
 */
package trainingcodes;

/**
 * @author Administrator
 *
 */
import java.util.Scanner;
	public class Arraycode1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter the count of Students:");
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
			int n= sc.nextInt();
			int arr[] = new int [n];
			for(int i=0;i<n;i++) {
				System.out.println("Enter the marks of Student number:"+(i+1));
	             arr[i]=sc.nextInt();	
				}
			for(int i=0;i<n;i++) {
				System.out.println("The marks of student number"+(i+1)+"is:"+arr[i]);
			}
			
		
	}

}
