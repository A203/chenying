package cy.动态绑定;

public class Test {
	public static void main(String[] args){
		A a = new A();
		System.out.println(a.str);
		a.hello();
		B b = new B();
		System.out.println(b.str);
		b.hello();
		A c = new B();
		System.out.println(c.str);
		c.hello();//调用了子类的方法，打印了父类的str
		}


}
