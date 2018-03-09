package pat;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class Main
{
    public static void main(String[] args)
    {
    	Scanner scanner = new Scanner(new BufferedInputStream(System.in));
    	while (scanner.hasNext())
			{
				List<Long> list = new ArrayList<>();//import文件错误会导致报错
				int count_1 = scanner.nextInt();
				for(int i=0;i<count_1;i++)
					{
						list.add(scanner.nextLong());
					}
				int count2 = scanner.nextInt();
				for(int i=0;i<count2;i++)
					{
						list.add(scanner.nextLong());
					}
				Collections.sort(list);
				//不论是Collections.sort方法或者是Arrays.sort方法，底层实现都是TimSort实现的，
				//这是jdk1.7新增的，以前是归并排序。
				//TimSort算法就是找到已经排好序数据的子序列，然后对剩余部分排序，然后合并起来
				
				int index = (count2+count_1-1)/2;
				System.out.println(list.get(index));
			}
    }



}
