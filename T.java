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
	JButton b_MEUN = new JButton("�޴�");
	JButton b_MEUN1 = new JButton("��˻�");// �� ���� ����(�˻�)
	JButton b_MEUN2 = new JButton("���ο�");// �ο�ǥ��
	JButton b_MEUN3 = new JButton("���Ϻ���");// ���� ǥ��

	// JTextArea TA = new JTextArea(30, 30);// �޽��� �Է¿�
	JTextField TA = new JTextField();
	JScrollPane scrol = new JScrollPane(TA);

	JTextArea TA2 = new JTextArea(30, 30);// ����Ʈ ��
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
		p1.add(scrol2);// ���� �޽��� ��� log
		this.add(scrol, new BorderLayout().SOUTH);// �޼��� ������ â
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
		this.setResizable(false);// âũ�� ����

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
			if (nn == 0)// �ѱ�
			{

				b_MEUN1.setVisible(true);
				b_MEUN2.setVisible(true);
				b_MEUN3.setVisible(true);

				b_MEUN.setText("�ݱ�");
				nn = 1;
			} else// ����
			{

				b_MEUN1.setVisible(false);
				b_MEUN2.setVisible(false);
				b_MEUN3.setVisible(false);

				b_MEUN.setText("�޴�");

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

