package ExIfElse;

import java.util.Scanner;

public class Ex3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key=new Scanner(System.in);
		System.out.println("������ɼ�");
		int score=key.nextInt();
		if(score<=0||score>100)
		{
			System.out.println("��������");
		}
		else if(score>=60)
		{
			System.out.println("�ɼ��ϸ�");
		}
		else
			System.out.println("�ɼ����ϸ�");
	}

}
