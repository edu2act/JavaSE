package com.MYQQ.message.vew;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import com.MYQQ.entity.message;
import com.MYQQ.message.service.ClientThread;
import com.MYQQ.message.service.MessageServiceImpl;
public class BtnListener implements ActionListener{
	ChatFrame chatFrame;
	public BtnListener(ChatFrame chatFrame) {
		this.chatFrame=chatFrame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String msg=chatFrame.txtMsg.getText();
		message message=new message();
		message.setContent(msg);
		message.setSender(chatFrame.myself.getQqnum());
		message.setReceiver(chatFrame.another.getQqnum());
		message.setSendtime(new Date());
		message.setState(1);
		MessageServiceImpl messageServiceImpl=new MessageServiceImpl();
		int key=messageServiceImpl.sendMessage(message);
		message.setId(key);
		//开启新的线程，发送消息
		new Thread(new ClientThread(message, chatFrame.another.getIp())).start();
		chatFrame.txtMsg.setText("");
		// 将消息放到多行文本框
		String content=chatFrame.txtList.getText();
		int size=chatFrame.txtList.getWidth()/3;
		int spaceSize=size-chatFrame.myself.getName().length()-msg.length()-1;
		if(spaceSize>0){
			for(int i=0;i<spaceSize;i++){
				content+=" ";
			}
			
		}
		content+=chatFrame.myself.getName()+":"+msg+"\n";
		chatFrame.txtList.setText(content);

	}
}
