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
		this.volume = volume;
		System.out.println("������ " + volume + "���� �����մϴ�.");
	}
	
	@Override
	public void setMute(boolean mute) {
		if (mute)
			System.out.println("TV�� ���Ұ� ���·� �����մϴ�.");
		else
			System.out.println("TV�� ���Ұ� ���¸� �����մϴ�.");
	}
}
