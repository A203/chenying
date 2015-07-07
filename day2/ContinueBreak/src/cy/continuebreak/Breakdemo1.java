package cy.continuebreak;

public class Breakdemo1 {

	/**
	 * @param args
	 * 找出1-99之间第一个能够被5整除的数，并打印
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=99;i++)
		{
			if(i%5==0)
			{
				System.out.println(i);
				break;
			}
		}

	}

}
