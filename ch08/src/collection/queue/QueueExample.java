package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		//LinkedList의 객체 생성
		Queue<Message> messageQueue = new LinkedList<>();
		
		//Message 객체 생성
		Message mail = new Message("sendMail", "이양파");
		Message sms = new Message("sendSms", "박마늘");
		Message katalk = new Message("sendKatalk", "오감자");
		
		//객체 넣기
		messageQueue.offer(mail);
		messageQueue.offer(sms);
		messageQueue.offer(katalk);
		
		//객체 빼기
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail" :
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSms":
				System.out.println(message.to + "님에게 문자를 보냅니다.");
				break;
			case "sendKatalk":
				System.out.println(message.to + "님에게 카톡을 보냅니다.");
				break;
			}
					
		}
		
	}

}
