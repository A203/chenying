package ExSwitch;

import java.util.Scanner;

public class Xingqi2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����Ӣ�����ڼ���");
		Scanner key=new Scanner(System.in);
		String dayString=key.nextLine();
		int day=0;
		//����month��ֵ���ж��Ǽ��·�
		switch(dayString.toLowerCase()){
		case "monday":day=1;break;
		case "tuesday":day=2;break;
		
		case "wednesday":day=3;break;
		case "thursday":day=4;break;
		case "friday":day=5;break;
		case "saturday":day=6;break;
		case "sunday":day=7;break;
		default:day=0;

		}
		if(day==0)
		{
			System.out.println("��Ч����");
		}
		else
		System.out.println("day:"+day);

	}

}