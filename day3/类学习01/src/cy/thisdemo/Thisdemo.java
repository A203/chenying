package cy.thisdemo;

public class Thisdemo {
	public static void main(String[] args) {

		Person p=new Person("Jim",3);
		Person p1=new Person("Jack",3,"����");
		
		System.out.println(p.name);
		System.out.println(p1.address);
		}
	//main�������.java��class�У�������������
}
class Person{
	
	String name;
	int age;
	String address;
	
	public Person(){}
	
	public Person(String name ,int age)
	{
		this.name=name;
		this.age=age;
	}
	public Person(String name,int age,String address){
		this(name,age);//���õ�ǰ������������Ĺ��췽��
        this.address=address;
	}
	void hello(){
		System.out.println("hello...");
	}
	void introduce(){
		System.out.println("name:"+name+"age:"+age+"address"+address);
	}
	

	/*thisָ��ǰ����
	  1.this�������ڹ��췽�����ݣ���������ͬ���ĳ�Ա�����;ֲ�����
	  2.this�������ڵ��ù��췽�������ٴ�������
	  3.this�������ڵ��ó�Ա���Ժͷ���
	*/


}
