package cy.choose;
import java.util.Scanner;
public class Task5Choose {

	/**
	 * @param args
	 * ��дһ��Ӧ�ó������һ�����µĲ����˵��� 
| 1. ����1��ѧ�� | 
| 2. ��ʾ����ѧ�� | 
| 3. �˳����� | 
| ������ѡ��1-3����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		System.out.printf("1. ����1��ѧ��%n2. ��ʾ����ѧ��%n3. �˳����� %n����������Ҫ�Ĳ������(1-3)");
		int i=keyboard.nextInt();
		switch(i)
		{
		case 1:
			System.out.println("����1��ѧ��");
			break;
		case 2:
			System.out.println("��ʾ����ѧ��");
		    break;
		case 3:
			System.out.println("�˳�����");
		    break;
			
		}
		

	}

}