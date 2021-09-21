package team2;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

public class T extends JFrame {
	JPanel p = new JPanel();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JButton b_letgo = new JButton();
	JButton b_MEUN = new JButton("메뉴");
	JButton b_MEUN1 = new JButton("방검색");// 방 존재 여부(검색)
	JButton b_MEUN2 = new JButton("현인원");// 인원표시
	JButton b_MEUN3 = new JButton("방목록보기");// 방목록 표시

	// JTextArea TA = new JTextArea(30, 30);// 메시지 입력용
	JTextField TA = new JTextField();
	JScrollPane scrol = new JScrollPane(TA);

	JTextArea TA2 = new JTextArea(30, 30);// 리스트 용
	JScrollPane scrol2 = new JScrollPane(TA2);

	static int iMeum;

	public T()

	{

		this.setTitle("TEAM");

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.setLayout(new GridLayout(4, 1));
		TA.setSize(200, 100);
		TA2.setSize(200, 700);
		TA2.setEditable(false);
		this.setLayout(new BorderLayout());
		// p1.setLayout(new GridLayout(2, 1));
		p1.add(scrol2);// 받은 메시지 목록 log
		this.add(scrol, new BorderLayout().SOUTH);// 메세지 보내기 창
		p1.setSize(200, 100);
		p2.setSize(200, 700);

		this.add(p1, BorderLayout.CENTER);

		// this.add(p2,BorderLayout.SOUTH);

		p.add(b_MEUN);
		p.add(b_MEUN1);
		p.add(b_MEUN2);
		p.add(b_MEUN3);
		b_MEUN.addActionListener(new Mymeuns());
		b_MEUN1.setVisible(false);
		b_MEUN2.setVisible(false);
		b_MEUN3.setVisible(false);
		this.add(p, BorderLayout.WEST);
		this.setVisible(true);
		this.setSize(400, 500);
		this.setResizable(false);// 창크기 고정

	}

	class MyChangeListener implements ChangeListener {

		public void stateChanged(ChangeEvent e)

		{
		}

	}

	class Mymeuns implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (nn == 0)// 켜기
			{

				b_MEUN1.setVisible(true);
				b_MEUN2.setVisible(true);
				b_MEUN3.setVisible(true);

				b_MEUN.setText("닫기");
				nn = 1;
			} else// 끄기
			{

				b_MEUN1.setVisible(false);
				b_MEUN2.setVisible(false);
				b_MEUN3.setVisible(false);

				b_MEUN.setText("메뉴");

				nn = 1;
			}
		}

	}

	class MyKeyListener implements KeyListener {

		public void keyPressed(KeyEvent e)

		{

		}

		public void keyReleased(KeyEvent arg0) {

		}

		public void keyTyped(KeyEvent arg0) {
		}

	}

	public static void main(String[] args) {
		new T();
	}
}

