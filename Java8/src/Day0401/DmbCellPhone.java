package Day0401;

public class DmbCellPhone extends CellPhone {	//CellPhone Ŭ���� ��� ����
	int channel;
	
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;	//this.medel�� �����Ѵ�.
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("DMB�� �մϴ�.");
	}	
	
	void turnOffDmb() {
		System.out.println("DMB�� ���ϴ�.");
	}
	
	void setChannel(int channel) {
		this.channel = channel;
		System.out.println(channel + "���� ä���� �����մϴ�.");
	} 
}
