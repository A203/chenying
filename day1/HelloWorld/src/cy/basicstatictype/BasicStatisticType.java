package cy.basicstatictype;

public class BasicStatisticType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte类型数据位数以及最大最小值
		System.out.println("基本类型：byte二进制位数 "+Byte.SIZE);
		System.out.println("基本类型：byte最大值 "+Byte.MAX_VALUE);//-128至127，负零算-128
		System.out.println("基本类型：byte最小值 "+Byte.MIN_VALUE);
		//float类型数据位数以及最大最小值
		System.out.println("基本类型：float二进制位数 "+Float.SIZE);
		System.out.println("基本类型：float最大值 "+Float.MAX_VALUE);//float所能表示的最小正数
		System.out.println("基本类型：float最小值 "+Float.MIN_VALUE);
		
		//byte类型数据赋值
		byte b=50;
		//byte b1=130;//超出了byte类型表示的数据范围
		//float类型数据赋值
		float f=10.0f;//float f=10.0不行
		
		double d=20.0;

	}

}
