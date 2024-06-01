package GUI;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CreateAccount  implements ActionListener
{
	
	JFrame j;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4,t5;
	JButton b1;
	public static void main(String[] args)
	{
		new CreateAccount();
	}
	CreateAccount()
	{
		j=new JFrame("LOGIN FORM");
	    j.setLayout(null);
	    j.setSize(500,500);
	    l1=new JLabel("FIRST NAME");
	    l1.setBounds(100, 50, 100, 50);
	    t1=new JTextField(10);
	    t1.setBounds(220, 50, 100, 50);
	    j.add(l1);
	    j.add(t1);
	   
	    l2=new JLabel("LAST NAME");
	    l2.setBounds(100, 100, 100, 50);
	    t2=new JTextField(10);
	    t2.setBounds(220, 100, 100, 50);
	    j.add(l2);
	    j.add(t2);
	   
	    l3=new JLabel("PHONE NUMBER");
	    l3.setBounds(100, 150, 100, 50);
	    t3=new JTextField(10);
	    t3.setBounds(220, 150, 100, 50);
	    j.add(l3);
	    j.add(t3);
	   
	    l4=new JLabel("PASSWORD");
	    l4.setBounds(100, 200, 100, 50);
	    t4=new JTextField(10);
	    t4=new JPasswordField(20);
	    t4.setBounds(220, 200, 100, 50);
	    j.add(l4);
	    j.add(t4);
	   
	    l5=new JLabel(" CONFORM PASSWORD");
	    l5.setBounds(100, 250, 100, 50);
	    t5=new JTextField(10);
	    t5=new JPasswordField(20);
	    t5.setBounds(220, 250, 100, 50);
	        j.add(l5);
	    j.add(t5);
	   
	    b1=new JButton("SIGN UP");
	    j.add(b1);
	    b1.setBounds(210, 320, 120, 50);
	    b1.setFont(new Font("Times new Roman",Font.ITALIC,20));
	    b1.addActionListener(this);
	    j.setVisible(true);
	
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		String uname=t1.getText();
		String lname=t2.getText();
		String phone=t3.getText();
		String pass =t4.getText();
		String confo=t5.getText();
		if(e.getSource()==b1)
		{
		    if(uname.equals("") || lname.equals("")|| phone.equals("") || pass.equals("")||confo.equals(""))
		    {
		    	JOptionPane.showMessageDialog(j, "Fields many not be empty");
		    }
		    else
		    {
		    	new LoginNamepassword();
		    }
		}
	}

}