package cy.choose;
import java.util.Scanner;
public class Task5Choose {

	/**
	 * @param args
	 * 编写一个应用程序绘制一个如下的操作菜单。 
| 1. 增加1个学生 | 
| 2. 显示所有学生 | 
| 3. 退出程序 | 
| 请输入选择（1-3）：
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		System.out.printf("1. 增加1个学生%n2. 显示所有学生%n3. 退出程序 %n请输入您想要的操作序号(1-3)");
		int i=keyboard.nextInt();
		switch(i)
		{
		case 1:
			System.out.println("增加1个学生");
			break;
		case 2:
			System.out.println("显示所有学生");
		    break;
		case 3:
			System.out.println("退出程序");
		    break;
			
		}
		

	}

}
