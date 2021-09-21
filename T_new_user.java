package team2;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

public class T_new_user extends JFrame {

	JButton jb_ok = new JButton("확인");// T_start로 간다

	JLabel jl_id = new JLabel("ID : ");
	JLabel jl_pw = new JLabel("PW : ");
	JLabel jl_pw2 = new JLabel("PW : ");
	JLabel jl_error = new JLabel("비밀번호 입력하세요");

	JTextField tf_id = new JTextField(11);
	JTextField tf_pw = new JTextField(11);
	JTextField tf_pw2 = new JTextField(11);
	JPanel p_main = new JPanel();

	T_new_user() {
		this.setTitle("회원가입");
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
		this.setResizable(false);// 창크기 고정
	}
	class My_error implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			String b1 =tf_pw.getText();
			String b2 =tf_pw2.getText();
			int aa = b1.compareTo(b2);
			if(aa==0)
			{
				jl_error.setText("비밀번호가 일치합!");
			}
			else
			{
				jl_error.setText("비밀번호가 일치하지 않음");
			}
		}

	}//회원가입 버튼

	public static void main(String[] args) {
		new T_new_user();
	}
}
