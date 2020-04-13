package Day0413;

import javax.swing.JFrame;

public class MouseEventDrawEx {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		MouseEventDraw med = new MouseEventDraw();
		
		f.add(med);
		f.setSize(250, 250);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
