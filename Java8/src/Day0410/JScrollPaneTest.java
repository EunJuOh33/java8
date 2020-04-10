package Day0410;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class JScrollPaneTest extends JFrame {
	JPanel jp;
	
	public JScrollPaneTest(String title) {
		super(title);
		setLayout(new BorderLayout());
		jp = new JPanel();
		jp.setLayout(new GridLayout(10, 5));
		int cnt = 1;
		for (int i=0; i<10; i++) {	//보통 0으로 초기화한다.
			for(int j=0; j<5; j++) {
				jp.add(new JButton("버튼" + cnt));
				cnt++;
			}
		}
		
		//수직, 수평 스크롤바를 설정하기 위한 상수를 얻음
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		JScrollPane js = new JScrollPane(jp, v, h);
		add(js, BorderLayout.CENTER);
		
		//메뉴 만들기
		JMenuBar jmb = new JMenuBar();
		setJMenuBar(jmb);
		JMenu jm1 = new JMenu("파일");
		JMenu jm2 = new JMenu("편집", false);
		JMenu jm3 = new JMenu("보기", true);
		JMenuItem item1 = new JMenuItem("새로 만들기");
		JMenuItem item2 = new JMenuItem("열기");
		JMenuItem item3 = new JMenuItem("프로그램 종료");
		jm1.add(item1);
		jm1.add(item2);
		jm1.add(item3);
		jmb.add(jm1);
		jmb.add(jm2);
		jmb.add(jm3);
		item3.addActionListener(e -> {
			System.exit(0);
		});
		
		
		setSize(250, 250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		JScrollPaneTest f = new JScrollPaneTest("스크롤 예제");
	}
}
