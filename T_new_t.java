package team2;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

public class T_new_t extends JFrame{
	
	JButton jb_ok = new JButton("����");//T ����//T_list���� �־��ٰ�
	JButton jb_no = new JButton("���");//â�ݱ�
	JLabel jl_id = new JLabel("���ȣ : ");
	JTextField tf_name = new JTextField(11);
	JPanel p_main =  new JPanel();
	
	
	public T_new_t()
	{
		this.setTitle("�游���");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout(15,15));
		p_main.setLayout(new GridLayout(2, 2));
		jb_ok.setSize(50, 50);
		p_main.add(jl_id);
		p_main.add(tf_name);
		p_main.add(jb_ok);
		p_main.add(jb_no);
		this.add(p_main,BorderLayout.CENTER);
		this.setSize(200,200);
		this.setVisible(true);
		this.setResizable(false);//âũ�� ����
		
		
	}
	public static void main(String[] args) {
		new T_new_t();
	}
}
