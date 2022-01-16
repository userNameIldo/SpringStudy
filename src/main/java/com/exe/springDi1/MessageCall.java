package com.exe.springDi1;

public class MessageCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("일반적인 객체 생성");
		MessageEn messageEn = new MessageEn();
		MessageKr messageKr = new MessageKr();
		
		messageEn.hello("배수지");
		messageKr.hello("배수지");
		
		
		System.out.println("인터페이스 객체 생성");
		
		Message ms;
		
		ms = new MessageEn();
		ms.hello("배수지");

		ms = new MessageKr();
		ms.hello("배수지");
		
	}

}
