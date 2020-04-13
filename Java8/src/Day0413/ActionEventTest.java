package Day0413;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ActionEventTest extends JFrame implements ActionListener {
	JButton jbtn1, jbtn2, jbtn3, jbtn4;
	
	ActionEventTest() {
		super("ActionEvent 처리");	//super는 JFrame
		setLayout(new FlowLayout());
		
		jbtn1 = new JButton("입력");
		add(jbtn1);
		jbtn2 = new JButton("확인");
		add(jbtn2);
		jbtn3 = new JButton("옵션");
		add(jbtn3);
		jbtn4 = new JButton("메시지");
		add(jbtn4);
		
		jbtn1.addActionListener(this);	//this는 ActionListener
		jbtn2.addActionListener(this);	//(자신이 ActionListner을 구현하고 있다.)
		jbtn3.addActionListener(this);
		jbtn4.addActionListener(this);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	
	public void actionPerformed (ActionEvent e) {
		if(e.getSource() == jbtn1) {
			String name = JOptionPane.showInputDialog(this, "이름을 입력하세요!");
				// this자신이 부모 컴포넌트, showInputDialog는 서브 컴포넌트
				// Dialog는 버튼을 입력했을 때 뜨는 창이다. inputDialog는 입력창
			System.out.println(name);
		}
		
		if(e.getSource() == jbtn2) {
			int con = JOptionPane.showConfirmDialog(this, "확인?");
				// true, false를 리턴하는 다이얼로그
			if(con == JOptionPane.YES_NO_OPTION); {
				//System.exit(0);
			}
		}
		
		if(e.getSource() == jbtn3) {
			String[] option = {"검색", "추가", "취소"};
			JOptionPane.showOptionDialog(this, "원하는 작업 선택", "옵션 대화상자", 
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,
					null, option, option[0]);
		}
		
		if(e.getSource() == jbtn4) {
			JOptionPane.showMessageDialog(this, "메시지 대화상자");
		}
	}
	
	
	public static void main(String[] args) {
		ActionEventTest aet = new ActionEventTest();
		aet.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
