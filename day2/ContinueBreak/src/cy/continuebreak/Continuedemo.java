package cy.continuebreak;

public class Continuedemo {

	/**
	 * @param args
	 * ��ӡ1-99֮���ܹ���5������������¼������Ҫ������ֵĸ���
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,count=0;
		for(i=1;i<=99;i++)
		{
			if(i%5==0)
			{
				System.out.println("i="+i);
				continue;
			}
			count++;
		}
		System.out.println("count="+count);

	}

}