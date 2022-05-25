package java_quiz;
import java.util.Scanner;
import java.util.Random;
public class Main_quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int easy[] = new int[5];
		int med[] = new int[5];
		int hard[] = new int[5];
		int question_counter=0,ec=0,mc=0,hc=0;
		Easy e = new Easy();
		Medium m = new Medium();
		Hard h = new Hard();
		Master mas = new Master();
		Rules rule = new Rules();
        System.out.println("=================================================================");
        System.out.println("|                      Welcome to Java Quiz                     |");
        System.out.println("=================================================================\n");
        System.out.println("\n-----: Rules of quiz :-----\n");
        rule.display();
        System.out.println("\nPress Enter key to continue........");
        try{
    	System.in.read();
    	}
    	catch(Exception ex)
    	{}
        System.out.println();
    	while(question_counter<16)
    	{
    		if(question_counter<5)
    		{
    			int i = rand.nextInt(20);
    			int random_condition=0;
    			for(int j=0;j<ec;j++)
    			{
    				if(i==easy[j])
    					break;
    				else
    					random_condition++;
    			}
    			if(random_condition==ec)
    			{
    				easy[ec++]=i;
   					question_counter++;
   					System.out.println("\n\n-----: Qustion No. : "+(question_counter)+" :-----");
   					e.display(i);
   					System.out.print("Enter your correct option : ");
    				char a = sc.next().charAt(0);
    				while(a<65 || a>68)
    				{
    					System.out.println("Invalid Option.\n");
   						System.out.print("Enter your correct option : ");
   						a = sc.next().charAt(0);
    				}
    				boolean ans = e.answer(a, i);
    				if(ans)
    				{
   						System.out.println("\nCongratulation!!!\nYou have unlocked new Badge : Bronze "+(5-ec+1));
   						System.out.println("\nPress Enter key to continue........");
   						try{
    						System.in.read();
    					}
    					catch(Exception ex)
    					{}
    				}
    				else
   					{
   						System.out.println("\nOOOPs!!! Incorrect Answer.");
   						e.right(i);
   						if(ec==1)
    						System.out.println("No badges are unlocked.\n");
    					else
    						System.out.println("Your final Java Badge is : Bronze "+(5-ec+2));
    					break;
    				}
    			}
   		}
   			else if(question_counter<10 && question_counter>=5)
   			{
   				int i = rand.nextInt(20);
    			int random_condition=0;
    			for(int j=0;j<mc;j++)
    			{
   					if(i==med[j])
   						break;
   					else
   						random_condition++;    				
   				}
    			if(random_condition==mc)
    			{
    				med[mc++]=i;
   					question_counter++;
   					System.out.println("\n\n-----: Qustion No. : "+(question_counter)+" :-----");
   					m.display(i);
    				System.out.print("Enter your correct option : ");
    				char a = sc.next().charAt(0);
    				while(a<65 || a>68)
    				{
    					System.out.println("Invalid Option.\n");
   						System.out.print("Enter your correct option : ");
   						a = sc.next().charAt(0);
   					}
    				boolean ans = m.answer(a, i);
    				if(ans)
    				{
    					System.out.println("\nCongratulation!!!\nYou have unlocked new Badge : Silver "+(5-mc+1));
   						System.out.println("\nPress Enter key to continue........");
   						try{
   							System.in.read();
   						}
    					catch(Exception ex)
    					{}
    				}
    				else
    				{
    					System.out.println("\nOOOPs!!! Incorrect Answer.");
   						m.right(i);
   						if(mc==1)
   							System.out.println("Your final Java Badge is : Bronze 1");
   						else
    						System.out.println("Your final Java Badge is : Silver "+(5-mc+2));
    					break;
    				}
    			}
    		}
   			else if(question_counter<15 && question_counter>=10)
   			{
    			int i = rand.nextInt(20);
    			int random_condition=0;
    			for(int j=0;j<hc;j++)
    			{
   					if(i==hard[j])
    					break;
    				else
    					random_condition++;
    			}
    		if(random_condition==hc)
   				{
   					hard[hc++]=i;
   					question_counter++;
    				System.out.println("\n\n-----: Qustion No. : "+(question_counter)+" :-----");
    				h.display(i);
    				System.out.print("Enter your correct option : ");
    				char a = sc.next().charAt(0);
   					while(a<65 || a>68)
   					{
    					System.out.println("Invalid Option.\n");
    					System.out.print("Enter your correct option : ");
    					a = sc.next().charAt(0);
    				}
    				boolean ans = h.answer(a, i);
    				if(ans)
   					{
   						System.out.println("\nCongratulation!!!\nYou have unlocked new Badge : Gold "+(5-hc+1));
    					System.out.println("\nPress Enter key to continue........");
    					try{
    						System.in.read();
    					}
   						catch(Exception ex)
    					{}
   					}
   					else
   					{
    					System.out.println("\nOOOPs!!! Incorrect Answer.");
    					h.right(i);
    					if(hc==1)
    						System.out.println("Your final Java Badge is : Silver 1");
    					else
    						System.out.println("Your final Java Badge is : Gold "+(5-hc+2));
   						break;
   					}
   				}
   			}
    		else
    		{
    			question_counter++;
   				int i = rand.nextInt(5);
   				System.out.println("\n-----Jackpot Question-----");
   				mas.display(i);
   				System.out.print("Enter your correct option : ");
    			char a = sc.next().charAt(0);
    			boolean ans = mas.answer(a, i);
    			if(ans)
    				System.out.println("\nCongratulation!!!\nYou are MASTER of Java.\n");
   				else
   				{
   					System.out.println("\nOOOPs!!! Incorrect Answer.");
    				mas.right(i);
    				System.out.println("Your final Java Badge is : Gold 1");
    			}
    		}
       }
	sc.close();
	}
}
