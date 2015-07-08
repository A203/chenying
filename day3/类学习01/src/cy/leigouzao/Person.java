package cy.leigouzao;

public class Person {
    String name;
    int age;
    String address;
    void introduce(){
    	System.out.println("大家好，我叫"+name);
    }
    
    //无参默认构造方法
    Person(){
    	System.out.println("Person的默认构造方法被调用");
    }
    Person(String name1,int age1)
    {
    	name=name1;
    	age=age1;
    	System.out.println("2个参数的构造方法被调用");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.name="张三";
		person.age=20;
		person.address="USA";
		
		person.introduce();
		Person person1=new Person("李白",35);
		person1.introduce();
		

	}
}
