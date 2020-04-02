package Day0402;

public class RemoteControlEx {
	public static void main(String[] args) {
		RemoteControl.changeBattery();	//static�޼ҵ�� �������̽�.�� ����ؼ� �ҷ��� �� �ִ�.
		TV tv = new TV();
		Audio audio = new Audio();
//		RemoteControl rc = new RemoteControl();	//�������̽��� �����ڰ� �����ϴ�.
		RemoteControl rc;	//������ ������ �� �ֽ��ϴ�.
		rc = tv;	//�������̽� �������� ���� Ŭ������ ��ü�� ���Ե˴ϴ�.
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
		rc.setMute(true);	//���Ұ� ���·� �����մϴ�. Audio���� mute�� �������� �ʾҴ�.
		rc.setMute(false);	//���Ұ� ���¸� �����մϴ�.
		rc.turnOff();
		System.out.println();
		
		//�͸� ���� ��ü
		rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("���Ϸ��� �մϴ�.");
			}

			@Override
			public void turnOff() {
				System.out.println("���Ϸ��� ���ϴ�.");
			}

			@Override
			public void setVolume(int volume) {
				System.out.println("�µ��� �ܰ踦 " + volume + "�ܰ躰�� �����մϴ�.");
			}
			
		};	//�͸�����ü�� �ݵ�� �����ݷ��� ���� �Ѵ�.
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);	
		rc.turnOff();
	}
}
