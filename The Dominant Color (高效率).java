package test1;

import java.util.Scanner;

public class Main {
	public static int judge(long[][] temp ,long num,int count)
	 {
		 for (int i = 0; i < count; i++)
			{
				if(num==temp[i][0])
					{
						return i;
					}
			}
		 return 0;
	 }

	public static void main(String[] args) 
	{
		int K,C;
		int count=0;
		Scanner input = new Scanner(System.in);
		K=input.nextInt();C=input.nextInt();
		long[][] temp = new long[K*C][2];
		
		long tem=0;
		long b;
		for (int i = 0; i < K*C; i++)
			{
				b=input.nextLong();
				tem = judge(temp,b,count);
				if(tem==0)
					{
						temp[count][0]=b;
						temp[count][1]++;
						count++;
					}
				if(tem>0)
					{
						temp[(int)tem][1]++;
					}
			}
		input.close();
		
		long a=temp[0][1];
		int record=0;
		for (int i = 0; i <count; i++)
			{
				if(temp[i][1]>a)
					{
						record = i;
					}
			}
		
		System.out.println(temp[record][0]);
    }
}