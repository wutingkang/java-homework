package _2014211466_��ͦ��_1_Student;

public class StudentList {
	private Student[] list; //list�洢ѧ�����󣬵�һ��Ԫ��Ϊ��
	private int total = 0; //ѧ��������

	public StudentList(int length){ //length�����鳤��
		list = new Student[length];
	}
	
	public boolean add(Student stu){ //����stu�������У��ɹ�������true������false
		if (total < list.length)
		{
			total++;
			list[total] = stu;  
			return true;
		}
		else
			return false;
	}
	
	public boolean remove(int no){ //ɾ����no������Ԫ�أ�ɾ���ɹ�������true������false
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
	
	public boolean remove(String number){ //ɾ��ѧ��Ϊnumber��ѧ����ɾ���ɹ�������true������false
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
	
	public boolean isEmpty(){ //�ж������Ƿ�Ϊ�գ����ǣ�����true������false
		if(total >= 1)
			return false;
		else
			return true;
	}
	
	public Student getItem(int no){ //���ص�no��ѧ��
		if(no >= 1 && no <= total)
			return list[no];
		else
			return null;
	}
	
	public Student getItem(String number){ //����ѧ��Ϊnumber��ѧ���������������ڣ�����null��
		for (int i = 1; i <= total; i++)
			if(number.equals(list[i].getNumber()))
				return list[i];
					
		return null;
	}
	
	public int getTotal(){return total;} //����ѧ��������
}
