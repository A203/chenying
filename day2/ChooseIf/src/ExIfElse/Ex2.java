package ExIfElse;

import java.util.Scanner;

public class Ex2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ѧ��de���������ѧ���ĳɼ��ȼ�
		Scanner keyboard=new Scanner(System.in);
		System.out.println("������ɼ���");
		int score=keyboard.nextInt();//��������

		if(score>=90)
		{
			System.out.println("�ȼ�ΪA");
		}
		else if(score>=80)
		{
			System.out.println("�ȼ�ΪB");
		}
		else if(score>=70)
		{
			System.out.println("�ȼ�ΪC");
		}
		else if(score>=60)
		{
			System.out.println("�ȼ�ΪD");
		}
		else
			System.out.println("�ȼ�ΪE");

	}

}