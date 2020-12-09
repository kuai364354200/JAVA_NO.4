package Test4;

import java.util.Scanner;

public class PhD implements Student,Teacher{
	///设置属性
	String Phd_name="youxu";
	boolean Phd_sex;
	int Phd_age;
	float Phd_tuition;
	float Phd_salary;
	String Phd_hobby;
	
	
	///设置名字
	public void set_Phd_name(String name) {
		this.Phd_name = name;
	}
	public void Phd_name() {
		
		System.out.println("博士的名字是"+":"+Phd_name);
	}
	
	
	///设置性别
	public void set_Phd_sex(boolean sex) {
		this.Phd_sex = sex;
	}
	public void Phd_sex() {
		if(Phd_sex == true){
			System.out.println("性别男");
		}
		else{
			System.out.println("性别女");

		}
	}
	
	
	
	///设置年龄
	public void set_Phd_age(int age) {
		this.Phd_age = age;
	}
	public void Phd_age() {
		
		System.out.println("博士的年龄是"+":"+Phd_age);
	}
	
	
	///设置学费
	public void set_Phd_tuition(float set_tuition) {
		this.Phd_tuition = set_tuition;
	}
	
	///查询学费
	public void check_tuition() {		
		System.out.println("博士今年未缴学费:"+Phd_tuition);
	}

	
	///缴纳学费
	public void hand_in_tuition(float hand_tuition) {
		System.out.println("今年已缴纳学费:"+hand_tuition);
		Phd_tuition = Phd_tuition-hand_tuition;
		System.out.println("今年仍未缴纳学费:"+Phd_tuition);
	}
	
	
	///设置薪水
	public void set_Phd_salary(float salary) {
		this.Phd_salary = salary;
	}
	
	
	///查询薪水
	public void check_salary() {
		System.out.println("博士的月薪水:"+Phd_salary);
	}
	
	///发送薪水
	public void sent_salary() {
		System.out.println("本月已发送薪水:"+Phd_salary);
		
	}
	
	public void calculator(int salary,int tuition) {
		   int  year_salary = salary * 12-tuition*2;
		   double x = 0;
		   if (year_salary <= 36000) {
			   x = year_salary * 0.03;
			   }
		   else if (36000 < year_salary && year_salary <= 144000){
		      x = year_salary * 0.1 - 2520; }
		   else if (144000 < year_salary && year_salary<= 300000) {
		      x = year_salary * 0.2 - 16920;
		   }
		   else if (300000 < year_salary && year_salary<= 420000) {
		      x = year_salary * 0.25 - 31920;
		   }
		   else if (420000 < year_salary && year_salary<= 660000) {
			      x = year_salary * 0.3 - 52920;
			   }
		   else if (660000 < year_salary && year_salary<= 960000) {
			      x = year_salary * 0.35 - 85920;
			   }
		   else if (960000 < year_salary) {
			      x = year_salary * 0.45 - 181920;
			   }
		   System.out.println("每月需要缴纳的税款" +x/12);
		}

	
	
public static void main(String[] args) {
	boolean i = true;
	while (i) {
			 Scanner s = new Scanner(System.in);
			 try {
			 PhD Phd_youxu = new PhD();
			 ///设置姓名
			 System.out.println("请输入个人资料名字");
			 String name1 = s.nextLine();
			 Phd_youxu.set_Phd_name(name1);
			 Phd_youxu.Phd_name();
			 ///设置性别
			 System.out.println("请用True/false来设置个人资料性别（true为男，false为女）");
			 boolean sex1 = s.nextBoolean();
			 Phd_youxu.set_Phd_sex(sex1);
			 Phd_youxu.Phd_sex();
			 ///设置年龄
			 System.out.println("请设置年龄，输入一个整数");
			 int age1 = s.nextInt();
			 Phd_youxu.set_Phd_age(age1);
			 Phd_youxu.Phd_age();
			 ///设置学费
			 int tuition1 = 5000;
			 Phd_youxu.set_Phd_tuition(tuition1);
			 Phd_youxu.hand_in_tuition(5000);
			 ///设置工资。月薪
			 Phd_youxu.set_Phd_salary(3500);
			 Phd_youxu.check_salary();
			 Phd_youxu.sent_salary();
			 Phd_youxu.calculator(3500,5000);
			 i = false;
			 s.close();
			 }
			catch(ArrayIndexOutOfBoundsException ne) {
				System.out.println("数组越界");
				s.next();
			}
			catch(NumberFormatException e) {
				System.out.println(e.getMessage()+"数字格式错误");
				s.next();
			}
			catch(Exception m) {
				System.out.println("出现未知错误,请重新输入");
				s.next();
			}
			 finally {
			 }
			 s.close();
		 }
	}
}
