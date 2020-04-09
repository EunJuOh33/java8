package Day0409;

import javax.swing.JFrame;

public class ParamJappletEx {
	public static void main(String[] args) {
		JFrame f = new JFrame("애플릿 첫 예제");
		ParamJApplet p = new ParamJApplet();
		p.init("Java");
		
		f.setSize(300, 300);
//		f.setTitle("애플릿 첫 예제"); 	//프로그램 이름 지정
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p);
		f.setVisible(true);
	}
}
