package homework2;

import java.util.Scanner;

public class _2014211466_��ͦ��_2_Student {
	private String studentNumber;
	private String studentName;
	private int markForMaths;
	private int markForEnglish;
	private int markForScience;

	public _2014211466_��ͦ��_2_Student(String number, String name){
		this.studentName = name;
		this.studentNumber = number;
	}
	public _2014211466_��ͦ��_2_Student(){this("", "");}
	
	
	public String getNumber(){return studentNumber;}
	public String getName(){return studentName;}
	public int getMathsMark(){return markForMaths;}
	public int getEnglishMark(){return markForEnglish;}
	public int getScienceMark(){return markForScience;}
	
	public void enterStudentNumber(){
		try{
			String number = "";
			@SuppressWarnings("resource")
			Scanner sc1 = new Scanner(System.in);
			System.out.println("������ѧ��ѧ�ţ�");
			number = sc1.nextLine();
			
			if (number.length() == 10 &&
				number.charAt(0) == '2' &&
				number.charAt(1) == '0' &&
				number.matches("[0-9]+")){
				this.studentNumber = number;
			}
			else
			{
				throw new _2014211466_��ͦ��_2_StudentNumberException();
			}
			
		}
		catch(_2014211466_��ͦ��_2_StudentNumberException e){
			System.out.println("ѧ����Ҫ��������������ѧ��Ϊ10λ����1λΪ2����2λΪ0������λΪ����0~9.");
			enterStudentNumber();
		}
	}
	public void enterName(){
		String name = "";
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		System.out.println("������ѧ��������");
		name = sc2.nextLine();
		this.studentName = name;
		
	}
	public void enterMarks(){
		try{
			int math, english, science;
			
			@SuppressWarnings("resource")
			Scanner sc3 = new Scanner(System.in);
			System.out.println("������ѧ�����ſγɼ�����ѧ��Ӣ���ѧ����");
			math = sc3.nextInt();
			english = sc3.nextInt();
			science = sc3.nextInt();
			
			
			if (math >= 0 && math <= 100 &&
				english >= 0 && english <= 100 &&
				science >=0 && science <= 100){
				this.markForMaths = math;
				this.markForEnglish = english;
				this.markForScience = science;
			}
			else{
				throw new _2014211466_��ͦ��_2_ScoreException();
			}
			
		}
		catch(_2014211466_��ͦ��_2_ScoreException e){
			enterMarks();
		}	
	}
	
	public void enterInformation(){
		enterStudentNumber();
		enterName();
		enterMarks();
	}
	
	public double calculateAverage(){
		return (markForMaths + markForEnglish + markForScience) / 3.0;
	}
	public String toString(){
		return "ѧ����Ϣ���£�" + 
			   "\nѧ�ţ�" + studentNumber + 
			   "\n������" + studentName +
               "\n��ѧ�ɼ���" + markForMaths + 
               "\nӢ��ɼ���" + markForEnglish + 
               "\nƽ���ɼ���" + calculateAverage();
	} 
}
