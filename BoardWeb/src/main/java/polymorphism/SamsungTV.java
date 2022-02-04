package polymorphism;

public class SamsungTV implements TV {
	private Speaker speaker;
	private int price;
	
	
	public void initMethod() {
		System.out.println("��ü �ʱ�ȭ �۾� ó��...");
	}
	public void destroyMethod() {
		System.out.println("��ü ���� ���� ó���� ���� ó��...");
	}
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) ��ü����");
	}

	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeakerȣ��");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("setPriceȣ��");
		this.price = price;
	}
	public void powerOn() {
		System.out.println("SamsungTV---���� �Ҵ�.(����: " +price +")");	
	}

	public void powerOff() {
		System.out.println("SamsungTV___���� ����.");
	}
	public void volumeUp() {
		speaker.volumeUp();
//		System.out.println("SamsungTV___�Ҹ� �ø���.");
	}
	public void volumeDown() {
		speaker.volumeDown();
//		System.out.println("SamsungTV___�Ҹ� ������.");
	}
	
}