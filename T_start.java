package team2;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
/*
 * ���̶� �ؽ�Ʈ�ʵ� �гο� �ְ� ��ư�� �г�2�� �־  ��ġ�غ���
 * 
 */
public class T_start extends JFrame{
	
	JButton jb_login = new JButton("�����ϱ�");//T Ŭ���� ȣ��

	JLabel jl_id = new JLabel("�г��� : ");
	
	JTextField tf_id = new JTextField(11);

	JPanel p_main =  new JPanel();
static boolean on_off = true;
	public T_start(){
		this.setTitle("�α���â");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		p_main.setLayout(new GridLayout(1, 3));
		p_main.add(jl_id);//�г��� label
		p_main.add(tf_id);//�г��� textfield
		p_main.add(jb_login);//�����ϱ� ��ư	
		jb_login.addActionListener(new My_go_List());
		this.add(p_main,BorderLayout.CENTER);
		this.setSize(300,200);
		this.setVisible(on_off);
		this.setResizable(false);//âũ�� ����
		
	}

	class My_go_List implements ActionListener {
		
		T tt;//T_List����� T�� �������ֱ�!!
		@Override
		public void actionPerformed(ActionEvent e) {
			//new T_List();
			
		    tt = new T();
		    dispose();
		    
		}
		
	}//�α��� ��ư
	 
	public static void main(String[] args) {
		new T_start();
	}
}
