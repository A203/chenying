package cy.leigouzao;

public class Person {
    String name;
    int age;
    String address;
    void introduce(){
    	System.out.println("��Һã��ҽ�"+name);
    }
    
    //�޲�Ĭ�Ϲ��췽��
    Person(){
    	System.out.println("Person��Ĭ�Ϲ��췽��������");
    }
    Person(String name1,int age1)
    {
    	name=name1;
    	age=age1;
    	System.out.println("2�������Ĺ��췽��������");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.name="����";
		person.age=20;
		person.address="USA";
		
		person.introduce();
		Person person1=new Person("���",35);
		person1.introduce();
		

	}
}
