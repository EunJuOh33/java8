package Day0402;

public class TV implements RemoteControl {
	int volume;

	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME) {
			
		} else {
			
		}
		System.out.println("TV�� ������ " + volume + "���� �����մϴ�.");
	}
	
	@Override
	public void setMute(boolean mute) {	//����Ʈ
		if (mute)
			System.out.println("TV�� ���Ұ� ���·� �����մϴ�.");
		else
			System.out.println("TV�� ���Ұ� ���¸� �����մϴ�.");
	}
}
