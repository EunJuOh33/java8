package Day0409;

import javax.swing.JFrame;

public class ParamJappletEx {
	public static void main(String[] args) {
		JFrame f = new JFrame("���ø� ù ����");
		ParamJApplet p = new ParamJApplet();
		p.init("Java");
		
		f.setSize(300, 300);
//		f.setTitle("���ø� ù ����"); 	//���α׷� �̸� ����
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p);
		f.setVisible(true);
	}
}
