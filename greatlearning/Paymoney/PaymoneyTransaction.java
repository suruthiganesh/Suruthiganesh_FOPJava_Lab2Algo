package greatlearning;

import java.util.Scanner;

public class PaymoneyTransaction
{
	static int targetvalue ;

	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size  = sc.nextInt();
		int[] inputarrvalues =  new int[size];
		System.out.println( "Enter the array values");
		for (int i = 0; i < size; i++)

			inputarrvalues[i] = sc.nextInt();

		System.out.println("enter the total no of transactions to be achieved");
		 int totalnumoftargets = sc.nextInt();

		while ( totalnumoftargets > 0) 
		{

			int flag = 0;
			System.out.println("enter the value of target");
			targetvalue = sc.nextInt();

			long initialvalue = 0;

			for (int i = 0; i < size; i++)
			{ 

				initialvalue = initialvalue + inputarrvalues[i];

				if (initialvalue >= targetvalue) 
				{

					System.out.println("Target achieved after "+(i + 1) + " transactions ");

					flag = 1;

					break;

				}

			}

			if (flag==0){

				System.out.println(" Given target is not achieved ");
			}
				System.out.println("Do you want to continue 1.yes 2.no");
				int choice = sc.nextInt();
				if (choice==2)
				{
					System.out.println("Exited successfully");
					break;
				}
				

			   

		   }

	}
	
}



		
	




