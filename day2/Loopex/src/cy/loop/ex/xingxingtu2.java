package cy.loop.ex;

import java.util.Scanner;

public class xingxingtu2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*       *     
		 *      ***
		 *     *****
		 *    *******
		 *   *********
		 *   行   星星数   前面的空
		 *   1   1     
		 *   
		 */
		System.out.println("请输入行数：");
		Scanner keyboard=new Scanner(System.in);
		int num;
		num=keyboard.nextInt();
		for(int i=1;i<=num;i++){
			for(int j=1;j<=num-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
