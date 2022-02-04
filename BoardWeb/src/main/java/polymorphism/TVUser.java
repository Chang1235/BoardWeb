package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	// 1. Spring �����̳ʸ� �����Ѵ�.
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
	
	// 2. Spring �����̳ʷκ��� �ʿ��� ��ü�� ��û(LookUp)�Ѵ�.
		TV tv = (TV)factory.getBean("tv");
	
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		//3. Spring �����̳ʸ� �����Ѵ�,.
		factory.close();
	}
}
