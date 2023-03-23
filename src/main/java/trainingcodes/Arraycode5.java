/**
 * 
 */
package trainingcodes;

/**
 * @author Administrator
 *
 */

import java.util.Scanner;
public class Arraycode5 {

	/**
	 * @param args
	 */
	public static int linearSearch(int arr[],int key) {
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return(i+1); 
			}
		}
			return 0;
	}
		// TODO Auto-generated method stub
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element to be searched");
		int key =sc.nextInt();
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		int res=linearSearch(arr,key);
		if(res>0) {
			System.out.println("Element found in position  " +(res));
			
		}
		else {
			System.out.println("Element not found");
			
		}

	}

}
