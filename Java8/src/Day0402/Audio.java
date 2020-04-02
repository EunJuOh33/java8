package Day0402;

public class Audio implements RemoteControl {
	int volume;

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME) {
			
		} else {
			
		}
		System.out.println("오디오의 볼륨을 " + volume + "으로 변경합니다.");
	}
}
