package swing.gui;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

class gui{
    public static void main(String args[]){

        JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        ImageIcon chatIcon = new ImageIcon("C:/Users/nekur/IdeaProjects/swing.gui/src/main/resources/chaticon.png");
        frame.setIconImage(chatIcon.getImage());
        System.out.println(chatIcon.getIconWidth());

        JMenuBar menuBar = new JMenuBar();
        //File
        JMenu fileMenu = new JMenu("File");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveAsMenuItem = new JMenuItem("Save as");
        fileMenu.add(openMenuItem);
        fileMenu.add(saveAsMenuItem);
        //Help
        JMenu helpMenu = new JMenu("Help");
        //add File and Help to menuBar
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        //Panel at bottom for text entry
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter Text");
        JTextField textField = new JTextField(10);
        JButton sendButton = new JButton("Send");
        JButton resetButton = new JButton("Reset");
        panel.add(label);
        panel.add(textField);
        panel.add(sendButton);
        panel.add(resetButton);

        //Text Area at the center
        JTextArea textArea = new JTextArea();

        //add all components to frame
        frame.getContentPane().add(BorderLayout.NORTH, menuBar); // Adds Button to content pane of frame
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, textArea);
        frame.setVisible(true);
    }
}
