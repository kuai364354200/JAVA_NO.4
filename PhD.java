package Test4;

import java.util.Scanner;

public class PhD implements Student,Teacher{
	///��������
	String Phd_name="youxu";
	boolean Phd_sex;
	int Phd_age;
	float Phd_tuition;
	float Phd_salary;
	String Phd_hobby;
	
	
	///��������
	public void set_Phd_name(String name) {
		this.Phd_name = name;
	}
	public void Phd_name() {
		
		System.out.println("��ʿ��������"+":"+Phd_name);
	}
	
	
	///�����Ա�
	public void set_Phd_sex(boolean sex) {
		this.Phd_sex = sex;
	}
	public void Phd_sex() {
		if(Phd_sex == true){
			System.out.println("�Ա���");
		}
		else{
			System.out.println("�Ա�Ů");

		}
	}
	
	
	
	///��������
	public void set_Phd_age(int age) {
		this.Phd_age = age;
	}
	public void Phd_age() {
		
		System.out.println("��ʿ��������"+":"+Phd_age);
	}
	
	
	///����ѧ��
	public void set_Phd_tuition(float set_tuition) {
		this.Phd_tuition = set_tuition;
	}
	
	///��ѯѧ��
	public void check_tuition() {		
		System.out.println("��ʿ����δ��ѧ��:"+Phd_tuition);
	}

	
	///����ѧ��
	public void hand_in_tuition(float hand_tuition) {
		System.out.println("�����ѽ���ѧ��:"+hand_tuition);
		Phd_tuition = Phd_tuition-hand_tuition;
		System.out.println("������δ����ѧ��:"+Phd_tuition);
	}
	
	
	///����нˮ
	public void set_Phd_salary(float salary) {
		this.Phd_salary = salary;
	}
	
	
	///��ѯнˮ
	public void check_salary() {
		System.out.println("��ʿ����нˮ:"+Phd_salary);
	}
	
	///����нˮ
	public void sent_salary() {
		System.out.println("�����ѷ���нˮ:"+Phd_salary);
		
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
		   System.out.println("ÿ����Ҫ���ɵ�˰��" +x/12);
		}

	
	
public static void main(String[] args) {
	boolean i = true;
	while (i) {
			 Scanner s = new Scanner(System.in);
			 try {
			 PhD Phd_youxu = new PhD();
			 ///��������
			 System.out.println("�����������������");
			 String name1 = s.nextLine();
			 Phd_youxu.set_Phd_name(name1);
			 Phd_youxu.Phd_name();
			 ///�����Ա�
			 System.out.println("����True/false�����ø��������Ա�trueΪ�У�falseΪŮ��");
			 boolean sex1 = s.nextBoolean();
			 Phd_youxu.set_Phd_sex(sex1);
			 Phd_youxu.Phd_sex();
			 ///��������
			 System.out.println("���������䣬����һ������");
			 int age1 = s.nextInt();
			 Phd_youxu.set_Phd_age(age1);
			 Phd_youxu.Phd_age();
			 ///����ѧ��
			 int tuition1 = 5000;
			 Phd_youxu.set_Phd_tuition(tuition1);
			 Phd_youxu.hand_in_tuition(5000);
			 ///���ù��ʡ���н
			 Phd_youxu.set_Phd_salary(3500);
			 Phd_youxu.check_salary();
			 Phd_youxu.sent_salary();
			 Phd_youxu.calculator(3500,5000);
			 i = false;
			 s.close();
			 }
			catch(ArrayIndexOutOfBoundsException ne) {
				System.out.println("����Խ��");
				s.next();
			}
			catch(NumberFormatException e) {
				System.out.println(e.getMessage()+"���ָ�ʽ����");
				s.next();
			}
			catch(Exception m) {
				System.out.println("����δ֪����,����������");
				s.next();
			}
			 finally {
			 }
			 s.close();
		 }
	}
}
