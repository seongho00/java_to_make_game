package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {


        JButton button1 = new JButton();
        JLabel label1 = new JLabel();
        button1.setSize(200, 200);

        ActionListener actionListener = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (button1.equals(e.getSource())) {
                    System.out.println("TEST");
                }
            }

        };


        JFrame frm = new JFrame();

        // 버튼 만들기
        button1.setText("Button1");
        button1.setSize(80, 30);
        button1.setLocation(60, 30);
        button1.setBackground(Color.blue);
        button1.setForeground(Color.RED);
        frm.add(button1);
        button1.addActionListener(actionListener);

        // 버튼 상호작용


    }




}





