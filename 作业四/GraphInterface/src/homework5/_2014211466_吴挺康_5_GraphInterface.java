package homework5;
import java.util.Iterator;
import java.util.Vector;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class _2014211466_吴挺康_5_GraphInterface implements ActionListener{
	//员工存储的vector（new Vector<Employee>()不能忘记！）
	Vector<_2014211466_吴挺康_5_Employee> employeeList = new Vector<_2014211466_吴挺康_5_Employee>();
	
	//顶层容器
	JFrame frame = new JFrame();
	Container content = frame.getContentPane();
	
	//菜单条
	JMenuBar menubar = new JMenuBar();
	
	//菜单
	JMenu EmployeeInfoInputMenu = new JMenu("EmployeeInfoInput");
	JMenu SearchMenu = new JMenu("Search");
	
	//显示在首页的欢迎词，也用来显示员工平均工资
	JLabel inform;
	
	public _2014211466_吴挺康_5_GraphInterface(){
		///////////////////EmployeeInfoInputMenu添加菜单项////////////////
		JMenuItem CommisionEmployeeMenuItem= new JMenuItem("CommisionEmployee");
		CommisionEmployeeMenuItem.addActionListener(this);
		
		JMenuItem BasePlusCommisionEmployeeMenuItem= new JMenuItem("BasePlusCommisionEmployee");
		BasePlusCommisionEmployeeMenuItem.addActionListener(this);
		
		EmployeeInfoInputMenu.add(CommisionEmployeeMenuItem);
		EmployeeInfoInputMenu.add(BasePlusCommisionEmployeeMenuItem);
				
		////////////////////SearchMenu添加菜单项//////////////////////////
		JMenuItem AverageEarningSearchMenuItem= new JMenuItem("AverageEarningSearch");
		AverageEarningSearchMenuItem.addActionListener(this);
		
		SearchMenu.add(AverageEarningSearchMenuItem);
		
		
		////////////////////menubar添加菜单//////////////////////////
		menubar.add(EmployeeInfoInputMenu);
		menubar.add(SearchMenu);
		
		///////////////////设置欢迎词，也用来显示员工平均工资//////////
		content.add(menubar,BorderLayout.NORTH);
		inform = new JLabel("欢迎使用员工管理系统",JLabel.CENTER);
		content.add(inform, BorderLayout.CENTER);
		
		frame.setTitle("员工图形化管理系统");
		frame.pack(); 
		frame.setBounds(450, 200, 400, 400);
		frame.setVisible(true);	
	}
  

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
				
		if (cmd.equals("CommisionEmployee"))
		{
			JFrame CommisionFrame = new JFrame();
		    CommisionFrame.setTitle("CommisionEmployee信息录入");
		    CommisionFrame.setBounds(450, 200, 400, 300);
		    Container CommisionContent = CommisionFrame.getContentPane();
		     
		    JPanel CommisionPanel = new JPanel();
		    
		    JPanel socialSecurityNumberPanel = new JPanel();
		    JLabel socialSecurityNumberLabel = new JLabel("socialSecurityNumber:");
		    JTextField socialSecurityNumberText = new JTextField(20);
		    socialSecurityNumberPanel.add(socialSecurityNumberLabel);
		    socialSecurityNumberPanel.add(socialSecurityNumberText);
			CommisionPanel.add(socialSecurityNumberPanel);
		    
		    JPanel firstNamePanel = new JPanel();
		    JLabel firstNameLabel = new JLabel("First Name:");
		    JTextField firstNameText = new JTextField(20);
		    firstNamePanel.add(firstNameLabel);
			firstNamePanel.add(firstNameText);
			CommisionPanel.add(firstNamePanel);
		    
			JPanel lastNamePanel = new JPanel();
		    JLabel lastNameLabel = new JLabel("Last Name:");
		    JTextField lastNameText = new JTextField(20);
		    lastNamePanel.add(lastNameLabel);
			lastNamePanel.add(lastNameText);
			CommisionPanel.add(lastNamePanel);

			JPanel grossSalesPanel = new JPanel();
		    JLabel grossSalesLabel = new JLabel("grossSales:");
		    JTextField grossSalesText = new JTextField(20);
		    grossSalesPanel.add(grossSalesLabel);
			grossSalesPanel.add(grossSalesText);
			CommisionPanel.add(grossSalesPanel);
			
			JPanel commissionRatePanel = new JPanel();
		    JLabel commissionRateLabel = new JLabel("commissionRate:");
		    JTextField commissionRateText = new JTextField(20);
		    commissionRatePanel.add(commissionRateLabel);
			commissionRatePanel.add(commissionRateText);
			CommisionPanel.add(commissionRatePanel);
			
			//确定按钮
			JPanel buttonPanel = new JPanel();
			JButton sunmitButton = new JButton("确认");
			buttonPanel.add(sunmitButton);
			CommisionPanel.add(buttonPanel);
			sunmitButton.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					//添加员工信息
					int grossSales = Integer.parseInt(grossSalesText.getText().toString());
					double commissionRate = Double.parseDouble(commissionRateText.getText().toString());
					_2014211466_吴挺康_5_CommisionEmployee newCommisionEmployee = new _2014211466_吴挺康_5_CommisionEmployee(
							firstNameText.getText().toString(),
							lastNameText.getText().toString(),
							socialSecurityNumberText.getText().toString(),
							grossSales,
							commissionRate
							);
					employeeList.add(newCommisionEmployee);
					
					//退出当前窗口
					CommisionFrame.dispose();
				}
			});
			
			CommisionContent.add(CommisionPanel, BorderLayout.CENTER);
			//CommisionFrame.pack();
			CommisionFrame.setVisible(true);
		}else if (cmd.equals("BasePlusCommisionEmployee")){
			JFrame BasePlusCommisionFrame = new JFrame();
		    BasePlusCommisionFrame.setTitle("BasePlusCommisionEmployee信息录入");
		    BasePlusCommisionFrame.setBounds(450, 200, 400, 300);
		    Container BasePlusCommisionContent = BasePlusCommisionFrame.getContentPane();
		     
		    JPanel BasePlusCommisionPanel = new JPanel();
		    
		    JPanel socialSecurityNumberPanel = new JPanel();
		    JLabel socialSecurityNumberLabel = new JLabel("socialSecurityNumber:");
		    JTextField socialSecurityNumberText = new JTextField(20);
		    socialSecurityNumberPanel.add(socialSecurityNumberLabel);
		    socialSecurityNumberPanel.add(socialSecurityNumberText);
			BasePlusCommisionPanel.add(socialSecurityNumberPanel);
		    
		    JPanel firstNamePanel = new JPanel();
		    JLabel firstNameLabel = new JLabel("First Name:");
		    JTextField firstNameText = new JTextField(20);
		    firstNamePanel.add(firstNameLabel);
			firstNamePanel.add(firstNameText);
			BasePlusCommisionPanel.add(firstNamePanel);
		    
			JPanel lastNamePanel = new JPanel();
		    JLabel lastNameLabel = new JLabel("Last Name:");
		    JTextField lastNameText = new JTextField(20);
		    lastNamePanel.add(lastNameLabel);
			lastNamePanel.add(lastNameText);
			BasePlusCommisionPanel.add(lastNamePanel);

			JPanel grossSalesPanel = new JPanel();
		    JLabel grossSalesLabel = new JLabel("grossSales:");
		    JTextField grossSalesText = new JTextField(20);
		    grossSalesPanel.add(grossSalesLabel);
			grossSalesPanel.add(grossSalesText);
			BasePlusCommisionPanel.add(grossSalesPanel);
			
			JPanel commissionRatePanel = new JPanel();
		    JLabel commissionRateLabel = new JLabel("commissionRate:");
		    JTextField commissionRateText = new JTextField(20);
		    commissionRatePanel.add(commissionRateLabel);
			commissionRatePanel.add(commissionRateText);
			BasePlusCommisionPanel.add(commissionRatePanel);
			
			JPanel baseSalaryPanel = new JPanel();
		    JLabel baseSalaryLabel = new JLabel("BasePlusCommision:");
		    JTextField baseSalaryText = new JTextField(20);
		    baseSalaryPanel.add(baseSalaryLabel);
		    baseSalaryPanel.add(baseSalaryText);
			BasePlusCommisionPanel.add(baseSalaryPanel);
			
			//确定按钮
			JPanel buttonPanel = new JPanel();
			JButton sunmitButton = new JButton("确认");
			buttonPanel.add(sunmitButton);
			BasePlusCommisionPanel.add(buttonPanel);
			sunmitButton.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					//添加员工信息
					int grossSales = Integer.parseInt(grossSalesText.getText().toString()),
						baseSalary = Integer.parseInt(baseSalaryText.getText().toString());	
					double commissionRate = Double.parseDouble(commissionRateText.getText().toString());
					_2014211466_吴挺康_5_BasePlusCommisionEmployee newBasePlusCommisionEmployee = new _2014211466_吴挺康_5_BasePlusCommisionEmployee(
							firstNameText.getText().toString(),
							lastNameText.getText().toString(),
							socialSecurityNumberText.getText().toString(),
							grossSales,
							commissionRate,
							baseSalary
							);
					employeeList.add(newBasePlusCommisionEmployee);
					
					//退出当前窗口
					BasePlusCommisionFrame.dispose();
				}
			});
			
			BasePlusCommisionContent.add(BasePlusCommisionPanel, BorderLayout.CENTER);
			//BasePlusCommisionFrame.pack();
			BasePlusCommisionFrame.setVisible(true);
		}else if (cmd.equals("AverageEarningSearch")){
			int sumEarning = 0;
			
			Iterator<_2014211466_吴挺康_5_Employee> employeeIter = employeeList.iterator(); 
			while(employeeIter.hasNext()) { 
				sumEarning += employeeIter.next().earning();
			}
			
			//使用下面的方式更简单，用上面的方式是为了熟悉Iterator的用法
			/*for (Employee employee : employeeList)
				sumEarning += employee.earning();*/
			
			if (employeeList.size() != 0)
				inform.setText("全部员工的平均工资：" + sumEarning/employeeList.size());
			else
				inform.setText("当前系统没有员工！");
		}else{
		}
	}  	
	    			    	
	public static void main(String[] args) {
		  new _2014211466_吴挺康_5_GraphInterface();
	}
}