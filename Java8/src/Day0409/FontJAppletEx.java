package Day0409;

import java.awt.Font;

import javax.swing.JFrame;

public class FontJAppletEx {
	public static void main(String[] args) {
		JFrame f = new JFrame("폰트 설정 예제");
		FontJApplet p = new FontJApplet();
		p.init();
		
		f.setSize(600, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p);
		f.setResizable(false); 	//크기를 변경하지 못하게 한다.
		f.setVisible(true);
	}
}
