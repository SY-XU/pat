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
				List<Long> list = new ArrayList<>();//import�ļ�����ᵼ�±���
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
				//������Collections.sort����������Arrays.sort�������ײ�ʵ�ֶ���TimSortʵ�ֵģ�
				//����jdk1.7�����ģ���ǰ�ǹ鲢����
				//TimSort�㷨�����ҵ��Ѿ��ź������ݵ������У�Ȼ���ʣ�ಿ������Ȼ��ϲ�����
				
				int index = (count2+count_1-1)/2;
				System.out.println(list.get(index));
			}
    }



}
