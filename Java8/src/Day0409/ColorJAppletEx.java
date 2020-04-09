package Day0409;

import java.awt.Color;

import javax.swing.JFrame;

public class ColorJAppletEx {
	public static void main(String[] args) {
			JFrame f = new JFrame("색상 변환 예제");
			ColorJApplet p = new ColorJApplet();
			p.init();
			
			f.setSize(300, 300);
			f.setBackground(Color.orange);	//배경 색이 주황색으로 변한다.
//			f.setTitle("애플릿 첫 예제"); 	//프로그램 이름 지정
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.add(p);
			f.setVisible(true);
		}
	}
