package org.firstgui;

import javax.swing.*;
import javax.swing.plaf.basic.DefaultMenuLayout;
import java.awt.*;
import java.awt.font.TextLayout;

public class q1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,350);

        JLabel question = new JLabel("Que1:Which one among these is not a datatype?");

        JRadioButton option1 = new JRadioButton("int");
        JRadioButton option2 = new JRadioButton("Float");
        JRadioButton option3 = new JRadioButton("boolean");
        JRadioButton option4 = new JRadioButton("char");

        JButton nextButton = new JButton("Next");

        question.setBounds(30, 24, 500, 50);
        option1.setBounds(50, 64, 200, 50);
        option2.setBounds(50, 95, 200, 50);
        option3.setBounds(50, 126, 200, 50);
        option4.setBounds(50, 157, 200, 50);
        nextButton.setBounds(100, 230, 100, 50);

        JPanel panel = new JPanel(null);
        panel.add(question);
        panel.add(option1);
        panel.add(option2);
        panel.add(option3);
        panel.add(option4);
        panel.add(nextButton);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setVisible(true);
    }
}