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
		addButton("����", panel);
		
		add(panel, "North");
		cards = new Card();
		add(cards, "Center");
		setVisible(true);		
	}
	
	
	void addButton(String str, Container target) {
		JButton button = new JButton(str);
		button.addActionListener(this);	//ActionListener�� implements�߱� ������
										//�ڱ� �ڽ��� ActionListener�̴�.
		target.add(button);
	}
	
	
	private class Card extends JPanel {
		CardLayout layout;	//ī�� ���̾ƿ�
		
		public Card() {
			layout = new CardLayout();
			setLayout(layout);
			for (int i=1; i <= 10; i++)
				add(new JButton("���� ī���� ��ȣ -> " + i), "Center");
		}
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("����"))	
			System.exit(0);
		if (e.getActionCommand().equals("<<")) 
			cards.layout.first(cards);	//���� ù ī�带 �����ش�.
		if (e.getActionCommand().equals("<")) 
			cards.layout.previous(cards);	//���� ī�带 �����ش�.
		if (e.getActionCommand().equals(">")) 
			cards.layout.next(cards);	//���� ī�带 �����ش�.
		if (e.getActionCommand().equals(">>")) 
			cards.layout.last(cards);	//���� ������ ī�带 ������
	}
	
	
	public static void main(String[] args) {
		NullContainer2 uc = new NullContainer2();
	}
}
