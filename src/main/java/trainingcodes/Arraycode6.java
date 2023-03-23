/**
 * 
 */
package trainingcodes;

/**
 * @author Administrator
 *
 */

import java.util.Scanner;
import java.util.Arrays;
public class Arraycode6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,5,6,7,8,9};
		int arr2[]= {1,2,3,4,5,6,7,8,9};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(arr1.length==arr2.length) {
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i]!=arr2[i]) {
					System.out.println("Arrays are nt equal");
					System.exit(0);
				}
			}
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are nt equal");
		}
	}

}
