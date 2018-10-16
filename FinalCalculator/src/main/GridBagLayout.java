package main;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
//import javax.swing.JTextField;

public class GridBagLayout implements ActionListener{
	static double a=0,b=0,result=0;
    static int operator=0;
	JFrame f;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,plus,minus,sub,mul,equal,div,clear,dot,backspace;
	JTextArea t;
	GridBagLayout(){
		f =new JFrame("Calculator");
		JPanel text = new JPanel();
		JPanel button = new JPanel(new GridLayout(4,4,4,4));
		JPanel south = new JPanel();
		 t =new JTextArea(3,30);
		 b1 =new JButton("1");
		 b2 =new JButton("2");
		 b3 =new JButton("3");
		 b4 =new JButton("4");
		 b5 =new JButton("5");
		 b6 =new JButton("6");
		 b7 =new JButton("7");
		 b8 =new JButton("8");
		 b9 =new JButton("9");
		 b0 =new JButton("0");
		 plus =new JButton("+");
		 minus =new JButton("-");
		 mul =new JButton("X");
		 div =new JButton("/");
		 equal =new JButton("=");
		 dot =new JButton(".");
		 clear =new JButton("C");
		//JButton clear1 =new JButton("CE");
		//JButton squar =new JButton("Square");
		 backspace =new JButton("B");
		//JButton dot =new JButton(".");
		f.setLayout(new BorderLayout());
		f.add(text,BorderLayout.NORTH);
		f.add(button,BorderLayout.CENTER);
		f.add(south,BorderLayout.SOUTH);
		text.add(t);
		south.add(clear);south.add(backspace);
		button.add(b7);button.add(b8);button.add(b9);button.add(mul);
		button.add(b4);button.add(b5);button.add(b6);button.add(div);
		button.add(b1);button.add(b2);button.add(b3);button.add(minus);
		button.add(dot);button.add(b0);button.add(equal);button.add(plus);
		f.setSize(350,450);
		f.setVisible(true);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        plus.addActionListener(this);
        div.addActionListener(this);
        mul.addActionListener(this);
        minus.addActionListener(this);
        dot.addActionListener(this);
        equal.addActionListener(this);
        backspace.addActionListener(this);
        clear.addActionListener(this);
		
		
	}
	
	 
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
            t.setText(t.getText().concat("1"));
        
        if(e.getSource()==b2)
            t.setText(t.getText().concat("2"));
        
        if(e.getSource()==b3)
            t.setText(t.getText().concat("3"));
        
        if(e.getSource()==b4)
            t.setText(t.getText().concat("4"));
        
        if(e.getSource()==b5)
            t.setText(t.getText().concat("5"));
        
        if(e.getSource()==b6)
            t.setText(t.getText().concat("6"));
        
        if(e.getSource()==b7)
            t.setText(t.getText().concat("7"));
        
        if(e.getSource()==b8)
            t.setText(t.getText().concat("8"));
        
        if(e.getSource()==b9)
            t.setText(t.getText().concat("9"));
        
        if(e.getSource()==b0)
            t.setText(t.getText().concat("0"));
        
        if(e.getSource()==dot)
            t.setText(t.getText().concat("."));
        
        if(e.getSource()==plus)
        {
            a=Double.parseDouble(t.getText());
            operator=1;
            t.setText("");
        } 
        
        if(e.getSource()==minus)
        {
            a=Double.parseDouble(t.getText());
            operator=2;
            t.setText("");
        }
        
        if(e.getSource()==mul)
        {
            a=Double.parseDouble(t.getText());
            operator=3;
            t.setText("");
        }
        
        if(e.getSource()==div)
        {
            a=Double.parseDouble(t.getText());
            operator=4;
            t.setText("");
        }
        
        if(e.getSource()==equal)
        {
            b=Double.parseDouble(t.getText());
        
            switch(operator)
            {
                case 1: result=a+b;
                    break;
        
                case 2: result=a-b;
                    break;
        
                case 3: result=a*b;
                    break;
        
                case 4: result=a/b;
                    break;
        
                default: result=0;
            }
        
            t.setText(""+result);
        }
        
        if(e.getSource()==clear)
            t.setText("");
        
        if(e.getSource()==backspace)
        {
            String s=t.getText();
            t.setText("");
            for(int i=0;i<s.length()-1;i++)
            t.setText(t.getText()+s.charAt(i));
        }        
    }

	public static void main(String args[]) {
		new GridBagLayout();
		
		
	}
}
