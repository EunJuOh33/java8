package Day0413;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class MouseEventDraw extends JPanel implements MouseListener {
	int noval = 0;	
	int[] x,y;
	
	public MouseEventDraw() {	//생성자
		x = new int[50];	// 크기가 50인 배열 x, y
		y = new int[50];
		addMouseListener(this);
	}
	
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.blue);
		g.drawString("마우스를 클릭하면 사각형을 그림", 10, 10);	//숫자는 글자 위치
		g.setColor(Color.red);
		for(int i=1; i <= noval; i++) {
			g.drawRect(x[i] - 20, y[i] -20, 50, 50);
		}
	}
	
	
	public void mouseClicked(MouseEvent e) {
		if(noval < 50) {
			x[noval] = e.getX();
			y[noval] = e.getY();
			noval++;
		}
		repaint();
	}
	
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	
}
