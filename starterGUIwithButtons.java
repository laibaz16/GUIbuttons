// Starter Template 
// import(s) at top of program b4 class line

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class starterGUIwithButtons extends JFrame implements ActionListener{ 
  //Variable and GUIObject Declaration area 
  JButton[] buttons;
  JLabel l1,l2, l3, l4,l5,l6,l7;
  JLabel [] boxes, boxes2, boxes3,labels, score;
  JPanel p2, p3,p4,p5,p6,p7,p8;
  ImageIcon image = new ImageIcon(new ImageIcon("image.png").getImage().getScaledInstance(140, 100, Image.SCALE_DEFAULT));
  ImageIcon yellowdots = new ImageIcon(new ImageIcon("yellowdots.png").getImage().getScaledInstance(15, 15, Image.SCALE_DEFAULT));
  
  public static void main(String[ ] args) 
  {
    new starterGUIwithButtons ();
  }  
  
  public starterGUIwithButtons (){
    //Create object and your code goes here
    
    
    JPanel panel1 = new JPanel();
    this.add(panel1);
    panel1.setBorder(BorderFactory.createLineBorder(Color.black,10));
    panel1.setLayout(null);
    panel1.setBackground(new Color(135,206,250));
    
    //smallboxes
    p2 = new JPanel();
    panel1.add(p2);
    p2.setBounds(20, 24, 50, 240);
    
    boxes= new JLabel[36];
    for( int a=0;a<36;a++)
    {
      boxes[a]=new JLabel("");
      boxes[3]=new JLabel("D",SwingConstants.CENTER);
      boxes[4]=new JLabel("O",SwingConstants.CENTER);
      boxes[5]=new JLabel("T",SwingConstants.CENTER);
      boxes[9]=new JLabel("B",SwingConstants.CENTER);
      boxes[10]=new JLabel("E",SwingConstants.CENTER);
      boxes[11]=new JLabel("T",SwingConstants.CENTER);
      boxes[18]=new JLabel("T",SwingConstants.CENTER);
      boxes[19]=new JLabel("H",SwingConstants.CENTER);
      boxes[20]=new JLabel("E",SwingConstants.CENTER);
      boxes[33]=new JLabel("H",SwingConstants.CENTER);
      boxes[34]=new JLabel("O",SwingConstants.CENTER);
      boxes[35]=new JLabel("T",SwingConstants.CENTER);      
      p2.add(boxes[a]);
      boxes[a].setBorder(BorderFactory.createLineBorder(Color.black,1));
    }
    p2.setLayout( new GridLayout(12,3,2,2));    
    p3=new JPanel();
    panel1.add(p3);
    p3.setBounds(20, 268, 70, 100);
    boxes2= new JLabel[24];
    for( int b=0;b<24;b++)
    {
      boxes2[b]=new JLabel("");
      boxes2[0]=new JLabel("D",SwingConstants.CENTER);
      boxes2[1]=new JLabel("E",SwingConstants.CENTER);
      boxes2[2]=new JLabel("B",SwingConstants.CENTER);
      boxes2[3]=new JLabel("T",SwingConstants.CENTER);
      boxes2[8]=new JLabel("B",SwingConstants.CENTER);
      boxes2[9]=new JLabel("O",SwingConstants.CENTER);
      boxes2[10]=new JLabel("D",SwingConstants.CENTER);
      boxes2[11]=new JLabel("E",SwingConstants.CENTER);      
      p3.add(boxes2[b]);
      boxes2[b].setBorder(BorderFactory.createLineBorder(Color.black,1));
    }
    p3.setLayout( new GridLayout(6,4,2,2));
    
    p4=new JPanel();
    panel1.add(p4);
    boxes3=new JLabel[6];    
    for (int q=0; q<6; q++)
    {
      boxes3[q]=new JLabel("");
      boxes3[q].setBorder(BorderFactory.createLineBorder(Color.black,1));
      p4.add(boxes3[q]);
    }
    p4.setLayout( new GridLayout(1,6,2,2));
    p4.setBounds(20, 372, 90,15);
    
    p5=new JPanel();
    panel1.add(p5);
    p5.setBounds(175, 110, 325,130);
    p5.setLayout(new GridLayout(2,6,0,60));
    p5.setBackground(new Color(135,206,250));
    labels=new JLabel[12];
    for (int z=0;z<6;z++)
    {
      labels[z]=new JLabel("");
      labels[0]=new JLabel("B", SwingConstants.CENTER);
      labels[1]=new JLabel("O",SwingConstants.CENTER);
      labels[2]=new JLabel("D",SwingConstants.CENTER);
      labels[3]=new JLabel("E",SwingConstants.CENTER);
      labels[z].setBorder(BorderFactory.createLineBorder(Color.white,2));
      p5.add(labels[z]);      
    }
    
    for( int y=0;y<6;y++)
    { labels[y]=new JLabel(yellowdots);
      labels[4]=new JLabel("H",SwingConstants.CENTER);
      labels[5]=new JLabel("T",SwingConstants.CENTER); 
      p5.add(labels[y]);
    }
    
    p6=new JPanel();
    panel1.add(p6);
    buttons= new JButton[4];
    buttons[0]=new JButton("TWIST");
    buttons[1]=new JButton("ENTER");
    buttons[2]=new JButton("LAST WORD");
    buttons[3]=new JButton("CLEAR");
    for(int t=0;t<4;t++)
    { 
      buttons[t].addActionListener(this);
      buttons[t].setBackground(new Color(255,140,0));
      buttons[t].setBorder(BorderFactory.createLineBorder(Color.white,2));
      buttons[t].setFont(new Font("Century Gothic", Font.BOLD, 12));
      buttons[t].setForeground(Color.WHITE);
      p6.add(buttons[t]);
    }
    p6.setBounds(175, 250, 325,40);
    p6.setBackground(new Color(135,206,250));
    p6.setLayout( new GridLayout(1,6,5,0));
    
    p7=new JPanel();
    panel1.add(p7);
    
    score=new JLabel[4];
    for(int w=0; w<4; w++)
    {
      score[w]=new JLabel(""); 
      score[0]=new JLabel("SCORE");
      score[1]=new JLabel("680");
      score[2]=new JLabel("TIME");
      score[3]=new JLabel("1:01");
      score[w].setFont(new Font("Century Gothic", Font.BOLD, 26));
      score[w].setForeground(Color.WHITE);
      p7.add(score[w]);
    }
    p7.setLayout(new GridLayout(4,1,0,2));
    p7.setBackground(new Color(135,206,250));
    p7.setBounds(175, 300, 240,100);
    
    p8=new JPanel();
    panel1.add(p8);
    l7=new JLabel(image);
    p8.add(l7);
    p8.setBounds(360, 12, 140,95);     
     p8.setBackground(new Color(135,206,250));
    
    
    
    this.setSize(535,460);
    this.setVisible(true);
  } 
  
  public void actionPerformed(ActionEvent e)
  {
    //Most of the 'action' codes will be attached to buttons
    
    //if (e.getSource()==b1)
    {
    }
    //else if (e.getSource()==b2)
    {
    }
  }
}