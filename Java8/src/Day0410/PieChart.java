package Day0410;

import java.awt.Color;

import javax.swing.JFrame;

public class PieChart {
	public static void main(String[] args) {
		JFrame f = new JFrame("파이 차트");
		Exam0901 p = new Exam0901();
		
		f.add(p);
		f.setSize(500, 500);
		f.setBackground(Color.LIGHT_GRAY);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setVisible(true);
	}
}
