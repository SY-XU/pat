package test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int begin=0,over=0;
        num = scanner.nextInt();
        String[] text = new String[num+1];
        for (int i = 0; i <=num; i++)
			{
				text[i]=scanner.nextLine();
			}
        begin=scanner.nextInt();
        over=scanner.nextInt();
        scanner.close();
        
        int temp_score_1=0;
        int temp_score_2=0;
        for (int i = 1; i <= num; i++)
			{
				for (int j =1; j <= num-i; j++)
					{
						String temp;
						temp_score_1=Integer.parseInt(text[j].substring(text[j].lastIndexOf(" ")+1,text[j].length()));
						temp_score_2=Integer.parseInt(text[j+1].substring(text[j+1].lastIndexOf(" ")+1,text[j+1].length()));
						if(temp_score_1<temp_score_2)
							{
								temp = text[j+1];
								text[j+1]=text[j];
								text[j]=temp;
							}
					}	
			}
        int flag=0;
        String out;
        for (int i = 1; i <= num; i++)
			{
				temp_score_1=Integer.parseInt(text[i].substring(text[i].lastIndexOf(" ")+1,text[i].length()));
				out = text[i].substring(0, text[i].lastIndexOf(" "));
				if(temp_score_1<=over&&temp_score_1>=begin)
					{
						flag++;
						System.out.println(out);
					}
			}
        if (flag==0)
			{
				System.out.println("NONE");
			}
     
    }
}