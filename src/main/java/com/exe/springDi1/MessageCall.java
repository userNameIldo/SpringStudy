package com.exe.springDi1;

public class MessageCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�Ϲ����� ��ü ����");
		MessageEn messageEn = new MessageEn();
		MessageKr messageKr = new MessageKr();
		
		messageEn.hello("�����");
		messageKr.hello("�����");
		
		
		System.out.println("�������̽� ��ü ����");
		
		Message ms;
		
		ms = new MessageEn();
		ms.hello("�����");

		ms = new MessageKr();
		ms.hello("�����");
		
	}

}
