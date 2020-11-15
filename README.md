# 计G201 2020322073 宋子寒 
# JAVA3
# 实验目的
1. Java中抽象类和抽象方法的定义； 
2. 掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法
3. 了解异常的使用方法，并在程序中根据输入情况做异常处理
# 实验内容
某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。
1. 设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。
2. 设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。（其他属性及方法，可自行发挥）
3. 编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）。
# 实验要求
1. 在博士研究生类中实现各个接口定义的抽象方法;
2. 对年学费和年收入进行统计，用收入减去学费，求得纳税额；
3. 国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static final修饰定义。
4. 实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。
5. 根据输入情况，要在程序中做异常处理。
# 实验过程
1. 构造两个接口学生管理接口（Colleagestudent）和教师管理接口（Teacher），Colleagestudent接口里有缴费学费和查询学费的两个静态方法，Teacher接口里有发放薪水和查询薪水的两个静态方法；
2. 编辑一个用来获取money的学校财务类；
3. 编辑一个博士研究生类（Graduate），实现学生管理接口（Colleagestudent）和教师管理接口（Teacher），并加入姓名、性别、年龄、每学期学费、每月薪水等属性，构造各种静态的方法；
4. 编辑一个Control类，用toshow（）方法实现Graduate类中的各种方法；
5. 编辑一个测试类（Test），实例化Control，实现toshow（）方法；
# 主要代码
swith方法
```
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
```
异常类
1.
```
   	try {
			  System.out.println("请输入年龄");
			  age=sct.nextInt();
		      } 
		  catch (Exception e) {

          System.out.println("你出现了异常");
    
		  }	
```
2.
```
try {
			 Schoolfinance a=new  Schoolfinance();
			 a.setMoney(7000.0);
			 double moneys=a.getMoney();
			 System.out.println("你发放的薪水为"+moneys);
		} catch (Exception e) {
			System.out.println("你输入的出现了异常");
		}
```
3.
```
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
```
