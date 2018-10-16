package main;

import java.awt.Color;
//import java.awt.Dimension;
//import java.awt.Font;
import java.awt.GridLayout;
//import java.security.PublicKey;

import javax.swing.BorderFactory;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Calculator {
	JTextField textfield;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel(new GridLayout(4,4));
	JTextArea textarea = new JTextArea(0,0);
	
	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
	JButton button3 = new JButton("3");
	JButton button4 = new JButton("4");
	JButton button5 = new JButton("5");
	JButton button6 = new JButton("6");
	JButton button7 = new JButton("7");
	JButton button8 = new JButton("8");
	JButton button9 = new JButton("9");
	JButton button0 = new JButton("0");
	JButton button_add = new JButton("+");
	JButton button_sub = new JButton("-");
	JButton button_mult = new JButton("*");
	JButton button_div = new JButton("/");
	JButton button_equal = new JButton("=");
	JButton button_point = new JButton(".");
	
	
	
	
	public Calculator(){
		frame.setSize(350,400);
		frame.setTitle("Simple Calculator");
		textfield = new JTextField("Result");
		
		
		frame.setLayout(new GridLayout(2,1));
		panel.setBackground(Color.LIGHT_GRAY);
		frame.add(textarea);
		frame.add(panel);
		
		Border border = BorderFactory.createLineBorder(Color.RED,4);
		textarea.setBackground(Color.white);
		Border tborder = BorderFactory.createLineBorder(Color.BLUE,5);
		textarea.setBorder(tborder);
		
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button_div);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button_mult);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button_add);
		panel.add(button0);
		panel.add(button_point);
		panel.add(button_equal);
		panel.add(button_sub);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

