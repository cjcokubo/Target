package question1;

import javax.swing.*;

public class Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame ("Target");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		TargetPanel panel = new TargetPanel(); 

		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	
	}

}
