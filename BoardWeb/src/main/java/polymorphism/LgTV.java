package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@Component("tv")
public class LgTV implements TV {
	@Autowired
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("===> LgTV ��ü ����");
	}
	public void powerOn() {
	System.out.println("LgTV___���� �Ҵ�.");
	}

	public void powerOff() {
		System.out.println("LgTV___���� ����.");
	}
	public void volumeUp() {
		speaker.volumeUp();
//		System.out.println("LgTV___�Ҹ� �ø���.");
	}
	public void volumeDown() {
		speaker.volumeDown();
//		System.out.println("LgTV___�Ҹ� ������.");
	}
}
