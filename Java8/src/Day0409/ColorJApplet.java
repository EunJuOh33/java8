package Day0409;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ColorJApplet extends JPanel {
	public void init() {
		setBackground(Color.orange);
		//방법 1: 패널 사용
		//Panel p1 = new Panel();
		//p1.setBackground(Color.orange);
		//this.add(p1);
	}
	
	public void paint(Graphics g) {
		// 방법 2: paint 매소드에서 fillRect 사용
		// g.setColor(Color.orange);
		// g.filRect(0,0,getWidth(),getHeight());
		Color myColor = new Color(255, 0, 0);	//글자 색상이 변한다.
		g.setColor(myColor);
		g.drawString("검정색 글씨를 그린다.", 40, 100);
	} 
}
