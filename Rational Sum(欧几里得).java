package test1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
    		Scanner scanner = new Scanner(System.in);
    		int num = scanner.nextInt();
    		String[] strings = new String[num];
    		int fenzi=0;int fenmu=0;int zhengshu=0;
    		
    		for (int i = 0; i < num; i++)
				{
					strings[i]=scanner.next();
				}
    		scanner.close();
    		
    		for (int i = 0; i < num; i++)
				{
					int flag=1,begin=0;
					if(strings[i].charAt(0)=='-')
						{
							flag=-1;
							begin=1;
						}
					
					int tempfenzi=flag*Integer.parseInt(strings[i].substring(begin, strings[i].indexOf("/")));
					int tempfenmu=Integer.parseInt(strings[i].substring(strings[i].indexOf("/")+1));
					if(tempfenmu==0)
						{
							return;
						}

					
					if(i==0)
						{
							fenzi = tempfenzi;
							fenmu = tempfenmu;
						}
					else {
						fenzi = fenzi * tempfenmu+tempfenzi*fenmu;
						fenmu=fenmu*tempfenmu;
					}
					//Å·¼¸ÀïµÃ
					int factor = gcd(fenzi,fenmu);
					if(factor==0)
						{
							System.out.println(0);
							return;
						}
					fenzi/=factor;
					fenmu/=factor;
				}
    		
    		zhengshu=zhengshu+fenzi/fenmu;
    		fenzi =fenzi%fenmu;
    		if (zhengshu!=0)
    			if(fenzi!=0)
    				System.out.println(zhengshu+" "+fenzi+"/"+fenmu);
    			else {
					System.out.println(zhengshu);
				}
    		else if (fenzi!=0) {
				System.out.println(fenzi +"/"+fenmu);
    		}
				else {
					System.out.println(0);
			}		
    }
    
    private static int gcd(int a,int b)
	{
		if(a==0)
			return 0;
		if(a<0)
			a=-a;
		if(b<0)
			b=-b;
		if(a<b)
			{
				int temp = a;
				a=b;
				b= temp;
			}
		if(a%b==0)
			return b;
		else
			return gcd(b, a%b);
	}
}