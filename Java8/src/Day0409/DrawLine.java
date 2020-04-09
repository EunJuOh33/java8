package Day0409;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class DrawLine extends JApplet {
	public void init() {
		setBackground(Color.orange);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.drawLine(10, 20, 150, 150);
		g.setColor(Color.BLACK);
		for(int y=0; y<150; y=y+20) 
			g.drawLine(10+y, 20, 10+y, 150);
	}
}
