package Day0409;

import java.awt.Color;

import javax.swing.JFrame;

public class PolygonJAppletEx {
	public static void main(String[] args) {
		JFrame f = new JFrame("폴리곤 그리기");
		PolygonJApplet p = new PolygonJApplet();
		
		f.add(p);
		f.setBackground(Color.yellow);
		f.setSize(500, 500);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
