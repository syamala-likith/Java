package GUI;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
public class LoginNamepassword implements ActionListener
{
    JFrame u;
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1,b2;
    public static void main (String args[])
    {
    	new LoginNamepassword();
    }
    LoginNamepassword()
    {
	    u=new JFrame("LOGIN FORM");
	    u.setLayout(null);
	    u.setSize(500,500);
	    l1=new JLabel("UserName");
	    l1.setBounds(100, 50, 100, 50);
	    t1=new JTextField(10);
	    t1.setBounds(220, 50, 100, 50);
	    u.add(l1);
	    u.add(t1);
	    l2=new JLabel("Password");
	    l2.setBounds(100, 100, 100, 50);
	    t2=new JTextField(10);
	    t2=new JPasswordField(20);
	    t2.setBounds(220, 100, 100, 50);
	    u.add(l2);
	    u.add(t2);
	    b1=new JButton("Log in");
	    u.add(b1);
	    b1.setBounds(200, 200, 150, 50);
	    b1.setFont(new Font("Times new Roman",Font.ITALIC,20));
	    b2=new JButton("SIGN UP");
	    b2.setBounds(200, 270, 150, 50);
	    b2.setFont(new Font("Times new Roman",Font.ITALIC,20));
	    u.add(b2);
	    b1.addActionListener(this);
	    b2.addActionListener(this);
	    u.setVisible(true);
    }
	public void actionPerformed(ActionEvent e)
	{
		String pass=t2.getText();
		String uname=t1.getText();
		if(e.getSource()==b2)
		{
			new CreateAccount();
		}
		if(e.getSource()==b1)
		{
			if(uname.equals("Charan") && pass.equals("Charan@123"))
			{
				new Frame();
			}
			else
			{
				JOptionPane.showMessageDialog(u,"INVALID USERNAME or PASSWORD");
			}
		}
	}
}