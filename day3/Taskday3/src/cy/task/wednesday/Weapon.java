package cy.task.wednesday;
//Tank,Flighter,WarShip���̳���Weapon,�ֱ��ò�ͬ�ķ�ʽʵ�� Weapon ���еĳ��󷽷���
public abstract class Weapon implements Assaultable , Mobile{
	
	
}
class Tank extends Weapon{
    public void attack(){System.out.println("Tank attack");}
	public void move(){System.out.println("Tank move");}
}
class Flighter extends Weapon{
    public void attack(){System.out.println("Flighter attack");}
	public void move(){System.out.println("Flighter move");}
	
}
class WarShip extends Weapon{
    public void attack(){System.out.println("WarShip attack");}
	public void move(){System.out.println("WarShip move");}
	
}