package cy.类的加载和对象实例化;

public class Ex3static {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(A.instance.num2);
		System.out.println(new A(1).num2);

	}

}
class A{
	static A instance = new A(1);//执行这一句时num1还没有赋值为5
	static int num1=5;
	int num2;
	A(int num3){
		num2=num1-num3;
	}
}
