package _2014211466_��ͦ��_1_Student;
import java.util.Scanner;

public class _2014211466_��ͦ��_1_Student {
	public static void main(String arg[]){
		String name = null, number = null;
		int math = 0, english = 0, science = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ѧ��ѧ�ţ�");
		number = sc.nextLine();
		System.out.println("������ѧ��������");
		name = sc.nextLine();
		System.out.println("������ѧ�����ſγɼ�����ѧ��Ӣ���ѧ����");
		math = sc.nextInt();
		english = sc.nextInt();
		science = sc.nextInt();
		
		Student aStudent = new Student(number, name);
		aStudent.enterMarks(math, english, science);
		
		System.out.println(aStudent.toString());
	}
}
