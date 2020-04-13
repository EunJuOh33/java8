package Day0413;

import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.JFrame;

public class BorderLayoutTest extends JFrame {
	public BorderLayoutTest() {
		super("보더레이아웃");
		//JFrame과 JApplet의 기본 레이아웃 매니저는 BorderLayout이기 때문에,
		//BorderLayout 매니저를 생성하지 않아도 된다.
		//각 컴포넌트를 컨테이너에 추가
		add("North", new Button("North"));	//쓰는 방법은 여러가지
		add(BorderLayout.EAST, new Button("East"));
		add(new Button("Center"), BorderLayout.CENTER);
		add(new Button("South"), BorderLayout.SOUTH);
		add(new Button("West"), BorderLayout.WEST);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String args[]) {
		BorderLayoutTest blt = new BorderLayoutTest();
		blt.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
