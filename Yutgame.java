package com.sd.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.security.*;
import java.util.ArrayList;

public class Yutgame extends JFrame implements ActionListener{
    static Icon smallicon = new ImageIcon("c:/Users/park/Code/201411022/j/src/com/sd/game/smallcircle.gif");
    static Icon smallredicon = new ImageIcon("c:/Users/park/Code/201411022/j/src/com/sd/game/smallcircle_red.gif");
    static Icon bigredicon = new ImageIcon("c:/Users/park/Code/201411022/j/src/com/sd/game/bigcircle_red.gif");
    static Icon smallblueicon = new ImageIcon("c:/Users/park/Code/201411022/j/src/com/sd/game/smallcircle_blue.gif");
    static Icon bigblueicon = new ImageIcon("c:/Users/park/Code/201411022/j/src/com/sd/game/bigcircle_blue.gif");
    static Icon bigicon = new ImageIcon("c:/Users/park/Code/201411022/j/src/com/sd/game/bigcircle.gif");
    
    static JButton roll1,roll2,alarm;
    static JLabel lable1, lable2, lable3,lable5, lable6, lable7;
    static JLabel lable8,lable14;
    static JLabel lable15,lable21;
    static JLabel lable25;
    static JLabel lable29,lable35;
    static JLabel lable36,lable42;
    static JLabel lable43, lable44, lable45, lable47, lable48, lable49;
    static JPanel panel;
    
    static ArrayList <JLabel> JList = new ArrayList <JLabel>();
    static String[] List = {"lable43","lable36","lable29","lable15","lable8","lable1","lable2","lable3","lable5","lable6", 
                "lable7","lable14","lable21","lable35","lable42","lable49","lable48","lable47","lable45","lable44"};
    
    
    public Yutgame(){
        Icon noicon = new ImageIcon("c:/Users/park/Code/201411022/j/src/com/sd/game/nocircle.gif");
        this.setTitle("Exciting Yut Game");
        
        panel = new JPanel(new GridLayout(7,7));
        getContentPane().add(panel);
        
        lable1 = new JLabel(bigicon);
        lable2 = new JLabel(smallicon);
        lable3 = new JLabel(smallicon);
        JLabel lable4 = new JLabel(noicon);
        lable5 = new JLabel(smallicon);
        lable6 = new JLabel(smallicon);
        lable7 = new JLabel(bigicon);
        lable8 = new JLabel(smallicon);
        JLabel lable9 = new JLabel(smallicon);
        JLabel lable10 = new JLabel(noicon);
        JLabel lable11 = new JLabel(noicon);
        JLabel lable12 = new JLabel(noicon);
        JLabel lable13 = new JLabel(smallicon);
        lable14 = new JLabel(smallicon);
        lable15 = new JLabel(smallicon);
        JLabel lable16 = new JLabel(noicon);
        JLabel lable17 = new JLabel(smallicon);
        JLabel lable18 = new JLabel(noicon);
        JLabel lable19 = new JLabel(smallicon);
        JLabel lable20 = new JLabel(noicon);
        lable21 = new JLabel(smallicon);
        JLabel lable22 = new JLabel(noicon);
        JLabel lable23 = new JLabel(noicon);
        JLabel lable24 = new JLabel(noicon);
        lable25 = new JLabel(bigicon);
        JLabel lable26 = new JLabel(noicon);
        JLabel lable27 = new JLabel(noicon);
        JLabel lable28 = new JLabel(noicon);
        lable29 = new JLabel(smallicon);
        JLabel lable30 = new JLabel(noicon);
        JLabel lable31 = new JLabel(smallicon);
        JLabel lable32 = new JLabel(noicon);
        JLabel lable33 = new JLabel(smallicon);
        JLabel lable34 = new JLabel(noicon);
        lable35 = new JLabel(smallicon);
        lable36 = new JLabel(smallicon);
        JLabel lable37 = new JLabel(smallicon);
        JLabel lable38 = new JLabel(noicon);
        JLabel lable39 = new JLabel(noicon);
        JLabel lable40 = new JLabel(noicon);
        JLabel lable41 = new JLabel(smallicon);
        lable42 = new JLabel(smallicon);
        lable43 = new JLabel(bigredicon);
        lable44 = new JLabel(smallicon);
        lable45 = new JLabel(smallicon);
        JLabel lable46 = new JLabel(noicon);
        lable47 = new JLabel(smallicon);
        lable48 = new JLabel(smallicon);
        lable49 = new JLabel(bigicon);
        
       
        roll1= new JButton("p1! roll!!");
        roll2= new JButton("p2! roll!!");
        alarm = new JButton("alarm");
        
        roll1.setSize(100,100);
        roll2.setSize(100,100);
        alarm.setSize(100,100);
        
        roll1.addActionListener(this);
        roll2.addActionListener(this);

        panel.add(lable1);
        panel.add(lable2);
        panel.add(lable3);
        panel.add(lable4);
        panel.add(lable5);
        panel.add(lable6);
        panel.add(lable7);
        panel.add(lable8);
        panel.add(lable9);
        panel.add(lable10);
        panel.add(lable11);
        panel.add(lable12);
        panel.add(lable13);
        panel.add(lable14);
        panel.add(lable15);
        panel.add(lable16);
        panel.add(lable17);
        panel.add(lable18);
        panel.add(lable19);
        panel.add(lable20);
        panel.add(lable21);
        panel.add(lable22);
        panel.add(roll1);
        panel.add(roll2);
        panel.add(lable25);
        panel.add(alarm);
        panel.add(lable27);
        panel.add(lable28);
        panel.add(lable29);
        panel.add(lable30);
        panel.add(lable31);
        panel.add(lable32);
        panel.add(lable33);
        panel.add(lable34);
        panel.add(lable35);
        panel.add(lable36);
        panel.add(lable37);
        panel.add(lable38);
        panel.add(lable39);
        panel.add(lable40);
        panel.add(lable41);
        panel.add(lable42);
        panel.add(lable43);
        panel.add(lable44);
        panel.add(lable45);
        panel.add(lable46);
        panel.add(lable47);
        panel.add(lable48);
        panel.add(lable49);

        
        JList.add(lable43);
        JList.add(lable36);
        JList.add(lable29);
        JList.add(lable15);
        JList.add(lable8);
        JList.add(lable1);
        JList.add(lable2);
        JList.add(lable3);
        JList.add(lable5);
        JList.add(lable6);
        JList.add(lable7);
        JList.add(lable14);
        JList.add(lable21);
        JList.add(lable35);
        JList.add(lable42);
        JList.add(lable49);
        JList.add(lable48);
        JList.add(lable47);
        JList.add(lable45);
        JList.add(lable44);
        
       
        pack();
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if(source==roll1){
            YutStart.startGame1();
           
        }else if(source==roll2){
            YutStart.startGame2();
        }
        

    }
   
    
    public static void main(String[] args) throws Exception{
        Yutgame c = new Yutgame();
        c.pack();
        c.setSize(700,700);
        c.setVisible(true);
        c.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}