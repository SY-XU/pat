package test1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) 
	{
		//本质： 同时删掉两个不同的数，众数不变。 于是我们随便记录一个数x， 
		//来一个数 y,和x不同的话就把x ,y都扔了，
		//相当于扔掉两个不同的数，和x相同的话，就把计数器加1。
		
		int m,n,answer=0;
		Scanner input = new Scanner(System.in);
		m=input.nextInt();
		n=input.nextInt();
		for (int i = m*n,time=0;i>0; --i)
			{
				int x;
				x=input.nextInt();
				if(time==0)
					{
						answer=x;
					}
				if(x==answer)
					{
						time++;
					}
				else
					{
						time--;
					}
			}
		System.out.println(answer);
		
	}
}