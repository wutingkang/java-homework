package _2014211466_吴挺康_1_Student;
import java.util.Scanner;

public class _2014211466_吴挺康_1_Student {
	public static void main(String arg[]){
		String name = null, number = null;
		int math = 0, english = 0, science = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入学生学号：");
		number = sc.nextLine();
		System.out.println("请输入学生姓名：");
		name = sc.nextLine();
		System.out.println("请输入学生三门课成绩（数学，英语，科学）：");
		math = sc.nextInt();
		english = sc.nextInt();
		science = sc.nextInt();
		
		Student aStudent = new Student(number, name);
		aStudent.enterMarks(math, english, science);
		
		System.out.println(aStudent.toString());
	}
}
