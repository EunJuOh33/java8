package Day0402;

public class Audio implements RemoteControl {
	int volume;

	@Override
	public void turnOn() {
		System.out.println("������� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("������� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME) {
			
		} else {
			
		}
		System.out.println("������� ������ " + volume + "���� �����մϴ�.");
	}
}
