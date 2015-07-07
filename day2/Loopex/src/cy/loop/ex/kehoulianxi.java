package cy.loop.ex;

public class kehoulianxi {

	/**
	 * @param args
	 * 提示用户输入一个1-100之间的数字
	 * 假设用户输入的是13，则打印
	 *     1
	 *    222
	 *   33333
	 *  4444444
	 *  .....
	 * DDDDDDDDD  
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m=13;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m-i;j++)
			{
				System.out.print(" ");
			}
			if(i<10){
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(i);
			}
			}
			else {
				char l=0;
				switch(i)
				{
				case 10:l='A';break;
				case 11:l='B';break;
				case 12:l='C';break;
				case 13:l='D';break;
				default:System.out.println("error");break;
				}
				for(int j=1;j<=2*i-1;j++)
				{
					System.out.print(l);
				}
			}
			System.out.println("");
		}

	}

}
