import java.util.Scanner;

public class Graduate implements Colleagestudent,Teacher{
	int doctoral=7000;  //第一位博士的薪水
	int doctoral2=6000;  //第二位博士的薪水
	int amount=doctoral*12;   //第一位博士的总收入
	int amount1=doctoral2*12;  //第二位博士的总收入
	double coin;   
	final double tex=0.03;   //薪水税额
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
			 System.out.println("请输入姓名");
		  name=sct.next();
	}
	public  void sexymation() {
		 Scanner sct=new Scanner(System.in);
		 System.out.println("请输入性别（数字1代表man，数字2代表woman）");
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
				System.out.println("你输入的有误");
				System.exit(1);
				break;
			}
			
		
		
			
	}
    public static void agemation() {
    	 int age;
    	 Scanner sct=new Scanner(System.in);
    	try {
			  System.out.println("请输入年龄");
			  age=sct.nextInt();
		      } 
		  catch (Exception e) {

          System.out.println("你出现了异常");
    
		  }	
    }
	
	public static void inquiresalary() {  //获取的薪水
		try {
			 Schoolfinance a=new  Schoolfinance();
			 a.setMoney(7000.0);
			 double moneys=a.getMoney();
			 System.out.println("你发放的薪水为"+moneys);
		} catch (Exception e) {
			System.out.println("你输入的出现了异常");
		}
		
	  }
	public static void payment() {   //接口中的方法都是静态的方法	 
		Graduate Doctoral1 = new Graduate();
		Schoolfinance  scw=new Schoolfinance();
		String str="请输入你要交的学费";
		scw.setMoney(10000);
		while(true) {
			System.out.println(str);
			Scanner scb=new Scanner(System.in);
			int id1;
			double b=scw.getMoney();
    	try {
    		id1=scb.nextInt();
    		if(id1==b) {
    			System.out.println("你的学费支付了："+id1+"元,支付成功");
         		break;
    		}else {
    			 System.out.println("你输入的有误");
    			 
    		}
     		
		} catch (Exception e) {
			str="您输入有误,请输入一个整数:";
			continue;
		}
		}
     }
	public  void taxamount() {
    	System.out.println("该学生的税额款为："+(amount-sh)*tex+"元");
    }
  
  
}
