package test1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) 
	{
		//���ʣ� ͬʱɾ��������ͬ�������������䡣 ������������¼һ����x�� 
		//��һ���� y,��x��ͬ�Ļ��Ͱ�x ,y�����ˣ�
		//�൱���ӵ�������ͬ��������x��ͬ�Ļ����ͰѼ�������1��
		
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