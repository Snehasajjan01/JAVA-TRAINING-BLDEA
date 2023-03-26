/**
 * 
 */
package trainingcodes;

/**
 * @author Administrator
 *
 */
import java.util.Scanner;
public class Ilovemymother {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			if(i==0 && j<(n/2) || j==(n/4) || (i==(n-1) && j<(n/2)))
			{
			System.out.print("* ");//I
			}
			else{
				System.out.print("  ");
			}
		}
			for(int j=0;j<n;j++) {
				if(j==0 || i==(n-1)) {
					System.out.print("* ");//L
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j=0;j<n;j++) {
				if((j==0 && i!=0 && i!=(n-1)) || (i==0 && j!=n-1 && j!=0) || (i==n-1 && j!=n-1&& j!=0) || (j==n-1 && i!=0 && i!=n-1)) {
					System.out.print("* ");//O
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j=0;j<n;j++) {
				if((j==0 && i<=n/2) || (j==n-1 && i<=n/2) || i-j==n/2 || i+j==n-1+n/2) {
					System.out.print("* ");//V
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j=0;j<n;j++) {
				if(j==0 || (i==0 && j<=(n/2)) || (i==(n/2) && j<(n/2)) || (i==(n-1) && j<=(n/2))) {
					System.out.print("* ");//E
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j=0;j<n;j++) {
				if(j==0 || j==(n-1) || (i==j && i<=(n/2)) || (i+j==(n-1) && j>=(n/2))) {
					System.out.print("* ");//M
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j=0;j<n;j++) {
				if((i==j && i<=n/2) || (i+j==n-1 && i<=n/2) || (j==n/2 && i>=n/2)) {
					System.out.print("* ");//Y
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j=0;j<n;j++) {
				if(j==0 || j==(n-1) || (i==j && i<=(n/2)) || (i+j==(n-1) && j>=(n/2)))
				{
					System.out.print("* ");//M
					}
				
			else {
				System.out.print("  ");
			}
		}
			for(int j=0;j<n;j++) {
				if((j==0 && i!=0 && i!=(n-1)) || (i==0 && j!=n-1 && j!=0) || (i==n-1 && j!=n-1&& j!=0) || (j==n-1 && i!=0 && i!=n-1)) {
					System.out.print("* ");//o
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j=0;j<n;j++) {
				
			if(j==0 || j==(n-1) || (i==j && i<=(n/2)) || (i+j==(n-1) && j>=(n/2))) {
				System.out.print("* ");//M
			}
			else {
				System.out.print("  ");
			}
				
			}
			System.out.println();//M
		}
	}

}
