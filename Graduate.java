import java.util.Scanner;

public class Graduate implements Colleagestudent,Teacher{
	int doctoral=7000;  //��һλ��ʿ��нˮ
	int doctoral2=6000;  //�ڶ�λ��ʿ��нˮ
	int amount=doctoral*12;   //��һλ��ʿ��������
	int amount1=doctoral2*12;  //�ڶ�λ��ʿ��������
	double coin;   
	final double tex=0.03;   //нˮ˰��
	Schoolfinance sch=new Schoolfinance();
    double sh=sch.getMoney();
	public double getCoin() {
		return coin;
	}
	public void setCoin(double coin) {
		this.coin = coin;
	}
	public static void information() {
		  String name;
	 Scanner sct=new Scanner(System.in);
			 System.out.println("����������");
		  name=sct.next();
	}
	public  void sexymation() {
		 Scanner sct=new Scanner(System.in);
		 System.out.println("�������Ա�����1����man������2����woman��");
		 int i;
		 i=sct.nextInt();
	
			switch (i) {
			case 1:
			    System.out.println("man");
				break;
			case 2:
                System.out.println("woman");
                break;
			default:
				System.out.println("�����������");
				System.exit(1);
				break;
			}
			
		
		
			
	}
    public static void agemation() {
    	 int age;
    	 Scanner sct=new Scanner(System.in);
    	try {
			  System.out.println("����������");
			  age=sct.nextInt();
		      } 
		  catch (Exception e) {

          System.out.println("��������쳣");
    
		  }	
    }
	
	public static void inquiresalary() {  //��ȡ��нˮ
		try {
			 Schoolfinance a=new  Schoolfinance();
			 a.setMoney(7000.0);
			 double moneys=a.getMoney();
			 System.out.println("�㷢�ŵ�нˮΪ"+moneys);
		} catch (Exception e) {
			System.out.println("������ĳ������쳣");
		}
		
	  }
	public static void payment() {   //�ӿ��еķ������Ǿ�̬�ķ���	 
		Graduate Doctoral1 = new Graduate();
		Schoolfinance  scw=new Schoolfinance();
		String str="��������Ҫ����ѧ��";
		scw.setMoney(10000);
		while(true) {
			System.out.println(str);
			Scanner scb=new Scanner(System.in);
			int id1;
			double b=scw.getMoney();
    	try {
    		id1=scb.nextInt();
    		if(id1==b) {
    			System.out.println("���ѧ��֧���ˣ�"+id1+"Ԫ,֧���ɹ�");
         		break;
    		}else {
    			 System.out.println("�����������");
    			 
    		}
     		
		} catch (Exception e) {
			str="����������,������һ������:";
			continue;
		}
		}
     }
	public  void taxamount() {
    	System.out.println("��ѧ����˰���Ϊ��"+(amount-sh)*tex+"Ԫ");
    }
  
  
}
