package test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings ={"ling","yi","er","san","si","wu","liu","qi","ba","jiu","shi"};
        String[]  demo = {"Shi","Bai","Qian","Wan","Yi"};
        String text= new String();
        String ans = new String();
        char temp;
        text=scanner.next();
        scanner.close();
 
        int flag=0;
        temp = text.charAt(0);
        if (temp=='-')
            {
                flag=1;
            }
        int t_len = text.length()-flag;
        int num=0;
        for (int i = 0; i < text.length(); i++)
			{
				char x=text.charAt(i);
				if((x>'a' &&x<'z' )||(x>'A'&&x<'Z') ){
				num++;
				}
			}
        if(num>0)
        	{
        		System.out.println("ling");
        		t_len=-1;
        	}
        if (t_len==9)
            {
                String p1 = text.substring(flag, t_len-8+flag);
                String p2 =text.substring(t_len-8+flag,t_len-4+flag);
                String p3= text.substring(t_len-4+flag,text.length());
                String pp1 = Process(p1),pp2=Process(p2),pp3=Process(p3);
                if(flag==1)
                    {
                        ans="Fu ";
                    }
                ans+=pp1+"Yi "+pp2+"Wan "+pp3;
                System.out.println(ans);
            }
        if(t_len>4&&t_len<=8)
            {
                String p1 = text.substring(flag, t_len-4+flag);
                String p2= text.substring(t_len-4+flag,text.length());
                String pp1=Process(p1),pp2=Process(p2);
                if(flag==1)
                    {
                        ans="Fu ";
                    }
                ans+=pp1+"Wan "+pp2;
                System.out.println(ans);
                }
             
        if(t_len<=4)
            {
                if(flag==1)
                    {
                        ans="Fu ";
                    }
                ans+=Process(text);
                System.out.println(ans);
            }
         
    }
 
    public static String Process(String a)
    {
        String[] strings ={"ling ","yi ","er ","san ","si ","wu ","liu ","qi ","ba ","jiu ","shi "};
        String[]  demo = {"","Shi ","Bai ","Qian ","Wan ","Yi"};
        String tmp=new String();
        int temp=0;
        int ctrl = 0;
        for (int i = 0; i < a.length(); i++)
            {
                temp =Integer.parseInt(String.valueOf((a.charAt(i))));
                if(temp==0)
                    {
                        ctrl=ctrl+1;
                        continue;
                    }
                if(temp!=0||i==a.length()-1)
                    {
                        if(ctrl>=1)
                            tmp=tmp+"ling ";
                        ctrl=0;
                    }
                tmp+=strings[temp]+ demo[a.length()-i-1];
            }
        return tmp;
    }
}