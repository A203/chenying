package cy.continuebreak;

public class Breakdemo1 {

	/**
	 * @param args
	 * �ҳ�1-99֮���һ���ܹ���5��������������ӡ
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
