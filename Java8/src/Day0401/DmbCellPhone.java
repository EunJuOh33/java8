package Day0401;

public class DmbCellPhone extends CellPhone {	//CellPhone 클래스 상속 받음
	int channel;
	
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;	//this.medel이 존재한다.
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("DMB를 켭니다.");
	}	
	
	void turnOffDmb() {
		System.out.println("DMB를 끕니다.");
	}
	
	void setChannel(int channel) {
		this.channel = channel;
		System.out.println(channel + "으로 채널을 변경합니다.");
	} 
}
