package cy.task.wednesday;
//дһ����Army,����һ֧���ӣ��������һ��������Weapon����w�������洢�þ�����ӵ�е�������������
//���໹�ṩһ�����췽�����ڹ��췽����ͨ����һ��int���͵Ĳ������޶���������ӵ�е������������,������һ��С����ʼ������w�����໹�ṩһ������addWeapon(Weapon wa),��ʾ�Ѳ���wa���������������뵽����w�С���������л�������������attackAll()��moveAll()����w�����е����������������ƶ���
public class Army {
	int nummax;
	Weapon[] w;
	public Army(){}
	public Army(int a){
		nummax=a;
		w=new Weapon[a];
	}
	
	 /*public void addWeapon(Weapon weapon) {
		 if (size >= w.length) {
		 System.out.println("����װ���㹻��!");
		 return;
		 }
		 else {
		 w[size] = weapon;
		 size++;
		 }
		 }*/
	public void addWeapon(Weapon wa)//��ʾ�Ѳ���wa���������������뵽����w��
	{
		int i;
		for(i=0;i<w.length;i++){
			if ((w[i])==null){
				break;
			}
		}
		if(i>=w.length)
		{
			System.out.println("����װ���㹻�ˣ��޷������ӣ�");
			System.exit(0);
		}
		else
		w[i]=wa;
	}
//��������л�������������attackAll()��moveAll()����w�����е����������������ƶ���
	public void attackAll(){
		for(int i=0;i<w.length;i++)
		{
			w[i].attack();
		}
	}
	public void moveAll(){
		for(int i=0;i<w.length;i++)
		{
			w[i].move();
		}
	}

	//дһ��������ȥ�������ϳ���
	public static void main(String[] args) {
		Army army1 = new Army(5);
		Tank t1=new Tank();
		Tank t2=new Tank();
		Flighter t3=new Flighter();
		Flighter t4=new Flighter();
		WarShip t5=new WarShip();
		
		army1.addWeapon(t1);
		army1.addWeapon(t2);
		army1.addWeapon(t3);
		army1.addWeapon(t4);
		army1.addWeapon(t5);
		
		army1.attackAll();
		army1.moveAll();
		
		
		
		


	}

}