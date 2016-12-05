package com.sd.gui;

import javax.swing.*;
import java.awt.*;

public class CalcAreaGUIMain{
    public static void main(String[] args){
        JFrame f = new JFrame();
        JPanel panel = new JPanel(new GridLayout(3,2));
        f.getContentPane().add(panel);
        JLabel lable1 = new JLabel("반지름");
        JLabel lable2 = new JLabel("면적");
        JTextField radiusTf1 = new JTextField(20);
        JTextField areaTf1 = new JTextField(20);
        JButton b1 = new JButton("계산");
        JButton b2 = new JButton("취소");
        panel.add(lable1);
        panel.add(radiusTf1);
        panel.add(lable2);
        panel.add(areaTf1);
        panel.add(b1);
        panel.add(b2);
        f.pack();
        f.setVisible(true);
    }
}