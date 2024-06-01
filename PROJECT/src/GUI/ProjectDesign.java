package GUI;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ProjectDesign implements ActionListener
{
	int cost,m,d;
	JFrame j;
	  JLabel l,l1,l2,l3,l4,l5;
	  JTextField t1;
	  JComboBox c1,c2,c3;
	  JRadioButton rb1,rb2;
	  JButton b;
	  String d1[]= { "select","Red","Blue","Black","White","Orange"};
	  String d2[]= { "select","Tube Tyre","Tubless Tyre","Cross Ply Tyre","Radial Ply Tyre","Blass Ply Tyre"};
	  String d3[]= { "select","V-Engine Layout","Flat Engine Layout","Straight or Inline Engine Layout"};
	  String cb4,cb5,cb6;
	  ProjectDesign(int cost,int m,int d)
	  {
		  
		  this.m=m;
		  this.d=d;
	    j=new JFrame("Design");
	    j.setSize(500,500);
	    j.setLayout(null);
	    
	    l=new JLabel("Select The Colour and Type Of The Tyer and Engine Type");
	    l.setBounds(30, 80, 550, 50);
	    l.setFont(new Font("Times New Roman",Font.BOLD,21));
	    j.add(l);
	    
	    l1=new JLabel("Colour");
	    l1.setBounds(130, 150, 150, 50);
	    l1.setFont(new Font("Times New Roman",Font.BOLD,22));
	    j.add(l1);
	    c1=new JComboBox(d1);
	    c1.setBounds(250, 150, 185, 50);
	    j.add(c1);
	    
	    l2=new JLabel("Wheeler");
	    l2.setBounds(130, 250, 150, 50);
	    l2.setFont(new Font("Times New Roman",Font.BOLD,22));
	    j.add(l2);
	    
	    rb1=new JRadioButton("4");
		rb1.setSelected(true);
		rb1.setBounds(250, 250, 150, 50);
		j.add(rb1);
	    
		l3=new JLabel("Types Of Tyers");
	    l3.setBounds(80, 350, 150, 50);
	    l3.setFont(new Font("Times New Roman",Font.BOLD,22));
	    j.add(l3);
	    c2=new JComboBox(d2);
	    c2.setBounds(250, 350, 185, 50);
	    j.add(c2);
	    
		l3=new JLabel("Engine Type");
	    l3.setBounds(90, 450, 150, 50);
	    l3.setFont(new Font("Times New Roman",Font.BOLD,22));
		j.add(l3);
		c3=new JComboBox(d3);
	    c3.setBounds(250, 450, 185, 50);
	    j.add(c3);
	    
	    cb4= (String) c1.getSelectedItem();
	    if(cb4.equals("Red"))
	    {
	    	cost=cost+12300;
	    }
	    if(cb4.equals("Blue"))
	    {
	    	cost=cost+14575;
	    }
	    if(cb4.equals("Black"))
	    {
	    	cost=cost+15678;
	    }
	    if(cb4.equals("Orange"))
	    {
	    	cost=cost+16975;
	    }
	    if(cb4.equals("White"))
	    {
	    	cost=cost+11297;
	    }
	    
	    cb5= (String) c1.getSelectedItem();
	    if(cb5.equals("Tube Tyre"))
	    {
	    	cost=cost+12300;
	    }
	    if(cb5.equals("Tubless Tyre"))
	    {
	    	cost=cost+14575;
	    }
	    if(cb5.equals("Cross Ply Tyre"))
	    {
	    	cost=cost+15678;
	    }
	    if(cb5.equals("Radial Ply Tyre"))
	    {
	    	cost=cost+16975;
	    }
	    if(cb5.equals("Blass Ply Tyre"))
	    {
	    	cost=cost+11297;
	    }
	    
	    
	    cb6= (String) c1.getSelectedItem();
	    if(cb6.equals("V-Engine Layout"))
	    {
	    	cost=cost+12300;
	    }
	    if(cb6.equals("Flat Engine Layout"))
	    {
	    	cost=cost+14575;
	    }
	    if(cb6.equals("Straight or Inline Engine Layout"))
	    {
	    	cost=cost+15678;
	    }
	    
	    this.cost=cost;
	    
	    l4=new JLabel("Car Model Cost:"+cost+" Rs Only");
	    l4.setBounds(100, 550, 400, 50);
	    l4.setFont(new Font("Times New Roman",Font.BOLD,22));
	    j.add(l4);
	    
	    
	    l5=new JLabel("Car Will Be Deliverd in "+m+" Months "+d+" Days");
	    l5.setBounds(80, 600, 500, 50);
	    l5.setFont(new Font("Times New Roman",Font.BOLD,22));
	    j.add(l5);
	    
	    b=new JButton("SUBMIT");
	    b.setBounds(190, 700, 150, 50);
	    b.setFont(new Font("Times new Roman",Font.BOLD,15));
	    
	    j.add(b);
	    b.addActionListener(this);
	    j.setVisible(true);
	    
	    j.setSize(600, 900);
	  }
	
	  @Override
	  public void actionPerformed(ActionEvent e)
	  {
		  String cb1,cb2,cb3,r;
	      if(e.getSource()==b)
	      {
	    	  
	    	  
	    	  cb4= (String) c1.getSelectedItem();
	  	    if(cb4.equals("Red"))
	  	    {
	  	    	cost=cost+12300;
	  	    }
	  	    if(cb4.equals("Blue"))
	  	    {
	  	    	cost=cost+14575;
	  	    }
	  	    if(cb4.equals("Black"))
	  	    {
	  	    	cost=cost+15678;
	  	    }
	  	    if(cb4.equals("Orange"))
	  	    {
	  	    	cost=cost+16975;
	  	    }
	  	    if(cb4.equals("White"))
	  	    {
	  	    	cost=cost+11297;
	  	    }
	  	    
	  	    cb5= (String) c1.getSelectedItem();
	  	    if(cb5.equals("Tube Tyre"))
	  	    {
	  	    	cost=cost+12300;
	  	    }
	  	    if(cb5.equals("Tubless Tyre"))
	  	    {
	  	    	cost=cost+14575;
	  	    }
	  	    if(cb5.equals("Cross Ply Tyre"))
	  	    {
	  	    	cost=cost+15678;
	  	    }
	  	    if(cb5.equals("Radial Ply Tyre"))
	  	    {
	  	    	cost=cost+16975;
	  	    }
	  	    if(cb5.equals("Blass Ply Tyre"))
	  	    {
	  	    	cost=cost+11297;
	  	    }
	  	    
	  	    
	  	    cb6= (String) c1.getSelectedItem();
	  	    if(cb6.equals("V-Engine Layout"))
	  	    {
	  	    	cost=cost+12300;
	  	    }
	  	    if(cb6.equals("Flat Engine Layout"))
	  	    {
	  	    	cost=cost+14575;
	  	    }
	  	    if(cb6.equals("Straight or Inline Engine Layout"))
	  	    {
	  	    	cost=cost+15678;
	  	    }
	  	    
	    	  cb1= (String) c1.getSelectedItem();
	    	  //System.out.println("Colour:"+cb1);
	    	  
	    	  r=rb1.getText();
	    	  //System.out.println("Wheeler:"+r);
	    	  
	    	  cb2= (String) c2.getSelectedItem();
	    	  //System.out.println("Type Of The Tyer:"+cb2);
	    	  
	    	  cb3= (String) c3.getSelectedItem();
	    	  //System.out.println("Engine Type:"+cb3);
	    	  
	    	  //System.out.println("Total Cost:"+cost+" Rs Only");
	    	  
	    	  //System.out.println("Car Will Be Deliverd in "+m+" Months "+d+" Days");
	    	  
	    	  JOptionPane.showMessageDialog(j,"Successfully Car Was Booked"+"\nColour is:"+cb1+"\nWheeler is:"+r+"\nType Of The Tyer is:"+cb2+"\nEngine Type is:"+cb3+"\nTotal Cost is:"+cost+" Rs Only"+"\nCar Will Be Deliverd in "+m+" Months "+d+" Days");
	     
	      }
	  }
}