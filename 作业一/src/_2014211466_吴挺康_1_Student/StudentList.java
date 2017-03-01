package _2014211466_吴挺康_1_Student;

public class StudentList {
	private Student[] list; //list存储学生对象，第一个元素为空
	private int total = 0; //学生总人数

	public StudentList(int length){ //length是数组长度
		list = new Student[length];
	}
	
	public boolean add(Student stu){ //增加stu到数组中，成功，返回true，否则false
		if (total < list.length)
		{
			total++;
			list[total] = stu;  
			return true;
		}
		else
			return false;
	}
	
	public boolean remove(int no){ //删除第no个数组元素，删除成功，返回true，否则false
		if (no <= total && no >= 1)
		{
			for (int i = no; i < total; i++)
				list[i] = list[i + 1];
			
			total--;
			return true;
		}
		else
			return false;
	}
	
	public boolean remove(String number){ //删除学号为number的学生，删除成功，返回true，否则false
		for (int i = 1; i <= total; i++)
			if(number.equals(list[i].getNumber()))
			{
				for(int del = i; i < total; del++)
					list[del] = list[del + 1];
				
				total--;
				return true;
			}
		
		return false;
	}
	
	public boolean isEmpty(){ //判断数组是否为空，若是，返回true，否则false
		if(total >= 1)
			return false;
		else
			return true;
	}
	
	public Student getItem(int no){ //返回第no个学生
		if(no >= 1 && no <= total)
			return list[no];
		else
			return null;
	}
	
	public Student getItem(String number){ //返回学号为number的学生，若该生不存在，返回null。
		for (int i = 1; i <= total; i++)
			if(number.equals(list[i].getNumber()))
				return list[i];
					
		return null;
	}
	
	public int getTotal(){return total;} //返回学生总人数
}
