package GUI;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Student implements ActionListener
{
	JFrame f;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2;
	JRadioButton rb1,rb2;
	ButtonGroup bg;
	JComboBox cb;
	String d[]= {"Select","CSE","ECE","EEE","IoT","MECH","CE","AERO"};
	JCheckBox c,cpp,j;
	JButton b1;
	public static void main(String[] args) 
	{
		new Student();
	}
	Student()
	{
		f=new JFrame("StudentDetails");
		f.setLayout(null);
		f.setVisible(true);
		
		l1=new JLabel("Name");
		l1.setBounds(100, 50, 100, 50);
		l1.setFont(new Font("Times New Roman",Font.BOLD,20));
		f.add(l1);
		
		t1=new JTextField();
		t1.setBounds(220, 50, 150, 50);
		f.add(t1);
		
		l2=new JLabel("ID");
		l2.setBounds(100, 120, 100, 50);
		l2.setFont(new Font("Times New Roman",Font.BOLD,20));
		f.add(l2);
		
		t2=new JTextField();
		t2.setBounds(220, 120, 150, 50);
		f.add(t2);
		
		l3=new JLabel("Gender");
		l3.setBounds(100, 190, 100, 50);
		l3.setFont(new Font("Times New Roman",Font.BOLD,20));
		f.add(l3);
		
		rb1=new JRadioButton("Male");
		rb1.setSelected(true);
		rb1.setBounds(220, 190, 100, 50);
		f.add(rb1);
		
		rb2=new JRadioButton("Female");
		rb2.setSelected(false);
		rb2.setBounds(320, 190, 100, 50);
		f.add(rb2);
		
		bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		l4=new JLabel("Department");
		l4.setBounds(100, 270, 100, 50);
		l4.setFont(new Font("Times New Roman",Font.BOLD,18));
		f.add(l4);
		
		cb=new JComboBox(d);
		cb.setBounds(240, 270, 100, 50);
		f.add(cb);
		
		l5=new JLabel("Course");
		l5.setBounds(100, 350, 100, 50);
		l5.setFont(new Font("Times New Roman",Font.BOLD,20));
		f.add(l5);
		
		c=new JCheckBox("C");
		c.setBounds(220, 350, 100, 50);
		f.add(c);
		
		cpp=new JCheckBox("C++");
		cpp.setBounds(320, 350, 100, 50);
		f.add(cpp);
		
		j=new JCheckBox("JAVA");
		j.setBounds(430, 350, 100, 50);
		f.add(j);
		
		b1=new JButton("Submit");
		b1.setBounds(250, 450, 100, 50);
		f.add(b1);
		b1.addActionListener(this);
		
		f.setSize(600, 600);
	}
	public void actionPerformed(ActionEvent e) 
	{
		String n,i,d,g,c;
		if(e.getSource()==b1)
		{
			n=t1.getText();
			System.out.println("Name is:"+n);
			i=t2.getText();
			System.out.println("ID is:"+i);
			if(rb1.isSelected())
				g=rb1.getText();
			else
				g=rb2.getText();
			System.out.println("Gender is:"+g);
			
			d= (String) cb.getSelectedItem();
			System.out.println("DEpartment is:"+d);
			if(this.c.isSelected())
			{
				System.out.println("Course is:"+this.c.getText());
			}
			if(cpp.isSelected())
			{
				System.out.println("Course is:"+cpp.getText());
			}
			if(j.isSelected())
			{
				System.out.println("Course is:"+j.getText());
			}
		}
		
	}

}