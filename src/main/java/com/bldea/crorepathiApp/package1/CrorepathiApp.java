/**
 * 
 */
package com.bldea.crorepathiApp.package1;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class CrorepathiApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to Crorepathi Game");
		System.out.println("Lets Welcome our first candidate");
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.next();
		System.out.println("What is your age?");
		int age = sc.nextInt();
		System.out.println("Which is your city?");
		String city = sc.next();
		System.out.println("Which is your state?");
		String state = sc.next();
		Candidate c1 = new Candidate(name,age,city,state);
		System.out.println("Congratualtions Mr/Ms."+c1.getName()+ " for being selected for the hot seat.");
		System.out.println("Rules of the game");
	    System.out.println("1.There will be 10 questions which rewards specific amount in the"+"Incremental order");
	    System.out.println("2.The game will contain 3 life-lines."+"(audience phone,50-50 and skip");
	    System.out.println("3.You can quit the game at any stage");
	    System.out.println("Please press 1 if you wish to see the reward per question"+ "else press any key.");
	    int press_1=sc.nextInt();
	    if(press_1==1) {
	    	System.out.println("Question-1:1000\n"+
	                           "Question-2:5000\n"+
	    			           "Question-3:10000\n"+
	                           "Question-4:20000\n"+
	    			           "Question-5:50000\n"+
	                           "Question-6:1,00,000\n"+
	    			           "Question-7:10,00,000\n"+
	                           "Question-8:50,00,000\n"+
	    			           "Question-9:70,00,000\n"+
	                           "Question-10:1,00,00,000\n");
	    	System.out.println("Do you wish to continue??(type:Y/N)");
	    	}
	    else {
	    	System.out.println("Do you wish to continue??(type:Y/N)");
	    }
	    	String press_2 = sc.next();
	    	if(press_2.equalsIgnoreCase("yes")==true) {
	    		System.out.println("Let's start the game");
	    		System.out.println("Here is your first question");
	    		boolean res1 = Questions.fetchQuestion1(c1.getName());
	    		if(res1==true) {
	    			System.out.println("Congratulations your answer is correct.\n"+"You have won Rs."+c1.getAmount());
	    			System.out.println("Here is your next Question.");
	    			boolean res2 = Questions.fetchQuestion2(c1.getName());
	    			if(res2==true) {
	    				System.out.println("Congratulations your answer is correct.\n"+"You have won Rs."+c1.getAmount());
	    				System.out.println("Here is your next Question.");
	    				boolean res3 = Questions.fetchQuestion3(c1.getName());
	    				if(res3==true) {
	    					System.out.println("Congratulations your answer is correct.\n"+"You have won Rs."+c1.getAmount());
		    				System.out.println("Here is your next Question.");
		    				boolean res4 = Questions.fetchQuestion4(c1.getName());
		    				if(res4==true) {
		    					System.out.println("Congratulations your answer is correct.\n"+"You have won Rs."+c1.getAmount());
			    				System.out.println("Here is your next Question.");
			    				boolean res5 = Questions.fetchQuestion5(c1.getName());
			    				if(res5==true) {
			    					System.out.println("Congratulations your answer is correct.\n"+"You have won Rs."+c1.getAmount());
				    				System.out.println("Here is your next Question.");
				    				boolean res6 = Questions.fetchQuestion6(c1.getName());
				    				if(res6==true) {
				    					System.out.println("Congratulations your answer is correct.\n"+"You have won Rs."+c1.getAmount());
					    				System.out.println("Here is your next Question.");
					    				boolean res7 = Questions.fetchQuestion7(c1.getName());
					    				if(res7==true) {
					    					System.out.println("Congratulations your answer is correct.\n"+"You have won Rs."+c1.getAmount());
						    				System.out.println("Here is your next Question.");
						    				boolean res8 = Questions.fetchQuestion8(c1.getName());
						    				if(res8==true) {
						    					System.out.println("Congratulations your answer is correct.\n"+"You have won Rs."+c1.getAmount());
							    				System.out.println("Here is your next Question.");
							    				boolean res9 = Questions.fetchQuestion9(c1.getName());
							    				if(res9==true) {
							    					System.out.println("Congratulations your answer is correct.\n"+"You have won Rs."+c1.getAmount());
								    				System.out.println("Here is your next Question.");
								    				boolean res10 = Questions.fetchQuestion10(c1.getName());
								    				if(res10==true) {
								    					System.out.println("Congratulations your answer is correct.\n"+"You have won Rs."+c1.getAmount());
									    			}
								    				else {
								    					System.out.println("We are sorry!your answer is incorrect.\n"+"You have won Rs."+c1.getAmount());
								    				}
								    				}
							    				else {
							    					System.out.println("We are sorry!your answer is incorrect.\n"+"You have won Rs."+c1.getAmount());
							    				}
							    					
							    				}
						    				else {
						    					System.out.println("We are sorry!your answer is incorrect.\n"+"You have won Rs."+c1.getAmount());
						    				}
						    					
						    				}
					    				else {
					    					System.out.println("We are sorry!your answer is incorrect.\n"+"You have won Rs."+c1.getAmount());
					    				}
					    					
					    				}
				    				else {
				    					System.out.println("We are sorry!your answer is incorrect.\n"+"You have won Rs."+c1.getAmount());
				    				}
				    					
				    				}
			    				else {
			    					System.out.println("We are sorry!your answer is incorrect.\n"+"You have won Rs."+c1.getAmount());
			    					
			    				}
		    				}
		    				else {
		    					System.out.println("We are sorry!your answer is incorrect.\n"+"You have won Rs."+c1.getAmount());
		    					
		    				}
	    				}
		    				else {
	    					System.out.println("We are sorry!your answer is incorrect.\n"+"You have won Rs."+c1.getAmount());
	    					
	    				}
	    			}
	    			else {
	    				System.out.println("We are sorry!your answer is incorrect.\n"+"You have won Rs."+c1.getAmount());
	    			}
	    		}
	    		else {
	    			System.out.println("We are sorry!your answer is incorrect.\n"+"You have won Rs."+c1.getAmount());
	    			
	    		}
	    	}
	    	
	    	else {
	    	System.out.println("Thank you.Good luck next time");
	    }
	    }
	}  



