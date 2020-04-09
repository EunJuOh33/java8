package Day0409;

import javax.swing.JFrame;

public class RoundRectEx {
	public static void main(String[] args) {
		JFrame f = new JFrame("사각형 그리기");
		RoundRect p = new RoundRect();
		
		f.setSize(500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p);
		f.setResizable(false);
		f.setVisible(true);
	}
}
