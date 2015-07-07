package cy.loop.ex;

import java.util.Scanner;

public class xingxingtu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key=new Scanner(System.in);
		System.out.println("ÊäÈëĞÇĞÇĞĞÊı£º");
		int num=key.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print("*");
			}
			System.out.println("");
			
		}
		
		

	}

}
