package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.tools.Tool;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import javax.print.DocFlavor.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ProjectCompany implements ActionListener
{
	
	JFrame j;
	JLabel l1,l2;
	JComboBox c;
	JButton b1;
	String d[]= {"select","BMW","AUODI","FERARI"};
	public static void main(String[] args)
	{  
		new ProjectCompany();    
	}
	ProjectCompany()
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\rocky\\Pictures\\Saved Pictures\\IMG_20210129_131605.jpg"));
		
		
		j=new JFrame("CAR COMPANY");
	    j.setLayout(null);
	    
	    l1=new JLabel("SELECT CAR COMPANY");
	    l1.setBounds(20, 250, 250, 50);
	    l1.setFont(new Font("Times New Roman",Font.BOLD,18));
	    l1.setForeground(new Color(0Xffffff));
	    j.add(l1);
	    c=new JComboBox(d);
	    c.setBounds(250, 250, 200, 50);
	    j.add(c);
	    
	    b1=new JButton("Continue");
	    b1.setBounds(200, 330, 150, 50);
	    b1.setFont(new Font("Times new Roman",Font.BOLD,15));
	    j.add(b1);
	    b1.addActionListener(this);
	    
	    l2=new JLabel("");
	    Image img=new ImageIcon(this.getClass().getResource("/imgbg.jpg")).getImage();
	    l2.setIcon(new ImageIcon(img));
	    l2.setBounds(0, 0, 600, 500);
	    j.add(l2);
	    
	    
	    j.setVisible(true);
	    j.getContentPane().setBackground(new Color(0Xc92626));
	    j.setSize(600, 500);
	}
	private void setIconImage(Image image) {
		// TODO Auto-generated method stub
		
	}
	public void actionPerformed(ActionEvent e)
	{
		String d;
	      if(e.getSource()==b1)
	      {
		        d=(String) c.getSelectedItem();
		        //System.out.println("Car Company:"+d);
		        if(d.equals("BMW"))
	        	{
		        	new Project("/imgbmw.jpg");
	        	}
		        else if(d.equals("AUODI"))
		        {
		        	new Project("/imgauodi.jpg");
		        }
		        else if(d.equals("FERARI"))
		        {
		        	new Project("/img.jpg");
		        }
	      }
	}
}
