package test1;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;


public class Main {
	public static boolean isMoreThan(String pre, String next)
	 {
	        char[] c_pre = pre.toCharArray();
	        char[] c_next = next.toCharArray();
	        
	        int minSize = Math.min(c_pre.length, c_next.length);
	        
	        for (int i = 0; i < minSize; i++) {
	            if((int)c_pre[i] > (int)c_next[i]){
	                return true;
	            }else if((int)c_pre[i] < (int)c_next[i]){
	                return false;
	            }
	        }
	        if(c_pre.length > c_next.length){
	            return true;
	        }
	        
	        return false;
	    }
	public static void main(String[] args) 
	{
		int N,C;
		Scanner input = new Scanner(System.in);
		N=input.nextInt();C=input.nextInt();
		String[] stu = new String[N+1];
		for (int i = 0; i <=N; i++)
			{		
				stu[i]=input.nextLine().trim();
			}
		input.close();

		for (int i = 1; i <= N; i++)
			{
				for (int j = 1; j <= N-i; j++)
					{
						int temp1=Integer.parseInt(stu[j].split(" ")[0]);
						int temp2=Integer.parseInt(stu[j+1].split(" ")[0]);
						String temp;
						if(temp1>temp2)
							{
								temp = stu[j+1];
								stu[j+1]=stu[j];
								stu[j]=temp;
							}
					}	
			}
		
		if(C==3)
			{
			for (int i = 1; i <=N; i++)
				{
					for (int j = 1; j <= N-i; j++)
						{
							int temp1=Integer.parseInt(stu[j].split(" ")[2]);
							int temp2=Integer.parseInt(stu[j+1].split(" ")[2]);
							String temp;
							if(temp1>temp2)
								{
									temp = stu[j+1];
									stu[j+1]=stu[j];
									stu[j]=temp;
								}
						}	
				}
			}
		
		if(C==2)
			{
				for (int i = 1; i <=N; i++)
					{
						for (int j = 1; j <= N-i; j++)
							{
								String temp1=stu[j].split(" ")[1];
								String temp2=stu[j+1].split(" ")[1];
								String temp;
								if(isMoreThan(temp1, temp2))
									{
										temp = stu[j+1];
										stu[j+1]=stu[j];
										stu[j]=temp;
									}
							}	
					}
			}

		for (int i = 1; i <= N; i++)
			{
				System.out.println(stu[i].trim());
			}
	}
}