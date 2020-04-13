package Day0413;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class NullContainer2 extends JFrame implements ActionListener {
	JPanel panel;
	Card cards;
	
	public NullContainer2() {
		setTitle("CardLayout");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel (new GridLayout(0, 5, 10, 0));
		
		addButton("<<", panel);
		addButton("<", panel);
		addButton(">", panel);
		addButton(">>", panel);
		addButton("종료", panel);
		
		add(panel, "North");
		cards = new Card();
		add(cards, "Center");
		setVisible(true);		
	}
	
	
	void addButton(String str, Container target) {
		JButton button = new JButton(str);
		button.addActionListener(this);	//ActionListener를 implements했기 때문에
										//자기 자신이 ActionListener이다.
		target.add(button);
	}
	
	
	private class Card extends JPanel {
		CardLayout layout;	//카드 레이아웃
		
		public Card() {
			layout = new CardLayout();
			setLayout(layout);
			for (int i=1; i <= 10; i++)
				add(new JButton("현재 카드의 번호 -> " + i), "Center");
		}
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("종료"))	
			System.exit(0);
		if (e.getActionCommand().equals("<<")) 
			cards.layout.first(cards);	//제일 첫 카드를 보여준다.
		if (e.getActionCommand().equals("<")) 
			cards.layout.previous(cards);	//이전 카드를 보여준다.
		if (e.getActionCommand().equals(">")) 
			cards.layout.next(cards);	//다음 카드를 보여준다.
		if (e.getActionCommand().equals(">>")) 
			cards.layout.last(cards);	//제일 마지막 카드를 보여준
	}
	
	
	public static void main(String[] args) {
		NullContainer2 uc = new NullContainer2();
	}
}
