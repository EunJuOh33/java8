package Day0402;

public interface RemoteControl {
	//상수 필드
	int MAX_VOLUME = 10;	//클래서에서 상수를 만드려면 
							//public static int MAX_VOLUME 이렇게 해줘야 한다.
	int MIN_BOLUME = 0;
	
	//추상 메소드
	void turnOn();			//클래스에서 추상 메소드를 만드려면
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드
	default void setMute(boolean mute){
		if(mute) {
			System.out.println("음소거 상태로 설정합니다.");
		}else {
			System.out.println("음소거 상태를 해제합니다.");
		}
	}
	//정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}