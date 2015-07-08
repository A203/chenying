package cy.类的加载和对象实例化;

public class Ex初始化块 {


	public static void main(String[] args) {
		new Person();
	}

}
class Person{
	Person(){
		System.out.println(1);
	}
	{
		System.out.println(2);
	}//初始化块会在默认构造方法里的最前面执行
}
