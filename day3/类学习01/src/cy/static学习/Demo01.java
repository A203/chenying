package cy.staticѧϰ;

public class Demo01 {
	
	int age;
	static String name;
	
    void hello(){
		System.out.println("hello...");
	}
	//�෽��
	static void hi()
	{
		System.out.println("hi...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo01 d=new Demo01();
		d.age=10;
		d.hello();
		d.hi();
		Demo01.hi();
		System.out.println(Demo01.name);
		

	}

}
