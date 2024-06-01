package GUI;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class NumberOfWords implements ActionListener
{
	JFrame f;
	JLabel l1;
	JTextField t1;
	JButton b1;
	public static void main(String[] args) 
	{
		new NumberOfWords();
	}
	NumberOfWords()
	{
		f=new JFrame("To Print Number Of Words & Characters");
		f.setLayout(null);
		f.setVisible(true);
		
		l1=new JLabel("Enter a String");
		l1.setBounds(100, 50, 100, 50);
		l1.setFont(new Font("Times New Roman",Font.BOLD,20));
		f.add(l1);
		
		t1=new JTextField();
		t1.setBounds(220, 50, 150, 50);
		f.add(t1);
		
		b1=new JButton("Submit");
		b1.setBounds(250, 450, 100, 50);
		f.add(b1);
		b1.addActionListener(this);
		
		f.setSize(600, 600);
	}
	public void actionPerformed(ActionEvent e) 
	{
		String s;
		if(e.getSource()==b1)
		{
			s=t1.getText();
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==' ')
				{
					
				}
			}
			
		}
		
	}

}