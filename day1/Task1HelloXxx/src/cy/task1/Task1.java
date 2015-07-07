package cy.task1;
import java.util.Scanner;
public class Task1 {

	/**
	 * @param args
	 * 从命令参数中接收姓名，在程序打印 Hello xxxxx
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		System.out.println("请输入某人姓名：");
		String name=keyboard.next();
		System.out.println("Hello "+name);
		
		
		

	}

}
