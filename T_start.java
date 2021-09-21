package team2;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
/*
 * 라벨이랑 텍스트필드 패널에 넣고 버튼도 패널2에 넣어서  배치해보기
 * 
 */
public class T_start extends JFrame{
	
	JButton jb_login = new JButton("입장하기");//T 클래스 호출

	JLabel jl_id = new JLabel("닉네임 : ");
	
	JTextField tf_id = new JTextField(11);

	JPanel p_main =  new JPanel();
static boolean on_off = true;
	public T_start(){
		this.setTitle("로그인창");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		p_main.setLayout(new GridLayout(1, 3));
		p_main.add(jl_id);//닉네임 label
		p_main.add(tf_id);//닉네임 textfield
		p_main.add(jb_login);//입장하기 버튼	
		jb_login.addActionListener(new My_go_List());
		this.add(p_main,BorderLayout.CENTER);
		this.setSize(300,200);
		this.setVisible(on_off);
		this.setResizable(false);//창크기 고정
		
	}

	class My_go_List implements ActionListener {
		
		T tt;//T_List만들고 T만 변경해주기!!
		@Override
		public void actionPerformed(ActionEvent e) {
			//new T_List();
			
		    tt = new T();
		    dispose();
		    
		}
		
	}//로그인 버튼
	 
	public static void main(String[] args) {
		new T_start();
	}
}
