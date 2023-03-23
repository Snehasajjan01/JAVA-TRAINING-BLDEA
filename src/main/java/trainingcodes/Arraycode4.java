/**
 * 
 */
package trainingcodes;

/**
 * @author Administrator
 *
 */

import java.util.Scanner;
public class Arraycode4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the count of movie house:");
		Scanner sc=new Scanner(System.in);
		int mov=sc.nextInt();
			System.out.println("Enter the count  of theatre in each movie house");
			int thr=sc.nextInt();
			System.out.println("enter the count of screens in each theatre");
			int scr=sc.nextInt();
			int arr[][][]=new int[mov][thr][scr];
			for(int i=0;i<arr[i].length;i++) {
				System.out.println("inside movie house"+(i+1);
				for(int j=0;j<arr[i].length;j++) {
					System.out.println("Enter the capacity of screen no:"+(k+1));
					arr[i][j][k]=sc.nextInt();
				}
		}
	}
			System.out.println("------");
			for(int i=0;i<arr.length;i++) {
				System.out.println("inside the movie house no:"+(i+1));
				for(int j=0;j<arr[i].length;j++) {
					System.out.println("inside the theatre no:"+(j+1));
					for(int k=0;k<arr[i][j].length;k++) {
						System.out.println("enter the capacity of scree no"+(k+1));
						arr[i][j][k]=sc.nextInt();
					}
				}
			}
	
	
