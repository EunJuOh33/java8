package Day0402;

public interface RemoteControl {
	//��� �ʵ�
	int MAX_VOLUME = 10;	//Ŭ�������� ����� ������� 
							//public static int MAX_VOLUME �̷��� ����� �Ѵ�.
	int MIN_BOLUME = 0;
	
	//�߻� �޼ҵ�
	void turnOn();			//Ŭ�������� �߻� �޼ҵ带 �������
	void turnOff();
	void setVolume(int volume);
	
	//����Ʈ �޼ҵ�
	default void setMute(boolean mute){
		if(mute) {
			System.out.println("���Ұ� ���·� �����մϴ�.");
		}else {
			System.out.println("���Ұ� ���¸� �����մϴ�.");
		}
	}
	//���� �޼ҵ�
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}