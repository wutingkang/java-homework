package _2014211466_��ͦ��_1_Student;

import java.util.Scanner;

public class _2014211466_��ͦ��_1_StudentList {
	
	public static void outputAllStudent(StudentList studentlist)
	{
		if(studentlist.getTotal() >= 1)
		{
			System.out.println("\n---Ŀǰ��" + studentlist.getTotal() + "��ѧ������ϢΪ---��\n");
			for(int i = 1; i <= studentlist.getTotal(); i++)
				System.out.println(studentlist.getItem(i).toString());
		}
		else
			System.out.println("\nĿǰû��ѧ����\n");
		
	}
	
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int choice = 0, math = 0, english = 0, science = 0, no = 0;
		StudentList studentlist = new StudentList(100);//����100��ѧ���Ĵ洢�ռ� 
		String number = null, name = null;
		
		do{
			System.out.println("�˵����£������� 1~8������Ҫִ�еĲ�����\n"+
								"1. ����1��ѧ��  2. ����ѧ��ɾ��ѧ��  3. ����λ��ɾ��ѧ��\n"+  
								"4. �ж��Ƿ�Ϊ��   5.����λ�÷���ѧ��   6.����ѧ�ŷ���ѧ��\n"+
								"7. ���ȫ��ѧ����Ϣ  8.�˳�����\n"+
								"���������Ĳ�����\n");
			
			choice = sc.nextInt();//nextInt()ֻ��ȡ��ֵ��ʣ��"\n"��û�ж�ȡ������
			
			switch(choice)
			{
			case 1:
				System.out.println("������ѧ����Ϣ��\n");
				System.out.println("ѧ�ţ�");
				
				sc.nextLine();//��ȡ���ϴ�����Ļ��з�,����ʹ��next()
				number = sc.nextLine();
				System.out.println("������");
				name = sc.next();
				Student stu = new Student(number, name);
				
				System.out.println("��ѧ�ɼ���");
				if (sc.hasNextInt()){  
					math = sc.nextInt();
					System.out.println("math��");
		        }
				System.out.println("Ӣ��ɼ���");
				if (sc.hasNextInt()){  
					english = sc.nextInt();
				}
				
				System.out.println("��ѧ�ɼ���");
				if (sc.hasNextInt()){  
					science = sc.nextInt();
				}
				
				stu.enterMarks(math,  english,  science);
				
				studentlist.add(stu);
				outputAllStudent(studentlist);
				break;
			case 2:
				System.out.println("������ѧ��ѧ�ţ�\n");
				number = sc.next();
				
				 if (studentlist.remove(number)){
					 System.out.println("ɾ���ɹ���\n");
					 outputAllStudent(studentlist);
				 }
				 else
					 System.out.println("ɾ��ʧ�ܡ�\n");
				break;
			case 3:
				System.out.println("������ɾ��ѧ����λ�ã�\n");
				no = sc.nextInt();
				
				if (studentlist.remove(no)){
					System.out.println("ɾ���ɹ���\n");
					outputAllStudent(studentlist);
				} 
				 else
					 System.out.println("ɾ��ʧ�ܡ�\n");
				break;
			case 4:
				if(studentlist.isEmpty())
					System.out.println("��ǰѧ������Ϊ�ա�\n");
				else
					System.out.println("��ǰѧ�����鲻Ϊ�ա�\n");
				break;
			case 5:
				System.out.println("������ѧ����λ�ã�\n");
				no = sc.nextInt();
				stu = studentlist.getItem(no);
				if(null != stu)
					System.out.println(stu.toString());
				else
					System.out.println("�Բ���û�ж�Ӧ��ѧ��.");
				break;
			case 6:
				System.out.println("������ѧ����ѧ�ţ�\n");
				number = sc.next();
				
				stu = studentlist.getItem(number);
				if(null != stu)
					System.out.println(stu.toString());
				else
					System.out.println("�Բ���û�ж�Ӧ��ѧ��.");
				break;
			case 7:
				outputAllStudent(studentlist);
				break;
			default:
				if(choice != 8)
					System.out.println("\n�������\n");
				break;
			}
		
			sc.nextLine();//��ȡ������û�н��յĵĻ��з�
			
		}while(choice != 8);
		
		sc.close();
	}
}
