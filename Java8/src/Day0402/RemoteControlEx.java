package Day0402;

public class RemoteControlEx {
	public static void main(String[] args) {
		RemoteControl.changeBattery();	//static메소드는 인터페이스.을 사용해서 불러올 수 있다.
		TV tv = new TV();
		Audio audio = new Audio();
//		RemoteControl rc = new RemoteControl();	//인터페이스는 생성자가 없습니다.
		RemoteControl rc;	//변수는 정의할 수 있습니다.
		rc = tv;	//인터페이스 변수에는 구현 클래스의 객체가 대입됩니다.
		rc = new TV();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println();
		
		rc = audio;
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);	//음소거 상태로 설정합니다. Audio에서 mute를 설정하지 않았다.
		rc.setMute(false);	//음소거 상태를 해제합니다.
		rc.turnOff();
		System.out.println();
		
		//익명 구현 객체
		rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("보일러를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("보일러를 끕니다.");
			}

			@Override
			public void setVolume(int volume) {
				System.out.println("온도의 단계를 " + volume + "단계별로 변경합니다.");
			}
			
		};	//익명구현객체는 반드시 세미콜론을 찍어야 한다.
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);	
		rc.turnOff();
	}
}
