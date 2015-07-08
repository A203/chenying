package cy.phone;

public class Phone {

	String name;
	String brand;
	int price;
	
	
	void call(){
		System.out.println("打电话。。。");
	}
	void sendMsg(){
		System.out.println("发短信。。。");
	}
	public static void main(String[] args)
	{
		Phone p = new Phone();
		
		p.name = "Sansun";
		p.brand = "爆米花";
		p.price = 99;
		
		System.out.println(p.name);
		p.sendMsg();
		
	}



}
