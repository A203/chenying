package ExSwitch;

public class Meiju {
	public enum day{monday,tuesday,wednesday,thursday,friday,saturday,sunday}//枚举类型

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		day day1=day.wednesday;//注意这里的用法
		int intDay=0;//要有初值
		switch(day1)//枚举类型会有提示，黄色的，鼠标移过去选择add missing case
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
