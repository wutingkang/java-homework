package _2014211466_吴挺康_1_Student;

import java.util.Scanner;

public class _2014211466_吴挺康_1_StudentList {
	
	public static void outputAllStudent(StudentList studentlist)
	{
		if(studentlist.getTotal() >= 1)
		{
			System.out.println("\n---目前有" + studentlist.getTotal() + "个学生，信息为---：\n");
			for(int i = 1; i <= studentlist.getTotal(); i++)
				System.out.println(studentlist.getItem(i).toString());
		}
		else
			System.out.println("\n目前没有学生。\n");
		
	}
	
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int choice = 0, math = 0, english = 0, science = 0, no = 0;
		StudentList studentlist = new StudentList(100);//分配100个学生的存储空间 
		String number = null, name = null;
		
		do{
			System.out.println("菜单如下，请输入 1~8代表您要执行的操作：\n"+
								"1. 增加1个学生  2. 根据学号删除学生  3. 根据位置删除学生\n"+  
								"4. 判断是否为空   5.根据位置返回学生   6.根据学号返回学生\n"+
								"7. 输出全部学生信息  8.退出程序\n"+
								"请输入您的操作：\n");
			
			choice = sc.nextInt();//nextInt()只读取数值，剩下"\n"还没有读取！！！
			
			switch(choice)
			{
			case 1:
				System.out.println("请输入学生信息：\n");
				System.out.println("学号：");
				
				sc.nextLine();//读取掉上次输入的换行符,或者使用next()
				number = sc.nextLine();
				System.out.println("姓名：");
				name = sc.next();
				Student stu = new Student(number, name);
				
				System.out.println("数学成绩：");
				if (sc.hasNextInt()){  
					math = sc.nextInt();
					System.out.println("math：");
		        }
				System.out.println("英语成绩：");
				if (sc.hasNextInt()){  
					english = sc.nextInt();
				}
				
				System.out.println("科学成绩：");
				if (sc.hasNextInt()){  
					science = sc.nextInt();
				}
				
				stu.enterMarks(math,  english,  science);
				
				studentlist.add(stu);
				outputAllStudent(studentlist);
				break;
			case 2:
				System.out.println("请输入学生学号：\n");
				number = sc.next();
				
				 if (studentlist.remove(number)){
					 System.out.println("删除成功。\n");
					 outputAllStudent(studentlist);
				 }
				 else
					 System.out.println("删除失败。\n");
				break;
			case 3:
				System.out.println("请输入删除学生的位置：\n");
				no = sc.nextInt();
				
				if (studentlist.remove(no)){
					System.out.println("删除成功。\n");
					outputAllStudent(studentlist);
				} 
				 else
					 System.out.println("删除失败。\n");
				break;
			case 4:
				if(studentlist.isEmpty())
					System.out.println("当前学生数组为空。\n");
				else
					System.out.println("当前学生数组不为空。\n");
				break;
			case 5:
				System.out.println("请输入学生的位置：\n");
				no = sc.nextInt();
				stu = studentlist.getItem(no);
				if(null != stu)
					System.out.println(stu.toString());
				else
					System.out.println("对不起，没有对应的学生.");
				break;
			case 6:
				System.out.println("请输入学生的学号：\n");
				number = sc.next();
				
				stu = studentlist.getItem(number);
				if(null != stu)
					System.out.println(stu.toString());
				else
					System.out.println("对不起，没有对应的学生.");
				break;
			case 7:
				outputAllStudent(studentlist);
				break;
			default:
				if(choice != 8)
					System.out.println("\n输入错误。\n");
				break;
			}
		
			sc.nextLine();//读取掉上面没有接收的的换行符
			
		}while(choice != 8);
		
		sc.close();
	}
}
