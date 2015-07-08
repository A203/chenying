package cy.抽象类;

public abstract class Animal {
	
	public abstract void sleep();

}

//子类继承抽象父类，必须要实现父类中的所有抽象方法，否则子类也是抽象类
//abstra class Tiger extends Animal{
class Tiger extends Animal{
	public void sleep(){
		System.out.println("趴着睡...");
	}
}

class Monkey extends Animal{
	public void sleep(){
		System.out.println("仰着睡...");
	}
}
//某个类是抽象类，但是其中可以没有抽象方法