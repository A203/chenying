package ExIfElse;

import java.util.Scanner;

public class Ex3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key=new Scanner(System.in);
		System.out.println("请输入成绩");
		int score=key.nextInt();
		if(score<=0||score>100)
		{
			System.out.println("输入有误！");
		}
		else if(score>=60)
		{
			System.out.println("成绩合格！");
		}
		else
			System.out.println("成绩不合格！");
	}

}
