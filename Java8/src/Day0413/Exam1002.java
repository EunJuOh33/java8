package Day0413;

import java.awt.BorderLayout;
import java.awt.TextField;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Exam1002 {
	public static void main(String[] args) {
//프로그램의 구성		
		JFrame f = new JFrame("메뉴 예제");
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu1 = new JMenu("파일");
		JMenu menu2 = new JMenu("편집");
		JMenu menu3 = new JMenu("보기");
		
		JMenuItem item1_1 = new JMenuItem("새로 만들기");
		JMenuItem item1_2 = new JMenuItem("열기");
		JMenuItem item1_3 = new JMenuItem("저장");
		JMenuItem item2_1 = new JMenuItem("잘라내기");
		JMenuItem item2_2 = new JMenuItem("복사");
		JMenuItem item2_3 = new JMenuItem("붙여넣기");
		JMenuItem item3_1 = new JMenuItem("도구모음");
		JMenuItem item3_2 = new JMenuItem("상태 표시줄");
		
		menu1.add(item1_1);
		menu1.add(item1_2);
		menu1.add(item1_3);
		menu2.add(item2_1);
		menu2.add(item2_2);
		menu2.add(item2_3);
		menu3.add(item3_1);
		menu3.add(item3_2);
		
		menuBar.add(menu1);
		menuBar.add(menu2);
		menuBar.add(menu3);
		
		TextField tf = new TextField();
		tf.setEnabled(false);
		tf.setEditable(false);
		
		f.add(tf, BorderLayout.SOUTH);
		f.setJMenuBar(menuBar);	//add로 붙이지 않는다.
		f.setSize(300, 300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
// 글자 나타나도록 만들기
		ActionListener listener = e -> tf.setText(e.getActionCommand());	
		//getActionCommand()에는 String값이 들어가야 한다.
		item1_1.addActionListener(listener);
		item1_2.addActionListener(listener);
		item1_3.addActionListener(listener);
		item2_1.addActionListener(listener);
		item2_2.addActionListener(listener);
		item2_3.addActionListener(listener);
		item3_1.addActionListener(listener);
		item3_2.addActionListener(listener);	
	}
}
