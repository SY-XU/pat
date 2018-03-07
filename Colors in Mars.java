package test1;

import java.util.Scanner;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) 
	{
		int R,G,B;
		Scanner input = new Scanner(System.in);
		R=input.nextInt();G=input.nextInt();B=input.nextInt();
		input.close();
		
		String r,g,b;
		r=Integer.toString(R,13).toUpperCase();
		g=Integer.toString(G,13).toUpperCase();
		b=Integer.toString(B,13).toUpperCase();
		
		
		System.out.print("#");
		if(r.length()==1)
			{
				System.out.print("0");
				System.out.print(r);
			}
		else
			{
				System.out.print(r);
			}
		
		if(g.length()==1)
			{
				System.out.print("0");
				System.out.print(g);
			}
		else
			{
				System.out.print(g);
			}
		
		if(b.length()==1)
			{
				System.out.print("0");
				System.out.print(b);
			}
		else
			{
				System.out.print(b);
			}
	}
}