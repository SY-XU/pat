package pat;

import java.util.Arrays;
import java.util.Scanner;
 
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n,m;
        int[] s1 = new int[1000000];
        int[] s2 = new int[1000000];
         
        n = input.nextInt();
        for(int i =0;i<n;i++)
            {
                s1[i] = input.nextInt();
            }
        m = input.nextInt();
        for(int i=0;i<m;i++)
            {
                s2[i] = input.nextInt();
            }
         
        int[] temp = new int[n+m];
        for(int i=0;i<n;i++)
            {
                temp[i] = s1[i];
            }
        for(int i=0;i<m;i++)
            {
                temp[n+i]=s2[i];
            }
         
        Arrays.sort(temp);
        //这里temp的大小不能提前规定，否则会前面一大堆0
        n=n+m;
        if(n%2==0)
            {
                System.out.println(temp[n/2-1]);
            }
        else if (n%2==1)
            {
                System.out.println(temp[n/2]);
            }
 
    }

}
