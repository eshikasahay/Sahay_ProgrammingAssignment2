import java.util.Scanner;

public class Problem3 
{

	public static void main(String[] args) 
	{
		String[] topics = {"Water Pollution", "Global Warming", "Over-population", "Air Pollution", "Political Issues"};
		int[][] responses = new int[5][10];
		int c = 1, rate, num=0;
		double total[] = {0, 0, 0, 0, 0};
		double max, min;
		int i, j;
		
		Scanner sc = new Scanner(System.in);
				
		while(c==1)
		{
			for(j=0;j<5; j++)
			{
				System.out.println("Rate '"+topics[j]+"' from 1 (least important) to 10 (most important)");
				rate = sc.nextInt();
				total[j]+= rate;
				responses[j][rate-1]++;
			}
			num++;
			System.out.println("\nENTER 1 TO KEEP RATING OR 0 TO SHOW SUMMARY");
			c = sc.nextInt();
			System.out.println();
		}
		
		System.out.println("\nSUMMARY\n");
		System.out.println("\t\t\t\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\tAvg");
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		
		for(i=0; i<5; i++)
		{
			System.out.print((i+1)+") "+topics[i]+"\t\t");
			for(j=0; j<10; j++)
			{
				System.out.print(responses[i][j]+"\t");
			}
			System.out.println((total[i]/num));
		}
		
		max = total[0];
		min = total[0];
		
		for(i=1; i<5; i++)
		{
			if(total[i] > max)
			{
				max = total[i];
			}
			if(total[i] < min)
			{
				min = total[i];
			}
		}
		System.out.println();
		for(i=0; i<5; i++)
		{
			if(total[i] == max)
				System.out.println("'"+topics[i]+"' issue received the highest point total. Total points: "+(int)max);
		}
		System.out.println();
		for(i=0; i<5; i++)
		{
			if(total[i] == min)
				System.out.println("'"+topics[i]+"' issue received the lowest point total. Total points: "+(int)min);
		}

	}

}
