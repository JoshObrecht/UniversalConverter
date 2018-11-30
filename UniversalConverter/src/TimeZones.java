import java.util.Scanner;

public class TimeZones
	{
		public static void convertTimeZones()
		{
			boolean Timechoosing = true;
		    String Start = "";
		    while (Timechoosing)
		    	{
		    		System.out.println("choose the unit of time you want to convert from.");
		    		System.out.println("1.Central Standard Time");
		    		System.out.println("2.Mountain Standard Time");
		    		System.out.println("3.Pacific Standard Time");
		    		System.out.println("4.Alaska Standard Time");
		    		System.out.println("5.Hawaii-Aleutian Standard Time");
		    		Scanner userInput = new Scanner (System.in);
		    		int choose1 = userInput.nextInt();
		    		System.out.println("what's the hour of your time?");
		    		Scanner userInput3= new Scanner (System.in);
		    		int choose3 = userInput3.nextInt();
		    		System.out.println("what's the minute of your time?");
		    		Scanner userInput4 = new Scanner (System.in);
		    		int choose4 = userInput4.nextInt();
		    		
		    		
		    		
		    		System.out.println("choose the unit of time you want to convert to.");
		    		System.out.println("1.Central Standard Time");
		    		System.out.println("2.Mountain Standard Time");
		    		System.out.println("3.Pacific Standard Time");
		    		System.out.println("4.Alaska Standard Time");
		    		System.out.println("5.Hawaii-Aleutian Standard Time");
		    		Scanner userInput2 = new Scanner (System.in);
		    		int choose2 = userInput2.nextInt();
		    		
		    		if(choose1 == 1)
		    			{
		
		    				
		    				 if (choose2 == 2)
		 
		    							{
		    								int number1 = choose3 -1;
		    								System.out.println("The new time is "+ number1+":" + choose4);
		    							}
		    						
		    				 else if (choose2 == 3)
		    							{
		    								int number2 = choose3 -2;
		    								System.out.println("The new time is " + number2+ ":" +choose4);
		    							}
		    				 else if (choose2 == 4)
		    					 {
		    						 int number3 = choose3 -3;
		    						 System.out.println("The new time is " + number3+ ":"+choose4);
		    					 }  
		    				 else if (choose2 == 5)
		    					 {
		    						 int number4 = choose3 -4;
		    						 System.out.println("The new time is " + number4+ ":"+choose4);
		    				  
		    	                 }
		    			}
		    		else if(choose1 == 2)
		    				     {
		    				    	 
		    				    	 
		    					if (choose2 == 1)
		    						{
		    							int number5 = choose3 +1;
		    							System.out.println("The new time is "+number5 + ":"+choose4);
		    						}
		    					else if (choose2 == 3)
		    			    	   {
		    			    		   int number6 = choose3 -1;
		    			    		   System.out.println("The new time is "+number6 + ":"+choose4);
		    			    	   }
		    					else if (choose2 == 4)
		    			    	   {
		    			    		   int number7 = choose3 -2;
		    			    		   System.out.println("The new time is "+number7+ ":"+choose4);
		    			    	   }
		    					else if (choose2 == 5)
		    			    	   {
		    			    		   int number8 = choose3 -3;
		    			    		   System.out.println("The new time is "+number8+ ":"+choose4);
		    			    	   }
		    				     }
		    					
		    		else if (choose1 == 3)
		    			{
		    				
		    				
		    				if(choose2 == 1)
		    					{
		    						int number9 = choose3 +2;
		    						System.out.println("The new time is "+number9+ ":"+choose4);
		    					}
		    				else if (choose2 == 2)
		    					{
		    						int number10 = choose3 +1;
		    						System.out.println("The new time is "+number10+":"+choose4);
		    					}
		    				else if (choose2 == 4)
		    					{
		    						int number11 = choose3 -1;
		    						System.out.println("The new time is "+number11+":"+choose4);
		    								
		    					}
		    				else if (choose2 == 5)
		    					{
		    						int number12 = choose3 -2;
		    						System.out.println("The new time is "+number12+":"+choose4);
		    					}
		    			}
		    	       else if (choose1 == 4)
		    			{
		    				
		    			    	if(choose2 == 1)
		    					{
		    						int number13 = choose3 +3;
		    						System.out.println("The new time is "+number13+":"+choose4);
		    					}
		    			    	else if (choose2 == 2)
		    			    		{
		    			    			int number14 = choose3 +2;
		    			    			System.out.println("The new time is "+number14+":"+choose4);
		    			    			
		    			    		}
		    			    	else if (choose2 == 3) 
		    			    		{
		    			    		     int number15 = choose3 +1;
		    			    		     System.out.println("The new time is "+number15+":"+choose4);
		    			         	}
		    			    	else if (choose2 == 5)
		    			    		{
		    			    			int number16 = choose3 -1;
		    			    			System.out.println("The new time is "+number16+":"+choose4);
		    			    		}
		    			    	
		    			}
		    			else if (choose1 == 5)
		    				{
		    				
		    					
		    					if(choose2 == 1)
		    						{
		    							int number17 = choose3 +4;
		    							System.out.println("The new time is "+number17+":"+choose4);
		    						}
		    					else if(choose2 == 2)
		    						{
		    							int number18 = choose3 +3;
		    							System.out.println("The new time is "+number18+":"+choose4);
		    						}
		    					else if(choose2 == 3)
		    						{
		    							int number19 = choose3 +2;
		    							System.out.println("The new time is "+number19+":"+choose4);
		    						}
		    					else if (choose2 == 4)
		    						{
		    							int number20 = choose3 +1;
		    							System.out.println("The new time is "+number20+":"+choose4);
		    						}
		    					
		    				}
		    			
		    			       
		    			    	   
		    				}
		    			}
		    		
		    	}
		

	
