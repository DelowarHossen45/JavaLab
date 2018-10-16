package main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class SwingDemo {
	SwingDemo()
	{
		JFrame jfrm = new JFrame("Caculator");
		jfrm.setSize(250, 300);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JLabel jlab = new JLabel("");
		//jfrm.add(jlab);
		jfrm.setVisible(true);
	}
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
			new SwingDemo();
			}
		});
	}

}

