package _2014211466_吴挺康_1_Student;

public class Student {
	private String studentNumber;
	private String studentName;
	private int markForMaths;
	private int markForEnglish;
	private int markForScience;

	public Student(String number, String name){
		this.studentName = name;
		this.studentNumber = number;
	}
	public Student(){this("2014211466", "吴挺康");}
	
	public String getNumber(){return studentNumber;}
	public String getName(){return studentName;}
	public int getMathsMark(){return markForMaths;}
	public int getEnglishMark(){return markForEnglish;}
	public int getScienceMark(){return markForScience;}
	
	public void enterMarks(int markForMaths, int markForEnglish, int markForScience){
		this.markForMaths = markForMaths;
		this.markForEnglish = markForEnglish;
		this.markForScience = markForScience;
	}
	public double calculateAverage(){
		return (markForMaths + markForEnglish + markForScience) / 3.0;
	}
	public String toString(){
		return "学生信息如下：" + 
			   "\n学号：" + studentNumber + 
			   "\n姓名：" + studentName +
               "\n数学成绩：" + markForMaths + 
               "\n英语成绩：" + markForEnglish + 
               "\n平均成绩：" + calculateAverage();
	} 
}
