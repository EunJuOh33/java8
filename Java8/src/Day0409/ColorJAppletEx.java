package Day0409;

import java.awt.Color;

import javax.swing.JFrame;

public class ColorJAppletEx {
	public static void main(String[] args) {
			JFrame f = new JFrame("���� ��ȯ ����");
			ColorJApplet p = new ColorJApplet();
			p.init();
			
			f.setSize(300, 300);
			f.setBackground(Color.orange);	//��� ���� ��Ȳ������ ���Ѵ�.
//			f.setTitle("���ø� ù ����"); 	//���α׷� �̸� ����
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.add(p);
			f.setVisible(true);
		}
	}
