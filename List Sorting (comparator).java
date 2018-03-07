package test1;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;



public class Main {
	
	class student
	{
		public int ID;
		public String name;
		public int grade;
		
		public student(int id,String name,int grade)
		{
			this.ID =id;
			this.name=name;
			this.grade=grade;
		}
	}

	private static Main test;
	
	public int N,C;
	public student[] record;
	
	public void run()
	{
		Scanner input = new Scanner(System.in);
		N = input.nextInt();
		C = input.nextInt();
		
		record = new student[N];
		
		for (int i = 0; i < record.length; i++)
			{
				record[i]=new student(input.nextInt(), input.next(), input.nextInt());
			}
		
		if(C==1) Arrays.sort(record, new comparator1());
		else if(C==2) Arrays.sort(record, new comparator2());
		else if(C==3) Arrays.sort(record,new comparator3());
		
		input.close();
		
		for(int i=0;i<N;i++)
			{
				String id =record[i].ID+"";
				int dif =  6 - id.length();
				for(int j = 0; j <dif;j++)
					{
						id = "0" + id;
					}
				System.out.println(id+" "+record[i].name+" "+record[i].grade);
			}
		
	}
	
	class comparator1 implements Comparator<student>
	{
		public int compare(student a,student b)
		{
			if(a.ID>b.ID) return 1;
			else if(a.ID<b.ID) return -1;
			else return 0;
		}
	}
	 
	class comparator2 implements Comparator<student>
	{
		public int compare(student a,student b)
		{
			int res=a.name.compareTo(b.name);
			if(res!=0) return res;
			else {
				if(a.ID>b.ID) return 1;
				else if (a.ID<b.ID) return -1;
				else
					{
						if(a.ID>b.ID) return 1;
						else if(a.ID<b.ID) return -1;
						else return 0;
					}
			}
		}
	}
		class comparator3 implements Comparator<student>
		{
			public int compare(student a, student b)
			{
				if(a.grade>b.grade) return 1;
				else if (a.grade<b.grade) return -1;
				else 
					{
						if(a.ID>b.ID) return 1;
						else if(a.ID<b.ID) return -1;
						else return 0;
					}
			}
		}

	
	public static void main(String[] args) 
	{
		Main.test = new Main();
		test.run();
	}

}