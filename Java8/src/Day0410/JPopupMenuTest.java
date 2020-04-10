package Day0410;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;

public class JPopupMenuTest extends JFrame {
	String[] title = {"사번", "성명", "부서"};
	JRadioButtonMenuItem rbm[];
	
	public JPopupMenuTest() {
		super("팝업메뉴에서 항목 선택");
		final JPopupMenu pmenu = new JPopupMenu();
		ButtonGroup tgroup = new ButtonGroup();
		rbm = new JRadioButtonMenuItem[3];
		
		for(int i=0; i<rbm.length; i++) {
			rbm[i] = new JRadioButtonMenuItem(title[i]);
			pmenu.add(rbm[i]);
			tgroup.add(rbm[i]);
		}
		
		//마우스 이벤트를 리스너에 등록
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e)
				{checkForTriggerEvent(e);}
			public void mouseReleased(MouseEvent e)
				{checkForTriggerEvent(e);}
			public void checkForTriggerEvent (MouseEvent e) {
				//마우스 오른쪽 버튼을 누르거나 해제할 때 발생
				if(e.isPopupTrigger())
				pmenu.show(e.getComponent(), e.getX(), e.getY());
			}	
		});
		
		setSize(300, 200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		JPopupMenuTest pt = new JPopupMenuTest();
		pt.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
