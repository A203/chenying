package cy.leigouzao;

public class Fruit {

	String name;
	int price;
	String addr;
	
	Fruit(){};
	Fruit(String n,int p,String a)
	{
		name=n;
		price=p;
		addr=a;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f=new Fruit("ƻ��",3,"ɽ��");
		System.out.println(f.name);
		
	}

}
