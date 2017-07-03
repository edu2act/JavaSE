package com.MYQQ.message.vew;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.MYQQ.entity.user;
import com.MYQQ.user.service.UserserviceImpl;

public class ChatFrame extends JFrame{
	user myself;
	public user another;
	
	public JTextArea txtList=null;
	JTextField txtMsg=null;
	JButton btn=null;
	public ChatFrame(){}
	
	public ChatFrame(user myself, String other){
		this.myself=myself;
		String temp[]=other.split(" ");
		UserserviceImpl userServiceImpl=new UserserviceImpl();
		another=userServiceImpl.listByQqNum(Integer.parseInt(temp[0]));
		JPanel panel=new JPanel();
		this.getContentPane().add(panel);
		panel.setLayout(new BorderLayout());
		
		txtList=new JTextArea(5, 20);
		panel.add(txtList, BorderLayout.CENTER);
		
		JPanel txtPanel=new JPanel();
		txtMsg=new JTextField(10);
		btn=new JButton("����");
		
		btn.addActionListener(new BtnListener(this));
		
		txtPanel.add(txtMsg);
		txtPanel.add(btn);
		panel.add(txtPanel, BorderLayout.SOUTH);
		
		this.setTitle(temp[1]);
		this.setSize(400,300);
		this.setVisible(true);
		
	}
}
