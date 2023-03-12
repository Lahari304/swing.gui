
package swing.gui;

import java.awt.event.*;
import javax.swing.*;

class OnlineTest2 extends JFrame implements ActionListener
{
    JLabel label;
    JRadioButton option[]=new JRadioButton[5];
    JButton b1,b2;
    ButtonGroup bg;
    int count=0,current=0,result=0;
    int answers[]=new int[10];

    OnlineTest2(JLabel label){
        add(label);
        label.setBounds(30,40,450,20);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250,100);
        setVisible(true);
        setSize(600,350);
    }
    OnlineTest2()
    {
        setAnswers();

        label=new JLabel();
        add(label);
        bg=new ButtonGroup();
        for(int i=0;i<5;i++)
        {
            option[i]=new JRadioButton();
            add(option[i]);
            bg.add(option[i]);
        }
        b1=new JButton("Next");
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("Submit");
        b2.addActionListener(this);
        add(b2);

        set();

        b1.setBounds(100,240,100,30);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250,100);
        setVisible(true);
        setSize(600,500);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(bg.isSelected(option[answers[current]].getModel())) {
            System.out.println(current);
            result++;
        }

        bg.clearSelection();

        if(e.getSource()==b1)
        {
            count=count+1;
            current++;
            set();
        }
        else if(e.getSource()==b2){
            removeAll(); repaint();
            add(label);
            label.setText("Answers submitted! Your Score is: "+result+"/"+answers.length);
            label.setBounds(30,40,450,20);
            setVisible(false);
            new OnlineTest2(label);
        }
    }

    void setAnswers(){

        answers[0] = 1;
        answers[1] = 2;
        answers[2] = 3;
        answers[3] = 0;
        answers[4] = 0;
        answers[5] = 2;
        answers[6] = 1;
        answers[7] = 3;
        answers[8] = 1;
        answers[9] = 2;

    }

    void set()
    {

        if(current==0)
        {
            label.setText("Que1: Which one among these is not a datatype");
            option[0].setText("int");option[1].setText("Float");option[2].setText("boolean");option[3].setText("char");
        }
        if(current==1)
        {
            label.setText("Que2: Which class is available to all the class automatically");
            option[0].setText("Swing");option[1].setText("Applet");option[2].setText("Object");option[3].setText("ActionEvent");
        }
        if(current==2)
        {
            label.setText("Que3: Which package is directly available to our class without importing it");
            option[0].setText("swing");option[1].setText("applet");option[2].setText("net");option[3].setText("lang");
        }
        if(current==3)
        {
            label.setText("Que4: String class is defined in which package");
            option[0].setText("lang");option[1].setText("Swing");option[2].setText("Applet");option[3].setText("awt");
        }
        if(current==4)
        {
            label.setText("Que5: Which institute is best for java coaching");
            option[0].setText("Guru99");option[1].setText("ABC");option[2].setText("XYZ");option[3].setText("123");
        }
        if(current==5)
        {
            label.setText("Que6: Which one among these is not a keyword");
            option[0].setText("class");option[1].setText("int");option[2].setText("get");option[3].setText("if");
        }
        if(current==6)
        {
            label.setText("Que7: Which one among these is not a class ");
            option[0].setText("Swing");option[1].setText("Actionperformed");option[2].setText("ActionEvent");option[3].setText("Button");
        }
        if(current==7)
        {
            label.setText("Que8: which one among these is not a function of Object class");
            option[0].setText("toString");option[1].setText("finalize");option[2].setText("equals");option[3].setText("getDocumentBase");
        }
        if(current==8)
        {
            label.setText("Que9: which function is not present in Applet class");
            option[0].setText("init");option[1].setText("main");option[2].setText("start");option[3].setText("destroy");
        }
        if(current==9)
        {
            label.setText("Que10: Which one among these is not a valid component");
            option[0].setText("JButton");option[1].setText("JList");option[2].setText("JButtonGroup");option[3].setText("JTextArea");

            remove(b1);
            repaint();

            b2.setBounds(400, 300, 120, 50);
        }
        label.setBounds(30,40,450,20);
        for(int i=0,j=0;i<=90;i+=30,j++)
            option[j].setBounds(50,80+i,200,20);
    }
    public static void main(String s[])
    {

        new OnlineTest2();
    }


}