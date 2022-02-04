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
		System.out.println("===> LgTV 객체 생성");
	}
	public void powerOn() {
	System.out.println("LgTV___전원 켠다.");
	}

	public void powerOff() {
		System.out.println("LgTV___전원 끈다.");
	}
	public void volumeUp() {
		speaker.volumeUp();
//		System.out.println("LgTV___소리 올린다.");
	}
	public void volumeDown() {
		speaker.volumeDown();
//		System.out.println("LgTV___소리 내린다.");
	}
}
