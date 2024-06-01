package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Frame implements  ActionListener
{
	JFrame j;
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	public static void main(String[] args)
	{
		new Frame();
	}
	Frame()
	{
		j=new JFrame("WELCOME");
		j.setLayout(null);
		j.setSize(1000, 1000);
		
		l1=new JLabel("INPUT 1");
		l1.setBounds(100, 50, 100, 50);
		
		t1=new JTextField(10);
		t1.setBounds(200, 50, 100, 50);
		
		j.add(l1);
		j.add(t1);
		
		l2=new JLabel("INPUT 2");
		l2.setBounds(100, 110, 100, 50);
		
		t2=new JTextField(10);
		t2.setBounds(200, 110, 100, 50);
		
		j.add(l2);
		j.add(t2);
		
		l3=new JLabel("OUTPUT");
		l3.setBounds(100, 200, 100, 50);
		
		t3=new JTextField(10);
		t3.setBounds(200, 200, 100, 50);
		
		j.add(l3);
		j.add(t3);
		
		b1=new JButton("ADD");
		b1.setBounds(180, 270, 150, 50);
		j.add(b1);
		
		b2=new JButton("SUB");
		b2.setBounds(180, 320, 150, 50);
		j.add(b2);
		
		b3=new JButton("MULT");
		b3.setBounds(180, 370, 150, 50);
		j.add(b3);
		
		b4=new JButton("DIV");
		b4.setBounds(180, 420, 150, 50);
		j.add(b4);
		
		b5=new JButton("PERCENTAGE");
		b5.setBounds(180, 470, 150, 50);
		j.add(b5);
		
		b6=new JButton("DS%");
		b6.setBounds(180,520, 150, 50);
		j.add(b6);
		
		b7=new JButton("COA%");
		b7.setBounds(180,570, 150, 50);
		j.add(b7);
		
		b8=new JButton("MFE%");
		b8.setBounds(180,620, 150, 50);
		j.add(b8);
		
		b9=new JButton("JAVA%");
		b9.setBounds(180,670, 150, 50);
		j.add(b9);
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		
		j.setVisible(true);
	
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int c=a+b;
			t3.setText(Integer.toString(c));
		}
		
		if(e.getSource()==b2)
		{
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int c=a-b;
			t3.setText(Integer.toString(c));
			if(c<0)
			{
				JOptionPane.showMessageDialog(j,"Value is Negative");
			}
		}
		if(e.getSource()==b3)
		{
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int c=a*b;
			t3.setText(Integer.toString(c));
		}
		if(e.getSource()==b4)
		{
			float a=Float.parseFloat(t1.getText());
			float b=Float.parseFloat(t2.getText());
			float c=a/b;
			t3.setText(Float.toString(c));
		}
		if(e.getSource()==b5)
		{
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int c=(a/b)*100;
			t3.setText(Integer.toString(c));
		}
		if(e.getSource()==b6)
		{
			float a=Float.parseFloat(t1.getText());
			float b=Float.parseFloat(t2.getText());
			float c=(a/b)*12;
			t3.setText(Float.toString(c));
		}
		if(e.getSource()==b7)
		{
			float a=Float.parseFloat(t1.getText());
			float b=Float.parseFloat(t2.getText());
			float c=(a/b)*20;
			t3.setText(Float.toString(c));
		}
		if(e.getSource()==b8)
		{
			float a=Float.parseFloat(t1.getText());
			float b=Float.parseFloat(t2.getText());
			float c=(a/b)*18;
			t3.setText(Float.toString(c));
		}
		if(e.getSource()==b9)
		{
			float a=Float.parseFloat(t1.getText());
			float b=Float.parseFloat(t2.getText());
			float c=(a/b)*12;
			t3.setText(Float.toString(c));
		}
	}
}