package GUI;
import java.awt.Color;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Project implements ActionListener
{
  JFrame j;
  JLabel l1,l2;
  JComboBox c;
  JButton b1;
  String d[]= { "select","SEDAN","COUPE","SPORTS CAR","STATION WAGON","HATCHBACK","CONVERTIBLE","SPORT UTILITY VEHICLE","MINIVAN"};
  Project(String s)
  {
    j=new JFrame("CAR MODEL");
    j.setLayout(null);
    
    l1=new JLabel("SELECT CAR MODEL");
    l1.setBounds(50, 250, 250, 50);
    l1.setFont(new Font("Times New Roman",Font.BOLD,18));
    j.add(l1);
    c=new JComboBox(d);
    c.setBounds(250, 250, 200, 50);
    j.add(c);
    
    b1=new JButton("DESIGN");
    b1.setBounds(200, 330, 150, 50);
    b1.setFont(new Font("Times new Roman",Font.BOLD,15));
    
    j.add(b1);
    b1.addActionListener(this);
    
    l2=new JLabel("");
    Image img=new ImageIcon(this.getClass().getResource(s)).getImage();
    l2.setIcon(new ImageIcon(img));
    l2.setBounds(180, 10, 200, 300);
    j.add(l2);
    
    
    j.setVisible(true);
    j.getContentPane().setBackground(new Color(0X60b3fa));
    j.setSize(600, 500);
  }

  @Override
  public void actionPerformed(ActionEvent e)
  {
	  String d;
      if(e.getSource()==b1)
      {
	        d=(String) c.getSelectedItem();
	        //System.out.println("Car Model:"+d);
	        if(d.equals("SEDAN"))
        	{
	        	new ProjectDesign(1000000,1,10);
        	}
	        else if(d.equals("COUPE"))
	        {
	        	new ProjectDesign(2000000,2,5);
	        }
	        else if(d.equals("COUPE"))
	        {
	        	new ProjectDesign(3000000,1,15);
	        }
	        else if(d.equals("SPORTS CAR"))
	        {
	        	new ProjectDesign(4000000,1,20);
	        }
	        else if(d.equals("STATION WAGON"))
	        {
	        	new ProjectDesign(5000000,2,7);
	        }
	        else if(d.equals("HATCHBACK"))
	        {
	        	new ProjectDesign(6000000,1,16);
	        }
	        else if(d.equals("CONVERTIBLE"))
	        {
	        	new ProjectDesign(7000000,1,19);
	        }
	        else if(d.equals("SPORT UTILITY VEHICLE"))
	        {
	        	new ProjectDesign(8000000,1,25);
	        }
	        else if(d.equals("MINIVAN"))
	        {
	        	new ProjectDesign(9000000,1,13);
	        }
      }
  }
}