package cy.phone;

public class Phone {

	String name;
	String brand;
	int price;
	
	
	void call(){
		System.out.println("��绰������");
	}
	void sendMsg(){
		System.out.println("�����š�����");
	}
	public static void main(String[] args)
	{
		Phone p = new Phone();
		
		p.name = "Sansun";
		p.brand = "���׻�";
		p.price = 99;
		
		System.out.println(p.name);
		p.sendMsg();
		
	}



}
