package cy.thisdemo;

public class Thisdemo {
	public static void main(String[] args) {

		Person p=new Person("Jim",3);
		Person p1=new Person("Jack",3,"杭州");
		
		System.out.println(p.name);
		System.out.println(p1.address);
		}
	//main放在这个.java的class中，其他类放在外边
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
		this(name,age);//调用当前类的两个参数的构造方法
        this.address=address;
	}
	void hello(){
		System.out.println("hello...");
	}
	void introduce(){
		System.out.println("name:"+name+"age:"+age+"address"+address);
	}
	

	/*this指当前对象
	  1.this可以用在构造方法内容，用来区分同名的成员变量和局部变量
	  2.this可以用于调用构造方法，减少代码冗余
	  3.this可以用于调用成员属性和方法
	*/


}
