package team2;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

public class T_new_user extends JFrame {

	JButton jb_ok = new JButton("Ȯ��");// T_start�� ����

	JLabel jl_id = new JLabel("ID : ");
	JLabel jl_pw = new JLabel("PW : ");
	JLabel jl_pw2 = new JLabel("PW : ");
	JLabel jl_error = new JLabel("��й�ȣ �Է��ϼ���");

	JTextField tf_id = new JTextField(11);
	JTextField tf_pw = new JTextField(11);
	JTextField tf_pw2 = new JTextField(11);
	JPanel p_main = new JPanel();

	T_new_user() {
		this.setTitle("ȸ������");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		p_main.setLayout(new GridLayout(4, 2));
		p_main.add(jl_id);
		p_main.add(tf_id);
		p_main.add(jl_pw);
		p_main.add(tf_pw);
		p_main.add(jl_pw2);
		p_main.add(tf_pw2);
		p_main.add(jl_error);
		p_main.add(jb_ok);
		jb_ok.addActionListener(new My_error());
		this.add(p_main, BorderLayout.CENTER);
		this.setSize(300, 300);
		this.setVisible(true);
		this.setResizable(false);// âũ�� ����
	}
	class My_error implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			String b1 =tf_pw.getText();
			String b2 =tf_pw2.getText();
			int aa = b1.compareTo(b2);
			if(aa==0)
			{
				jl_error.setText("��й�ȣ�� ��ġ��!");
			}
			else
			{
				jl_error.setText("��й�ȣ�� ��ġ���� ����");
			}
		}

	}//ȸ������ ��ư

	public static void main(String[] args) {
		new T_new_user();
	}
}
