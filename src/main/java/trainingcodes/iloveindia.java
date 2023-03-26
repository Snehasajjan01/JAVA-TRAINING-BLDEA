/**
 * 
 */
package trainingcodes;

/**
 * @author Administrator
 *
 */
import java.util.Scanner;
public class iloveindia {

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
				if((j==0 && i!=0 && i!=(n-1)) || (i==0 && j<n/2 && j!=0) || (i==n-1 && j<n/2 && j!=0) || (j==n/2 && i!=0 && i!=n-1)) {
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
			if(i==0 && j<(n/2) || j==(n/4) || (i==(n-1) && j<(n/2))) {
				System.out.print("* ");//I
			}
			else {
				System.out.print("  ");
			}
			
		}
		for(int j=0;j<n;j++) {
			if(j==0 || i==j || j==n-1) {
				System.out.print("* ");//N
			}
			else {
				System.out.print("  ");
			}
		}
		for(int j=0;j<n;j++) {
			if(j==0 || (i==0 && j<(n/2)) || (j==(n/2) && i!=0 && i!=(n-1)) || (i==(n-1) && j<(n/2)) || j==0) {
				System.out.print("* ");//D
				
			}
			else {
				System.out.print("  ");
			}
		}
		for(int j=0;j<n;j++) {
			if(i==0 && j<(n/2) || j==(n/4) || (i==(n-1) && j<(n/2))) {
				System.out.print("* ");//I
			}
			else {
				System.out.print("  ");
			}
			
		}
		for(int j=0;j<n;j++) {
			if(i==(n/2) || (i+j==(n/2)) || (j-i==(n/2)) || (j==0 && i>=(n/2)) || (j==(n-1) && i>=(n/2))) {
				System.out.print("* ");//A
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();

	}
	}
}


