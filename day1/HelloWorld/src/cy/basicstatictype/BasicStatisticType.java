package cy.basicstatictype;

public class BasicStatisticType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte��������λ���Լ������Сֵ
		System.out.println("�������ͣ�byte������λ�� "+Byte.SIZE);
		System.out.println("�������ͣ�byte���ֵ "+Byte.MAX_VALUE);//-128��127��������-128
		System.out.println("�������ͣ�byte��Сֵ "+Byte.MIN_VALUE);
		//float��������λ���Լ������Сֵ
		System.out.println("�������ͣ�float������λ�� "+Float.SIZE);
		System.out.println("�������ͣ�float���ֵ "+Float.MAX_VALUE);//float���ܱ�ʾ����С����
		System.out.println("�������ͣ�float��Сֵ "+Float.MIN_VALUE);
		
		//byte�������ݸ�ֵ
		byte b=50;
		//byte b1=130;//������byte���ͱ�ʾ�����ݷ�Χ
		//float�������ݸ�ֵ
		float f=10.0f;//float f=10.0����
		
		double d=20.0;

	}

}
