package cy.类的加载和对象实例化;

public class Ex4初始化块 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new A1();
		new A1();

	}

}
class A1{
	static{
		System.out.print(1);
	}
	{
		System.out.print(2);
	}
	A1(){
		System.out.print(3);
	}
}
