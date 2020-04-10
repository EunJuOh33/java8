package Day0410;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelEx {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼2");
		btn1.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btn1.setText("변경1");
			}
		});
		btn2.addActionListener(e -> btn3.doClick()); 
		btn2.addActionListener(e -> btn2.setText("변경3"));
		
		p2.add(btn1);
		p2.add(btn2);
		p2.add(btn3);
		
		
		p2.add(new JButton("버튼1"));
		p2.add(new JButton("버튼2"));
		p2.add(new JButton("버튼3"));
		p1.add(p2);
		f.add(p1);
		
		f.setLayout(new FlowLayout());
		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

