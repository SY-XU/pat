package test1;

import java.util.Scanner;

 class TreeNode
{
	int val;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int val)
	{
		this.val = val;
	}

}
 
public class Main {
	
	static Scanner input = new Scanner(System.in);
	private static int n;
	private static int count= 0;
	private static StringBuffer resultBuffer = new StringBuffer();
   
	public static void  postorder(TreeNode root)
	{
		if(root!=null)
			{
				postorder(root.left);
				postorder(root.right);
				resultBuffer.append(root.val +" ");
			}
	}
	
	public static TreeNode buildTree()
	{
		TreeNode node = null;
		if(count<2*n)
			{
				String line = input.nextLine().trim();//trim()�������ص����ַ��������һ��������
																//����������ʼ�ͽ�β�Ŀո񶼱�ɾ����
				if(line.startsWith("Push"))
					{
						int value = Integer.parseInt(line.split(" ")[1]);
						node = new TreeNode(value);
						count++;
					}
				else
					{
						count++;
						return null;
					}
				node.left = buildTree();
				node.right = buildTree();
			}
		return node;
	}
	
	public static void main(String[] args) 
	{
		  //��nextint��nextlneһ���õ�ʱ������ȫ������nextline 
		n = Integer.parseInt(input.nextLine().trim());
		TreeNode rootNode = buildTree();
		postorder(rootNode);
		System.out.println(resultBuffer.toString().trim());
    }
}