package ExSwitch;

public class Meiju {
	public enum day{monday,tuesday,wednesday,thursday,friday,saturday,sunday}//ö������

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day day1=day.wednesday;//ע��������÷�
		int intDay=0;//Ҫ�г�ֵ
		switch(day1)//ö�����ͻ�����ʾ����ɫ�ģ�����ƹ�ȥѡ��add missing case
		{
		case monday:intDay=1;
		    break;
		case tuesday:intDay=2;
			break;
		case wednesday:intDay=3;
			break;
		case thursday:intDay=4;
			break;
		case friday:intDay=5;
			break;
		case saturday:intDay=6;
			break;
		case sunday:intDay=7;
			break;
		}
		System.out.println("intDay:"+intDay);
		

	}

}
